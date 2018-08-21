package com.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.dao.commondao;
import com.shared.applicationconstants;

public class commondaoimpl implements commondao {

	public Connection getConnnection() throws SQLException {
		Connection connection = null;

		try {
			Class.forName(applicationconstants.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = DriverManager.getConnection(applicationconstants.DB_URL, applicationconstants.DB_USERNAME,
				applicationconstants.DB_PASSWORD);
		return connection;
	}

	public Map<Integer, String> selectStates() throws SQLException {

		String query = "select * from state_detail";
		Map<Integer, String> map = new HashMap<>();

		try (Connection connection = getConnnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				map.put(rs.getInt("i_state_id"), rs.getString("v_state_name"));
			}

		}

		return map;
	}
	public Map<Integer, String> selectCities2() throws SQLException {

		String query = "select * from city_detail";
		Map<Integer, String> map = new HashMap<>();

		try (Connection connection = getConnnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				map.put(rs.getInt("i_city_id"), rs.getString("i_city_name"));
			}

		}

		return map;
	}
	@Override
	public Map<Integer, String> selectCities(int stateId) throws SQLException {
		String query = "select * from city_detail where i_state_id = ?";
		Map<Integer, String> map = new HashMap<>();

		try (Connection connection = getConnnection(); PreparedStatement ps = connection.prepareStatement(query);) {
			ps.setInt(1, stateId);
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					map.put(rs.getInt("i_city_id"), rs.getString("i_city_name"));
				}
			}
		}
		return map;
	}
}
