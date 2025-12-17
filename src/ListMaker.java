import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    private static ArrayList<String> places = new ArrayList <String>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare variables
        String userMenu;
        boolean stop = false;
        boolean fileHasBeenLoaded = false;
        boolean fileHasBeenEdited = false;
        boolean fileHasBeenSaved = false;

        //List with 10 items inside it
        places.add("Germany");
        places.add("Ireland");
        places.add("Switzerland");
        places.add("Greenland");
        places.add("Greece");
        places.add("Japan");
        places.add("Russia");
        places.add("Indonesia");
        places.add("Bali");
        places.add("Maldives");

        //Initial printing of list
        System.out.println("Here is the current list: ");


        //Actual "code", portion of project

        do {
            userMenu = InputHelper.getRegExString(scan, "Choose an option from the menu: \n A - Add an item to the list \n D - Delete an item to the list \n P - Print the list \n Q - Quit the program \n O - Open list file \n S - Save current list \n C - Clear all the elements from current list", "[AaDdPpQqOoSsCc]");

            if (userMenu.equalsIgnoreCase("A")) {
                addMethod();
            } else if (userMenu.equalsIgnoreCase("D")) {
                deleteMethod();
            } else if (userMenu.equalsIgnoreCase("P")) {
                printMethod();
            } else if (userMenu.equalsIgnoreCase("Q")) {
                stop = quitMethod();
            } else if (userMenu.equalsIgnoreCase("O")) {
                openMethod();
            } else if (userMenu.equalsIgnoreCase("S")) {
                saveMethod();
            } else if (userMenu.equalsIgnoreCase("C")) {
                clearMethod();
            }
        } while (!stop);
    }

    //Asks the user for index of value they want to remove from the list
    private static void deleteMethod() {
        int index = InputHelper.getRangedInt(scan, "Enter the position of the item you want to remove", 0,places.size() -1 );
        places.remove(index);
        scan.nextLine();
    }

    //Asks the user for a value that will be added to the list
    private static void addMethod() {
        String newIndex = scan.nextLine();
        System.out.println("Did you want to add a value to the list? If so which value? ");
        places.add(newIndex);
        scan.nextLine();
    }

    //Prints out the current list
    private static void printMethod() {
        for (int i = 0; i < places.size(); i++) {
            System.out.print(i);
            System.out.print(" - ");
            System.out.print(places.get(i));
            System.out.println();
        }
    }

    //Asks the user if they are sure they want to quit
    private static boolean quitMethod() {
        boolean continueYN = false;
        String quit = InputHelper.getYNConfirm(scan, "Would you like to quit? [Y/N]");
        return true;
    }

    //Opens a list file from PC
    private static boolean openMethod() {

    }

    //Saves the current list file to PC
    private static boolean saveMethod() {

    }

    //Clear, removes all the elements from the current list
    private static boolean clearMethod() {

    }
}


