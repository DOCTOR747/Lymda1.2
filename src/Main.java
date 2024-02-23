public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
// Программа не заработает т. к. instance - переменная класса Supplier

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        int d = calc.plus.apply(1, 2);
        int e = calc.minus.apply(1,1);
        int f = calc.devide.apply(d, e);
        calc.println.accept(c);
    }
}