package Lab4;

public class DIEM {
	double x;
	double y;

	public DIEM() {
	}

	public DIEM(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x= " + this.x + "\n" + "y=" + this.y;
	}

}
