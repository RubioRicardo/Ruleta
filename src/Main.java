import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int TipoDeApuesta=0;



        while (TipoDeApuesta!=6) {
            int numeroAleatorio = rand.nextInt(37);


            System.out.println("+---------------------------------------------------+");
            System.out.println("Ingrese el tipo de apuesta que desea realizar");
            System.out.println("1. Apuesta a un número");
            System.out.println("2. Apuesta a un color");
            System.out.println("3. Apuesta a par o impar");
            System.out.println("4. Apuesta a de 1 a 18 o de 19 a 36");
            System.out.println("5. Apuesta a de 1 a 12, de 13 a 24 o de 25 a 36");
            System.out.println("6. Salir");
            System.out.println("+---------------------------------------------------+");

            TipoDeApuesta = scanner.nextInt();

            if (TipoDeApuesta == 1) {
                System.out.println("Ingrese el numero al que desea apostar");
                int numeroApuesta = scanner.nextInt();
                apuestaNumero(numeroAleatorio, numeroApuesta);

            } else if (TipoDeApuesta == 2) {
                System.out.println("+---------------------------------------------------+");
                System.out.println("Ingrese el color al que desea apostar");
                System.out.println("1. Rojo");
                System.out.println("2. Negro");
                System.out.println("+---------------------------------------------------+");

                int colorApostado = scanner.nextInt();
                apostarColor(numeroAleatorio, colorApostado);
            } else if (TipoDeApuesta == 3) {
                System.out.println("+---------------------------------------------------+");
                System.out.println("Selecione numeros pares o impares");
                System.out.println("1. Par");
                System.out.println("2. Impar");
                System.out.println("+---------------------------------------------------+");
                int parImpar = scanner.nextInt();
                apuestaParImpar(numeroAleatorio, parImpar);

            } else if (TipoDeApuesta == 4) {
                System.out.println("+---------------------------------------------------+");
                System.out.println("Selecione uno de estos rangos");
                System.out.println("1. de 1 a 18");
                System.out.println("2. de 19 a 36");
                System.out.println("+---------------------------------------------------+");
                int rango = scanner.nextInt();
                apuestaRangoLargos(numeroAleatorio, rango);

            } else if (TipoDeApuesta == 5) {

                System.out.println("+---------------------------------------------------+");
                System.out.println("Selecione uno de estos rangos");
                System.out.println("1. de 1 a 12");
                System.out.println("2. de 13 a 24");
                System.out.println("3. de 25 a 36");
                System.out.println("+---------------------------------------------------+");
                int rango = scanner.nextInt();
                apuestaRangoCortos(numeroAleatorio, rango);
            } else if (TipoDeApuesta == 6) {
                //Salida
                System.out.println("Gracias por jugar");
                System.out.println("FIN");
            } else {
                System.out.println("Opcion no valida");
            }
        }

    }

    public static void apuestaNumero(int numeroAleatorio, int numeroApuesta){
        if (numeroApuesta==numeroAleatorio){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else{
            System.out.println("Perdiste el nuemro era: "+ numeroAleatorio);
        }
    }



    public static void apuestaParImpar(int numeroAleatorio, int input){
        if (numeroAleatorio==0){
            System.out.println("El numero es: "+ numeroAleatorio + "y es Verde, Perdiste");
        }else if (numeroAleatorio%2==0 && input==1){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else if (numeroAleatorio%2!=0 && input==2){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else{
            System.out.println("Perdiste el numero era: "+ numeroAleatorio);
        }
    }

    public static void apuestaRangoLargos(int numeroAleatorio, int input){
        if (numeroAleatorio==0){
            System.out.println("El numero es: "+ numeroAleatorio + "y es Verde, Perdiste");
        }else if (numeroAleatorio>=1 && numeroAleatorio<=18 && input==1){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else if (numeroAleatorio>=19 && numeroAleatorio<=36 && input==2){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else{
            System.out.println("Perdiste el numero era: "+ numeroAleatorio);
        }
    }

    public static void  apuestaRangoCortos(int numeroAleatorio, int input ){
        if (numeroAleatorio==0){
            System.out.println("El numero es: "+ numeroAleatorio + "y es Verde, Perdiste");
        }else if (numeroAleatorio>=1 && numeroAleatorio<=12 && input==1){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else if (numeroAleatorio>=13 && numeroAleatorio<=24 && input==2){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else if (numeroAleatorio>=25 && numeroAleatorio<=36 && input==3){
            System.out.println("Ganaste el numero era: "+ numeroAleatorio);
        }else {
            System.out.println("Perdiste el numero era: "+ numeroAleatorio);
        }
    }

    public static void apostarColor(int numeroAleatorio,int colorApostado) {


        boolean esNegro = numerosNegros(numeroAleatorio);

        if (numeroAleatorio == 0) {
            System.out.println("El numero es: " + numeroAleatorio + " y es Verde, Perdiste");
        } else if (esNegro == true && colorApostado == 2) {

            System.out.println("Ganaste el numero era: " + numeroAleatorio +" N");
        } else if (esNegro == false && colorApostado == 1) {
            System.out.println("Ganaste el numero era: " + numeroAleatorio+" R");
        }else {
            if (esNegro==true){
                System.out.println("Perdiste el numero era: " + numeroAleatorio+" N");
            }else{
                System.out.println("Perdiste el numero era: " + numeroAleatorio+" R");
            }
        }
    }

    public static boolean numerosNegros(int x){

        boolean esNegroV=false;
        if (x==2 || x==4 || x==6 || x==8 || x==10 || x==11 || x==13 || x==15 || x==17 || x==20 || x==22 || x==24 || x==26 || x==28 || x==29 || x==31 || x==33 || x==35){
            esNegroV=true;
        }
        return esNegroV;
    }


}