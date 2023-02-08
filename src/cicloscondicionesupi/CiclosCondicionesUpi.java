package cicloscondicionesupi;

import java.util.Scanner;

/**
 *
 * @author fpica
 */
public class CiclosCondicionesUpi {

    public static void main(String[] args) {
        menu1();
    }

    public static void cicloWhile() {
        int x = 0;
        while (x < 20) {
            System.out.println("Valor ");

        }
    }

    public static void ciclodoWhile() {
        Scanner leer = new Scanner(System.in);
        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();

        } while (opcion != 3);
    }

    public static void menu() {
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Salir");
    }

    public static void sumar() {
        float total;
        total = 5 + 6;
        System.out.println("total suma: " + total);
    }

    public static void restar() {
        float total;
        total = 5 - 6;
        System.out.println("total suma: " + total);
    }

    public static void CondicionIF() {
        int num1, num2, num3;
        num1 = 6;
        num2 = 7;
        num3 = 9;
        ///Condicion IF ELSE ELSE IF
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es mayor ");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println(num2 + " es mayor ");
        } else if ((num1 > num2) && (num2 > num3)) {
            System.out.println(" los tres numeros son iguales ");
        }

    }

    public static void Condicionswitch() {
        Scanner leer = new Scanner(System.in);
        byte dia = 0;

        System.out.println("Digite el dia");
        dia = leer.nextByte();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Dia Invalido");
        }
        
        
    }
    public static void menu1() {
        
        Scanner leer = new Scanner(System.in);
        byte opcion = 0;
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            
            switch (opcion) {
            case 1:
                sumar1();
                break;
            case 2:
                restar1();
                break;
            case 3:
                multiplicar1();
                break;
            case 4:
                dividir1();
                break;
            case 5:
            System.out.println("Gracias por utilizar el programa.");break;

            default:
                System.out.println("Valor Invalido");
        }

        } while (opcion != 5);
        
        
    }
    
    public static void sumar1() {
     
        Scanner leer = new Scanner(System.in);
        
     int numero1 = 0;
     int numero2 = 0;
     int total;
     
        System.out.println("Ingrese el primer valor;");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor;");
        numero2 = leer.nextInt();
        
        total = numero1+numero2;
        System.out.println("El total de la suma es: " + total);
     
    }
    
        public static void restar1() {
     
        Scanner leer = new Scanner(System.in);
        
     int numero1 = 0;
     int numero2 = 0;
     int total;
     
        System.out.println("Ingrese el primer valor;");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor;");
        numero2 = leer.nextInt();
        
        total = numero1-numero2;
        System.out.println("El total de la resta es: " + total);
     
    }
     
            public static void multiplicar1() {
     
        Scanner leer = new Scanner(System.in);
        
     int numero1 = 0;
     int numero2 = 0;
     int total;
     
        System.out.println("Ingrese el primer valor;");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor;");
        numero2 = leer.nextInt();
        
        total = numero1*numero2;
        System.out.println("El total de la multiplicacion es: " + total);
     
    }
       public static void dividir1() {
     
        Scanner leer = new Scanner(System.in);
        
     double numero1 = 0;
     double numero2 = 0;
     double total;
     
        System.out.println("Ingrese el primer valor;");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor;");
        numero2 = leer.nextInt();
        
        total = numero1/numero2;
        System.out.println("El total de la division es:" + total);
     
    }
        
    }

