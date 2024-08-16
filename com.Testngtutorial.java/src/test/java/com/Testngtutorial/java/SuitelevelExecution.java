package com.Testngtutorial.java;

import org.testng.annotations.Test;

public class SuitelevelExecution {
	
	   @Test
	   public void D_test(){
		System.out.println("D should execute second");
		}
		@Test
		public void E_test(){
		System.out.println("E should execute third");
		}

}
