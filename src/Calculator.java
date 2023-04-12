public class Calculator {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "sum":
                sum(firstNumber, secondNumber);
                break;

            case "sub":
                subtraction(firstNumber, secondNumber);
                break;

            case "mul":
                multiplication(firstNumber, secondNumber);
                break;

            case "div":
                division(firstNumber, secondNumber);
                break;

            default:
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