public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int suma = first + second;
		int subtract = first - second;
		int multiply = first * second;
		int divide = first / second;
		System.out.println("Suma " + suma);
		System.out.println("Subtract " + subtract);
		System.out.println("Multiply " + multiply);
		System.out.println("Divide " + divide);
	}
}