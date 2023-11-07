public class BusinessLoan extends Loan {
    public BusinessLoan(String loanNumber, String customerLastName, double amountOfLoan, int term,double primeInterestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term,primeInterestRate);
        interestRate = 1 + 0.01+ primeInterestRate;
    }

    public double interestRate() {
        return interestRate;
    }
}
