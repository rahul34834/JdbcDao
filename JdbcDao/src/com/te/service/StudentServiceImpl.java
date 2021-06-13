package com.te.service;

import com.te.bean.StudentData;
import com.te.dao.GetDaoImplFactory;
import com.te.dao.StudebtDao;

public class StudentServiceImpl  implements StudentService {
	
	GetDaoImplFactory gdif=new GetDaoImplFactory();
	StudebtDao dao=gdif.getDaoImpl();

	@Override
	public StudentData getSingleRecord(int id) {
		if(id<0) {
			return null;
			
		}else {
			System.out.println("student service layer");
			return dao.getSingleRecord(id);
		}
		
	}

	@Override
	public void getAllRecords() {
//		System.out.println("Fetching all records");
		
	}

	@Override
	public void insertRecord(StudentData a) {
//		System.out.println("Inserting .....!!!");
		
	}
			
	


}
