package chuong1;

import java.util.Scanner;

public class Bai7 {
	
	public static void countDay() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap nam: ");
		boolean check = false;
		int nam;
		do {
			if(check) {
				System.out.println("Nhap nam sai. Yeu cau nhap lai.");
				System.out.print("Nhap lai nam: ");
			}
			check = true;
			nam = scanner.nextInt();
		}while(nam < 0);
		System.out.println("Nhap thang: ");
		check = false;
		int thang;
		do	{
			if(check) {
				System.out.println("Nhap thang sai. Yeu cau nhap lai.");
				System.out.print("Nhap lai thang: ");
			}
			check = true;
			thang = scanner.nextInt();
		}while(thang < 1 || thang > 12);
		
		int ngay;
		
		switch(thang) {
			case 1:
				ngay = 31;
				break;
			case 2:
				if(nam % 4 == 0) {
					ngay = 29;
				} else {
					ngay = 28;
				}
				break;
			case 3:
				ngay = 31;
				break;
			case 4:
				ngay = 30;
				break;
			case 5:
				ngay = 31;
				break;
			case 6:
				ngay = 30;
				break;
			case 7:
				ngay = 31;
				break;
			case 8:
				ngay = 31;
				break;
			case 9:
				ngay = 30;
				break;
			case 10:
				ngay = 31;
				break;
			case 11:
				ngay = 30;
				break;
			case 12:
				ngay = 31;
				break;
			default:
				ngay = 0;
		}
		if(ngay <= 0) {
			System.out.println("Error.");
		}else {
			System.out.println("Nam: " + nam + ", Thang: " + thang + ", So ngay: " + ngay);
		}
	}
	
	public static void main() {
		Bai7 bai7 = new Bai7();
		bai7.countDay();
	}
}
