import java.util.Scanner;

/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		ArgRunner args = new ArgRunner();
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String first,second ;
			while(!exit.equals("yes")) {
				if(Calculator.result != 0 ) {
					System.out.println("Reusing a calculation result : yes/no ");
					String temp = reader.next();
					if(!temp.equals("yes"))
					calc.cleanResult();
					else
						System.out.println("Error input!");
				}
				//Валидация
				System.out.println("Enter first arg :  ");
				while (!reader.hasNextInt()){
				 reader.next();
				}first = reader.next();
				//Валидация
				System.out.println("Enter second arg :  ");
				while (!reader.hasNextInt()){
					reader.next();
				}second = reader.next();

				System.out.println("Enter operation :  ");
				String operation = reader.next();
				switch (operation){
					case "+" : args.summa(Integer.valueOf(first),Integer.valueOf(second));
						break;
					case "-" : args.subtract(Integer.valueOf(first),Integer.valueOf(second));
						break;
					case "*" : args.multiply(Integer.valueOf(first),Integer.valueOf(second));
						break;
					case "/" : args.divide(Integer.valueOf(first),Integer.valueOf(second));
						break;
					default: System.out.println("Error operation!");
				}
				System.out.println("Result : " + calc.getResult());
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}

	}
}