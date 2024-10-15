package org.example;

/**
 * Вычисление корня квадратного уровнения
 */
public class Main {
    public static void main(String[] args) {

        MethodD methodD = new MethodD();
        methodD.aByXX = 1;
        methodD.bByX = 3;
        methodD.c = -4;

        int d =  methodD.calculateD();

        int squareRoot = (int) Math.sqrt(d);

        int x1 = (-methodD.bByX + squareRoot) / (2 * methodD.aByXX);
        int x2 = (-methodD.bByX - squareRoot) / (2 * methodD.aByXX);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}