package LambdasandStreamsch17.ch17Exerisce;

import java.util.stream.IntStream;

public class SumOfEvenTriples {
    public static void main(String[] args) {
     int x1=   IntStream.rangeClosed(1,10)
                .map((int x)->{
                    if(x%2==0){
                       return x*3;
                    }

                    return 0;
                }).sum();
        System.out.println(x1);
        System.out.println(
                IntStream.rangeClosed(1,10)
                        .filter(x->x%2==0)
                        .map(x->x*3)
                        .sum());

    }

}
