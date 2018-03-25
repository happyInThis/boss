package com.sail.boss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations={"classpath:boss.xml"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BossApplication {

	public static void main(String[] args) {
		SpringApplication.run(BossApplication.class, args);
	}
}
