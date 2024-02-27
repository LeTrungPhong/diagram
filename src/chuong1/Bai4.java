package chuong1;

import java.util.Scanner;

public class Bai4 {
	public static void HPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he phuong trinh bac nhat");
		System.out.println("ax + by = c");
		System.out.println("dx + ey = f");
		System.out.print("Nhap a: ");
		float a = scanner.nextFloat();
		System.out.print("Nhap b: ");
		float b = scanner.nextFloat();
		System.out.print("Nhap c: ");
		float c = scanner.nextFloat();
		System.out.print("Nhap d: ");
		float d = scanner.nextFloat();
		System.out.print("Nhap e: ");
		float e = scanner.nextFloat();
		System.out.print("Nhap f: ");
		float f = scanner.nextFloat();
		
		double deltaX = c*e - b*f;
		double deltaY = a*f - c*d;
		double delta  = a*e - b*d;
		if(delta == 0) {
			if(deltaX != 0 || deltaY != 0) {
				System.out.println("He phuong trinh bac nhat khong co nghiem");
			}
			else {
				System.out.println("He phuong trinh bac nhat co vo so nghiem");
			}
		}
		else {
			System.out.println("Nghiem cua he phuong trinh la: x = " + deltaX/delta + ", y = " + deltaY/delta);
		}
	}
	public static void main(String[] args) {
		Bai4 bai4 = new Bai4();
		bai4.HPTB1();
	}
}
