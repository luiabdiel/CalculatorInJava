public class Calculator {
    public static void main(String[] args) {
        if (args.length > 3) {
            System.out.println("Ops.. preencha os dados corretamente: [operacao] [primeiro numero] [segundo numero]");
            return;
        }

        double firstNumber = Double.parseDouble(args[1]);
        double secondNumber = Double.parseDouble(args[2]);

        switch (args[0]) {
            case "add":
                System.out.println(addition(firstNumber, secondNumber));
                break;

            case "sub":
                System.out.println(subtraction(firstNumber, secondNumber));
                break;

            case "mul":
                System.out.println(multiplication(firstNumber, secondNumber));
                break;

            case "div":
                if ((firstNumber == 0) || (secondNumber == 0)) {
                    System.out.println("Ops.. divisão por zero não é permitida!");
                } else {
                    System.out.println(division(firstNumber, secondNumber));
                }
                break;

            default:
                System.out.println("Ops.. operação inválida. Use 'add', 'sub', 'mul' ou 'div'.");
        }
    }

    static double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    static double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}