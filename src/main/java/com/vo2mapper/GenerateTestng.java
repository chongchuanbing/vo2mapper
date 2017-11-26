/*
 * Copyright (C) 2014-2016 AiJia All rights reserved
 * Author: chong
 * Date: 2016年11月3日
 * Description:GenerateTestng.java 
 */
package com.vo2mapper;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ihomefnt.psi.service.DeliverPurchaseService.DeliverPurchaseOrderServiceImpl;
import com.vo2mapper.util.DateUtil;
import com.vo2mapper.vo.MethodVo;

/**
 * testng测试代码生成
 * 
 * @author chong
 */
public class GenerateTestng {

	public static void main(String[] args) throws IOException {
		
		String classFullName = DeliverPurchaseOrderServiceImpl.class.getName();

		GenerateTestng.beforeDeal(classFullName);

		// VoParser.copyFile(classFullName);
	}

	/**
	 * 预处理
	 * 
	 * @param classFullName
	 * @throws IOException
	 */
	public static void beforeDeal(String classFullName) throws IOException {
		String className = classFullName.substring(classFullName.lastIndexOf(".") + 1);

		String packageName = classFullName.substring(0, classFullName.lastIndexOf("."));
		
		String mainPackageName = "";
		if (-1 < classFullName.indexOf(".dto")) {
			mainPackageName = classFullName.substring(0, classFullName.indexOf(".dto"));
		} else if (-1 < classFullName.indexOf(".po")) {
			mainPackageName = classFullName.substring(0, classFullName.indexOf(".po"));
		} else {
			mainPackageName = classFullName;
		}

		List<MethodVo> methodVoList = VoParser.getAllMethods(classFullName);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("methodList", methodVoList);
		map.put("className", className);
		map.put("packageName", packageName);
		map.put("mainPackageName", mainPackageName);
		map.put("createTimeStr", DateUtil.format(new Date(), DateUtil.FORMAT_SHORT_CN));

		GenerateTestng.processTestng(map, className);

	}

	/**
	 * 生成dao文件
	 * 
	 * @param className
	 * @throws IOException
	 */
	public static void processTestng(Map<String, Object> map, String className) throws IOException {
		System.out.println("--------------------------------------test unit start--------------------------------");
		VoParser.process(map, "testng.ftl", className + "Test.java");
		System.out.println("--------------------------------------test unit end--------------------------------");
	}
}
