import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Indtast postnummer: ");

        Scanner scanner = new Scanner(System.in);

        int postnummer = scanner.nextInt();

        ArrayList<PostInfo> list = new ArrayList<PostInfo>();

        list.add(new PostInfo(2610, "Rødovre"));
        list.add(new PostInfo(2700, "Husum"));

        for (int i = 0; i < list.size(); i++) {
            if (postnummer == list.get(i).getPostNummer()) {
                System.out.println("" + list.get(i));
            }

            // System.out.println("li: " + i + list.toString());
        }

        // PostInfo test = new PostInfo(2610, "Rødovre");

        // System.out.println(test.toString());

        // PostInfo test = new PostInfo(2610, "Rødovre");

        // System.out.println("" + test);

        // System.out.println(test.toString());

        // System.out.println("Indtast postnummer: ");

        // Scanner scanner = new Scanner(System.in);

    }

}