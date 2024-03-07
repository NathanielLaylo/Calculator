package com.practice.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi, I am a calculator!");

        Scanner sc = new Scanner(System.in);

        System.out.println("What operation do you want to perform? Addition, Subtraction, Multiplication or Division?");
        String operation = sc.nextLine().toLowerCase();

        System.out.println("Enter your first number: ");
        double inputA = sc.nextDouble();

        System.out.println("Enter your second number: ");
        double inputB = sc.nextDouble();

        double output;

        switch(operation){
            case "addition":
                output = inputA + inputB;
                System.out.println(output);
                break;
            case "subtraction":
                output = inputA - inputB;
                System.out.println(output);
                break;
            case "multiplication":
                output = inputA * inputB;
                System.out.println(output);
                break;
            case "division":
                output = inputA / inputB;
                System.out.println(output);
                break;
            default:
                System.out.println("Error with the input!");
                break;

        }
    }
}