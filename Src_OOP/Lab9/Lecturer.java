package Lab9;

public class Lecturer extends Staff implements Salary {
	private String  facultyName;
	private double coefficientSalary;
	private double coefficientSalary2;

	public Lecturer(String fullName, String gender, int age, String address, String facultyName,
			double coefficientSalary, double coefficientSalary2) {
		super(fullName, gender, age, address);
		this.facultyName = facultyName;
		this.coefficientSalary = coefficientSalary;
		this.coefficientSalary2 = coefficientSalary2;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	public double getCoefficientSalary2() {
		return coefficientSalary2;
	}


	public void setCoefficientSalary2(double coefficientSalary2) {
		this.coefficientSalary2 = coefficientSalary2;
	}

	@Override
	public double caculateSalary() {
		 return this.coefficientSalary *1650000;
	}
	
	public double totalSalary() {
		return (this.coefficientSalary * this.coefficientSalary2)*1650000;
	}

	@Override
	public String toString() {
		return "Lecturer [facultyName=" + facultyName + ", coefficientSalary=" + coefficientSalary
				+ ", coefficientSalary2=" + coefficientSalary2 + ", caculateSalary()=" + caculateSalary()
				+ ", totalSalary()=" + totalSalary() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
