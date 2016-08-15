package com.cubic.rabi;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i=0;i<5;i++) {
			list.add(i+100);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println("Value at index "+i+"  ="+list.get(i));
		}
		
		
		printCollection(list);
	}

	private static void printCollection(Collection<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			System.out.println("Collection Value = "+value);
			itr.remove();
			
		}
	}
	
	private void printMessage()
	{
		System.out.println("wata noud");
	}

}
