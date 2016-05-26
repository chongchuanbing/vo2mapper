package com.vo2mapper.vo;

/**
 * 
 * @author Administrator
 *
 */
public class FieldVo {
	private String primaryKey;
	private String foreginKey;
	private String sort;
	private String search;
	private String showName;
	private String dbName;
	private String javaType;
	private String dbType;

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getForeginKey() {
		return foreginKey;
	}

	public void setForeginKey(String foreginKey) {
		this.foreginKey = foreginKey;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

}
