package chuong1;

import java.util.Scanner;

public class Bai11 {
	
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
		
		int kq = 1;
		
		check = n%2 == 0 ? true : false;
		// true so chan
		// false so le
		
		if(check) {
			for(int i = 2; i <= n; i=i+2) {
				kq = kq * i;
			}
		}else	{
			for(int i = 1; i <= n; i=i+2) {
				kq = kq * i;
			}
		}
		
		System.out.println("n!! = " + kq);
	}
	
	public static void main(String[] args) {
		Bai11 bai11 = new Bai11();
		bai11.resolve();
	}
}
