package com.mavensession.qa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class reverse_list {
	public List reverse(List mylist){
	    //your code should read the values from a list and reverse the values and return the reversed list.
		Collections.reverse(mylist);
		return mylist;
	    }

	    @Test
	    public void test1(){
	        List<String> messageReversed = Arrays.asList("You?", "Are", "How", "Hello");
	        List<String> message = Arrays.asList("Hello", "How", "Are", "You?");
	        Assert.assertEquals(message, reverse(messageReversed));
	    }

	    @Test
	    public void test2(){
	        List<String> message = Arrays.asList("A", "B", "C", "D", "E");
	        List<String> messageReversed = Arrays.asList("E", "D", "C", "B", "A");
	        Assert.assertEquals(message, reverse(messageReversed));
	    }

		@Test
	    public void test3(){
	        List<String> message = Arrays.asList("1", "2", "3", "4", "5");
	        List<String> messageReversed = Arrays.asList("6", "5", "4", "3", "2", "1");
	        Assert.assertNotEquals(message, reverse(messageReversed));
	    }

}
