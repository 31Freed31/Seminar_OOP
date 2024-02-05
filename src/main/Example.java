package main;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = (a, b) -> a+b;
        Mathematics x = Double::sum;
        System.out.println(x.add(5, 45));
    }
}
interface Mathematics{
    double add(double a, double b);
}

class Calculator{
    static Map<Character, Calculable> map = new HashMap<>();
    static{
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('s', arr -> Math.sqrt(arr[0]));
    }

    public static void main(String ... args) {
        System.out.println(calculate1('s', 25, 45));

    }
    public static double calculate(char op, double x, double y){
        if(op == '+') return x+y;
        if(op == '-') return x-y;
        if(op == '*') return x*y;
        else throw new UnsupportedOperationException("Non implemented");
    }
    public static double calculate1(char op, double ... arr){
        return map.get(op).calc(arr);
    }

}
interface Calculable {
    double calc(double ... arr);
}