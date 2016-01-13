public class ArgRunner{
	/**
	 * @(int ... params) метод с переменным количеством параметров
	 * класс который добавляет операции.
	*/
	/**
	 * выполнение операции суммирования.
	 */
	public void suma(int ... params){
		for(Integer param : params){
			Calculator.result += param;
		}
	}
	/**
	 * выполнение операции вычитания.
	*/
	public void subtract(int ... params) {
		Calculator.result = params[0];
		for (int i = 1; i < params.length; i++) {
			Calculator.result -= params[i];
		}
	}
	/**
	 * выполнение операции умножения.
	 */
	public void multiply(int ... params){
		Calculator.result = 1;
		for(Integer param : params){
			Calculator.result *= param;
		}
	}
	/**
	 * выполнение операции деления.
	 */
	public void divide(int ... params){
		Calculator.result = params[0];
		for(int i = 1; i < params.length; i++){
			Calculator.result /=  params[i];
		}
	}

	
}