import java.util.Scanner;

/*
public class OperadoresLogicos {
    public static void main (String args []) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int clave = 0, antiguedad = 0;
        System.out.println("\t Bienvenido al sistema de Vacaciones de Coca-Cola");
        System.out.println("");
        System.out.print("Cuál es el nombre del trabajador?");
        nombre = entrada.nextLine();
        System.out.print("Cuantos son sus años de antigüedad?");
        antiguedad= entrada.nextInt();
        System.out.print("Cuál es su clave de departamento?");
        clave=entrada.nextInt();

        if (clave == 1){
            if (antiguedad == 1){
                System.out.print(nombre + ", Tiene derecho a 6 días de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <=6) { // Si la antigüedad es mayor o igual a 2 y la antigüedad es menor o igual a 6
                System.out.print(nombre + ", Tiene derecho a 14 días de vacaciones");
            } else if (antiguedad == 7) {
                System.out.print( nombre + ", Tiene derecho a 20 dias de vacaciones");
            } else {
                System.out.print("Error, al ingresar el numero de años");
            }
        } // fin de la clave 1
        else if (clave == 2) {
            if (antiguedad == 1){
                System.out.print(nombre + ", Tiene derecho a 7 días de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <=6) {
                System.out.print(nombre + ", Tiene derecho a 15 días de vacaciones");
            } else if (antiguedad == 7) {
                System.out.print( nombre + ", Tiene derecho a 22 dias de vacaciones");
            } else {
                System.out.print("Error, al ingresar el numero de años");
            }
        } //Fin de la clave 2
        else if (clave == 3) {
            if (antiguedad == 1){
                System.out.print(nombre + ", Tiene derecho a 10 días de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <=6) {
                System.out.print(nombre + ", Tiene derecho a 20 días de vacaciones");
            } else if (antiguedad == 7) {
                System.out.print( nombre + ", Tiene derecho a 30 dias de vacaciones");
            } else {
                System.out.print("Error, al ingresar el numero de años");
            }
        } //Fin de la clave 3
        else {
            System.out.print("Error, Clave Incorrecta");
        }
    }
}
*/


/*
public class OperadoresLogicos {
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int sueldo = 0, antiguedad=0, aumento=0, porcentaje= 0;

        System.out.println("***********************************************");
        System.out.println("* Bienvenido al sistema de aumento de sueldos *");
        System.out.println("***********************************************");
        System.out.println("");

        System.out.print("Nombre del empleado: ");
        nombre= entrada.nextLine();
        System.out.println("Cuál es tu antigüedad? ");
        antiguedad= entrada.nextInt();
        System.out.println("Cuál es tu sueldo? ");
        sueldo = entrada.nextInt();

        if (sueldo < 500 && antiguedad >= 10){
           porcentaje = (sueldo * 20 )/100;
           aumento= sueldo + porcentaje;
           System.out.println( nombre + ", eres candidato para el aumento de sueldo, tu sueldo ahora sera: $" + aumento);
        } else if (sueldo < 500 && antiguedad < 10) {
            porcentaje = (sueldo * 5 )/100;
            aumento= sueldo + porcentaje;
            System.out.println( nombre + ", eres candidato para el aumento de sueldo, tu sueldo ahora sera: $" + aumento);
        } else if ( sueldo >= 500) {
            System.out.println(nombre + ", no eres candidato para el aumento de sueldo, ya que tu sueldo es de: $" + sueldo);
        } else {
            System.out.println("Error");
        }
    }
}
 */

/*
public class OperadoresLogicos {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int velocidad= 0;

        System.out.println("A que velocidad iba el coche?");
        velocidad= entrada.nextInt();

        if (velocidad <= 50){
            System.out.println("Velocidad adecuada para manejar");
        } else if (velocidad >= 50 && velocidad <= 100) {
            System.out.println("Velocidad un poco alta, podria generarle una multa");
        } else if (velocidad >= 100){
            System.out.println("Va a exceso de velocidad, deberia de bajar la velocidad");
        } else {
            System.out.println("Error al introducir la velocidad");
        }
    }
}
*/

