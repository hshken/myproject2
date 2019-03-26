package com.java2.buylist;


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;



public class Testlist {

	public static void main(String[] args) {
		List items = new ArrayList();
		for(int i=1; i==i ;i++) {
		Scanner scanner =new Scanner (System.in);
		System.out.print("請輸入商品:");
		String name= scanner.nextLine();
		System.out.print("請輸入數量:");
		int buynumber = Integer.parseInt(scanner.nextLine());
		items.add(name);
		items.add(buynumber);
		System.out.println(items);
		if(buynumber==0) {
			break; 
		}
		
		
		}
		
	}
}

