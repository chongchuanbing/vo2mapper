/*
 * Copyright (C) 2014-2016 AiJia All rights reserved
 * Author: chong
 * Date: ${createTimeStr}
 * Description:${className}Test.java 
 */
package com.ihomefnt.cms.test.payment.earnestmoney;

import java.math.BigDecimal;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.ihomefnt.cms.test.BaseTest;

/**
 * 诚意金测试类
 * @author chong
 */
public class ${className}Test extends BaseTest {

	@Autowired
	public EarnestMoneyService earnestMoneyService;

	<#list methodList as method>
	@Test
	public void test${method.name?cap_first}() {
		throw new RuntimeException("Test not implemented");
	}
	</#list>

}
