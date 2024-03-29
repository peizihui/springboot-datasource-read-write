package com.carlton.demo.conf.split;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/***
 * 多数据源切换，负载均衡定义
* <p>Title: MyAbstractRoutingDataSource</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
public class MyAbstractRoutingDataSource extends AbstractRoutingDataSource {

	private final int dataSourceNumber;
	private AtomicInteger count = new AtomicInteger(0);

	public MyAbstractRoutingDataSource(int dataSourceNumber) {
		this.dataSourceNumber = dataSourceNumber;
	}

	@Override
	protected Object determineCurrentLookupKey() {
		String typeKey = DataSourceContextHolder.getJdbcType();
		if (typeKey.equals(DataSourceType.write.getType()))
			return DataSourceType.write.getType();
		// 读 简单负载均衡
		int number = count.getAndAdd(1);
		int lookupKey = number % dataSourceNumber;
		Integer i = lookupKey;
		return i;
	}

}
