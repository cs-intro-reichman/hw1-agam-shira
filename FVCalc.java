// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		System.out.println("please enter the current value of your saving account");
		double currentValue = Double.parseDouble(args[0]);
		System.out.println("please enter the annual interest rate");
		int interestRate = ( Integer.parseInt(args[1]) / 100 );
		System.out.println("please enter the number of years you'd like to predict your saving");
		int year = Integer.parseInt(args[2]);
		int futureValue = (int)(currentValue * (Math.pow (1+ (interestRate), year)));
		System.out.println("After " + year + " years , " + currentValue +"$ saved at "
							 + interestRate +"% will yield " + futureValue +"$");
	}
}