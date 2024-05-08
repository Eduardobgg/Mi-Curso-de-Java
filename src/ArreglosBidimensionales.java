import java.util.Scanner;
//Arreglo Bidimensional ESTATICO
/*
public class ArreglosBidimensionales {
    public static void main (String args []){
    \\                          filas Columnas
        int Arreglo [][]= new int[2][2];
        //      j   i
        Arreglo [0][0]= 5;
        Arreglo [0][1]= 2;
        Arreglo [1][0]= 2;
        Arreglo [1][1]= 5;

        System.out.print("[" + Arreglo [0][0] + "]" + "[" + Arreglo[0][1] + "]");
        System.out.print("\n[" + Arreglo [1][0] + "]" + "[" + Arreglo[1][1] + "]");
    }

}
 */


/*
//Arreglo Bidimensional DINAMICO
public class ArreglosBidimensionales {
    public static void main (String args []){
        Scanner entrada= new Scanner (System.in);
        int contador= 1;
        System.out.println("De que Tamaño quiere la Matriz?");
        System.out.print("Longitud de i: ");
        int Columnas= entrada.nextInt();
        System.out.print("Longitud de j: ");
        int Filas= entrada.nextInt();

        int Arreglo [][]= new int [Filas][Columnas];

        for (int j= 0; j<Filas; j++){
            for (int i= 0; i<Columnas; i++){
                Arreglo[j][i]= contador;
                contador ++;
                System.out.print("[" + Arreglo[j][i] + "]");
            }
            System.out.println("");//Salto de linea para seguir con la siguiente fila
        }

    }
}
*/

/*
public class ArreglosBidimensionales {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        int a= 0, b= 1, c=0;
        System.out.print("Columnas: ");
        int Columanas= entrada.nextInt();

        System.out.print("Filas: ");
        int Filas= entrada.nextInt();


        int Fibonacci[][] = new int[Filas][Columanas];

        for (int j= 0; j<Filas; j++){
            for (int i= 0; i<Columanas; i++){
                System.out.print("[" + a + "]");
                c= a+b;
                a=b;
                b=c;
            }
            System.out.println("");
        }
    }
}
 */


/*
public class ArreglosBidimensionales {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de Juegos: ");
        int juegos= entrada.nextInt();
        entrada.nextLine();

        int Filas = juegos+1; //Se añade una fila extra para los titulos, por ejemplo si quiero 2 juegos se le sumara 1 y entonces Filas tendra el Valor de 3

        String Basta1 [][] = new String[Filas][8];
        Basta1[0][0]= "Letra";
        Basta1[0][1]= "Nombre";
        Basta1[0][2]= "Apellido";
        Basta1[0][3]= "Ciudad o Pais";
        Basta1[0][4]= "Color";
        Basta1[0][5]= "Animal";
        Basta1[0][6]= "Flor o Fruto";
        Basta1[0][7]= "Cosa";


        String Basta2 [][] = new String[Filas][8];
        Basta2[0][0]= "Letra";
        Basta2[0][1]= "Nombre";
        Basta2[0][2]= "Apellido";
        Basta2[0][3]= "Ciudad o Pais";
        Basta2[0][4]= "Color";
        Basta2[0][5]= "Animal";
        Basta2[0][6]= "Flor o Fruto";
        Basta2[0][7]= "Cosa";

        for (int j= 1; j<Filas; j++){
            System.out.println("Ronda " + j);
            for (int i= 0; i<8; i++){
                    System.out.println("Persona 1");
                    System.out.print(Basta1[0][i] + ": ");
                    Basta1[j][i] = entrada.nextLine();

                    System.out.println("Persona 2");
                    System.out.print(Basta2[0][i] + ": ");
                    Basta2[j][i] = entrada.nextLine();

            }
            System.out.println("");
        }
        System.out.println("Basta Persona 1");
        for (int j= 0; j<Filas; j++){
            for (int i=0; i<8; i++){

                System.out.print("[" + Basta1[j][i] + "]");
            }
            System.out.println("");
        }

        System.out.println("Basta Persona 2");
        for (int j= 0; j<Filas; j++){
            for (int i=0; i<8; i++){
                System.out.print("[" + Basta2[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
 */


































