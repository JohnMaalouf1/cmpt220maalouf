package Appliances;
// Package

public class TV extends Appliance {
	// Class Inherits from Appliance class
	private String screenSize;
	private String brand;
	private String colorRange;
	// Variables

	public TV(double v, String c, String mi, double p, String screenSize, String brand, String colorRange) {
		// Constructor
		super(v, c, mi, p);
		this.screenSize = screenSize;
		this.brand = brand;
		this.colorRange = colorRange;
	}

	public TV(double price) {
		// Super Constructor
		super(120.0, "Gloss Black", "UK", price);
		screenSize = "32in";
		brand = "LG";
		colorRange = "RGB";
	}

	// Setters and Getters

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColorRange() {
		return colorRange;
	}

	public void setColorRange(String colorRange) {
		this.colorRange = colorRange;
	}

	public String toString() {
		// To String
		return "The price is : $" + super.getPrice()+ "| The color is : " + super.getColor() + "| It was made in : " + super.getMadeIn();

	}
}
