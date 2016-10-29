package com.vo2mapper;

import java.net.URL;

import org.junit.Test;

public class PathTest {
	
	@Test
	public void pathTest() {
		URL url = ClassLoader.getSystemResource("");
		System.out.println(url.getPath());
	}
}
