package view;

import controller.LagerController;

import java.util.Scanner;

public class ConsoleView {

    private LagerController lagerController;

    public ConsoleView(LagerController lagerController) {
        this.lagerController = lagerController;

    }

    /**
     * Prints the menu with options to choose from
     */
    public void menu() {
        System.out.println();
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to add produkt");
        System.out.println("Press 2 to show produkt");
        System.out.println("Press 3 to update produkt");
        System.out.println("Press 4 to delete produkt");
        System.out.println("Press 5 to add lageraktualisierung");
        System.out.println("Press 6 to show lageraktualisierung ");
        System.out.println("Press 7 to update lageraktualisierung ");
        System.out.println("Press 8 to delete lageraktualisierung ");

    }

    /**
     * Menu where all the functionalities are being used
     */
    public void consoleApp() {
        Scanner input = new Scanner(System.in);
        boolean next = true;
        int user = 1;
        while (next) {
            System.out.println();
            System.out.println("Press 1 for Produkt");
            System.out.println("Press 2 for Lageraktualisierung");
            System.out.println("Input: ");
        }

    }
}
