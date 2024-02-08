package interfaces;

public class Main {
    public static void main(String[] args) {
        var taxCalculator = new TaxCalculator2018(100_000);
        var taxReport = new TaxReport(taxCalculator);
        taxReport.show();

        // using setter injection
        taxReport.setCalculator(new TaxCalculator2019());
        taxReport.show();
    }
}