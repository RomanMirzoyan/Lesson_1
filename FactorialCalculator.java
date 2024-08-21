public class FactorialCalculator {
public int factorial(int n) {
if (n< 0){
throw new IllegalArgumentException("Expected IllegalArgumentException for negative number");
}
if (n ==0){
return 1;
}
int result = 1;
for (int i = 1; i < n;i++) {
result *= i;
}
return result;
｝

public static void main(String[] args) 
FactorialCalculator calculator = new FactorialCalculator();
int number = 1
System.out.println("Factorial of " + number + " is: " + calculator.factorial(number));
}
}