package com.te.dao;

import com.te.bean.StudentData;

public class StudentDaoHibernet  implements StudebtDao{

	@Override
	public StudentData getSingleRecord(int id) {
		
		System.out.println("hibernet implementations");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("hibernet implementations");
		
		
	}

	@Override
	public void insertRecord(StudentData a) {
		System.out.println("hibernet implementations");
	}

}
