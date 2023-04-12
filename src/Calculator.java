public class Calculator {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);

        System.out.println("(sum, sub, mult, div) first number second number");

        if (args[0].equals("sum")) {
            sum(firstNumber, secondNumber);
        } else {
            System.out.println("Ops.. preencha os dados corretamente");
        }
    }

    static void sum(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}