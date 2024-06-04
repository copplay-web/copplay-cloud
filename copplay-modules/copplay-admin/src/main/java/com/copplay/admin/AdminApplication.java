package com.copplay.admin;

import com.copplay.common.AppStartupListener;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "vip.xiaonuo")
@SpringBootApplication(scanBasePackages = {"vip.xiaonuo"})
public class AdminApplication {

    /* 解决druid 日志报错：discard long time none received connection:xxx */
    static {
        System.setProperty("druid.mysql.usePingMethod","false");
    }

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AdminApplication.class);
        springApplication.run(args);
        log.info(">>> {}", AdminApplication.class.getSimpleName().toUpperCase() + " STARTING SUCCESS");
    }

    @GetMapping("/")
    public String index() {
        return "WELCOME";
    }

    @Bean
    public AppStartupListener appStartupListener(){
        return new AppStartupListener();
    }
}
