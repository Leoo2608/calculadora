package app;

import java.util.Scanner;

public class App {

    public static Scanner t = new Scanner(System.in);

    public static void menu(){
        System.out.println("====  MENU   ====");
        System.out.println("1. SUMA          ");
        System.out.println("2. RESTA         ");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION      ");
        System.out.println("5. Salir         ");
        System.out.print("- Opcion: ");
    }
    public static void suma(){
        int num1, num2, res;
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.valueOf(t.nextLine());
        res = num1 + num2;
        System.out.println("Respuesta: "+ res);
    }
    public static void resta(){
        int num1, num2, res;
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.valueOf(t.nextLine());
        res = num1 - num2;
        System.out.println("Respuesta: "+ res);
    }
    public static void multiplicacion(){
        int num1, num2, res;
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.valueOf(t.nextLine());
        res = num1 * num2;
        System.out.println("Respuesta: "+ res);
    }
    public static void division(){
        int num1, num2, res;
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.valueOf(t.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.valueOf(t.nextLine());
        res = num1 / num2;
        System.out.println("Respuesta: "+ res);
    }
    public static void salir(){
        System.out.println("Gracias por usar el programa");
    }
    public static void error(){
        System.out.println("Ingrese una opcion entre 1 a 5...");
    }
    public static void inicio(){
        int op;
        do {
            menu();
            op = Integer.valueOf(t.nextLine());
            switch (op) {
                case 1: suma();
                    
                    break;
                case 2: resta();

                    break;
                case 3:multiplicacion();

                    break;
                case 4:division();

                    break;
                case 5: salir();
                    break;
                default: error();
                    break;
            }

        } while (op!=5);
    }
    public static void main(String[] args) throws Exception {
       inicio();
    }
}