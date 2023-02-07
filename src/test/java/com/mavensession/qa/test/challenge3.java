package com.mavensession.qa.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class challenge3 {
	public Map<String, Integer> countWords(String words){
	    // parse the sentence using a space as the delimiter
	    // count how many times each word exists in the sentence and return the object that contains the words and count
		Map<String,Integer> map = new HashMap<>();
		String[] word = words.split(" ");
		for(String s:word) {
			if(map.containsKey(s)) {
			map.put(s, map.get(s)+1);}
			else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
		return map;
	    }

	    @Test
	    public void test1(){
	        String sentence = "I'm trying to make a program on word count which I have partially made and it is giving the correct result but the moment I enter space or more than one space in the string, the result of word count show wrong results because I am counting words on the basis of spaces used. I need help if there is a solution in a way that no matter how many spaces are I still get the correct result. I'm mentioning the code below.";
	        Assert.assertEquals(7, (countWords(sentence).get("the").intValue()));
	    }

	    @Test
	    public void test2(){
	        String sentence = "3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6";
	        Assert.assertEquals(5, (countWords(sentence).get("5").intValue()));
	    }

	    @Test
	    public void test3(){
	        String sentence = "a B c b d e a b b B B B a b";
	        Assert.assertEquals(1, (countWords(sentence).get("e").intValue()));
	    }
}
