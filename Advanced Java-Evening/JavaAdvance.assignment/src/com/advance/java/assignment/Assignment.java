package com.advance.java.assignment;

import java.io.*;
import java.util.*;
import java.sql.*;

public class Assignment {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
	    FileOutputStream out = null;
	    Random rand = new Random();
	    
	    out = new FileOutputStream("numbers.txt");
	    
	    while(true)
	    {
	    	int random_number = rand.nextInt(100);
	    	out.write(random_number);
	    	
	    	if(random_number % 5 == 0) 
	    	{
	    		break;
	    	}
	    }
	    
	    ArrayList<Integer> nums = new ArrayList<Integer>();
	    in = new FileInputStream("numbers.txt");
	    int reader;
	    
	    while((reader = in.read()) != -1)
	    {
			nums.add(reader);
		}
	    
		in.close();
		out.close();
		
		System.out.println(nums);
		
		Integer ans = nums.stream().filter(e-> e%5 == 0).map(e-> e*2).reduce(1,(a,b)->{return a*b;});
		System.out.println(ans);
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
//		Class.forName("com.mysql.jdbc.driver");
		String url = "jdbc:mysql://remotemysql.com:3306/sMkXvyYxZM";		
		String username = "sMkXvyYxZM";
		String	passowrd = "8h9tWhCKws";
		
		Connection connection = DriverManager.getConnection(url, username, passowrd);
		String sql = "insert into test values (?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		String myName = "Pushpraj";
		
		preparedStatement.setInt(1, ans);
		preparedStatement.setString(2,myName);
		preparedStatement.execute();

		ResultSet result = preparedStatement.executeQuery("select * from test");
		
		while(result.next()) 
		{
		    String id = result.getString("id");
		    String name = result.getString("name");
		    System.out.println(id+ " "+name); 
		}
	}
}
