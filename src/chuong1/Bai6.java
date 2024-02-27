package chuong1;

import java.util.Scanner;

public class Bai6 {
	
	public static void resolveKaraoke() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap gio bat dau: ");
		int a;
		boolean check = false;
		do {
			if(check) {
				System.out.println("Nhap gio bat dau sai");
				System.out.print("Nhap lai gio bat dau: ");
			}
			check = true;
			a = scanner.nextInt();
		}while(a < 0 || a >= 24);
		check = false;
		System.out.print("Nhap gio ket thuc(dieu kien be hon gio bat dau): ");
		int b;
		do {
			if(check) {
				System.out.println("Nhap gio ket thuc sai hoac gio ket thuc be hon gio bat dau");
				System.out.print("Nhap lai gio ket thuc: ");
			}
			check = true;
			b = scanner.nextInt();
		} while(b < 0 || b >= 24 || b < a);
		if(b < 18) {
			System.out.println("Tong so tien la: " + (b-a)*45000);
		} else if(b > 18) {
			System.out.println("Tong so tien la: " + (b-a)*60000);
		}
	}
	
	public static void main(String[] args) {
		Bai6 bai6 = new Bai6();
		bai6.resolveKaraoke();
	}
}
