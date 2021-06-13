package com.te.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.te.bean.StudentData;

public class StudentDaoJdbc implements StudebtDao {

	@Override
	public StudentData getSingleRecord(int id) {
		
		StudentData sd=new StudentData();
		
		try {
			String dburl="jdbc:mysql://localhost:3306/student";
			
			Connection con=DriverManager.getConnection(dburl, "root", "Ra2420hul");
			Statement st=con.createStatement();
			String querry="select * from student12 where id="+id+";";
			ResultSet rs=st.executeQuery(querry);
			
			while(rs.next()) {
				sd.setId(rs.getInt("id"));
				sd.setName(rs.getString("name"));
				sd.setAge(rs.getInt("age"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return sd;
	}

	@Override
	public void getAllRecords() {
		System.out.println("hi");
		
	}

	@Override
	public void insertRecord(StudentData a) {
		System.out.println("bye");
		
	}

}
