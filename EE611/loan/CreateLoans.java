import java.util.Scanner;

 class CreateLoans {
    Loan[] loans;

    public CreateLoans() {
        loans = new Loan[5];
    }

    public void createLoans() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current prime interest rate: ");
        double primeInterestRate = scanner.nextDouble();
        scanner.nextLine();
        for (int i = 0; i < loans.length; i++) {
            System.out.println("\nLoan " + (i+1));
            System.out.print("Enter the type of loan \n(B for business or P for personal): ");
            String loanType = scanner.nextLine();
            System.out.print("Enter the loan number: ");
            String loanNumber = scanner.nextLine();
            System.out.print("Enter the customer's last name: ");
            String customerLastName = scanner.nextLine();
            System.out.print("Enter the amount of loan: ");
            double amountOfLoan = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the term (1 for short-term, 3 for medium-term, or 5 for long-term): ");
            int term = scanner.nextInt();
            scanner.nextLine();
            
            
            if (loanType.equals("B")) {
                loans[i] = new BusinessLoan(loanNumber, customerLastName, amountOfLoan, term,primeInterestRate);
            } else if (loanType.equals("P")) {
                loans[i] = new PersonalLoan(loanNumber, customerLastName, amountOfLoan, term,primeInterestRate);
            } else {
                System.out.println("Invalid loan type. Creating a short-term personal loan.");
                loans[i] = new PersonalLoan(loanNumber, customerLastName, amountOfLoan, 1,5.0);
            }
        }
       
    }

//void methods for calculating
    public void displayLoans() {
        double totalAmountOwedAtDueDate = 0;
        for (int i = 0; i < loans.length; i++) {
            System.out.println("\nLoan " + (i+1));
            System.out.println(loans[i]);
            totalAmountOwedAtDueDate += loans[i].amountOfLoan * (1 + loans[i].interestRate());
        }
        System.out.println("\nTotal amount owed at due date: " + totalAmountOwedAtDueDate);
    }

    public static void main(String[] args) {
        CreateLoans createLoansApp = new CreateLoans();
        createLoansApp.createLoans();
        createLoansApp.displayLoans();
    }
}
