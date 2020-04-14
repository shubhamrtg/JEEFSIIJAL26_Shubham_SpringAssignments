package com.cg.service;

import java.util.Map;

import com.cg.entity.Emp;

public class ServiceImpl implements IService{

	private Map<Integer,Emp> emap;
	
	public ServiceImpl(Map<Integer, Emp> emap) {
		super();
		this.emap = emap;
	}

	public Emp getEmployee(int eid) {
		return emap.get(eid);
	}

}
