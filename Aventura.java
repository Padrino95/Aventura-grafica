
import java.util.Scanner;

public class Aventura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String logo, decision1, mensaje;
        int opcion, decision2, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7;

        logo = "	  __^__                                      __^__\n"
                + "         ( ___ )------------------------------------( ___ )\n"
                + "          | / |                                      | \\ |\n"
                + "          | / |        La mansión del terror          | \\ |\n"
                + "          |___|                                      |___|\n"
                + "         (_____)------------------------------------(_____)";
        System.out.println(logo);
        System.out.println("De repente te despiertas en una habitación \n"
                + "mugrienta y llena de un pestilento olor a tabaco \n"
                + "al principio te sientes un poco aturdido, \n"
                + "pero poco a poco vas recuperando el conocmiento y \n"
                + "la poca cordura que antes tenías y te preguntas dónde \n"
                + "estás y como has llegado ahí, y lo más importante \n"
                + "¿cómo vas a escapar de esa habitación? \n\n"
                + "Te levantas del suelo y ves una nota de papel frente a ti \n"
                + "con lo que parecen una instrucciones sobre como escapar \n"
                + "del lugar \n"
                + "En dicha nota te dan cinco opciones de las cuales solo \n"
                + "una te llevará de vuelta a casa para poder volver a jugar \n"
                + "al fornite como buen niño rata que eres.");

        System.out.println("1.Te acercas a la ventana \n"
                + "2.Te acercas a la puerta \n"
                + "3.Coges la pistola \n"
                + "4.Te acercas a la trampilla \n"
                + "5.Coges e maletín lleno de dinero que hay en la habitacion");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                mensaje = "Una vez estás al lado de la ventana tienes \n"
                        + "dos opciones: "
                        + "La abres y saltas \n"
                        + "La abres e intentas pedir ayuda \n"
                        + "que prefieres, ¿saltar o pedir ayuda?";
//aqui si necesito el sout (xk luego vienen mas cosas)
                System.out.println(mensaje);
                teclado.nextLine();
                decision1 = teclado.nextLine();
                if ("saltar".equals(decision1)) {
                    mensaje = "enhorabuena, has saltado de un décimo piso \n"
                            + "y estás muerto";
                } else if ("pedir ayuda".equals(decision1)) {
                    mensaje = "enhorabuena, tu captor te ha escuchado \n"
                            + "y estás muerto";
                } else {
                    mensaje = "introduce un valor válido";
                }
                break;
            case 2:
                mensaje = "Ahora te encuentras al lado de la puerta y \n"
                        + "tienes que tomar una decisión: \n"
                        + "1.Intentas bloquearla\n"
                        + "2.La abres en sigilo";
                System.out.println(mensaje);
                decision2 = teclado.nextInt();
                if (decision2 == 1) {
                    mensaje = "Bién, has ganado un poco de tiempo \n"
                            + "nuevamente tienes que tomar una decisión \n"
                            + "1.Buscar una forma mágica de salir de ahí \n"
                            + "2.Vuelves sobre tus pasos y empiezas de nuevo";
                    System.out.println(mensaje);
                    opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            mensaje = "¿Eres tonto?\n"
                                    + "¿Desde cuando existe la magia?";
                            break;
                        case 2:
                            mensaje = "Reinicia el juego";
                            break;
                        default:
                            mensaje = "introduce un valor valido";
                    }
                } else if (decision2 == 2) {
                    mensaje = "tu captor estaba detrás de la puerta\n"
                            + "FIN DEL JUEGO";
                } else {
                    mensaje = "introduce un número válido";
                }
                break;
            case 3:
                mensaje = "Una vez has cogido la pistola te ves en la tesitura\n"
                        + "de elegir entre tres opciones:\n"
                        + "1.Compruebas que tenga balas\n"
                        + "2.Disparas a la cerradura de la puerta\n"
                        + "para intentar abrirla\n"
                        + "3.Crees que no te va a ser útil y la sueltas";
                System.out.println(mensaje);
                opcion3 = teclado.nextInt();
                if (opcion3 == 1) {
                    mensaje = "Una vez compruebas que efectivamente tiene balas\n"
                            + "1.la guardas e intentas escapar por la trampilla\n"
                            + "2.Te pegas un tiro porque no quieres seguir\n"
                            + "pensando como salir de alli";
                    System.out.println(mensaje);
                    opcion4 = teclado.nextInt();
                    if (opcion4 == 1) {
                        mensaje = "Una vez abres la trampilla te encuentras con tu captor\n"
                                + "Te encuentras ante la más complicada de tus decisiones\n"
                                + "1.le disparas y vas hacia el final del tunel\n"
                                + "2.Intentas hablar con el";
                        System.out.println(mensaje);
                        opcion5 = teclado.nextInt();
                        if (opcion5 == 1) {
                            mensaje = "enhorabuena has salido con vida¡¡¡";
                        } else if (opcion5 == 2) {
                            mensaje = "¿Desde cuando un captor va a querer hablar\n"
                                    + "contigo?\n"
                                    + "obviamente estás muerto";
                        } else {
                            mensaje = "Introduce un valor válido";
                        }

                    } else if (opcion4 < 3 && opcion4 > 1) {
                        mensaje = "Cuantos tiros quiere pegarte\n"
                                + "1\n"
                                + "2";
                        System.out.println(mensaje);
                        opcion6 = teclado.nextInt();
                        if (opcion6 == 1) {
                            mensaje = "No has muerto del todo , pero te has quedado vegetal";
                        } else if (opcion6 == 2) {
                            mensaje = "Estás muerto";
                        } else {
                            mensaje = "Introduce un numero valido";
                        }

                    } else {
                        mensaje = "introduce un valor válido";
                    }
                } else if (opcion3 == 2) {
                    mensaje = "Te has quedado sin balas y sin la posibilidad de huir del lugar";
                } else if (opcion3 == 3) {
                    mensaje = "Ha desperdiciado la unica forma de salir de alli, Fin del juego";
                } else {
                    mensaje = "introduce un valor válido";
                }
                break;
            case 4:
                mensaje = "Te encuentras ante una tesitura\n"
                        + "1.La abres\n"
                        + "2.Le pones un objeto encima para bloquearla";
                System.out.println(mensaje);
                opcion7 = teclado.nextInt();
                if (opcion7 == 1) {
                    mensaje = "Te encuentras con tu captor y no tienes como defenderte, Fin del juego";
                } else if (opcion7 == 2) {
                    mensaje = "Acabas de bloquear la única salida que habia, Fin del juego";
                } else {
                    mensaje = "introduce un valor válido";
                }
                break;
            case 5:
                mensaje = "Enhorabuena eres millonario pero no puedes salir\n"
                        + "del lugar, Fin del juego";
//aqui no necesito el sout
                //System.out.println(mensaje);
                break;
            default:
                mensaje = "introduce un valor válido";
        }
        System.out.println(mensaje);
    }
}