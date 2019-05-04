package Appliances;
// Package

public class Toaster extends Appliance {
	// Class Inherits from Appliance Class
	int numOfSlots;
	boolean broken;
	String size;
	// Variables Declared

	public Toaster(double v, String c, String mi, double p, boolean broken, String size) {
		// Constructor
		super(v, c, mi, p);
		this.broken = broken;
		this.size = size;
	}

	public Toaster(double p) {
		// Super Constructor
		super(120, "Silver", "Japan", p);
		numOfSlots = 2;
		broken = false;
		size = "6in";
	}
	// Setters and Getters
	public int getNumOfSlots() {
		return numOfSlots;
	}

	public void setNumOfSlots(int numOfSlots) {
		this.numOfSlots = numOfSlots;
	}

	public boolean isBroken() {
		return broken;
	}

	public void setBroken(boolean broken) {
		this.broken = broken;
	}

	public String toString()
	{
		return "The price is : $" + super.getPrice()+ "| The color is : " + super.getColor() + "| It was made in : " + super.getMadeIn();
	}
}
