public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        System.out.println("Result of "+a+" + "+b+" is = "+ ( a+b));
        System.out.println("Result of "+a+" - "+b+" is = "+ ( a-b));
        System.out.println("Result of "+a+" / "+b+" is = "+ ( a/b));
        System.out.println("Result of "+a+" * "+b+" is = "+ ( a*b));
        System.out.println("Result of "+a+" % "+b+" is = "+ ( a%b+10));

        int num1=a+b;
        int num2=a*b;


        int i = 3;
        int j = 4;

        String s = (i < j) ? "j is less than i" : "j is greater or equal i";
        System.out.println("s = " + s);
    }
}
