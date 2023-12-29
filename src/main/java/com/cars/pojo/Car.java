package com.cars.pojo;

public class Car {

	private String CarNo;
	private String Manufacture;
	private String Model;
	private int KmsRun;
	private int PriceExpected;
	private int NoOfOwners;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCarNo() {
		return CarNo;
	}
	public void setCarNo(String carNo) {
		CarNo = carNo;
	}
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getKmsRun() {
		return KmsRun;
	}
	public void setKmsRun(int kmsRun) {
		KmsRun = kmsRun;
	}
	public int getPriceExpected() {
		return PriceExpected;
	}
	public void setPriceExpected(int priceExpected) {
		PriceExpected = priceExpected;
	}
	public int getNoOfOwners() {
		return NoOfOwners;
	}
	public void setNoOfOwners(int noOfOwners) {
		NoOfOwners = noOfOwners;
	}
	
	
}
