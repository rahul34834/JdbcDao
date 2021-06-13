package com.te.dao;

import com.te.bean.StudentData;

public interface StudebtDao {
	
	public StudentData getSingleRecord(int id);
	
	public void getAllRecords();
	public void insertRecord(StudentData a);
	

}
