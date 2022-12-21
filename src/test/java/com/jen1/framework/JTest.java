package com.jen1.framework;

import org.testng.annotations.Test;

public class JTest {

	@Test(groups = "sanity")
	public void test1() {
		System.out.println("j1 executing");
		System.out.println("modified");
		System.out.println("modified2");
}
}
