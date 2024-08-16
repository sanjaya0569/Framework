package com.Testngtutorial.java;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGLearning {
	
	@Test
	public void c_test(){
	System.out.println("c should execute second");
	}
     @Test(dependsOnMethods = "c_test")
	public void a_test(){
	System.out.println("a should execute third");
	Assert.assertTrue(false);
	}
     @Test(dependsOnMethods = "a_test")
	public void b_test(){
	System.out.println("b should execute first");
	}

}
