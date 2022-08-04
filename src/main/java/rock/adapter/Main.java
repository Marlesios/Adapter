package rock.adapter;

public class Main {

    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println("результат деления: " + intsCalc.sum(2, 2));
        System.out.println("результат умножения: " + intsCalc.mult(23,10));
        System.out.println("результат деления: "+ intsCalc.div(100,5));
        System.out.println("результат экспоненции: " + intsCalc.pow(2, 10));
    }

}
