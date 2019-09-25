package com.carlton.demo.conf.split;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/***
 * 定义切面切点
* <p>Title: DataSourceAop</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
@Aspect
@Component
@Slf4j
public class DataSourceAop {

	static Logger log = LoggerFactory.getLogger(DataSourceAop.class);

	@Before("execution(* com.carlton.demo.mapper.*.select*(..)) || execution(* com.carlton.demo.mapper.*.count*(..))")
	public void setReadDataSourceType() {
		DataSourceContextHolder.read();
		log.info("dataSource切换到：Read");
	}

	@Before("execution(* com.carlton.demo.mapper.*.insert*(..)) || execution(* com.carlton.demo.mapper.*.update*(..)) || execution(* com.carlton.demo.mapper.*.delete*(..))")
	public void setWriteDataSourceType() {
		DataSourceContextHolder.write();
		log.info("dataSource切换到：write");
	}
}
