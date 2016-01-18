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
			case "+" :
				try {
					argRunner.suma(Integer.valueOf(first),Integer.valueOf(second));
				} catch (UserException e) {
					System.out.println(e.getMessage());
					System.out.println("Введите два параметра! ");
				}
				break;
			case "-" :
				try {
					argRunner.subtract(Integer.valueOf(first),Integer.valueOf(second));
				} catch (UserException e) {
					System.out.println(e.getMessage());
					System.out.println("Введите два параметра! ");
				}
				break;
			case "*" :
				try {
					argRunner.multiply(Integer.valueOf(first),Integer.valueOf(second));
				} catch (UserException e) {
					System.out.println(e.getMessage());
					System.out.println("Введите два параметра! ");
				}
				break;
			case "/" :
				try {
					argRunner.divide(Integer.valueOf(first),Integer.valueOf(second));
				} catch (UserException e) {
					System.out.println(e.getMessage());
					System.out.println("Введите два параметра! ");
				}
				break;
			default: System.out.println("Error operation!");
		}
	}


}