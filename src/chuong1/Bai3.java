package chuong1;

import java.util.Scanner;

public class Bai3 {
	
	public static void PTB2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap phuong trinh bac 2: ax(2) + bx + c = 0 voi (a khac 0)");
		float a;
		boolean check = false;
		do {
			if(check) {
				System.out.println("Nhap a khac 0");
			}
			System.out.print("Nhap a: ");
			a = scanner.nextFloat();
			check = true;
		} while(a == 0);
		System.out.print("Nhap b: ");
		float b = scanner.nextFloat();
		System.out.print("Nhap c: ");
		float c = scanner.nextFloat();
		
		float denta = b*b - 4*a*c;
		if(denta < 0) {
			System.out.println("Phuong trinh vo nghiem");
		}
		if(denta == 0) {
			float kq = (-b)/(2*a);
			System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %f", kq);
		}
		if(denta > 0) {
			double x1 = (-b + Math.sqrt(denta))/(2*a);
			double x2 = (-b - Math.sqrt(denta))/(2*a);
			System.out.printf("Phuong trinh co 2 nghiem phan biet x1 = %f, x2 = %f", x1, x2);
		}
	}
	
	public static void main(String[] agrs) {
		Bai3 bai3 = new Bai3();
		bai3.PTB2();
	}
}
