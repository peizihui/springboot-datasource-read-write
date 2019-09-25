package com.carlton.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * 
* <p>Title: ReadWriteDatabaseApplication</p>  
* <p>Description: 启动类</p>  
* @author Carlton  
* @date 2018年9月28日
 */
//@EnableTransactionManagement 已经配置了事务管理类，这个注解移到那边
@SpringBootApplication
@MapperScan("com.carlton.demo.mapper")
public class ReadWriteDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadWriteDatabaseApplication.class, args);
	}
}
