package Lab10;

public class PassengerCar extends Transportation implements Tax {
	private String color;
	private double cost;
	private int seat;
	
	
	

	public PassengerCar(String transportationName, String manufacturerName, String color, double cost, int seat) {
		super(transportationName, manufacturerName);
		this.color = color;
		this.cost = cost;
		this.seat = seat;
	}

	


	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int seat) {
		this.seat = seat;
	}


	@Override
	public double caculateTax() {
		if(this.seat >=5) {
			return this.cost -(this.cost*0.5);
		}else {
			return  this.cost -(this.cost*0.3);
		}
	}




	@Override
	public String toString() {
		return "PassengerCar [color=" + color + ", cost=" + cost + ", seat=" + seat + ", caculateTax()=" + caculateTax()
				+ "]";
	}
	
	
}
