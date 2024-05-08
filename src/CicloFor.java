/*
public class CicloFor {
    public static void main(String args[]){

        for (int i= 1; i <= 5; i++){
            System.out.print( i + ", ");
        }
    }
}
 */
/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 0; i <= 100; i+=5){
            System.out.print(i + ", ");
        }
    }
}
 */

/*
//Prueba FizzBuzz
public class CicloFor {
    public static void main (String args []){
        for (int i= 1; i<=20; i++){

            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
*/

/*
public class CicloFor {
    public static void main (String args []){
        for (int i=0; i<=100; i++){
            System.out.println(i + ", ");
        }
    }
}
 */
/*
public class CicloFor {
    public static void main (String args[]){
        for (int i= 1; i<=100; i++){
            if (i%3==0 && i%5==0 ){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
 */

/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 20; i >= 0; i--){
            System.out.println(i);
        }
    }
}
*/


/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 1; i <= 20; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
*/

/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 0; i<=30; i++){
            if (i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Fizz");
            } else if (i%3==0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}
 */

/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 1; i<=10; i++){
            if (i==10){
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
    }
}

 */

/*
public class CicloFor {
    public static void main (String args []){
        int i=1, j=99;
        for (i= 1; i<=5; i++){
            if (i<5){
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            j--;
        }
    }
}
 */

/*
// Sucesion Fibonacci
public class CicloFor {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        for (int i= 0; i < 10; i++) {
            if (i<9) {
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
    }
}
 */

/*
public class CicloFor {
    public static void main (String args []){
        for (int i= 0; i<=20; i++){
            if (i%5== 0 && i%3==0){
                System.out.println("FIZZBUZZ");
            } else if (i%3==0) {
                System.out.println("FIZZ");
            } else if (i%5==0) {
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }
        }
    }
}
 */

/*
import java.util.Scanner;
public class CicloFor {
    public static void main (String args []){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Hasta que numero quieres imprimir la sucesion Fibonacci: ");
        int Numero= entrada.nextInt();
        int a= 0, b=1, c=0;
        for (int i= 0; i<Numero; i++){
            System.out.print(a + ", ");
            c= a+b;
            a= b;
            b= c;
            if (i==19){
                System.out.print(a);
            }
        }
    }
}
 */
