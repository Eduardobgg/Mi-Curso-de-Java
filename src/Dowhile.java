
/*
public class Dowhile {
    public static void main(String args[]) {
        int i = 1000;
        do { //Instrucciones
            System.out.print(i + ", ");
            i -= 200;
        } while (i >= 0); //Condición a cumplir
    }
}
*/

/*
public class Dowhile {
    public static void main (String args []){
        int i= 0;
        do {
            if (i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5== 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        } while (i<=30);
    }
}
*/

/*
public class Dowhile {
    public static void main (String args []){
        int i=1;
        do {
            if (i==10){
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
            i++;
        } while (i<=10);
    }
}

 */
/*
public class Dowhile {
    public static void main (String args []){
        int i= 1, j=99;
        do {
            if (i<5){
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            }else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            i++;
            j--;
        }while (i<=5);
    }
}
 */

/*
//Sucesion Fibonacci
public class Dowhile {
    public static void main (String args []){
        int i= 0, a=0, b=1, c=0;
        do {
            if (i<9){
                System.out.print(a + ", ");
                c=a+b;
                a=b;
                b=c;
            } else{
                System.out.print(a);
            }
            i++;
        }while (i<10);

    }
}
 */
