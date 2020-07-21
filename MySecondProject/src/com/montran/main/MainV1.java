package com.montran.main;



import com.montran.pojo.Test;

public class MainV1 {
	public static void main(String[] args) {
		
		Test test = new Test();
		Test t2 = new Test();
		
		test.settime(05, 05, 05);
		t2.settime(07, 07, 07);
		
		Test t3 = new Test();
		t3= test.sum(t2);
		test.showtime();
		t2.showtime();
		t3.showtime();
	}
}
