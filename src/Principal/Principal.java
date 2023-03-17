package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escoger;
        int type_call;
        double time;
        String name;
        double cost;
        int pasadas = 0;
        System.out.println("Bienvenidos al centro de llamas");
        System.out.println("Por favor escoja la linea que va a usar (Escriba solo el numero): ");
        System.out.println("1. Linea N°1");
        System.out.println("2. Linea N°2");
        System.out.println("3. Linea N°3");

        do {
            System.out.println("Ingrese el numero de la linea: ");
            escoger = teclado.nextInt();

            if (escoger == 1) {
                linea_01 call = new linea_01();
                System.out.println("Escoga que tipo de llamada va realizar: ");
                System.out.println("1. Local");
                System.out.println("2. Distancia");
                System.out.println("3. Celular");
                System.out.println("Ingrese el tipo con el numero al que corresponde: ");
                type_call = teclado.nextInt();

                if (type_call == 1) {
                    call.setType_call("Local");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call.setName(name);
                    cost = call.getCall_local() * call.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 2) {
                    call.setType_call("Distancia");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call.setName(name);
                    cost = call.getCall_distance() * call.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 3) {
                    call.setType_call("Celular");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call.setName(name);
                    cost = call.getCall_cell() * call.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else {
                    System.out.println("!WARNING¡ Usted escogio una opcion que no existe");
                }
            } else if (escoger == 2) {
                liena_02 call2 = new liena_02();
                System.out.println("Escoga que tipo de llamada va realizar: ");
                System.out.println("1. Local");
                System.out.println("2. Distancia");
                System.out.println("3. Celular");
                System.out.println("Ingrese el tipo con el numero al que corresponde: ");
                type_call = teclado.nextInt();

                if (type_call == 1) {
                    call2.setType_call("Local");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call2.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call2.setName(name);
                    cost = call2.getCall_local() * call2.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 2) {
                    call2.setType_call("Distancia");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call2.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call2.setName(name);
                    cost = call2.getCall_distance() * call2.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 3) {
                    call2.setType_call("Celular");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call2.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call2.setName(name);
                    cost = call2.getCall_cell() * call2.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else {
                    System.out.println("!WARNING¡ Usted escogio una opcion que no existe");
                }
            } else if (escoger == 3) {
                linea_03 call3 = new linea_03();
                System.out.println("Escoga que tipo de llamada va realizar: ");
                System.out.println("1. Local");
                System.out.println("2. Distancia");
                System.out.println("3. Celular");
                System.out.println("Ingrese el tipo con el numero al que corresponde: ");
                type_call = teclado.nextInt();

                if (type_call == 1) {
                    pasadas = type_call;

                    call3.setType_call("Local");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call3.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call3.setName(name);
                    cost = call3.getCall_local() * call3.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 2) {
                    call3.setType_call("Distancia");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call3.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call3.setName(name);
                    cost = call3.getCall_distance() * call3.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                } else if (type_call == 3) {
                    call3.setType_call("Celular");
                    System.out.println("Ingrese cuanto tiempo duro la llamada en minutos:");
                    time = teclado.nextDouble();
                    call3.setTime(time);
                    System.out.println("Ingrese a la persona que llamo: ");
                    name = teclado.next();
                    call3.setName(name);
                    cost = call3.getCall_cell() * call3.getTime();
                    System.out.println("El costo de la llamada fue de: " + cost + " pesos COP");

                }else {
                    System.out.println("!WARNING¡ Usted escogio una opcion que no existe");
                }
            } else {
                System.out.println("!WARNING¡ Usted escogio una opcion no valida");
            }
        }
        while (pasadas <= 3);

    }

}
