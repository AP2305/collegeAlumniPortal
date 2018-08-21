package com.service.impl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import com.dao.commondao;
import com.dao.impl.commondaoimpl;
import com.service.CommonService;

public class CommonServiceImpl implements CommonService{

		commondao commonDao = new commondaoimpl();
		
	@Override
	public Map<Integer, String> selectStates() {
		try {
			return 	commonDao.selectStates();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Map<Integer, String> selectCities(int stateId) {
		try {
			return 	commonDao.selectCities(stateId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Map<Integer, String> selectCities2() {
		try {
			return 	commonDao.selectCities2();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
