package Execption;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;


public class exceptionvar {

	static int ab=33;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		//Class.forName("com.mysql.cj.jdbc.Driver");
       // connection = DriverManager.getConnection(
           // "jdbc:mysql://localhost:3306/mydb",
           // "mydbuser", "mydbuser");//SQL Execption
		//FileInputStream fs=new FileInputStream(" "); file not found execption(compile time)
        //Thread.sleep(ab);//Interrupted Execption
		int a=1;
		int b=0;
		int c;
		int array[]= new int[4];
		array[5]=12;
		//int d="abc"; compile time execption
		//c=a/b; run time execption
		String s=null;
		//System.out.println(s.length());
		System.out.println(array[5]);
	}

}


//User Defined Exeception

//Built in execption
	//Checked execption-compile time=File not found execption,Sql exception,Interrupted Execption
	//Unchecked execption-run time=ArrayIndexOutOf, Nullpointer, airthemetic



