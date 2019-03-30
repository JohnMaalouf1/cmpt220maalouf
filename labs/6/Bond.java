package lab6;

public class Bond {
     private double coupon;
     private int payments;
     private double interests;
     private double valueMaturity;

    public Bond(){

    }

    public Bond(double coupon, int payments, double interests, double valueMaturity){
        this.coupon = coupon;
        this.payments = payments;
        this.interests = interests;
        this.valueMaturity = valueMaturity;
    }

    public double getPrice(){
        //double x = coupon * (1 - (1/Math.pow((1 + payments), payments))) + valueMaturity * 1 / Math.pow((1+interests), payments);
        //double price = coupon * (1 - (1/Math.pow((1 + interests), payments))) + valueMaturity * 1;
        //double finalPrice = price / Math.pow((1 + interests), payments);

        double price1 = 1/Math.pow(1+interests, payments);
        double finalPrice = coupon * (1-price1) + valueMaturity * price1;

        return finalPrice;

    }
}
