public class Calculator {
    public int add(int a, int b) {
        // обычное сложение
        return a + b;
    }
    public int dif(int a, int b) {
        // вычитание
        return a - b;
    }
    public int div(int a, int b) {
        // целочисленное деление
        return a / b;
    }
    public int times(int a, int b) {
        // умножение
        return a * b;
    }
    public int solver() {
        // Решаем выражение: ((10 + 5) - 3) * 2 / 4
        int sum = add(10, 5);       // 15
        int diff = dif(sum, 3);     // 12
        int product = times(diff, 2); // 24
        return div(product, 4);     // 6
    }
}