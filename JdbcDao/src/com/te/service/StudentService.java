package com.te.service;

import com.te.bean.StudentData;

public interface StudentService {
	
  public StudentData getSingleRecord(int id);
	
	public void getAllRecords();
	public void insertRecord(StudentData a);

}
