import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static boolean option1 = false;

    //Account method that takes the string "ans" as an argument
    //This method contains option 2 which allows you to enter a sum
    //Method processes the sum as a string and divides it in to a string array
    static ArrayList<String> account(String ans) {

        //Takes in the sum input as a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sum: ");
        String a = input.nextLine();

        //Divides the String in to a string array
        String[] stringArray = a.split("");
        ArrayList<String> finalList = new ArrayList<>();

        String value = "";
        String checker = "";

        for (String s : stringArray) {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9") || s.equals(".")
                    || s.equals("-") & value.isEmpty()
                    & !checker.equals("1")) {
                value += s;

            } else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/"))
                    || (s.equals("^")) || (s.equals("!"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "";

            } else if (s.equals("(") || (s.equals(")"))) {

                finalList.add(value);
                finalList.add(s);
                value = "";
                checker = "1";

            } else if (s.equals("a") & value.isEmpty()){
                value = ans;
            }

            else if (s.equals("e")){
                value = String.valueOf(Math.E);
            }

            else if (s.equals("s") || s.equals("c") || s.equals("t")) { // For sin, cos, tan
                if (!value.isEmpty()) {
                    finalList.add(value);
                    value = "";
                }
                finalList.add(s);

            }

            else {
                System.out.println(s);
                System.out.print("Invalid input\n");
                finalList = Menu.account(ans);

                break;
            }
        }
        finalList.add(value);

        return finalList;
    }

    //Method containing option 1, A feature list
    static void featureList(){
        System.out.println("Features:\nAddition: +\nSubtraction: -\nMultiplication: *" +
                "\nDivision: /\nPower: ^\nFactorial: !\nBrackets: ( ) \nEuler's Number: e\nPrevious Result: a" +
                "\nSine: s\nCosine: c\nTangent: t");
    }

    //Method containing option 3, An option menu
    static boolean options(){
        Scanner input = new Scanner(System.in);
        String optionInput;

        //Option 1 allows you to either disable or enable Step-by-step solution based on its current state
        //Set to disabled by default
        if(!option1){
            System.out.println("1 - Enable step-by-step solution ");
            optionInput = input.nextLine();
            if(optionInput.equals("1")){
                option1 = true;
                System.out.println("Enabled");
            }
        }
        else{
            System.out.println("1 - Disable step-by-step solution ");
            optionInput = input.nextLine();
            if(optionInput.equals("1")){
                option1 = false;
                System.out.println("Disabled");
            }
        }
        //returns boolean to state if step-by-step solution is enabled or disabled
        return option1;
    }
}

