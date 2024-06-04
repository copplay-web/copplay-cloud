package com.copplay.router.config;

import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger cloud聚合配置
 *
 * @author dongxiayu
 * <p>
 * https://doc.xiaominfo.com/knife4j/changelog/2017-12-18-swagger-bootstrap-ui-1.7-issue.html
 * </p>
 * @date 2021/4/9 10:42
 **/
@Component
@Primary
@AllArgsConstructor
public class SwaggerConfigure implements SwaggerResourcesProvider {

    public static final String API_URI = "/v3/api-docs";

    private final RouteLocator routeLocator;

    private final GatewayProperties gatewayProperties;

//    private final Knife4jAggregationProperties knife4jAggregationProperties;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<String> routes = new ArrayList<>();
        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
//        knife4jAggregationProperties.getCloud().getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getName()))
//                .forEach(routeDefinition -> resources.add(swaggerResource(routeDefinition.getName(),
//                        routeDefinition.getLocation())));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("3.0");
        return swaggerResource;
    }
}
