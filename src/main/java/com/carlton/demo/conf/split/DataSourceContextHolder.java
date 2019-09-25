package com.carlton.demo.conf.split;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/***
 * 本地全局变量，切换数据源
* <p>Title: DataSourceContextHolder</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
@Slf4j
public class DataSourceContextHolder {
	static Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

	private static final ThreadLocal<String> local = new ThreadLocal<String>();

	public static ThreadLocal<String> getLocal() {
		return local;
	}

	/**
	 * 读可能是多个库
	 */
	public static void read() {
		local.set(DataSourceType.read.getType());
	}

	/**
	 * 写只有一个库
	 */
	public static void write() {
		log.debug("writewritewrite");
		local.set(DataSourceType.write.getType());
	}

	public static String getJdbcType() {
		return local.get();
	}
}
