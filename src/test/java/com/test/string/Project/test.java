package com.test.string.Project;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class test {
	




 
	
	ArrayList<String> Sentance;
	ArrayList<String> l;
	program1 s;
	
	@Test
	public void EmptyString()                       // Test case when empty string is passed as parameter
	{
		Sentance=new ArrayList<String>();
		Sentance.add(":0");
		s=new program1();
		l=s.longLength("");
		assertTrue(Sentance.equals(l));
	}
	 
	@Test(expected=NullPointerException.class)
	public void NullString()								// Test case when null is passed as parameter
	{
		Sentance=new ArrayList<String>();
		Sentance.add(":0");
		program1 s=new program1();
		ArrayList<String> l=s.longLength(null);
		assertTrue(Sentance.equals(l));
	}
	
	@Test
	public void givenExInput() 								// Test case for given example string passed as parameter
	{
		Sentance=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the result:");
		String s1=sc.nextLine();
		Sentance.add(s1);
		program1 s=new program1();
		System.out.println("Enter the sentence:");
		String st=sc.nextLine();
		l = s.longLength(st);
		assertEquals(Sentance,l);
	}
	
	@Test
	public void givingSChars()								// Test case when string of special characters passed as parameter
	{
		Sentance=new ArrayList<String>();
		Sentance.add("+++++///+++++gckjb;jl;ik:24");
		program1 s=new program1();
		l = s.longLength("+++++///+++++gckjb;jl;ik  +++++++++++++++");
		assertEquals(Sentance,l);
	}
	

}

	


