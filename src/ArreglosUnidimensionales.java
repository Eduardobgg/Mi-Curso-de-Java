import java.util.Scanner;

/*
//ARREGLO ESTATICO
public class ArreglosUnidimensionales {
    public static void main (String args []){
        int Arreglo []= new int[5];
        Arreglo [0]= 2;
        Arreglo [1]= 4;
        Arreglo [2]= 6;
        Arreglo [3]= 8;
        Arreglo [4]= 10;

        System.out.print("[" + Arreglo[0] + "] ");
        System.out.print(" [" + Arreglo[1] + "] ");
        System.out.print(" [" + Arreglo[2] + "] ");
        System.out.print(" [" + Arreglo[3] + "] ");
        System.out.print(" [" + Arreglo[4] + "]");

    }
}
 */

/*
//ARREGLO DINAMICO
import java.util.Scanner;
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        int LongitudArreglo= 0;
        int Numero= 0;

        System.out.print("Longitud que desea que tenga el arreglo: ");
        LongitudArreglo= entrada.nextInt();

        int Arreglo[]= new int[LongitudArreglo];

        for (int i = 0; i < Arreglo.length; i++){
            System.out.print("Numero que desear agregar a la posición " + i + ": ");
            Numero= entrada.nextInt();
            Arreglo[i]= Numero;
        }
        for (int i= 0; i<Arreglo.length; i++){
            System.out.print(" [" + Arreglo[i] + "] ");
        }

    }
}
 */



/*
//MODIFICACIÓN ADICIONAL
import java.util.Scanner;
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        int LongitudArreglo= 0;
        int Numero= 0;
        int Dec= 0;

        System.out.print("Longitud que desea que tenga el arreglo: ");
        LongitudArreglo= entrada.nextInt();

        int Arreglo[]= new int[LongitudArreglo];

        for (int i = 0; i < Arreglo.length; i++){
            System.out.print("Numero que desear agregar a la posición " + i + ": ");
            Numero= entrada.nextInt();
            Arreglo[i]= Numero;
        }
        for (int i= 0; i<Arreglo.length; i++){
            System.out.print(" [" + Arreglo[i] + "] ");
        }
        System.out.println();
        System.out.println("Deseas modificar una sección del Arreglo?");
        System.out.print("1. SI");
        System.out.print("2. NO");
        Dec= entrada.nextInt();
        if(Dec == 1){
            System.out.print("Qué parte del arreglo deseas modificar: ");
            int modArreglo= entrada.nextInt();

            System.out.print("Nuevo numero: ");
            int NewNum= entrada.nextInt();

            Arreglo[modArreglo]= NewNum;
            for (int i= 0; i<Arreglo.length; i++){
                System.out.print(" [" + Arreglo[i] + "] ");
            }

        } else {
            System.out.print("OK. no");
        }
    }
}
 */


/*
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrad= new Scanner(System.in);
        double Arreglo[]= new double[10];

        for (int i= 0; i < Arreglo.length; i++){
            System.out.print("ingrese el precio del producto " + i + " : ");
            double PrecioProducto= entrad.nextDouble();
            Arreglo[i]= PrecioProducto;
        }
        for (int i= 0; i < Arreglo.length; i++){
            System.out.print("[ " + Arreglo[i] + " ]");
        }

    }
}
 */

//CURP pendiente
/*
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        String nombres= "", ApellidoMat= "", ApellidoPat= "" , Curp= "", Genero= "", ConsNombre="" , ConsApPat= "", ConsApMat= "";
        String FechaNacimiento= "", dia= "", mes= "", año="" ;
        String EntidadFederativa= "", PrimerCaracter= "", SegundoCaracter="";

        String Arreglo[]= new String[3];
        System.out.print("Nombre(s): ");
        Arreglo[0]= entrada.nextLine(); // Guardo en el arreglo 0, el nombre o nombres
        ConsNombre= Arreglo[0].substring(0,1); // Extraigo la primera letra de la cadena del Nombre

        System.out.print("Apellido Paterno: ");
        Arreglo[1]= entrada.nextLine(); // Guardo en el arreglo 1, el apellido Paterno
        ConsApPat= Arreglo[1].substring(0,2); // Extraigo las primeras dos letras de la cadena del Apellido Paterno

        System.out.print("Apellido Materno: ");
        Arreglo[2]= entrada.nextLine(); // Guardo en el arreglo 2, el apellido Materno
        ConsApMat= Arreglo[2].substring(0,1); // Extraigo la primer letra de la cadena del apellido Materno

        System.out.print("Fecha de Nacimiento (AA/MM/DD)");
        FechaNacimiento= entrada.nextLine();
        dia= FechaNacimiento.substring(0,2); //Extraigo el dia
        mes= FechaNacimiento.substring(3,5); //Extraigo el Mes
        año= FechaNacimiento.substring(6,8); //Extraigo el año

        System.out.print("Sexo (H/M): ");
        Genero= entrada.nextLine();

        System.out.print("Entidad Federativa: ");
        EntidadFederativa= entrada.nextLine();

        //Imprimotodo
        System.out.print("Tu Curp es: " + ConsApPat + ConsApMat + ConsNombre + año + mes + dia + Genero + EntidadFederativa);

    }
}
 */

/*
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.println("BIENVENIDO A LA BIBLIOTECA");
        System.out.println("1. Accion");
        System.out.println("2. Aventura");
        System.out.println("3. Terror");
        System.out.println("4. Romance");
        System.out.print("En que seccion quieres agregar tu libreria: ");
        int Eleccion= entrada.nextInt();
        entrada.nextLine();// Agregar esta línea para consumir el salto de línea
        System.out.print("De que cuantos espación para libros quieres tu libreria: ");
        int espacio= entrada.nextInt();
        entrada.nextLine();// Agregar esta línea para consumir el salto de línea

        String Libreria[]= new String[espacio];

            System.out.println("Agregar Libros en las posiciónes acendentes del 0-" + espacio);
            for (int i= 0; i<Libreria.length; i++){
                System.out.print("Nombre del Libro: ");
                Libreria[i]= entrada.nextLine();
            }
            for (int i= 0; i<Libreria.length; i++){
                System.out.print("[ " + Libreria[i] + " ]");
            }
    }
}
 */

/*
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        String Arreglo []= new String[5];
        System.out.println("Escoger su Despensa:");
        System.out.println("1. Tomates $40 \n 2. Leche $25  \n  3. Cereal $80  \n 4. Carne $102 \n 5. Coca-Cola $25 \n 6. Crema Corporal $40  \n 7. Tostadas $20 \n 8. Salchichas $50");
        for (int i= 0; i<5; i++){
            System.out.print("Producto " + i + ": ");
            Arreglo[i]= entrada.nextLine();
        }

    }
}
 */

/*
public class ArreglosUnidimensionales {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        int M= 1;
        double Calificaciones[]= new double[6];
        System.out.println("Calificaciones");
        for (int i= 0; i<Calificaciones.length; i++){
            System.out.print("Calificación "+ M + ": ");
            Calificaciones[i]= entrada.nextDouble();
            M++;
        }
        double CalificacionFinal= ((Calificaciones[0] + Calificaciones[1] + Calificaciones[2] + Calificaciones[3] + Calificaciones[4] + Calificaciones[5])*10)/60;

        for (int i= 0; i<Calificaciones.length; i++){
            System.out.print("[" + Calificaciones[i] + "]");
        }
        System.out.println();
        System.out.println("Calificación final: " + CalificacionFinal);
    }
}
 */

