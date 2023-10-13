/*Q.2 The employees table in the database has the following columns: id, first_name, last_name, and age. Write a Java program using JDBC to insert a new employee record into the table. The employee's first name is "John," last name is "Doe," and age is 30.*/

package com.jdbcon.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class InsertRecord {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/meradb","root","Darsh@7022");
	
	PreparedStatement pstmt=con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?)");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee id:");
	String id=sc.next();
	
	System.out.println("Enter Employee First Name:");
	String fname=sc.next();
	
	System.out.println("Enter Employee Last Name:");
	String lname=sc.next();
	
	System.out.println("Enter Employee Age:");
	String age=sc.next();
	
	
	sc.close();
	
	pstmt.setString(1,id);
	pstmt.setString(2,fname);
	pstmt.setString(3,lname);
	pstmt.setString(4,age);
	
	int r=pstmt.executeUpdate();
	con.close();
	System.out.println(r+"record added successfully!!!");
	}

}
