package Interfaces.DependencyInjection;

public class Taxcalculator2010 implements TaxCalculator{
    public int AnnualIncome;


    @Override
    public int calculateTax(int AnnulaIncome) {
        return annualTaxPercentage();
    }

    @Override
    public int annualTaxPercentage() {
        if(AnnualIncome>=1000000&&AnnualIncome<=2000000){
            return (int) (this.AnnualIncome*0.1);
        } else if (AnnualIncome>2000000) {
            return (int) (this.AnnualIncome*0.3);
        }
        return 0;
    }
}
