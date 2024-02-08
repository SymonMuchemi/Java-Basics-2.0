package interfaces;

public class Main {
    public static void main(String[] args) {
        var taxCalculator = new TaxCalculator2018(100_000);
        var taxReport = new TaxReport();
        taxReport.show(taxCalculator);

        // using setter injection
        taxReport.show(new TaxCalculator2019());
    }
}