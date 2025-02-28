package com.copplay.router.core.filter;

import cn.dev33.satoken.SaManager;
import cn.dev33.satoken.config.SaTokenConfig;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

/**
 * @description 转发认证全局过滤器，为请求添加 TOKEN
 * @author dongxiayu
 * @date 2022/11/18 1:51
 */
@Component
public class ForwardAuthFilter implements GlobalFilter {

    private static final String HEADER_ORIGIN = "Origin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        HttpHeaders httpHeaders = exchange.getRequest().getHeaders();

        /** token **/
        SaTokenConfig saTokenConfig = SaManager.getConfig();
        String tokenName = saTokenConfig.getTokenName();
        List<String> tokenValueList = httpHeaders.get(tokenName);
        String tokenValue = null;
        if(Objects.nonNull(tokenValueList) && !tokenValueList.isEmpty()){
            tokenValue = tokenValueList.get(0);
        }

        /** Origin **/
        String originValue = null;
        List<String> originValueList = httpHeaders.get(HEADER_ORIGIN);
        if(Objects.nonNull(originValueList) && !originValueList.isEmpty()){
            originValue = originValueList.get(0);
        }

        ServerHttpRequest newRequest = exchange
                .getRequest()
                .mutate()
                // 为请求追加 Origin 参数
                .header(HEADER_ORIGIN, originValue)
                // 为请求追加 Token 参数
                .header(tokenName, tokenValue)
                .build();
        ServerWebExchange newExchange = exchange.mutate().request(newRequest).build();

        return chain.filter(newExchange);
    }

}
