package ru.lesson7.lesson_test;

public class ArgRunner{
	/**
	 * @(int ... params) метод с переменным количеством параметров
	 * класс который добавляет операции.
	*/
	/**
	 * выполнение операции суммирования.
	 */
	public void suma(int ... params) throws UserException{
		if(params.length > 0){
			for(int args : params){
				Calculator.result += args;
			}
		}else {
			throw new UserException("Вы должны ввести аргумент!");
		}
	}
	/**
	 * выполнение операции вычитания.
	*/
	public void subtract(int ... params)  throws UserException{
		if(params.length > 0){
			Calculator.result = params[0];
			for (int i = 1; i < params.length; i++) {
				Calculator.result -= params[i];
			}
		}else {
			throw new UserException("Вы должны ввести аргумент!");
		}
	}
	/**
	 * выполнение операции умножения.
	 */
	public void multiply(int ... params) throws UserException{
		if(params.length > 0){
		Calculator.result = 1;
		for(Integer param : params){
			Calculator.result *= param;
		}
	}else {
		throw new UserException("Вы должны ввести аргумент!");
		}
	}

	/**
	 * выполнение операции деления.
	 * @param params входящие аргументы.
	 * @throws UserException Если аргумента нет,выкидываем исключение.
     */

	public void divide(int ... params) throws UserException{
		if(params.length > 0){
			Calculator.result = params[0];
			for(int args : params){
				if(args == 0){
					throw new IllegalArgumentException("Вы пытаетесь разделить на ноль!");
				}
				Calculator.result /=  args;
			}
		}else {
			throw new UserException("Вы должны ввести аргумент!");
		}

	}

	
}