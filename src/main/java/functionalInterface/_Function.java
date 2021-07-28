package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        int increment1 = incrementByOne.apply(1);
        System.out.println(increment);
        System.out.println(increment1);

        Function<Integer, Integer> addByOneAndMultiplyBy10 = incrementByOne.andThen(multiplyBy10);

        int addByOneAndMultiplyBy10Result = addByOneAndMultiplyBy10.apply(1);

        System.out.println(addByOneAndMultiplyBy10Result);

        int addByOneAndMultiplyBy10ResultBiFunc = incrementByOneAndMultiplyBiFunc.apply(1, 10);

        System.out.println(addByOneAndMultiplyBy10ResultBiFunc);
    }

    // Function is a function that accepts an argument and return only one argument
    static Function<Integer, Integer> incrementByOne = number -> {
        return number + 1;
    };

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    // BiFunction is a function that accepts 2 arguments and return only one argument
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunc = (number, numToMultiplyBy) -> {
        return (number + 1) * numToMultiplyBy;
    };

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
