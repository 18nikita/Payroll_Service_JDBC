package com.bridgelabz.payrollservice;

import java.sql.*;
import java.util.Enumeration;

public class PayrollService_DB {

	public static void main(String[] args) {
		System.out.println("..WELCOME TO EMPLOYEE PAYROLL SERVICE..");

		String jdbcURL = "jdbc:mysql://localhost:3306/payroll_service_jdbc?userSSL=false";
		String userName = "Nikita";
		String password = "Root";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Connot find the driver in the classpath!", e);
		}
		listDrivers();

		try {
			System.out.println("Connecting to database:" + jdbcURL);
			con = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection is successful!!!" + con);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static void listDrivers() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driverClass = (Driver) driverList.nextElement();
			System.out.println(" " + driverClass.getClass().getName());
		}
	}
}