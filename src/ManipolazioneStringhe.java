import java.util.Scanner;

public class ManipolazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("scivi qui stringa: ");
        String stringa = scanner.nextLine();

        System.out.println("la stinga è lunga: " + lunghezza(stringa));
        System.out.println("La stringa minuscola è: " + minuscolo(stringa));
        System.out.println("La stringa maiuscola è: " + maiuscolo(stringa));
        System.out.println("La iniziale della stringa è: " + iniziale(stringa));
        System.out.println("Le finali della stringa è: " + finale(stringa));


        scanner.close();
    }

    public static int lunghezza(String parametro1) {
        return parametro1.length();
    }

    public static String minuscolo ( String parametro1)  {
        return parametro1.toLowerCase();
    }

    public static String maiuscolo ( String parametro1)  {
        return parametro1.toUpperCase();
    }

    public static char iniziale ( String parametro1)  {
        return parametro1.charAt(0);
    }

    public static String finale ( String parametro1)  {
        return parametro1.substring(parametro1.length()-2);
    }
}
