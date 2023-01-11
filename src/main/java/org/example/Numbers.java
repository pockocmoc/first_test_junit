package org.example;

public class Numbers {

    public int sum(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }


    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int sum = numbers.sum(5);
        System.out.println("Sum from 0 till 5 = " + sum);
    }
}