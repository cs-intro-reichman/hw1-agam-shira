// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		int interestRate = ( Integer.parseInt(args[1]) / 100 );
		int year = Integer.parseInt(args[2]);
		int futureValue = (int)(currentValue * (Math.pow (1+ (interestRate), year)));
		System.out.println("After " + year + " years , $" + currentValue +" saved at "
							 + interestRate +"% will yield $ " + futureValue);
	}
}