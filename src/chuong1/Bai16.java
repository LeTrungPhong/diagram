package chuong1;

import java.util.Scanner;

public class Bai16 {
	
	public static void resolve() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap M: ");
		int M = scanner.nextInt();
		boolean check = false;
		if(M >= 0) {
			int temp = M;
			int count = 0;
			do {
				++count;
				temp = temp / 10;
			}while(temp / 10 != 0 || temp % 10 != 0);
			int []arr = new int[count];
			int dem = 0;
			do {
				arr[dem] = M % 10;
				M = M / 10;
				++dem;
			}while(M / 10 != 0 || M % 10 != 0);
			
			for(int i = 0; i <= count/2; ++i) {
				if(arr[i] != arr[count-i-1]) {
					break;
				}
				if(i == count/2) {
					check = true;
				}
			}
		}
		if(check) {
			System.out.println("M la so doi xung");
		}else {
			System.out.println("M khong phai la so doi xung");
		}
	}
	
	public static void main(String[] args) {
		Bai16 bai16 = new Bai16();
		bai16.resolve();
	}
}
