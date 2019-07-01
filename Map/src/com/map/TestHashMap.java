package com.map;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap hm=new HashMap();

		//put()
		hm.put(1, "Amit");
		hm.put("g","Gupta");

		
		//putAll
		HashMap hm1=new HashMap();

		hm1.put(4, "Devbrat");
		hm1.put("s","Singh");
		
		hm.putAll(hm1);
		
		//remove
		System.out.println(hm.remove("s")+" having key s is removed");
	
		
		//containsKey
		
		if(hm.containsKey(1)) {
			System.out.println("Key 1 is present");
		}
		
		//get()
		
		System.out.println(hm.get(4));
		
		System.out.println(hm.get(1));
		
	}

}
