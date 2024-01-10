package com.example.s1_04.n3.e6;

public class ArrayAccessDemo {
    private int[] numbers;

    public ArrayAccessDemo(int[] numbers) {
        this.numbers = numbers;
    }

    public int getElementAtIndex(int index) {
        return numbers[index]; // Puede lanzar ArrayIndexOutOfBoundsException
    }
}