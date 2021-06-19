package uh.ac.cr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Utilización de While Structure
            int i=1;//VARIABLE
            Scanner entrada1 = new Scanner(System.in);
            System.out.println("Ingrese cuantas veces desea imprimir Hello World.");
            int manytimes1 = entrada1.nextInt();
            while (i<=manytimes1)
            {
                System.out.println("Hello World");
                i++;
            }
            //utilizacion de FOR
            System.out.println("-----------------------------");
            Scanner entrada2 = new Scanner(System.in);
            System.out.println("Ingrese cuantas veces desea imprimir Hello World.");
            int manytimes2 = entrada2.nextInt();
            for (i = 1; i<=manytimes2; i++) //Estructura del FOR
            {
                System.out.println("Hello World");
            }

        //utlizacion de DO-WHILE
            System.out.println("-----------------------------");
            System.out.println("Hello World");
            int user;//declarar desicion de usuario
            do {
                Scanner entrada3 = new Scanner(System.in);
                System.out.println("¿Desea imprimir Hello world? 1)SI; 2)NO");
                user = entrada3.nextInt();

            }
            while (user==2);
            {
                System.out.println("Hello World");
            }

            //Utlizacion de WHILE
            Scanner entrada4 = new Scanner (System.in);
            int n1, n2, result, opcionNun; boolean op = true;
            while (op) {
                System.out.println("******");
                System.out.println("menu");
                System.out.println("1. continuar");
                System.out.println("2. detener");
                opcionNun = entrada4.nextInt();
                if (opcionNun == 2) {
                    System.out.println("finalizo");
                    break;
                } else {
                    switch (opcionNun) {
                        case 1:
                            System.out.println("Hello mundo");
                            break;


                    }
                }
            }
    }
}

