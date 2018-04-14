package com.sail.serices.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@MapperScan(basePackages = "com.sail.dal.mapper")
@ImportResource(locations={"boss.xml","common.xml"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BossApplication {

	public static void main(String[] args) {
		SpringApplication.run(BossApplication.class, args);  
	}
}
