package com.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
public interface commondao {

	Connection getConnnection() throws SQLException;

	Map<Integer, String> selectStates() throws SQLException;
	Map<Integer, String> selectCities(int stateId) throws SQLException;
	Map<Integer, String> selectCities2() throws SQLException;
}
