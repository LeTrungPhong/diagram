package chuong1;

import java.util.Scanner;

public class Bai9 {
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		boolean check = false;
		int n;
		do {
			if(check) {
				System.out.println("Nhan n sai. n phai lon hon 0.");
				System.out.print("Nhap lai n: ");
			}
			check = true;
			n = scanner.nextInt();
		}while(n <= 0);
		
		double kq = 15;
		for(int i = 1; i <= n; ++i) {
			float tu = i%2 == 0 ? 1 : (-1);
			float mau = 1;
			for(int j = 1; j <= i; ++j) {
				mau = mau * j;
			}
			kq = kq + tu/mau;
		}
		System.out.println("Ket qua chuong trinh: " + kq);
	}
	
	public static void main(String[] args) {
		Bai9 bai9 = new Bai9();
		bai9.resolve();
	}
}
