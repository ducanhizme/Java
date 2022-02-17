package Lab7;

public class Employee extends Person {
	private float coefficientsSalary;
	private float FOUNDATION_SALARY = 1000000;

	

	

	public Employee(String fullName, String address, float coefficientsSalary) {
		super(fullName, address);
		this.coefficientsSalary = coefficientsSalary;
	}

	public Employee() {
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	public float caculateSALARY() {
		return this.coefficientsSalary * this.FOUNDATION_SALARY;
	}

	@Override
	public String toString() {
		return "Employee [coefficientsSalary=" + coefficientsSalary + ",SALARY)=" + caculateSALARY()
				 + super.toString() + "]";
	}

	

	

}
