package Lab10;

public class Truck  extends Transportation implements Tax{
	private String color;
	private double cost;
	
	public Truck(String transportationName, String manufacturerName, String color, double cost) {
		super(transportationName, manufacturerName);
		this.color = color;
		this.cost = cost;
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


	

	@Override
	public String toString() {
		return "Truck [color=" + color + ", cost=" + cost + ", caculateTax()=" + caculateTax() + ", toString()="
				+ super.toString() + "]";
	}



	@Override
	public double caculateTax() {
		return this.cost - (this.cost*0.1);
	}
	
	
}
