package chuong1;

import java.util.Scanner;

public class Bai15 {
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen P: ");
		int P = scanner.nextInt();
		boolean check = false;
		
		if(P >= 0) {
			for(int i = 0; i <= P; ++i) {
				if(i * i == P) {
					check = true;
					break;
				}
			}
		}
		
		if(check) {
			System.out.println(P + " la so chinh phuong");
		}else {
			System.out.println(P + " khong phai la so chinh phuong");
		}
	}
	
	public static void main(String[] args) {
		Bai15 bai15 = new Bai15();
		bai15.resolve();
	}
}
