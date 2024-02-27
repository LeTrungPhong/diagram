package chuong1;

import java.util.Scanner;

public class Bai2 {
	
	public static void PTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap phuong trinh bac nhat ax + b = 0");
		System.out.print("Nhap a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhap b: ");
		float b = scanner.nextFloat();
		System.out.printf("Phuong trinh bac nhat la %f x + %f = 0", a, b);
		System.out.println();
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else	{
				System.out.println("Phuong trinh vo nghiem");
			}
		} else	{
			float kq = -b/a;
			System.out.printf("Nghiem cua phuong trinh la: %f", kq);
		}
	}
	
	public static void main(String[] args) {
		Bai2 bai2 = new Bai2();
		bai2.PTB1();
	}
}
