public class Calculations {


    static String hi(String a,String b){

        int number1 = Integer.parseInt(a);
        int number2 = Integer.parseInt(b);

        int c=number1+number2;
        return String.valueOf(c);
    }

}

class Addition extends Calculations{

    static int Add(int a,int b){
        int c = a+b;
        return c;
    }


}

class subtraction extends Calculations{

}
