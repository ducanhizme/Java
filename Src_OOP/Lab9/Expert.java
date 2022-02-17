package Lab9;

public class Expert extends Staff implements Salary{
	private String departmentName;
	private double coefficientSalary;

	public Expert(String fullName, String gender, int age, String address, String departmentName,double coefficientSalary) {
		super(fullName, gender, age, address);
		this.departmentName = departmentName;
		this.coefficientSalary = coefficientSalary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

	@Override
	public double caculateSalary() {
		return this.coefficientSalary *	1650000;
	}

	@Override
	public String toString() {
		return "Expert [departmentName=" + departmentName + ", coefficientSalary=" + coefficientSalary
				+ ", caculateSalary()=" + caculateSalary() + ", toString()=" + super.toString() + "]";
	}
}
