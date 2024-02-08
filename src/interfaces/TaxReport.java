/**
 * this is a simple illustration of tightly coupled classes
 * */

package interfaces;

public class TaxReport {

    // using constructor injection
    private TaxCalculator calculator;

    public TaxReport (TaxCalculator taxCalculator) {
        this.calculator = taxCalculator;
    }

    public void show() {
        var tax = calculator.calculateTax();

        System.out.println("tax = " + tax);
    }
}