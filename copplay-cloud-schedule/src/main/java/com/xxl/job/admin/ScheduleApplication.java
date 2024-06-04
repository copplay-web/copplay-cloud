package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.copplay.common.AppStartupListener;


@SpringBootApplication
public class ScheduleApplication {

	@Bean
	public AppStartupListener appStartupListener(){
		return new AppStartupListener();
	}

	public static void main(String[] args) {
        SpringApplication.run(ScheduleApplication.class, args);
	}

}