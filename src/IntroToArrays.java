import java.util.Scanner;

public class IntroToArrays {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vince = "Vince";
        String liz = "Liz";

        // type, name, construction, size
        // arrays are objects
        int[] grades = new int[10]; // size = 10

        // assignment of a value is done with an index, indexing starts at 0!
        for (int i = 0; i < grades.length; i++) {
            grades[i] = i;
        }

        grades[0] = 150;

        // printing arrays works best with a for each loop
        for(int x: grades) { // type - name : what you're looping over
            System.out.println(x);
        }

        // string arrays are declared the same way
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name:");
            String currentName = scan.nextLine();
            names[i] = currentName;
        }

        // for each loop with strings
        for (String x: names) {
            System.out.println(x);
        }

        // declaring an array and filling it right away. Each value is separated by a comma
        double[] doubles = {10.5, 0, 9.1, 3.4};


    }
}
