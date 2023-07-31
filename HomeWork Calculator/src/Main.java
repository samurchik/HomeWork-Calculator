import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            // Создание объекта класса Calculator
            Calculator calculator = new Calculator();
            // Создание объекта класса Random для генерации случайных чисел
            Random random = new Random();

            // Генерация случайных чисел от 0 до 99
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            // Вывод случайных чисел на экран
            System.out.println("Число 1: " + num1);
            System.out.println("Число 2: " + num2);

            // Вызов методов объекта calculator с передачей случайных чисел в качестве аргументов
            int sum = calculator.add(num1, num2);
            int difference = calculator.subtract(num1, num2);
            int product = calculator.multiply(num1, num2);
            int quotient = calculator.divide(num1, num2);

            // Вывод результатов вычислений на экран
            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + difference);
            System.out.println("Произведение: " + product);
            System.out.println("Частное: " + quotient);
        }
    }
