package javacode;

public class Problem1 {

    static class Calculator {
        double a;
        double b;

        Calculator(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double calculate(String operation) {
            switch (operation) {
                case "add":
                    return a + b;

                case "subtract":
                    return a - b;

                case "multiply":
                    return a * b;

                case "divide":
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                        return 0;
                    }
                    return a / b;

                default:
                    System.out.println("Invalid operation");
                    return 0;
            }
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5);
        System.out.println("Result: " + c.calculate("add"));
    }
}

