package math;

public class Calculator {
	public Calculator(){
		
	}
	
	public int add(int n, int m){
		return n + m;
	}
	
	public int factorial(int n){
		if(n == 1)
			return 1;
		else 
			return n*factorial(n-1);
	}
	
	public int fibonnaci(int n, int m, int limit){
		int sum = n+m;
		if(sum > limit)
			return sum;
		else
			return fibonnaci(m, sum, limit);
	}

	public int subtract(int n, int m){
		return n - m;
	}
}
