public abstract class Loan implements LoanConstants {
    String loanNumber;
    String customerLastName;
    double amountOfLoan;
    double interestRate;
    int term;
    double primeInterestRate;

    public Loan(String loanNumber, String customerLastName, double amountOfLoan, int term,double primeInterestRate) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.amountOfLoan = amountOfLoan > MAX_LOAN_AMOUNT ? MAX_LOAN_AMOUNT : amountOfLoan;
        this.term = term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM ? term : SHORT_TERM;
        this.primeInterestRate = primeInterestRate;
    }

    public abstract double interestRate();

    public String toString() {
        return "Loan number: " + loanNumber + "\nCustomer last name: " + customerLastName + "\nAmount of loan: " + amountOfLoan + "\nInterest rate: " + interestRate() + "\nTerm: " + term +" prime interest "+primeInterestRate;
    }
}
