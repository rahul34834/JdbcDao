package com.te.dao;

import com.te.bean.StudentData;

public class StudentDAOSpring  implements StudebtDao{

	@Override
	public StudentData getSingleRecord(int id) {
		System.out.println("spring implementations");
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("spring implementations");
		
	}

	@Override
	public void insertRecord(StudentData a) {
		System.out.println("spring implementations");
		
	}

}
