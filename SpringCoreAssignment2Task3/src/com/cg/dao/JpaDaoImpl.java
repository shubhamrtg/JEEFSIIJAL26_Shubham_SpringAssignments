package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jpadao")
@Lazy(true)
public class JpaDaoImpl implements IDao{

	public JpaDaoImpl() {
		System.out.println("jpa dao constructor");
	}

	@Override
	public String getName() {
		return "jpa name";
	}

}
