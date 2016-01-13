import java.util.Scanner;

/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	public String first,second,operation,exit;
	Scanner reader = new Scanner(System.in);

	/**
	 конструктор который задаёт первоначальное значение в переменную exit - "no"
	 */
	InteractRunner(){
		this.exit = "no";
	}
	/**
	 ввод первой цифры для дальнейших вычислений.
	 */
	public void setNumbersfirrst() {
		System.out.println("Enter first arg :  ");
		while (!reader.hasNextInt()) {
			reader.next();
		}
		this.first = reader.next();
	}
	/**
	 ввод второй цифры для дальнейших вычислений.
	 */
	public void setNumberssecond() {
		System.out.println("Enter second arg :  ");
		while (!reader.hasNextInt()) {
			reader.next();
		}
		this.second = reader.next();
	}
	/**
	 ввод операции для дальнейших вычислений.
	 */
	public void setOperation(){
		System.out.println("Enter operation :  ");
		this.operation = reader.next();
	}
	/**
	 ввод переменной для выхода из программы.
	 */
	public void exit(){
		System.out.println("Exit : yes/no ");
		this.exit = reader.next();
	}

	/**
	 очистить или использовать повторно результат вычисления.
	 */
	public void reusingResult(){
		if(Calculator.result != 0 ) {
			System.out.println("Reusing a calculation result : yes/no ");
			String temp = reader.next();
			{
				switch (temp) {
					case "yes":
						break;
					case "no":
						Calculator.result = 0;
						break;
					default:
						System.out.println("Error input!");
				}
			}
		}

	}
}
