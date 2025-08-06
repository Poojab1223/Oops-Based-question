package com;

public class MainClass {
	public static void main(String[] args) {
		Vehicle v1=new Truck("765hdfd");
		Vehicle v2 = new Truck("T201");
		Vehicle v3 = new Bike("B301");
		Vehicle v4 = new Car("C102");
		Vehicle v5 = new Truck("T202");
		Vehicle v6 = new Bike("B302");
		Vehicle v7 = new Car("C103");
		Vehicle v8 = new Bike("B303");
		Vehicle v9 = new Truck("T203");
		Vehicle v10 = new Car("C104");
		ParkingSlot p1=new ParkingSlot(v1,34,3);
		p1.dispalyInfo(v1);
		ParkingSlot p2 = new ParkingSlot(v2, 35, 1);
		ParkingSlot p3 = new ParkingSlot(v3, 36, 2);
		ParkingSlot p4 = new ParkingSlot(v4, 37, 2);
		ParkingSlot p5 = new ParkingSlot(v5, 38, 3);
		ParkingSlot p6 = new ParkingSlot(v6, 39, 3);
		ParkingSlot p7 = new ParkingSlot(v7, 40, 4);
		ParkingSlot p8 = new ParkingSlot(v8, 41, 4);
		ParkingSlot p9 = new ParkingSlot(v9, 42, 5);
		ParkingSlot p10 = new ParkingSlot(v10, 43, 5);
		
		ParkingSlot[] arr= {p1,p2,p3,p4,p5,p6,p7,p8,p9};
		int revenue=0;
		for(int i=0;i<arr.length;i++) {
			revenue=revenue+(arr[i].chargePerMinutes * arr[i].duration);
		}
		System.out.println("total revenutue generated is "+revenue);
		
	}

}
