
/*
Ejercicio 1: Promedio
public class EstructuraCondicionalIF_else {
    public static void main(String args[]){
        int Programacion= 7;
        int Probabilidad= 6;
        int Ingles= 5;
        int promedio=0;

        promedio= (Programacion + Probabilidad +Ingles)/3;

        if(promedio>= 6){
            System.out.println("El Alumno aprobo: " + promedio);
        } else {
         System.out.println("El Alumno reprobo: " + promedio);
        }
    }
}
*/

/*
Ejercicio 2: Sistema para comprar juegos con un presupuesto limitado
public class EstructuraCondicionalIF_else {
    public static void main(String args []){
        int presupuesto= 500;
        int RainbowSix= 200;
        int LegendZelda= 800;
        int FallGuys= 150;
        int CupHead= 150;
        int precio=0;
        int cambio= 0;

        precio= RainbowSix + FallGuys + LegendZelda;
        cambio= presupuesto-precio;
        if (precio <= 500) {
            System.out.println("Juegos adquiridos, total a pagar: $" + precio);
            System.out.println("Cambio: $" + cambio);
        } else {
            System.out.println("Fuera del presupuesto dado: $" + presupuesto);
            System.out.println("Precio a pagar: $" + precio);
        }

    }
}
 */



/*
Ejercicio 3: Numero par o impar
public class EstructuraCondicionalIF_else {
    public static void main(String args[]){
        int Numero= 42;

        if(Numero % 2 == 0){ // Si la division de el Numero es igual a 0
            System.out.println("El numero " + Numero + " es par"); //Entonces el numero es par
        }else {
            System.out.println("EL numero es impar"); //Si no es igual a 0 entonces es impar
        }
    }
}
 */

/*
Ejercicio 4= Verificar que si eres menor a 30 años eres joven y si eres mayor a 30 años eres adulto
public class EstructuraCondicionalIF_else {
    public static void main(String args[]){
        int edad=30;

        if (edad>=30){
            System.out.println("Eres Adulto");
        }else {
            System.out.println("Eres Joven");
        }
    }
}
 */

/*
Ejercicio 5: Verificar si aun queda espacio de memoria para descargar juegos
public class EstructuraCondicionalIF_else {
    public static void main(String args[]){
        int MemoriaXbox= 500;
        int Warzone= 120;
        int RainbowSix= 150;
        int Fortnite= 200;
        int RocketLeague= 300;
        int ARK= 500;
        int memoriaUsada=0;
        memoriaUsada= ARK;

        if (memoriaUsada > MemoriaXbox){
            System.out.println("No hay espacio en la consola");
        }else {
            System.out.println("Hay espacio suficiente");
        }
    }
}
 */

/*
Ejercicio 6: Descuentos del 30% a compras mayores a $400
public class EstructuraCondicionalIF_else {
    public static void main(String args[]){
        int camisa= 50;
        int jeans= 100;
        int sudadera= 300;
        int tenis= 190;
        int precioT= 0;
        int precioD=0;
        int precioF=0;
        precioT= jeans + sudadera + tenis;
        if (precioT >= 400){
             precioD= precioT - ((30 * precioT)/100);
             System.out.println("Usted tiene descuento");
             System.out.println("Total a pagar: $" + precioT);
             System.out.println("Total con descuento: $" + precioD);
        } else {
            precioF= 400-precioT;
            System.out.println("No se aplica descuento");
            System.out.println("Total a pagar: $" + precioT);
            System.out.println("Le hace falta $" + precioF + " para poder aplicar descuento");
        }
    }
}
 */

/*Ejercicio 7: Clasificación de overwatch
public class EstructuraCondicionalIF_else {
    public static void main(String args []){
        int partidasGanadas= 8;
        int partidadPerdidas= 6;

        if (partidadPerdidas < partidasGanadas){
            System.out.println("Clasificas de Rango");
        } else
        {
            System.out.println("No clasificas de Rango");
        }
    }
}
 */
/*
public class EstructuraCondicionalIF_else {
    public static void main (String args []){
        int edad= 21, entrada= 18;
        if (edad >= entrada){
            System.out.println("Puedes ingresar a la fiesta");
        }else {
            System.out.println("No puedes entrar ya que eres menor de edad");
        }
    }
}
 */
/*
public class EstructuraCondicionalIF_else {
    public static void main (String args []){
        int galletas= 6;

        if (galletas >= 2){
            System.out.println("Puedes compartir");
        } else {
            System.out.println("No puedes compartir");
        }
    }
}
 */

/*
public class EstructuraCondicionalIF_else {
    public static void main (String args []){
        int manzanas= 5, platanos= 4;

        if (manzanas >= platanos){
            System.out.println("El frutero es de color rojo");
        } else {
            System.out.println("El frutero es amarillo");
        }
    }
}
 */
/*
public class EstructuraCondicionalIF_else {
    public static void main (String args[]){
        int Roll= 2;

        if (Roll == 1){
            System.out.println("Roll de tanque");
        } else {
            System.out.println("Roll de Dps");
        }

    }
}
 */

/*
public class EstructuraCondicionalIF_else {
    public static void main (String args []){
        int Hora= 15, medioDia= 12;

        if (Hora > medioDia){
            System.out.println("son las " + Hora + " PM");
        } else {
            System.out.println("Aun no pasan del medio dia");
        }
    }
}
 */



