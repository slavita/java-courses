package ru.lesson7.lesson_test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	 задаём валидатор от чисел 0-9,который может содержать минимум 1 максимум 10 символов.
	 @Pattern - скомпилированное представление регулярного выражения. Для компиляции нужно вызвать статический метод compile.
	 @Matcher - движок, который производит операцию сравнения (match).
	 @boolean var - хранит результат сравнения(true или false).

	 */
	public void setNumbersfirrst() {
		System.out.println("Enter first arg :  ");
		Pattern pattern = Pattern.compile("([0-9]){1,10}");
		boolean var = false;

		while (!var) {
			this.first = reader.next();
			Matcher matcher = pattern.matcher(first);
			var = matcher.matches();
		}

	}
	/**
	 ввод второй цифры для дальнейших вычислений.
	 задаём валидатор от чисел 0-9,который может содержать минимум 1 максимум 10 символов.
	 */
	public void setNumberssecond() {
		System.out.println("Enter second arg :  ");
		Pattern pattern = Pattern.compile("([0-9]){1,10}");
		boolean var = false;
		while (!var) {
			this.second = reader.next();
			Matcher matcher = pattern.matcher(second);
			var = matcher.matches();
		}
	}
	/**
	 ввод операции для дальнейших вычислений.
	 задаём валидатор символов +*=/.
	 */
	public void setOperation() {
		System.out.println("Enter operation :  ");
		Pattern pattern = Pattern.compile("[\\Q+-*/\\E]");
		boolean var = false;
		while (!var) {
			this.operation = reader.next();
			Matcher matcher = pattern.matcher(operation);
			var = matcher.matches();
		}
	}
	/**
	 ввод переменной для выхода из программы.
	 задаём валидатор yes или no.
	 */
	public void exit(){
		System.out.println("Exit : yes/no ");
		Pattern pattern = Pattern.compile("yes|no");
		boolean var = false;
		while (!var) {
			this.exit = reader.next();
			Matcher matcher = pattern.matcher(exit);
			var = matcher.matches();
		}
	}

	/**
	 очистить или использовать повторно результат вычисления.
	 */
	public void reusingResult() throws UserException {
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
						throw new UserException("Error input!");
				}
			}
		}

	}
}
