import java.util.Scanner;

/**
 * @author yuliiamelnyk on 23/02/2020
 * @project Tamagochi
 */
public class Main {
    public static boolean isRaza = false;
    public static boolean isSalirMenu = false;
    public static Tamagotchi tamagotchi;
    public static Scanner scanner;

    public static void main(String[] args) {
        do {
            scanner = new Scanner(System.in);
            System.out.println("De que raza es tu tamagochi? Perro, Pajaro o Pez");
            String raza = scanner.nextLine();
            System.out.println("Introduzca nombre de tu mascota");
            String nombre = scanner.nextLine();
            tamagotchi = tamagotchi.nacer(raza, nombre);
            System.out.println(tamagotchi.toString());
        } while (!isRaza);
        do {
            if(tamagotchi.seHaMuerto()){
                System.out.println("Tu tamagotchi se ha muerto.");
                break;
            }
            if (tamagotchi.getClass().getName().equals("Perro")) {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar \n6 - Pasear");
                int menu = scanner.nextInt();
                menu(menu, tamagotchi);
            } else if (tamagotchi.getClass().getName().equals("Pajaro")) {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar \n6 - Sacar a volar");
                int menu = scanner.nextInt();
                menu(menu, tamagotchi);
            } else {
                System.out.println("Menu: \n0 - Salir \n1 - No hacer nada \n2 - Dar de comer \n3 - Dormir  \n4 - Bañar \n5 - Jugar ");
                int menu = scanner.nextInt();
                menu(menu, tamagotchi);
            }

        } while (!isSalirMenu);

    }

    // metodo para elejir el caso del menu
    public static void menu(int menu, Tamagotchi t) {
        switch (menu) {
            case 0:
                isSalirMenu = true;
                break;
            case 1:
                System.out.println("No haces nada, tu mascota hecha de menos a ti");
                t.vivir();
                System.out.println(t.toString());
                break;
            case 2:
                System.out.println("Come mi mascota favorita, come!");
                t.comer();
                t.vivir();
                System.out.println(t.toString());
                break;
            case 3:
                System.out.println("Veo, que estes cansado, duermete un poco");
                t.dormir();
                t.vivir();
                System.out.println(t.toString());
                break;
            case 4:
                System.out.println("Hueles mal, mi pequenito, hay que bañarte");
                t.baniarse();
                t.vivir();
                System.out.println(t.toString());
                break;
            case 5:
                System.out.println("Vamos a jugar en DOOM");
                t.jugar();
                t.vivir();
                System.out.println(t.toString());
                break;
            case 6:
                if (t.getClass().getName().equals("Perro")) {
                    System.out.println("Que buen tiempo! Nos damos a paseo!");
                    ((Perro)t).pasear();
                    t.vivir();
                    System.out.println(t.toString());
                } else if (t.getClass().getName().equals("Pajaro")) {
                    System.out.println("Vamos a volar, mi cielo!");
                    ((Pajaro)t).volar();
                    t.vivir();
                    System.out.println(t.toString());
                } else {
                    System.out.println("Accion incorecta, introduzca otra vez");
                    t.vivir();
                    System.out.println(t.toString());
                }
                break;
            default:
                System.out.println("Accion incorecta, introduzca otra vez");
                break;
        }
    }
}



























