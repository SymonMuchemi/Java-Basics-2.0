package interfaces;

public class TaxCalculator2018 implements TaxCalculator {
    private double incomeTax;

    public TaxCalculator2018(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    @Override
    public double calculateTax() {
        return incomeTax * 0.3;
    }
}
