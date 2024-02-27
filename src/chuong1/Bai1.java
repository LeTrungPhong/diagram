package chuong1;

import java.util.Scanner;

public class Bai1 {
	public static void cach1() {
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
		
		float max = 0;
		if(a >= b && a >= c) {
			max = a;
		}
		if(b >= a && b >= c) {
			max = b;
		}
		if(c >= a && c >= b) {
			max = c;
		}
		System.out.printf("max la: %f", max);
		System.out.println();
	}
	
	public static void cach2() {
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
		
		float max;
		
		if(a > b && a > c) {
			max = a;
		}
		else if(b > c) {
			max = b;
		} else	{
			max = c;
		}
		System.out.printf("max la: %f", max);
		System.out.println();
	}
	
	public static void cach3() {
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
		
		float max = (a >= b && a >= c)?a:((b >= c)?b:c);
		System.out.printf("max la: %f", max);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Bai1 bai1 = new Bai1();
		bai1.cach1();
		bai1.cach2();
		bai1.cach3();
	}
}
