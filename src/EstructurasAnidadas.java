/*
public class EstructurasAnidadas {
    public static void main(String args []){
        int num1= 10;
        int num2= 2;
        int Operacion= 1;
        int resultado= 0;
        if (Operacion == 1){
            resultado= num1 + num2;
            System.out.println("Resultado de la Suma de " + num1 + " + " + num2 + " es: " + resultado);
        } else if (Operacion == 2) {
            resultado= num1 - num2;
            System.out.println("Resultado de la Resta de " + num1 + " - " + num2 + " es: " + resultado);
        } else if (Operacion == 3) {
            resultado= num1 * num2;
            System.out.println("Resultado de la Multiplicación de " + num1 + " * " + num2 + " es: " + resultado);
        } else if (Operacion == 4) {
            resultado= num1/num2;
            System.out.println("Resultado de la Division de " + num1 + "/" + num2 + " es: " + resultado);
        }else {
            System.out.println("La operacion no existe");
        }
    }
}
*/

/*verificar si un numero es negativo o positivo
public class EstructurasAnidadas {
    public static void main(String args []){
        int numero= 0;
        if(numero >= 0){
            System.out.println("El numero " + numero + " es positivo ");
        }else if (numero < 0){
            System.out.println("El numero " + numero + " es negativo");
        }else {
            System.out.println("EL numero no es valido");
        }
    }
}
 */

/*Clasificacion por edades para peliculas
public class EstructurasAnidadas {
    public static void main (String args []){
        int edad= 19;
        int CategoriaPeli= 4;

        if (CategoriaPeli == 1){
            System.out.println("Clasificacion G");
            if (edad > 0){
                System.out.println("Todos pueden entrar");
            }
        } else if (CategoriaPeli==2){
            System.out.println("Clasificación: PG");
            if (edad < 7){
                System.out.println("Advertencia: El contenido no puede ser apto para tu edad");
            } else{
                System.out.println("Es adecuado para tu edad");
            }
        } else if (CategoriaPeli == 3){
            System.out.println("Clasificación PG-13");
            if (edad > 13){
                System.out.println("Puedes pasar a la función");
            } else if (edad < 10) {
                System.out.println("debes de ir acompañado de un adulto");
            }else {
                System.out.println("no es adecuado para la edad");
            }
        } else if (CategoriaPeli == 4) {
            System.out.println("Clasificación R");
            if (edad > 17){
                System.out.println("Puedes entrar");
            } else if (edad < 15) {
                System.out.println("debes de ir acompañado de un adulto");
            }else {
                System.out.println("No es adecuado para tu edad");
            }
        }

    }
}
*/


/* Codigo para Jugar Clasificatorias

public class EstructurasAnidadas {
    public static void main (String args[]){
        int ModoJuego= 2;
        int pR= 60;
        int pRg= 50;
        int pRparaClasificatoria= 50;
        int partidasFaltantes=0;

        if (ModoJuego == 1){
            System.out.println("Partida Rapida");
            System.out.println("Partidas jugadas: " + pR);
        } else if (ModoJuego == 2) {
            System.out.println("Partida Competitiva");
            if (pRg >= pRparaClasificatoria){
                System.out.println("Puedes Jugar clasificatorias");
            } else {
                partidasFaltantes= pRparaClasificatoria - pRg;
                System.out.println("Te falta ganar " + partidasFaltantes + " para poder jugar Clasificatorias" );
            }
        } else {
            System.out.println("Opción Invalida");
        }
    }
}
 */

