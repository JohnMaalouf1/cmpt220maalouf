package Appliances;
// Package

public class Telephone extends Appliance {
	// Class Inherits from Appliance ClSs
	String type;
	private boolean cracked;
	private String brand;
	// Variables

	public Telephone(double voltage, String color, String madeIn, double price, boolean cracked, String brand, String type) {
		// Constructor
		super(voltage,color,madeIn,price);
		this.cracked = cracked;
		this.brand = brand;
		this.type = type;
	}
	
	public Telephone(double price) {
		// SuperConstructor
		super(60, "Blue", "USA", price);
		cracked = false;
		brand = "Apple";
		type = "Smart";
	}
	// Setters and Getters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCracked() {
		return cracked;
	}

	public void setCracked(boolean cracked) {
		this.cracked = cracked;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString()
	{
		// To String Method
		return "THe price is : $" + super.getPrice()+ "| The color is : " + super.getColor() + "| It was made in : " + super.getMadeIn();
	}
}
