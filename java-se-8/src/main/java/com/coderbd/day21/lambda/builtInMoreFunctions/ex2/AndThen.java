package com.coderbd.day21.lambda.builtInMoreFunctions.ex2;
import java.util.function.Function;

public class AndThen {
    public static void main(String []args) {
        Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), 
			negateSquare = negate.compose(square);

        System.out.println(negateSquare.apply(10));
    }
}
