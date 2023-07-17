package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        Integer incrementedByOne
            = incrementByOneFunction.apply(1);
        System.out.println("incrementedByOne: " + incrementedByOne);

        // function chaining
        Integer incrementedByOneAndMultipliedBy10
            = incrementByOneFunction.andThen(multiplyBy10).apply(1);
        System.out.println("incrementedByOneAndMultipliedBy10: "
            + incrementedByOneAndMultipliedBy10);

        // BiFunction
        Integer incrementedByOneAndMultipliedBy20
            =  incrementByOneAndMultiplyByFactorBiFunction.apply(1, 20);
        System.out.println("incrementedByOneAndMultipliedBy20: "
            + incrementedByOneAndMultipliedBy20);
    }
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFactorBiFunction =
            (number, factor) -> (number + 1) * factor;
}
