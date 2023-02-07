package com.mavensession.qa.test;

import java.util.Arrays;
import java.util.OptionalInt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sum_challenge {
	public int sum(int[] nums) {
	    //Your code should be able to loop through the array and add all the values up.
	    //Your method should return the total
		int sum=0;
		for(int i: nums) {
			sum = sum+i;
		}
		return sum;
	    }

	    @Test
	    public void test1(){
	        int[] intArray = new int[]{1,2,2,1};
	        Assert.assertEquals(6, sum(intArray));
	    }

	    @Test
	    public void test2(){
	        int[] intArray = new int[]{1,1};
	        Assert.assertEquals(2, sum(intArray));
	    }

	    @Test
	    public void test3(){
	        int[] intArray = new int[]{1,1,3,4,5,7,100,-100};
	        Assert.assertEquals(21, sum(intArray));
	    }

}
