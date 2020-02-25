import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        System.out.println("Bestilling: ");

        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();

        ArrayList<Pizza> list = new ArrayList<Pizza>();

        list.add(new Pizza(1, "Hawaii", "Ost, skinke og ananas"));

        list.add(new Pizza(2, "Margherita", "Tomat og ost"));

        list.add(new Pizza(3, "Vesuvio", "Skinke og ost"));

        list.add(new Pizza(4, "Napoli", "Tomat, ost og pepperoni"));

        list.add(new Pizza(5, "Marmaris", "Tomat, ost, skinke, champignon og rejer"));

        list.add(new Pizza(6, "Capricciosa", "Med tomat, ost, skinke og champignon"));

        for (int i = 0; i < list.size(); i++) {
            if (nr == list.get(i).getnr())
                System.out.println("Du har bestilt Pizza nr: " + list.get(i));

        }

    }
}