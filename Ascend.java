// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int limit = Integer.parseInt(args[0]);
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		int num1 = (int) (a * limit);
		int num2 = (int) (b * limit);
		int num3 = (int) (c * limit);
		int minNum = Math.min(num1, Math.min(num2, num3));
        int maxNum = Math.max(num1, Math.max(num2, num3));
		int middleNum = ((num1 + num2 + num3) - (maxNum + minNum));
		System.out.println(minNum + " " + middleNum + " " + maxNum);
	}
}
