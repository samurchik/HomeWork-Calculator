public class Calculator {
    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для вычитания второго числа из первого
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод для умножения двух чисел
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод для деления первого числа на второе
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            return 0;
        }
    }
}
