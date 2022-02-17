package Lab10;

public class Cycle extends Transportation implements Tax{
	private String color;
	private double cost;
	
	
	
	
	public Cycle(String transportationName, String manufacturerName, String color, double cost) {
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
		return "Cycle [color=" + color + ", cost=" + cost + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double caculateTax() {
		System.out.println(this.getTransportationName()+" : khong tinh thue");
		return 0;
	}
	
	
}
