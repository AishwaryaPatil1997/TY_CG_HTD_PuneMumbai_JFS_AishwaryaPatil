package com.capgemini.exception.first;

import java.io.File;
import java.io.IOException;

public class Test 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("vikas.txt");
		f.createNewFile();
	}
}
