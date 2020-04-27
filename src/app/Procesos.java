package app;

import java.util.Scanner;

public class Procesos {

    public static Scanner t = new Scanner(System.in);

    public void suma(){
        double num1, num2, res;
        System.out.print("Digite el primer numero: ");
        num1 = Double.valueOf(t.nextLine());
        System.out.print("Digite el segundo numero: ");
        num2 = Double.valueOf(t.nextLine());
        res = num1 + num2;
        System.out.println("Respuesta: "+ res);
    }

    public void resta(){
        double num1, num2, res;
        System.out.print("Digite el primer numero: ");
        num1 = Double.valueOf(t.nextLine());
        System.out.print("Digite el segundo numero: ");
        num2 = Double.valueOf(t.nextLine());
        res = num1 - num2;
        System.out.println("Respuesta: "+ res);
    }

    public void multiplicacion(){
        double num1, num2, res;
        System.out.print("Digite el primer numero: ");
        num1 = Double.valueOf(t.nextLine());
        System.out.print("Digite el segundo numero: ");
        num2 = Double.valueOf(t.nextLine());
        res = num1 * num2;
        System.out.println("Respuesta: "+ res);
    }

    public void division(){
        double num1, num2, res;
        System.out.print("Digite el primer numero: ");
        num1 = Double.valueOf(t.nextLine());
        System.out.print("Digite el segundo numero: ");
        num2 = Double.valueOf(t.nextLine());
        res = num1 / num2;
        System.out.println("Respuesta: "+ res);
    }

}