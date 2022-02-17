package Lab7;

public class Customer extends Person {
	private String companyName;
	private float billValue;
	private float tax;
	private float totalMoney;

	public Customer(String fullName, String address, String companyName, float billValue, float tax, float totalMoney) {
		super(fullName, address);
		this.companyName = companyName;
		this.billValue = billValue;
		this.tax = tax;
		this.totalMoney = totalMoney;
	}

	public Customer() {
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public float getBillValue() {
		return billValue;
	}

	public void setBillValue(float billValue) {
		this.billValue = billValue;
	}

	public float getTax() {
		return tax;
	}

	public float getTotalMoney() {
		return totalMoney;
	}

	@Override
	public String toString() {
		return "Customer [companyName=" + companyName + ", billValue=" + billValue + ", tax=" + tax + ", totalMoney="
				+ totalMoney + ", getTax()=" + getTax() + ", getTotalMoney()=" + getTotalMoney() + "]";
	}

}
