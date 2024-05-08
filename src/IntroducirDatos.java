import java.util.Scanner;
/*
public class IntroducirDatos {
    public static void main(String args[]){
        Scanner Entrada = new Scanner(System.in);
        String nombre= "";
        int num1= 0, num2=0, resultado=0;
        System.out.println("Escribe tu nombre: ");
        nombre= Entrada.nextLine();

        System.out.println("Dame el valor del primer numero: ");
        num1=Entrada.nextInt();
        System.out.println("Dame el valor del segundo numero: ");
        num2=Entrada.nextInt();

        resultado= num1 + num2;

        System.out.println("Hola " + nombre + ", EL resultado de tu suma: " + num1 + " + " + num2 + "= " + resultado);
    }
}
*/

/* Codigo para escoger Rol y personaje en Overwatch

public class IntroducirDatos {
    public static void main(String args[]){
        Scanner Entrada= new Scanner(System.in);
        int selecRol= 0;

        System.out.println("Qué rol deseas elegir?");
        System.out.println("1) Tank");
        System.out.println("2) Support");
        System.out.println("3) Healer");
        selecRol = Entrada.nextInt();

        if (selecRol == 1){
            int escogerTank = 0;
            System.out.println("Escogiste el rol de Tank");
            System.out.println("Escoge el Tank que vas a usar:");
            System.out.println("1) Reinhard");
            System.out.println("2) D.V.A");
            System.out.println("3) Orisa");
            System.out.println("4) Roadhog");
            escogerTank= Entrada.nextInt();

            if (escogerTank == 1){
                System.out.println("Escogiste a Reinhard");
            } else if (escogerTank == 2) {
                System.out.println("Escogiste a D.V.A");
            } else if (escogerTank == 3) {
                System.out.println("Escogiste a Orisa");
            } else if (escogerTank == 4) {
                System.out.println("Escogiste a Roadhog");
            } else {
                System.out.println("Opción Incorrecta");
            }
            System.out.println(escogerTank);

        } else if (selecRol == 2) {
            int escogerSup= 0;
            System.out.println("Escogiste el rol de Support");
            System.out.println("Escoge un Support:");
            System.out.println("1) Soldado 76");
            System.out.println("2) Mei");
            System.out.println("3) Phara");
            System.out.println("4) Bastion");
            escogerSup=Entrada.nextInt();
            if (escogerSup == 1){
                System.out.println("Escogiste a Soldado 76");
            } else if (escogerSup == 2) {
                System.out.println("Escogiste a Mei");
            } else if (escogerSup == 3) {
                System.out.println("Escogiste a Phara");
            } else if (escogerSup == 4) {
                System.out.println("Escogiste a Bastion");
            }else {
                System.out.println("Opción Incorrecta");
            }
            System.out.println(escogerSup);

        } else if (selecRol == 3) {
            int escogerHeal=0;
            System.out.println("Escogiste el rol de Healer");
            System.out.println("Escoge un Healer:");
            System.out.println("1) Mercy");
            System.out.println("2) Moira");
            escogerHeal= Entrada.nextInt();

            if (escogerHeal== 1){
                System.out.println("Escogiste a Mercy");
            } else if (escogerHeal==2) {
                System.out.println("Escogiste a Moira");
            } else {
                System.out.println("Opcion Incorrecta");
            }
            System.out.println(escogerHeal);

        } else {
            System.out.println("No existe ese rol");
        }
    }
}

*/

/*
public class IntroducirDatos {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int persona= 0;
        String mensaje= "";
        System.out.println("1. Diana");
        System.out.println("2. Memas");
        System.out.println("3. Mamá");
        System.out.print("Escoge la persona a la que le quieres mandar el mensaje: ");
        persona = entrada.nextInt();
        entrada.nextLine(); // despues de un next int el método no consume el último carácter de nueva línea (\n) generado por pulsar Enter. Así que cuando llamas a nextLine() después de nextInt(), nextLine() lee esa línea nueva pendiente y no espera la entrada del usuario, lo que parece que el programa se "cierra" automáticamente.
        if (persona == 1){
            System.out.println("Diana");
            System.out.println("Escribir mensaje: ");
            mensaje= entrada.nextLine();
        } else if (persona == 2) {
            System.out.println("Memas");
            System.out.println("Escribir mensaje: ");
            mensaje= entrada.nextLine();
        } else if (persona == 3) {
            System.out.println("Mamá");
            System.out.println("Escribir mensaje: ");
            mensaje= entrada.nextLine();
        }else {
            System.out.println("Opción invalida");
        }

        System.out.println("Mensaje para: " + persona + ", Mensaje: " + mensaje);
    }
}
 */


/*
public class IntroducirDatos {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        String nombre="";
        int numero1, numero2, operación = 0;

        System.out.print("Escribe tu nombre completo: ");
        nombre = entrada.nextLine();

        System.out.print("Escribe el valor del primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escribe el valor del segundo numero: ");
        numero2= entrada.nextInt();

        System.out.println("Qué operación quieres realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.print("Operación: ");
        int op= entrada.nextInt();
        
        if (op== 1){
            System.out.println("Suma");
            operación= numero1 + numero2;
            System.out.print("Hola " + nombre + ", el resultado de tu Suma es: " + operación);

        } else if ( op == 2) {
            System.out.println("Resta");
            operación = numero1 - numero2;
            System.out.print("Hola " + nombre + ", el resultado de tu Resta es: " + operación);

        } else if (op == 3) {
            System.out.println("Multiplicación");
            operación = numero1 * numero2;
            System.out.print("Hola " + nombre + ", el resultado de tu Multiplicación es: " + operación);

        } else{
            System.out.print("Opción invalida");
        }
    }
}
*/

