/**
 * класс который содержит главную функцию программы
 */
public class Main {

    /**
     * InteractRunner класс пользовательского ввода.
     * выполняем операции пока переменная exit будет равна "no"
     */
    public static void main(String[] arg){

        Calculator calculator = new Calculator();
        InteractRunner interactRunner = new InteractRunner();

            while(!interactRunner.exit.equals("yes")) {
              interactRunner.reusingResult();
                interactRunner.setNumbersfirrst();
                interactRunner.setNumberssecond();
                interactRunner.setOperation();
                calculator.calculation(interactRunner.first,interactRunner.second,interactRunner.operation);
                System.out.println("Result : " + calculator.getResult());
                interactRunner.exit();
            }
    }
}
