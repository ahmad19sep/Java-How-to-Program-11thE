package OOPInheritance.java;

public class CarLoan extends PrincipalLoan {
    private int tenureLoan;
    public CarLoan(int tenureLoan, int principalLoan ) {
        super(principalLoan);
       this.tenureLoan=tenureLoan;
    }

    public int getTenureLoan() {
        return tenureLoan;
    }

   public int  getMonthlyInstallment(){
    return ((super.getPrincipalLoan())/getTenureLoan());
    }
}


















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































