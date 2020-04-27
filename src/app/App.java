package app;

import java.util.Scanner;

public class App {

    public static Scanner t = new Scanner(System.in);

    public static void menu(){
        System.out.println("-----  MENU  -----");
        System.out.println("1. SUMA          ");
        System.out.println("2. RESTA         ");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION      ");
        System.out.println("5. Salir         ");
        System.out.print("Opcion: ");
    }
    
    public static void salir(){
        System.out.println("Programa finalizado!");
    }
    public static void error(){
        System.out.println("Fuera de Rango...");
    }
    public static void inicio(){
        int op;
        Procesos p = new Procesos();
        do {
            menu();
            op = Integer.valueOf(t.nextLine());
            switch (op) {
                case 1: p.suma();
                    
                    break;
                case 2: p.resta();

                    break;
                case 3: p.multiplicacion();

                    break;
                case 4: p.division();

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