import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /// Loopy - variable to store the output of 5 words
        String fiveWords = "";
        int count = 1;
        while (count <= 5) {
            System.out.println("Please input a word #");
            String word = input.nextLine();
            fiveWords = fiveWords + " " + word; // to add a space after each word
            count = count + 1;// or count++

        }
        System.out.println(fiveWords); // stored values

        // Iffy

        boolean redEye;
        String userPrompt ="";
        String quit = "";


        do {

            System.out.println("Are your eyes red? ");
            userPrompt = input.nextLine();

            if (userPrompt.equalsIgnoreCase("y") || userPrompt.equalsIgnoreCase("yes")) {
                redEye = true;
            } else {
                redEye = false;
            }
            if (redEye == true) {
                System.out.println("Get some help");
            }else {
                System.out.println("You look great!");

                /// Iffy Loop
            }
            System.out.println("Do you want try again?");
            quit = input.nextLine();

        }while (!quit.equalsIgnoreCase("n"));


    }
}













