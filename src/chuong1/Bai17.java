package chuong1;

import java.util.Scanner;

public class Bai17 {
	
	public static boolean ktSNT(int m) {
		if(m == 0 || m == 1 || m < 0) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(m); ++i) {
			if(m%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		boolean check = false;
		int n;
		do {
			if(check) {
				System.out.println("Nhap n nguyen duong (n > 0)");
				System.out.print("Nhap lai n: ");
			}
			check = true;
			n = scanner.nextInt();
		}while(n <= 0);
		
		for(int i = 2; i <= n; ++i) {
			if(ktSNT(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Bai17 bai17 = new Bai17();
		bai17.resolve();
	}
}
