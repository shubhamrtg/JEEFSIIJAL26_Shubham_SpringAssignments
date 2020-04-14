package com.cg.service;

import com.cg.dao.IDao;

public class IServiceImpl implements IService{

	private IDao dao;
	
	public IServiceImpl() {
		System.out.println("Service constructor");
	}

	public void setDao(IDao dao) {
		System.out.println("Inject the dependencies");
		this.dao = dao;
	}

	public String viewName() {
		return dao.getName();
	}

}
