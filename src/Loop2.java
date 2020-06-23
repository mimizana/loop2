import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeat= "yes";
        boolean redEyes = true;



        while (repeat.equalsIgnoreCase("yes")){
            System.out.println("Are your eyes red?");
            String userInput;
            userInput =scan.nextLine();

            if  (userInput.equals("yes")) {
                redEyes = true;

            }
            else { redEyes = false;

            }

            if (redEyes ==true ){
                System.out.println("Get some sleep!");
            }
            else
            { System.out.println("You look great!");
            }
            System.out.println("Would you like to type again?");
            repeat = scan.nextLine();
        }

        }



}
