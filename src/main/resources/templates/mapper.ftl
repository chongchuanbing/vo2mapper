<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://www.mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="${packageName}">

	<resultMap id="${entityName?uncap_first}ResultMap" type="${fullClassName}">
		<id property="id" column="${databaseIdName}" />
		<#list fieldMapList as field>
		<#if field.primaryKey == 'false'>
		<result property="${field.showName}" column="${field.dbName}" />
		</#if>
		</#list>
	</resultMap>
	
	<select id="queryAll${entityName}" parameterType="map" resultMap="${entityName?uncap_first}ResultMap">
    	select
	    	t.${databaseIdName},
	    	<#list fieldMapList as field>
	    	<#if field.primaryKey == 'false'>
	    	t.${field.dbName}<#if field_has_next>,</#if>
	    	</#if>
	    	</#list>
    	from ${tableName} t 
		where 1=1
		<#list fieldMapList as field>
			<#if field.search == 'true'>
			and t.${field.dbName}=\#\{${field.showName}\}
			</#if>
		</#list>
		order by t.create_time desc
    </select>
    
    <select id="queryAll${entityName}" parameterType="map" resultMap="${entityName?uncap_first}ResultMap">
    	select
	    	count(1)
    	from ${tableName} 
		where 1=1
		<#list fieldMapList as field>
		</#list>
    </select>
    
    <insert id="add${entityName}" parameterType="${fullClassName}"
    	useGeneratedKeys="true" keyProperty="id">
    	INSERT INTO ${tableName}
		<trim prefix="(" suffix=")" suffixOverrides=",">
			<#list fieldMapList as field>
			<#if field.primaryKey == "false">
			<if test="${field.showName} != null">
				${field.dbName},
			</if>
			</#if>
			</#list>
		</trim>
		<trim prefix="values (" suffix=")" suffixOverrides=",">
			<#list fieldMapList as field>
			<#if field.primaryKey == "false">
			<if test="${field.showName} != null">
				\#\{${field.showName}\},
			</if>
			</#if>
			</#list>
		</trim>
    </insert>
    
    <update id="update${entityName}" parameterType="${fullClassName}">
		update ${tableName}
		<set>
			<#list fieldMapList as field>
			<#if field.primaryKey == "false">			
			<if test="${field.showName} != null">
				${field.dbName}=\#\{${field.showName}\},
			</if>
			</#if>
			</#list>
		</set>
		where ${databaseIdName}=\#\{id\}
	</update>
    
</mapper>