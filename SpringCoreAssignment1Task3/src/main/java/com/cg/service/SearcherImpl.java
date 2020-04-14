package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

public class SearcherImpl implements ISearcher{

	private List<String> cityList;
	
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public boolean search(String str) {
		return cityList.stream().anyMatch(s->s.equalsIgnoreCase(str));
	}

	public List<String> searchStartWith(String str) {
		return cityList.stream().filter(s -> s.startsWith(str)).collect(Collectors.toList());
	}

	public List<String> displayAll() {
		return cityList;
	}

	
}
