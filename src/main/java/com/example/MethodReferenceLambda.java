package com.example;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceLambda {

    public static void main(String a[]){
        List list = Arrays.asList("Ankit", "Mahesh", "Prasad", "Malik");
        list.forEach(customer -> System.out.println(customer));

        System.out.println();

        //method reference
        list.forEach(System.out::println);
    }
}
