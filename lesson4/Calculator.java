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
	очистить результат вычисления.
	*/
	public void cleanResult(){
		this.result = 0;
	}
}