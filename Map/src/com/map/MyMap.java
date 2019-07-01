package com.map;

import java.util.HashMap;

public class MyMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(11, "Amit");
		map.put(12, "it");
		map.put(13, "Am");
		
		//deb
				System.out.println("Data are");
				for (Integer i : map.keySet()){
				  System.out.println(map.get(i));
				}
		
	}

}
