/*
 * Copyright (C) 2014-2016 AiJia All rights reserved
 * Author: chong
 * Date: 2016年11月3日
 * Description:GenerateTestng.java 
 */
package com.vo2mapper;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ihomefnt.cms.intf.mail.po.MailRole;
import com.vo2mapper.util.DateUtil;
import com.vo2mapper.vo.MethodVo;

/**
 * testng测试代码生成
 * 
 * @author chong
 */
public class GenerateTestng {

	public static void main(String[] args) throws IOException {
		String classFullName = MailRole.class.getName();

		VoParser.beforeDeal(classFullName);

		// VoParser.copyFile(classFullName);
	}
	
	/**
	 * 预处理
	 * @param classFullName
	 * @throws IOException
	 */
	public static void beforeDeal(String classFullName) throws IOException {
		String className = classFullName.substring(classFullName.lastIndexOf(".")+1);
		
		String packageName = classFullName.substring(0, classFullName.lastIndexOf("."));
		
		List<MethodVo> methodVoList = VoParser.getAllMethods(classFullName);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("methodList", methodVoList);
		map.put("className", className);
		map.put("packageName", packageName);
		map.put("createTimeStr", DateUtil.format(new Date(), DateUtil.FORMAT_SHORT_CN));

		GenerateTestng.processTestng(map, className);
		
	}
	
	/**
	 * 生成dao文件
	 * @param className
	 * @throws IOException 
	 */
	public static void processTestng(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------http process start--------------------------------");
		VoParser.process(map, "testng.ftl", File.separator + "http" + File.separator + className + "Test.java");
		System.out.println("--------------------------------------http process end--------------------------------");
	}
}
