package vip.xiaonuo.auth.modular.sso.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vip.xiaonuo.auth.core.enums.SaClientTypeEnum;
import vip.xiaonuo.auth.modular.sso.param.AuthSsoTicketLoginParam;
import vip.xiaonuo.auth.modular.sso.service.AuthSsoService;
import com.copplay.common.domain.CommonResult;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;

/**
 * 单点登录控制器
 *
 * @author xuyuxiang
 * @date 2022/8/30 9:20
 **/
@Tag(name = "单点登录控制器")
@ApiSupport(author = "SNOWY_TEAM", order = 4)
@RestController
@Validated
public class AuthSsoController {

    @Resource
    private AuthSsoService authSsoService;

    /**
     * 根据ticket执行单点登录
     *
     * @author xuyuxiang
     * @date 2021/10/15 13:12
     **/
    @ApiOperationSupport(order = 1)
    @Operation(summary = "根据ticket执行单点登录")
    @PostMapping("/auth/sso/doLogin")
    public CommonResult<String> doLogin(@RequestBody @Valid AuthSsoTicketLoginParam authAccountPasswordLoginParam) {
        return CommonResult.data(authSsoService.doLogin(authAccountPasswordLoginParam, SaClientTypeEnum.B.getValue()));
    }
}
