public class TypeCasting {
    
    public static void main(String[] args) {
        // Implicit conversion: when we convert a small data type to a large data type
        // Also known as widening 
        // It happens automatically by the compiler
        byte a = 19;
        int b = a;
        System.out.println("Byte value: " + a);
        System.out.println("After implicit casting to int: " + b);

        // Explicit Conversion: conversion of a large data type into a small data type
        // Known as narrowing
        // Done manually
        
        double x = 10.39747992;
        int y = (int) x; // Explicit casting from double to int
        System.out.println("Original double value: " + x);
        System.out.println("After casting to int: " + y); // Output will be 10
    }
}
