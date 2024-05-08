/*public class Suma{
    public static void main(String args []){
        int valUno= 5;
        int valDos= 7;
        int resultado= 0;
        resultado = valUno + valDos;
        System.out.println("El resultado de la suma de " + valUno + "+" + valDos + "= " + resultado );
    }
}*/

/*Ejercicio 2 Calcular el porcentaje que debe pagar un cliente,
en la compra de una motocicleta a plazos en un periodo de 6 meses, si el interés mensual progresivo es de 3.5 % .
public class Edad{
    public static void main (String args []){
        int edad= 21;
        String nombre= "Eduardo";
        int saldo= 10;

        System.out.println(nombre + " tiene la edad de " + edad + " años, y su saldo telefonico es de $" + saldo );
    }
}
 */

/*
Ejercicio 2: concatenar mi nombre completo
public class Nombre{
  public static void main (String args []){
      String nombre= "Eduardo Biali";
      String apellidoUno= "Garcia";
      String apellidoDos= "Gomez";
      System.out.println("Concatenar el nombre de: " + nombre + " " + apellidoUno + " " + apellidoDos + ".");
  }
}
 */


/*Ejercicio 3: Actualizaciones de la semana para diferentes juegos
public class Actualizaciones{
  public static void main (String args[]){
      String Fortnite= "Fortnite Martes 3 de Octubre";
      String RainbowSix= "Rainbow Six Jueves 5 de Octubre";
      String Overwatch= "Overwatch Viernes 6 de Octubre";

      System.out.println("Las Actualizaciones pendiente: " + Fortnite);
      System.out.println("Las Actualizaciones pendiente: " + RainbowSix);
      System.out.println("Las Actualizaciones pendiente: " + Overwatch);
  }
}
*/

/*
Ejercicio 4: Anuncio de los mejores juegos del año en los GOTY 2023

public class Anuncio{
    public static void main (String args []){
        String juegoGanador= "The Legend of Zelda";
        String juegoSegundo= "SpiderMan Miles Morales";
        String juegoTercero= "Overwatch 2";

        System.out.println("El Ganador del GOTY al mejor juego del año es:");
        System.out.println("1: " + juegoGanador);
        System.out.println("2: " + juegoSegundo);
        System.out.println("3: " + juegoTercero);
    }
}
 */

/*
Ejercicio 5: Puntuaje para declarar al MVP de la partida

public class MVP{
    public static void main(String args []){
        String nombre1= "EduardoGGs";
        String nombre2= "Zakyzzz";
        String nombre3= "Sonic";
        int pUno= 60;
        int pDos= 60;
        int pTres= 60;
        int kUno= 4;
        int kDos= 8;
        int kTres= 11;
        int resultado1= 0;
        int resultado2= 0;
        int resultado3= 0;

        resultado1= pUno * kUno;
        resultado2= pDos * kDos;
        resultado3= pTres * kTres;

        System.out.println("Los resultados de la partida fueron los siguientes:");
        System.out.println(nombre1);
        System.out.println("Puntos de Partida: " + pUno + " ptos.");
        System.out.println("Kills: " + kUno + " eliminaciones.");
        System.out.println("Total de puntos en la partida: " + resultado1 + " puntos.");
        System.out.println("---------------------------------------------------------");
        System.out.println(nombre2);
        System.out.println("Puntos de Partida: " + pDos + " ptos.");
        System.out.println("Kills: " + kDos + " eliminaciones.");
        System.out.println("Total de puntos en la partida: " + resultado2 + " puntos.");
        System.out.println("---------------------------------------------------------");
        System.out.println(nombre3);
        System.out.println("Puntos de Partida: " + pTres + " ptos.");
        System.out.println("Kills: " + kTres + " eliminaciones.");
        System.out.println("Total de puntos en la partida: " + resultado3 + " puntos.");

        System.out.println("EL MVP de la partida es: " + nombre3 + " con " + resultado3 + " puntos en total." );
    }
}
 */

