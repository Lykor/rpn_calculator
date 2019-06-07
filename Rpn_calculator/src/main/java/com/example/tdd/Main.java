package com.example.tdd;

import java.util.Scanner;

public class Main {

  public static void main(String[] argc){
    RPNCalculator rpn = new RPNCalculator();

    Scanner sc = new Scanner(System.in);

  while(true) {
    System.out.println("Enter your equaetion: ");
    String equation = sc.nextLine();
    System.out.println("Your enter : " + equation);


    int solution = rpn.solveEquation(equation);
    System.out.println("Solution : " + solution);
  }
  }
}
