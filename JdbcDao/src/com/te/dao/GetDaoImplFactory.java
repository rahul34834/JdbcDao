package com.te.dao;

public class GetDaoImplFactory {
	
	String type="jdbc";
	public StudebtDao getDaoImpl() {
		
		if(type.equalsIgnoreCase("jdbc")) {
			return new StudentDaoJdbc();
			
		}else if(type.equalsIgnoreCase("Hibernet")) {
			return new StudentDaoHibernet();
			
		}else if(type.equalsIgnoreCase("Spring")) {
			return new StudentDAOSpring();
	}
		return null;

}
}
