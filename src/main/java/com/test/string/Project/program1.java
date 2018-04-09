package com.test.string.Project;
import java.util.ArrayList;
public class program1 {

			public ArrayList<String> longLength(String s) {   //finding the longest word in the given string
				// TODO Auto-generated method stub

				String arr[]=s.split(" ");                     // splitting the string by using the " "(space) seperator in to string array
				int x=arr.length;								//finding the length of the string array
				int arlen[]=new int[x];							//Initialize an integer array with the same length as string array to store the length of the words
				for(int i=0;i<x;i++)							// finding the length of the words and inserting in to the array
				{
					String p=arr[i];
					arlen[i]=p.length();
				}
				int max=arlen[0];								// finding out the maximum length word in the string array
				for(int j=0;j<x;j++)
				{
					if(arlen[j]>max)
						max=arlen[j];
				}
				ArrayList<String> list=new ArrayList<String>();  //Initializing array list in order to store the maximum length words
				for(int i=0;i<x;i++)								// finding the maximum length words and storing in the array list
				{
					String p1=arr[i];
					if(p1.length()==max)
					list.add(p1+":"+max);
				}
				return list;									// return array list
			}
		

		
	}


