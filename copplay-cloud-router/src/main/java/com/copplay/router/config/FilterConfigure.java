package com.copplay.router.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.copplay.router.core.filter.CorsFilter;

/**
 * 过滤器配置
 *
 * @author dongxiayu
 * @date 2021-03-12 23:30
 */
@Configuration
public class FilterConfigure {

    private static final String MAX_AGE = "18000L";

    @Bean
    public CorsFilter corsFilter(){
        return new CorsFilter();
    }

}
