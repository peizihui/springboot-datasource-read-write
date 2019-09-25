package com.carlton.demo.conf.split;

/***
 * 枚举区分读写数据源
* <p>Title: DataSourceType</p>  
* <p>Description: </p>  
* @author Carlton  
* @date 2018年9月28日
 */
public enum DataSourceType {
	read("read", "从库"), write("write", "主库");
	private String type;
	private String name;

	DataSourceType(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
