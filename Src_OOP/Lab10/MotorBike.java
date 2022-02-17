package Lab10;

public class MotorBike extends Transportation implements Tax{
	private String color;
	private double  cost;
	private double VAT=0.15;
	public MotorBike(String transportationName, String manufacturerName, String color, double cost) {
		super(transportationName, manufacturerName);
		this.color = color;
		this.cost = cost;
	}
	@Override
	public double caculateTax() {
		return this.cost - ( this.cost * this.VAT );
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
	public double getVAT() {
		return VAT;
	}
	@Override
	public String toString() {
		return "MotorBike [color=" + color + ", cost=" + cost + ", VAT=" + VAT + ", caculateTax()=" + caculateTax()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
