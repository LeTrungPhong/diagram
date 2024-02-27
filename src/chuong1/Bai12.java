package chuong1;

import java.util.Scanner;

public class Bai12 {
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong m: ");
		boolean check = false;
		int m;
		do {
			if(check) {
				System.out.println("Nhap sai so nguyen duong m.");
				System.out.print("Nhap lai do nguyen duong m: ");
			}
			check = true;
			m = scanner.nextInt();
		}while(m <= 0);
		
		int P = 1;
		int S = 0;
		
		while(m / 10 != 0 || m % 10 != 0) {
			P = P * (m%10);
			S = S + (m%10);
			m = m/10;
		}
		System.out.println("S: " + S);
		System.out.println("P: " + P);
	}
	
	public static void main(String[] args) {
		Bai12 bai12 = new Bai12();
		bai12.resolve();
	}
}
