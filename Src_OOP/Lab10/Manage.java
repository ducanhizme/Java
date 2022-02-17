package Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
	public void menu() {
		System.out.println("-----Menu-----");
		System.out.println("1.Xe dap");
		System.out.println("2.Xe khach");
		System.out.println("3.Xe tai");
		System.out.println("0.Thoat");
	}
	
	ArrayList<Transportation> list = new ArrayList<>();
	
	
	public Transportation inputCycle() {
		System.out.println("Nhap vao ten xe: ");
		String transportationName =new Scanner(System.in).nextLine();
		System.out.println("Nhap vao hang san xuat: ");
		String manufacturer = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao mau xe: ");
		String color = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao don gia: ");
		double cost = new Scanner(System.in).nextDouble();
		return new Cycle(transportationName, manufacturer, color, cost);
		
	}
	
	public Transportation inputPassengerCar() {
		System.out.println("Nhap vao ten xe: ");
		String transportationName =new Scanner(System.in).nextLine();
		System.out.println("Nhap vao hang san xuat: ");
		String manufacturer = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao mau xe: ");
		String color = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao don gia: ");
		double cost = new Scanner(System.in).nextDouble();
		System.out.println("Nhap vao so cho ngoi: ");
		int seat = new Scanner(System.in).nextInt();
		return new PassengerCar(transportationName, manufacturer, color, cost, seat);
	}
	
	public Transportation inputTruck() {
		System.out.println("Nhap vao ten xe: ");
		String transportationName =new Scanner(System.in).nextLine();
		System.out.println("Nhap vao hang san xuat: ");
		String manufacturer = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao mau xe: ");
		String color = new Scanner(System.in).nextLine();
		System.out.println("Nhap vao don gia: ");
		double cost = new Scanner(System.in).nextDouble();
		return new Truck(transportationName, manufacturer, color, cost);
	}
	
	public void input() {
		menu();
		int choice;
		do {
			System.out.println("Nhap vao lua chon cua ban: ");
			choice =  new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				list.add(inputCycle());
				break;
			case 2:
				list.add(inputPassengerCar());
				break;
			case 3:
				list.add(inputTruck());
				break;
			default:
				System.out.println("Moi ban nhap lai: ");
			}
		}while(choice !=0);
	}
	
	public void show() {
		for(Transportation info : list) {
			System.out.println(info);
		}
	}
}
	

