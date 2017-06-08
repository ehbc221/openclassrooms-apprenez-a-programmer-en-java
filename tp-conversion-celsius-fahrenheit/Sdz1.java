import java.util.Scanner;

public class Sdz1 {
    public static void main(String[] args) {
        //System.out.print("");
        Scanner sc = new Scanner(System.in);
        char reponse, mode;
        double arronfiFaren, faren, arrondiCelsius, celsius;
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");
        do {
        System.out.println("Choisissez le mode de convertion :");
        System.out.println("1- Convertisseur Celsius - Fahrenheit");
        System.out.println("2- Convertisseur Fahrenheit - Celsius");
            do {
                System.out.print("\nQuel type de conversion souhaitez-vous faire ? ");
                mode = sc.nextLine().charAt(0);
                if (mode != '1' && mode != '2') {
                    System.out.println("Choix incorrect. Veuillez le ressaisir svp.");
                }
            } while (mode != '1' && mode != '2');
            System.out.print("Température à convertir : ");
            if (mode == '1') {
                celsius = sc.nextDouble();
                faren = (double)(9) / (double)(5) * celsius + 32;
                arronfiFaren = arrondi(faren, 1);
                System.out.println(celsius + " °C correspond à : " + arronfiFaren + " °F.");
            }
            else {
                faren = sc.nextDouble();
                celsius = (faren - 32) * 5 / (double)(9);
                arrondiCelsius = arrondi(celsius, 2);
                System.out.println(faren + " °F correspond à : " + arrondiCelsius + " °C.");
            }
            do {
                System.out.print("Souhaitez-vous convertir une autre température ?(O/N) ");
                sc.nextLine();
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');
        } while (reponse == 'O');
        System.out.print("Au revoir !");
    }
    /**
     * Arrondir un double, avec un nobre de chiffres après la virgule défini
     * @param  double A             [Nobmre à arrondir]
     * @param  int    B             [Nombre de chiffres après la virgule]
     * @return        [Le nombre arrondi]
     */
    public static double arrondi(double A, int B) {
        return (double) ((int)(A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }
}
