public class PersonalLoan extends Loan {
    public PersonalLoan(String loanNumber, String customerLastName, double amountOfLoan, int term,double primeInterestRate) {
        super(loanNumber, customerLastName, amountOfLoan,term,primeInterestRate);
        interestRate = 2 + 0.01 + primeInterestRate;
    }

    public double interestRate() {
        return interestRate = primeInterestRate;
    }
}