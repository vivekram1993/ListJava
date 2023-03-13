package org.collection;

import java.util.ArrayList;
import java.util.List;

public class list {
	public static void main(String[] args) {
		
		List data = new ArrayList();
		data.add(10);
		data.add("Vivekram");
		data.add(596031);
		
	System.out.println(data);
	
	for(int i=0;i<data.size();i++)
	{
		System.out.println(data.get(i));
	}
		
	}

}
