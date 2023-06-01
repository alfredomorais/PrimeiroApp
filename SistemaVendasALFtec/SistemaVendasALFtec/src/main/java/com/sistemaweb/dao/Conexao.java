package com.sistemaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

@SuppressWarnings("unused")
public class Conexao {

	private static Connection conn = null;

	private Conexao() {
	}

	public static Connection getConexao() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/sistemavenda", "root", "");
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return conn;
		}
		return conn;
	}
}
