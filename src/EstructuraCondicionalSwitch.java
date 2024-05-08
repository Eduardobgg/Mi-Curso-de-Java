/*
public class EstructuraCondicionalSwitch {
    public static void main (String args []){
        int num1= 10, num2= 5, resultado= 0;
        int param= 3;
        switch (param){
            case 1: resultado= num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
            case 2: resultado= num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
            case 3: resultado= num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
            case 4: resultado= num1 / num2;
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
            default: System.out.println("Error, opción incorrecta");
            break;
        }
    }
}
*/

/*
public class EstructuraCondicionalSwitch {
    public static void main (String args []){
        int param= 5;

        switch (param){
            case 1: System.out.println("Overwatch");
            break;

            case 2: System.out.println("Fortnite");
            break;

            case 3: System.out.println("Rocket League");
            break;

            default: System.out.println("No existe ese juego");
            break;
        }
    }
}
 */

/*
import java.util.Scanner;
public class EstructuraCondicionalSwitch {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int mes= 0;

        System.out.println("Numero de un mes: ");
        mes= entrada.nextInt();

        switch (mes){
            case 1: System.out.println("Enero");
            break;

            case 2: System.out.println("Febrero");
                break;

            case 3: System.out.println("Marzo");
                break;

            case 4: System.out.println("Abril");
                break;

            case 5: System.out.println("Mayo");
                break;

            case 6: System.out.println("Junio");
                break;

            case 7: System.out.println("Julio");
                break;

            case 8: System.out.println("Agosto");
                break;

            case 9: System.out.println("Septiembre");
                break;

            case 10: System.out.println("Octubre");
                break;

            case 11: System.out.println("Noviembre");
                break;

            case 12: System.out.println("Diciembre");
                break;

            default: System.out.println("Error al ingresar el mes");
        }
    }
}
*/


/*
import java.util.Scanner;
public class EstructuraCondicionalSwitch {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int Op= 0;
        double pi= 3.1416, radio= 0, area= 0, base= 0, altura= 0, lado= 0;

        System.out.println("CALCULADORA DE AREAS");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Circulo");
        System.out.println("4. Rectangulo");
        System.out.print("Qué operación deseas Realizar: ");
        Op= entrada.nextInt();

        switch (Op){
            case 1:
                System.out.println("TRIANGULO");
                System.out.println("Valor de la base: ");
                base= entrada.nextDouble();
                System.out.println("Valor de la altura: ");
                altura= entrada.nextDouble();
                area= (base * altura) / 2;

                System.out.println("El área del triangulo es: " + area);
                break;

            case 2:
                System.out.println("CUADRADO");
                System.out.println("Valor de uno de sus lados: ");
                lado= entrada.nextDouble();
                area= lado + lado + lado + lado;
                System.out.println("El área del cuadrado es: " + area);
                break;

            case 3:
                System.out.println("CIRCULO");
                System.out.println("Valor del Radio: ");
                radio= entrada.nextDouble();
                area= pi * (radio * radio);
                System.out.println("El área del circulo es de: " + area);
                break;

            case 4:
                System.out.println("RECTANGULO");
                System.out.println("Valor de la base: ");
                base= entrada.nextDouble();
                System.out.println("Valor de la altura: ");
                altura= entrada.nextDouble();
                System.out.println("El área del rectangulo es de: " + area);
                break;

            default:
                System.out.println("Error, opereación incorrecta");
                break;
        }
    }
}
*/

/*
public class EstructuraCondicionalSwitch {
    public static void main (String args []){
        int menu= 3;
        int entrada= 2;
        int platoFuerte= 1;
        int postre= 3;

        switch (menu){
            case 1:
                System.out.println("Entradas");
                System.out.println("1. Crema de Champiñones");
                System.out.println("2. Crema de Calabaza");
                if (entrada==1){
                    System.out.println("Entrada: Crema de Champiñones" );
                } else if (entrada== 2) {
                    System.out.println("Entrada: Crema de Calabaza");
                } else {
                    System.out.println("No tenemos esa entrada");
                }
                break;

            case 2:
                System.out.println("Plato fuerte");
                System.out.println("1. Corte Ribey");
                System.out.println("2. Pierna de Pavo");
                if (platoFuerte== 1){
                    System.out.println("Plato fuerte: Corte Ribey");
                } else if (platoFuerte== 2) {
                    System.out.println("Plato fuerte: Pierna de Pavo");
                } else {
                    System.out.println("No tenemos ese plato fuerte");
                }
                break;

            case 3:
                System.out.println("Postre");
                System.out.println("1. Fresas con crema");
                System.out.println("2. Helado Napolitano");
                System.out.println("3. Pastel 3 leches");
                if (postre== 1){
                    System.out.println("Postre: Fresas con crema");
                } else if (postre== 2) {
                    System.out.println("Postre: Helado Napolitano");
                } else if (postre== 3) {
                    System.out.println("Postre: Pasel 3 leches");
                } else {
                    System.out.println("No tenemos ese postre");
                }
                break;

            default: System.out.println("No existe esa opción en el menu");
            break;
        }
    }
}
 */