package classProject;

public class Bus {
	int busNumber;
	int custorCount;
	int price;
	
	
	public int getNumber() {
		return busNumber;
	 }

	public int getCustorCount() {
		return custorCount;
	 }
	
	public int price() {
		return price;
	}
	
	public void setbusNumber(int busNumber) {
		this.busNumber = busNumber;
	} 
	
	public void setcustorCount(int custorCount) {
		this.custorCount = custorCount;
	} 
	
	public void setprice(int price) {
		this.price= price;
	} 
	
	public void take(int money) {
		this.price += money;
	}
}
	
	
	
//	public void Bus(int busNumber) {
//		this.busNumber = busNumber;
//		this.passengerCount = 0;
//		this.money = 0;
//	}
//
//	public void take(int money) {
//		this.money += money;
//		passengerCount++;
//	}
//	
//	public void showInfo() {
//		System.out.println("버스" + busNumbet + "번의 승객은" + passengerCount +
//				"명이고, 수입은" + 
//	}
//}
