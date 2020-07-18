package com.montran.main;

import java.util.Scanner;

import com.montran.mojo.Book;

public class BookMainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		Scanner scanner = new Scanner(System.in);
		
		book.input(01, "Rich Dad vs Poor Dad", 150);
		int a = scanner.nextInt();
		
		
		System.out.println("Enter The Number of Copies");
		int n = scanner.nextInt();
		if(n > 0)
			System.out.println("Total Amount To Be Paid is :" + book.purchase(n));
		else
			System.out.println("Please Enter Valid Number Of Copies");
	}

}
