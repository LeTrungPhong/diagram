package chuong1;

import java.util.Scanner;

public class Bai14 {
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen m: ");
		int m = scanner.nextInt();
		boolean check = true;
		if(m == 0 || m == 1 || m < 0) {
			check = false;
		}
		for(int i = 2; i <= Math.sqrt(m); ++i) {
			if(m%i == 0) {
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println(m + " la so nguyen to");
		}else {
			System.out.println( m + " khong phai la so nguyen to");
		}
	}
	
	public static void main(String[] args) {
		Bai14 bai14 = new Bai14();
		bai14.resolve();
	}
}
