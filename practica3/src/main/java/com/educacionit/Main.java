package com.educacionit;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // CLAVE CORRECTA 1234
        Scanner leer=new Scanner(System.in);
        int saldo=5000;

        int opcion=0;
        boolean altaTarjeta=true;

        int clave;

        do {
            System.out.print("Ingrese su clave ");
            clave = leer.nextInt();
            System.out.println("");

            if (clave!=1234) {
                System.out.println( " clave incorrecta");
                System.out.println("");
            } else {
                do {
                    System.out.println("***********************************");
                    System.out.println("Bienvenido ");
                    System.out.println("Elija una Opcion");
                    System.out.println("***********************************");
                    System.out.println("1.Consultar Saldo ");
                    System.out.println("2.Retirar Dinero");
                    System.out.println("3.Depositar Dinero");
                    System.out.println("4.bloquear tarjeta ");
                    System.out.println("5.salir");

                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Su saldo actual es: " + saldo);
                            break;
                        case 2:
                            System.out.println("Monto a retirar: ");
                            int montoRetirar = leer.nextInt();
                            if (montoRetirar > saldo) {
                                System.out.println("Saldo insuficiente ");
                            } else if (montoRetirar < saldo) {
                                saldo -= saldo;
                                System.out.println("Retiro exitoso ");
                            }                       ;
                            break;
                        case 3:
                            System.out.println("Monto a depositar ");
                            int deposito = leer.nextInt();
                            saldo += deposito;
                            System.out.println("Deposito exitoso ");
                            break;

                        case 4:

                            if (altaTarjeta){
                                int opc;
                                System.out.println("Desea dar de baja a la tarjeta digite 1 para si y 0 para no");
                                opc= leer.nextInt();
                                if (opc==1){
                                    altaTarjeta=false;
                                    System.out.println("Tarjeta dada de baja");
                                }else if(opc==0){
                                    System.out.println("Tarjeta sigue activa");
                                    altaTarjeta=true;
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Salir");break;

                        default:
                            System.out.println("Opcion no valida vuelva a elegir opcion");

                    }
                } while (opcion != 5);
            }
        } while (clave!=1234);
        System.out.println("***************************************");
        System.out.println("");
    }
}
