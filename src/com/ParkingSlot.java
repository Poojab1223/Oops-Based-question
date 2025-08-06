package com;

public class ParkingSlot {
	public ParkingSlot(Vehicle vehicle, int duration, int chargePerMinutes) {
		super();
		this.vehicle = vehicle;
		this.duration = duration;
		this.chargePerMinutes = chargePerMinutes;
	}
	Vehicle vehicle;
	int duration;
	int chargePerMinutes;
	void dispalyInfo(Vehicle v) {
		int parkingCharge=duration*chargePerMinutes;
		System.out.println("the parkingCharge is"+parkingCharge);
		if(v instanceof Truck) {
			v.setVehicleType("truck");
		}
		else if(v instanceof Car) {
			v.setVehicleType("car");
		}
		else
			v.setVehicleType("bike");
		
		System.out.println("vehicleId= "+v.getId()+"\n"+"vehicleType"+v.getVehicleType());
	}

}
