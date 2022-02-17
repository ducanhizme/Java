package Lab10;

public class Transportation {
	private  String transportationName;
	private String manufacturerName;
	public Transportation(String transportationName, String manufacturerName) {
		this.transportationName = transportationName;
		this.manufacturerName = manufacturerName;
	}
	public String getTransportationName() {
		return transportationName;
	}
	public void setTransportationName(String transportationName) {
		this.transportationName = transportationName;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	@Override
	public String toString() {
		return "Transportation [transportationName=" + transportationName + ", manufacturerName=" + manufacturerName
				+ "]";
	}
	
	
	
	
}
