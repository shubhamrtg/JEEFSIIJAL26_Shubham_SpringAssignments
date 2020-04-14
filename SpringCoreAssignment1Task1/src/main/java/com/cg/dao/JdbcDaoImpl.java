package com.cg.dao;

public class JdbcDaoImpl implements IDao{

	public JdbcDaoImpl() {
		System.out.println("JDBC DAO Constructor");
	}

	public String getName() {
		return "jdbc name";
	}

}
