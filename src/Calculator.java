public class Calculator {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);

        if (args[0].equals("sum")) {
            sum(firstNumber, secondNumber);
        }
        else if (args[0].equals("sub")) {
            subtraction(firstNumber, secondNumber);
        }
        else if (args[0].equals("mult")) {
            multiplication(firstNumber, secondNumber);
        }
        else if (args[0].equals("div")) {
            division(firstNumber, secondNumber);
        }
        else {
            System.out.println("Ops.. preencha os dados corretamente");
        }
    }

    static void sum(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    static void subtraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    static void multiplication(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    static void division(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}