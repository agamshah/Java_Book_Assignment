package com.montran.pojo;

import java.sql.Time;

public class Test {

	private int hours;
	private int minutes;
	private int seconds;
	
	public void settime(int hrs, int min, int sec) 
	{
		this.hours = hrs;
		this.minutes = min;
		this.seconds = sec;
	}
	public void showtime()
	{
		System.out.println("Enter hours : " +hours);
		System.out.println("Enter minutes : " + minutes);
		System.out.println("Enter seconds : " +seconds);
	}
	public Test sum (Test t2) 
	{
	    Test t3 = new Test();
		t3.seconds=seconds+t2.seconds;
		t3.minutes=minutes+t2.minutes;
		t3.hours=hours+t2.hours;
		return (t3);
		
	}

}
