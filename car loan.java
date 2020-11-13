//Car Loan Payment Calculator
public class CarLoan {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int dowmPayment = 2000;
  if(loanLength <=0 || interestRate <= 0)
  {
    System.out.println("Error! You must take out a valid car loan.");
  }
  else if(dowmPayment >= carLoan)
  {
    System.out.println("CAr can be paid in full");
  }
  else
  {
    int remainingBalance =carLoan - dowmPayment;
    int months = loanLength*12;
    //montly payment without interest
    int montlyBalance = remainingBalance / months;
    int interest = (montlyBalance*interestRate)/100;
    int montlyPayment = montlyBalance + interest;
    System.out.println(montlyPayment);

  }

	}
}