package com.map;

import java.util.HashMap;
public class EmployeeHashMap {

	public static void main(String[] args) {
		Employee e1,e2,e3,e4;
		e1=new Employee();
		e2=new Employee();
		e3=new Employee();
		e4=new Employee();

		e1.setData(1,"Amit",15000);
		e2.setData(9,"Sumit",5000);
		e3.setData(7,"Jeet",50000);
		e4.setData(2,"Dev",25000);
		
		HashMap<Integer, Employee> hm=new HashMap<Integer,Employee>();
		
		hm.put(e1.getId(), e1);
		hm.put(e2.getId(), e2);
		hm.put(e3.getId(), e3);
		hm.put(e4.getId(), e4);
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(7));
		
		
		
	}

}
