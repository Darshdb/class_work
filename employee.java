/*Q.1 You need to create a table named employees in the database to store employee information. Write a Java program using JDBC to create the employees table with the following columns:

id of type INT, which is the primary key and auto-incremented.
first_name of type VARCHAR(50) to store the employee's first name.
last_name of type VARCHAR(50) to store the employee's last name.
age of type INT to store the employee's age.*/

package com.jdbcon.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employee {
   static final String DB_URL = "jdbc:mysql://localhost/meradb";
   static final String USER = "root";
   static final String PASS = "Darsh@7022";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/meradb","root","Darsh@7022");
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE employee " +
                   "(id INTEGER," +
                   " first_name VARCHAR(255), " + 
                   " last_name VARCHAR(255), " + 
                   " age INTEGER)"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
 