package com.service;
import java.util.Map;

public interface CommonService {

	public Map<Integer, String> selectStates();
	public Map<Integer, String> selectCities2();
	public Map<Integer, String> selectCities(int stateId);

}