/*
Ejercicio 6: Calcular IMS

public class IMS{
    public static void main(String args []){
        double pesoK= 73.4;
        double altura= 1.72;
        double ims= 0;

        ims= pesoK/(altura * altura);

        System.out.println("El peso de la persona es: " + pesoK + " kilos.");
        System.out.println("La altura de la persona es: " + altura + " m");
        System.out.println("El IMC de la persona es: " + ims);
    }
}
 */

/*
Ejercicio 7: Descuentos boletos de Paul McCartney para cada tipo de tarjeta

public class Descuentos{
    public static void main(String args []){
        String tarjeta1= "BBVA";
        String tarjeta2= "Santander";
        String tarjeta3= "HSBC";
        String tarjeta4= "CitiBanamex";
        int descuentoBBVA= 30;
        int descuentoSantander= 40;
        int descuentoHsbc= 50;
        int descuentoCitibanamex= 60;
        int descuento1=0;
        int descuento2=0;
        int descuento3=0;
        int descuento4=0;
        int boletoPlatino= 7000;
        int precio1=0;
        int precio2=0;
        int precio3=0;
        int precio4=0;
        descuento1= (descuentoBBVA * boletoPlatino)/100;
        descuento2= (descuentoSantander * boletoPlatino)/100;
        descuento3= (descuentoHsbc * boletoPlatino)/100;
        descuento4= (descuentoCitibanamex * boletoPlatino)/100;
        precio1= boletoPlatino - descuento1;
        precio2= boletoPlatino - descuento2;
        precio3= boletoPlatino - descuento3;
        precio4= boletoPlatino - descuento4;

        System.out.println("El descuento para la tarjeta " + tarjeta1 + " es: " + descuento1 + ". El total a pagar seria de $" + precio1);
        System.out.println("El descuento para la tarjeta " + tarjeta2 + " es: " + descuento2 + ". El total a pagar seria de $" + precio2);
        System.out.println("El descuento para la tarjeta " + tarjeta3 + " es: " + descuento3 + ". El total a pagar seria de $" + precio3);
        System.out.println("El descuento para la tarjeta " + tarjeta4 + " es: " + descuento4 + ". El total a pagar seria de $" + precio4);

    }
}
 */
/* Programa para descuento de Pavos en Fortnite
public class Descuentos{
    public static void main (String args []){
        double pesoargEnmx= 0.021;
        int Pavosarg1000= 450;
        int Pavosarg2800= 1139;
        int Pavosarg5000= 1822;
        double PavosMx1000= Pavosarg1000 * pesoargEnmx;
        double PavosMx2800= Pavosarg2800 * pesoargEnmx;
        double PavosMx5000= Pavosarg5000 * pesoargEnmx;

        System.out.println("El precio de 1000 Pavos en Argentina es de: " + Pavosarg1000 + " ARS, su converción en México seria de: $" + PavosMx1000);
        System.out.println("El precio de 2800 Pavos en Argentina es de: " + Pavosarg2800 + " ARS, su converción en Méxoco seria de: $" + PavosMx2800);
        System.out.println("El precio de 5000 Pavos en Argentina es de: " + Pavosarg5000 + " ARS, su converción en México seria de: $" + PavosMx5000);


    }
}
 */

/*
public class DeclararVariables {
    public static void main (String args []){
        int num1= 10, num2= 5, resultado= 0;
        resultado= num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);

    }
}
 */
/*
public class DeclararVariables {
    public static void main (String args []){
        int num1= 10;
        int num2= 5;
        int resultado= 0;
        resultado= num1+num2;
        System.out.println("El resultado de la suma es: " + resultado);

    }
}
 */

/*
public class DeclararVariables {
    public static void main (String args []){
        String Nombre= "Eduardo";
        int edad= 21;
        String FechaNacimiento= "13/Octubre/2002";

        System.out.println("Nombre: " + Nombre + "\n Edad: " + edad + "\n Fecha de Nacimiento: " + FechaNacimiento);
    }
}
 */
