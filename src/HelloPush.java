import math.Calculator;
import math.fuckyou;

public class HelloPush {
	public static void main(String[] args){
		System.out.println("What's up");
		Calculator calc = new Calculator();
		int sum = calc.add(5, 5);
		System.out.println("" + sum);
		System.out.println(""+calc.fibonnaci(1, 1, 100));
		int fact = calc.factorial(9);
		System.out.println(""+fact);
		fuckyou flip = new fuckyou();
		flip.fuck();
	}
}
