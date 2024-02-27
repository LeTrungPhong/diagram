package chuong1;

import java.util.Scanner;

public class Bai19 {
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n;
		boolean check = false;
		do {
			if(check) {
				System.out.println("Nhap n > 0");
				System.out.print("Nhap lai n: ");
			}
			check = true;
			n = scanner.nextInt();
		}while(n <= 0);
		int fb1 = 0;
		int fb2 = 1;
		System.out.print(n + " chu so fibonaci dau tien la: ");
		for(int i = 1; i <= n; ++i) {
			if(i == 1) {
				System.out.print(1 + " ");
			}else {
				System.out.print(fb1 + fb2 + " ");
				int temp = fb2;
				fb2 = fb2 + fb1;
				fb1 = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Bai19 bai19 = new Bai19();
		bai19.resolve();
	}
}
