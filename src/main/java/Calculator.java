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
        // Решаем выражение: ((20 - 4) / 2 + 7) * 3
        int base = dif(20, 4);      // 16
        int half = div(base, 2);    // 8
        int sum = add(half, 7);     // 15
        return times(sum, 3);       // 45
    }
}