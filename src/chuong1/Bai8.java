package chuong1;

import java.util.Scanner;

public class Bai8 {
	
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
		double kq = 0;
		for(int i = 1; i <= n; ++i) {
			kq += 1.0/i;
		}
		System.out.println("Ket qua chuong trinh: " + kq);
	}
	
	public static void main(String[] args) {
		Bai8 bai8 = new Bai8();
		bai8.resolve();
	}
}
