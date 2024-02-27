package chuong1;

import java.util.Scanner;

public class Bai5 {
	
	public static void STG() {
		Scanner scanner = new Scanner(System.in);
		float a,b,c;
		System.out.println("Nhap 3 so a, b, c.");
		// nhap a
		System.out.print("Nhap a: ");
		a = scanner.nextInt();
		// nhap b
		System.out.print("Nhap b: ");
		b = scanner.nextInt();
		// nhap c
		System.out.print("Nhap c: ");
		c = scanner.nextInt();
		float kq = 0;
		if(a >= b && b >= c) kq = b;
		if(a >= c && c >= b) kq = c;
		if(b >= a && a >= c) kq = a;
		if(b >= c && c >= a) kq = c;
		if(c >= a && a >= b) kq = a;
		if(c >= b && b >= a) kq = b;
		System.out.printf("So trung gian la: %f", kq);
	}
	
	public static void main(String[] agrs) {
		Bai5 bai5 = new Bai5();
		bai5.STG();
	}
}
