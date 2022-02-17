package Lab2;

public class HCN {
	double length;
	double witdh;
	public HCN() {
	}
	public HCN(double length, double witdh) {
		this.length = length;
		this.witdh = witdh;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0) 
			this.length = length;
	}
	public double getWitdh() {
		return witdh;
	}
	public void setWitdh(double witdh) {
		if(witdh > 0)
			this.witdh = witdh;
	}
	public double caculateArea() {
		return this.witdh * this.length;
	}
	public double caculatePerimeter() {
		return (this.witdh + this.length)*2;
	}
	@Override
	public String toString() {
		return "Chieu dai: "+ this.length+" Chieu rong: "+ this.witdh+" Chu vi la: "+caculatePerimeter()+"Dien tich la: "+ caculateArea();
	}
	
	
	
}
