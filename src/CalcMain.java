import java.util.Scanner;
import java.util.ArrayList;


public class CalcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        String a = input.nextLine();
        String hello;
        String[] stringArray = a.split("");


        ArrayList<String> finalList = new ArrayList<>();
        String value="";

        for (String s : stringArray)
        {
            if (s.equals("0") || s.equals("1") || s.equals("2")
                    || s.equals("3") || s.equals("4")
                    || s.equals("5") || s.equals("6")
                    || s.equals("7") || s.equals("8")
                    || s.equals("9")
            ) {
                value += s;
            }

            else if (s.equals("+") || (s.equals("-")) || (s.equals("*")) || (s.equals("/")))
            {
                finalList.add(value);
                finalList.add(s);
                value = "";
            }
        }

        finalList.add(value);

        for (String s : finalList)
        {
            System.out.print(s + " ");
        }
        System.out.println();


        for(int counter=0;counter< finalList.size();counter++)
        {
            if(finalList.get(counter).equals("+"))
            {
                hello = Calculations.hi(finalList.get(counter-1),finalList.get(counter+1));
                finalList.remove(counter +0);
                finalList.remove(counter +0);
               finalList.set(counter-1,hello);
               counter-=counter;

            }

        }

        for (String s : finalList)
        {
            System.out.print(s + " ");
        }




    }
}