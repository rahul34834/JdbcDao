package com.te.service;

import com.te.bean.StudentData;

public class StduentServiceMain {

	public static void main(String[] args) {
		StudentServiceImpl ssi=new StudentServiceImpl();
		StudentData sd=ssi.getSingleRecord(1);
		
		System.out.println(sd.getId());
		System.out.println(sd.getName());
		System.out.println(sd.getAge());

	}

}
