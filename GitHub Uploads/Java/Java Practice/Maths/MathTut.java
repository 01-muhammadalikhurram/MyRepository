public class MathTut{

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y);
        System.out.println("Maximum of " + x + " and " + y + " is : " + z);

        z = Math.min(x,y);
        System.out.println("Minimum of " + x + " and " + y + " is : " + z);

        double squareRoot = Math.sqrt(x);
        System.out.println("Square Root of " + x + " is: " + squareRoot);

        squareRoot = Math.sqrt(y);
        System.out.println("Square Root of " + y + " is: " + squareRoot);

        double absolute = Math.abs(x);
        System.out.println("Absolute of " + x + " is: " + absolute);

        absolute = Math.abs(y);
        System.out.println("Absolute of " + y + " is: " + absolute);





    }

}