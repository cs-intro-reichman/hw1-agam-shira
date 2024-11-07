// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double interestRate = ( Double.parseDouble(args[1]));
		int year = Integer.parseInt(args[2]);
		int futureValue = (int)((currentValue * (Math.pow (1+ (interestRate/100), year))));
		System.out.println("After " + year + " years, a $" + currentValue +" saved at "
							 + interestRate + "% will yield $" + futureValue);
	}
}