package controller;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	// Fill your code
		ConnectionManager con= new ConnectionManager();
		con.getConnection();
		
		
if(con!=null)
			System.out.println("Connection established");
		else
			System.out.println("Check your connection");
		
	}
}