/* Codigo para elegir Rol de juego

public class EstructurasAnidadas {
    public static void main(String args []){
        int Tank= 1;
        int Support= 2;
        int Heal= 3;
        int escogerRoll=3;
        
        if(escogerRoll == 1){
            int tank1= 1;
            int tank2= 2;
            int tank3= 3;
            int tank4= 4;
            int escogerTank= 3;
            System.out.println("Escogiste el rol de Tank");
            if (escogerTank == 1){
                System.out.println("Reinhard");
            } else if (escogerTank == 2) {
                System.out.println("D.V.A");
            } else if (escogerTank == 3) {
                System.out.println("Orisa");
            } else if ( escogerTank == 4) {
                System.out.println("Roadhog");
            }else {
                System.out.println("No escogio personaje");
            }
        } else if (escogerRoll == 2) {
            int sup1= 1;
            int sup2= 2;
            int sup3= 3;
            int sup4= 4;
            int elegirSup= 4;
            System.out.println("Escogiste el rol de Support");
            if (elegirSup == 1){
                System.out.println("Soldado 76");
            } else if (elegirSup==2) {
                System.out.println("Mei");
            } else if (elegirSup==3) {
                System.out.println("Phara");
            } else if (elegirSup==4) {
                System.out.println("Bastion");
            }else {
                System.out.println("No escogio personaje");
            }
        } else if (escogerRoll == 3) {
            int heal1= 1;
            int heal2= 2;
            int elegirHeal= 2;
            System.out.println("Escogiste el rol de Heal");
            if (elegirHeal == 1){
                System.out.println("Mercy");
            } else if (elegirHeal==2) {
                System.out.println("Moira");
            }else {
                System.out.println("No escogio personaje");
            }
        } else{
            System.out.println("Rol no elegido");
        }
    }
}

*/

/*
public class EstructurasAnidadas {
    public static void main (String args []){
        int mododeJuego= 1, escogerRoll= 2, escogerPersonaje= 1;

        if (mododeJuego == 1){
            System.out.println("Juego Competitivo, Fila de Roles");
            if (escogerRoll == 1){
                System.out.println("Escogio roll de tanque");
                if (escogerPersonaje== 1){
                    System.out.println("Escogiste a Reinhard");
                } else if (escogerPersonaje==2) {
                    System.out.println("Escogiste a D.V.A");
                } else if (escogerPersonaje== 3) {
                    System.out.println("Escogiste a Roadhog");
                } else {
                    System.out.println("No existe ese personaje");
                }
            } else if (escogerRoll==2) {
                System.out.println("Escogio roll de dps");
                if (escogerPersonaje == 1){
                    System.out.println("Escogiste a Soldado 76");
                } else if (escogerPersonaje== 2) {
                    System.out.println("Escogiste a Junkrat");
                } else if (escogerPersonaje == 3) {
                    System.out.println("Escogiste a Mei");
                }else {
                    System.out.println("No existe ese personaje");
                }
            } else if (escogerRoll==3) {
                System.out.println("Escogio roll de Healer");
                if (escogerPersonaje==1){
                    System.out.println("Escogiste a Mercy");
                } else if (escogerPersonaje== 2) {
                    System.out.println("Escogiste a Moira");
                } else if (escogerPersonaje== 3) {
                    System.out.println("Escogiste a Lucio");
                }else {
                    System.out.println("No existe ese personaje");
                }
            }else {
                System.out.println("No existe ese Roll");
            }
        } else if (mododeJuego == 2) {
            System.out.println("Juego competitivo, Fila abierta");
        } else {
            System.out.println("No existe ese modo de juego");
        }
    }
}
 */

/*
public class EstructurasAnidadas {
    public static void main (String args []){
        int escuela= 2;
        int carrera= 1;

        if (escuela == 1){
            System.out.println("Fes Zaragoza");
            if (carrera== 1){
                System.out.println("Medicina");
            } else if (carrera== 2) {
                System.out.println("Veterinaria");
            } else {
                System.out.println("No existe esa carrera");
            }

        } else if (escuela== 2) {
            System.out.println("C.U");
            if (carrera== 1){
                System.out.println("Medicina");
            } else if (carrera== 2) {
                System.out.println("Veterinaria");
            } else {
                System.out.println("No existe esa carrera");
            }
        } else {
            System.out.println("No esta esa escuela");
        }

    }
}
 */