/*
public class IntroducirDatos {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int camino= 0, camino1= 0, equipamento= 0, camino2=0, camino3= 0;
        String nombre;
        System.out.print("Bienvenido Viajero, Introduzca el nombre de su personaje: ");
        nombre= entrada.nextLine();

        System.out.println("Bienvenido al juego viajero " + nombre);
        System.out.println("Era una noche lluviosa en tu casa, son las 3 de la mañana y escuchas un ruido a fuera de tu cuarto...");
        System.out.println("Qué haces?");
        System.out.println("1. Abrir la puerta para ver lo que provoco el ruido");
        System.out.println("2. Tratar de retomar el sueño");
        camino= entrada.nextInt();

        if (camino == 1){
            System.out.println("Al abrir la puerta te encuentrar un rastro de lo que parece ser sangre...");
            System.out.println("Qué haces?");
            System.out.println("1. Seguir el rastro de sangre que da a la cocina");
            System.out.println("2. Encerrarte y tratar de retomar el sueño sin darle importancia");
            camino1= entrada.nextInt();
            if (camino1== 1){
                System.out.println("Solo puedes llevar un objeto en la mano, que deseas llevar?");
                System.out.println("1. Linterna para ver mejor");
                System.out.println("2. Martillo que tenias en tu cuarto, pero tendras poca visibilidad");
                System.out.println("3. Cobija");
                equipamento= entrada.nextInt();
                if (equipamento==1){
                    System.out.println("Logras ver a lo lejos una criatura de aspecto horroroso y decides agacharte, buena elección");
                    System.out.println("Qué haces?");
                    System.out.println("1. Regresas sigilozamente a tu cuarto y pides ayuda al 911 (Tardaran en llegar 5 min y la criatura esta buscandote)");
                    System.out.println("2. Avientas la linterna y corres a la cocina para agarrar un cuchillo para tratar de herir a la criatura");
                    camino3= entrada.nextInt();
                    if (camino3== 1){
                        System.out.println("Tienes 1 min para buscar un escondite...");
                    } else if (camino3== 2) {
                        System.out.println("Logras llegar a la cocina pero te encuentras con que no hay cuchillos, mala decisión");
                    }else {
                        System.out.println("Opción incorrecta");
                    }

                } else if (equipamento== 2) {
                    System.out.println("Te acercas demasiado por la poca visibilidad y te ataco lo que fuera que te encontro primero");
                } else if (equipamento== 3) {
                    System.out.println("Te acercaste demasiado pero logras aventarle la cobija a lo que sea que te encontraste");
                    System.out.println("Qué haces?");
                    System.out.println("1. Corres de regreso a tu cuarto antes de que se pueda quitar la cobija de encima");
                    System.out.println("2. Lo tratas de someter y buscas objetos a tu alrededor para poder noquear o matar si es necesario a lo que sea que atrapaste");
                    camino2= entrada.nextInt();
                    if (camino2== 1){
                        System.out.println("Al correr a tu cuarto lo que sea que encontraste te alcanzo y te descuartizo");
                    } else if (camino2== 2) {
                        System.out.println("Al tratar de someterlo encuentras un lazo y lo amarras dentro de la cobija");
                    } else {
                        System.out.println("Opción incorrecta");
                    }
                }
            } else if (camino1== 2) {
                System.out.println("Al tratar de retomar el sueño entra una persona bruscamente a tu cuarto y se te avienta matandote brutalmente");
            } else {
                System.out.println("Opción invalida");
            }
        } else if (camino== 2) {
            System.out.println("Al tratar de retomar el sueño entra bruscamente una criatura horrenda a tu cuarto y se te avienta matandote brutalmente");
        } else {
            System.out.println("Opción invalida");
        }
    }
}
*/

/*
public class IntroducirDatos {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        String nombre= "", mesdeNac= "";
        int edad= 0, dia= 0, añoNac= 0;

        System.out.print("Nombre del Estudiante: ");
        nombre= entrada.nextLine();

        System.out.print("Edad: ");
        edad= entrada.nextInt();

        System.out.println("Fecha de Nacimiento");
        System.out.print("Dia: ");
        dia= entrada.nextInt();

        entrada.nextLine(); // puedes agregar una llamada extra a nextLine() después de leer el entero y antes de leer el mes. Esto se hace para consumir el salto de línea que queda pendiente y permitir que la próxima llamada a nextLine() lea correctamente la entrada del mes.

        System.out.print("Mes: ");
        mesdeNac= entrada.nextLine();

        System.out.print("Año: ");
        añoNac= entrada.nextInt();


        System.out.print("Hola " + nombre + ", Edad: " + edad + ", Fecha de nacimiento: " + dia + "/" + mesdeNac + "/" +añoNac);

    }
}

*/


/*
public class IntroducirDatos {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        String Nombre= entrada.nextLine();

        System.out.print("Escribe tu edad: ");
        int edad= entrada.nextInt();

        System.out.println("Nombre: " + Nombre + ", Edad: " + edad);

    }
}
 */