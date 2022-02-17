package Lab7;

public class Students  extends Person{
	private float mark1;
	private float mark2;

	

	public Students(String fullName, String address, float mark1, float mark2) {
		super(fullName, address);
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public Students() {
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

	public float getMark2() {
		return mark2;
	}

	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}

	public float caculateAvrMark() {
		return (this.mark1 + this.mark2) / 2;
	}

	@Override
	public String toString() {
		return "Students [mark1=" + mark1 + ", mark2=" + mark2 + ", AverageMark=" + caculateAvrMark() + "]"+super.toString();
	}

	
	

	
	

}
