package ru.lesson7.lesson_test;
/**
	класс реализующий калькулятор.
*/
public class Calculator {
	/**
	Результат вычислений.
	*/
	public static int result;
	/**
	
	получить результат.
	@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}

	/**
	 * провести вычисления в зависимости от введённой операции
	 * получить результат.
	 * @return результат вычисления.
	 * @ArgRunner класс отвечающий за виполнение операций
	 */
	public void calculation(String first, String second, String operation){
		ArgRunner argRunner = new ArgRunner();
		switch (operation){
			case "+" : argRunner.suma(Integer.valueOf(first),Integer.valueOf(second));
				break;
			case "-" : argRunner.subtract(Integer.valueOf(first),Integer.valueOf(second));
				break;
			case "*" : argRunner.multiply(Integer.valueOf(first),Integer.valueOf(second));
				break;
			case "/" : argRunner.divide(Integer.valueOf(first),Integer.valueOf(second));
				break;
			default: System.out.println("Error operation!");
		}
	}


}