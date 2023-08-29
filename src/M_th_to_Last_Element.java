
//Testing linked list
import java.util.*;

public class M_th_to_Last_Element {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int userInput = Integer.parseInt(scanner.nextLine());
        long userInput = Long.parseLong(scanner.nextLine()); // Read input as a long
        if (userInput <= 0 || userInput >= Math.pow(2, 32) - 1) {
            System.out.println("NIL");
            return; // Exit the program
        }

        String listInput = scanner.nextLine();
        String[] elements = listInput.split(" ");
        LinkedList<String> linkedList = new LinkedList<>();


        for (String element : elements) {

            long elementValue = Long.parseLong(element);
            if (elementValue < 0 || elementValue > Math.pow(2, 32) - 1) {
                System.out.println("NIL");
                return; // Exit the program
            }
            linkedList.add(element);
        }

        if (linkedList.size() <= 0 || linkedList.size() >= 1024) {
            System.out.println("NIL");
            return;
        }

        int intUserInput = (int) userInput; // Convert to int
        if (intUserInput >= 0 && intUserInput < linkedList.size()) {
            System.out.println(linkedList.get(linkedList.size() - intUserInput));
        } else {
            System.out.println("NIL");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}