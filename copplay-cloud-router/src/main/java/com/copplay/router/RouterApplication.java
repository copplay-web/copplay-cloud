package com.copplay.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vip.xiaonuo.common.AppStartupListener;

@SpringBootApplication
public class RouterApplication {
	public static void main(String[] args) {
		SpringApplication.run(RouterApplication.class, args);
	}

	@Bean
	public AppStartupListener appStartupListener(){
		return new AppStartupListener();
	}

}
