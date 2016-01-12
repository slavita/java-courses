public class ArgRunner{
	/*
	класс который добавляет операции.
	*/
	public void summa(int ... params){ //метод с переменным количеством параметров
		for(Integer param : params){
			Calculator.result += param;
		}
	}
	public void subtract(int ... params){ //метод с переменным количеством параметров
		for(Integer param : params){
			Calculator.result -= param;
		}
	}
	public void multiply(int ... params){ //метод с переменным количеством параметров
		Calculator.result = 1;
		for(Integer param : params){
			Calculator.result *= param;
		}
	}
	public void divide(int ... params){ //метод с переменным количеством параметров
		Calculator.result = params[0];
		for(int i = 1; i < params.length; i++){
			Calculator.result /=  params[i];
		}
	}

	
}