package Lab9;

public class Manager extends Staff implements Salary {
	private String workPlaceName;
	private double coefficientSalary;
	
	public Manager(String fullName, String gender, int age, String address, String workPlaceName,double coefficientSalary) {
		super(fullName, gender, age, address);
		this.workPlaceName = workPlaceName;
		this.coefficientSalary = coefficientSalary;
	}


	public String getWorkPlaceName() {
		return workPlaceName;
	}

	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public double caculateSalary() {
		return this.coefficientSalary *1650000;
	}
	
	public double totalSalary() {
		return this.caculateSalary()+(this.caculateSalary()*0.2);
	}

	@Override
	public String toString() {
		return "Manager [workPlaceName=" + workPlaceName + ", coefficientSalary=" + coefficientSalary
				+ ", caculateSalary()=" + caculateSalary() + ", totalSalary()=" + totalSalary() + "]";
	}
	
	
	
	
	
	
	
}
