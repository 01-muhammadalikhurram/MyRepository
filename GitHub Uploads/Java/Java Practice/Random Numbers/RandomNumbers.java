import java.util.Random;

public class RandomNumbers{

    public static void main(String[] args) {

        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("Generated Random Integer Number: " + randomInt);

        randomInt = random.nextInt(3);
        System.out.println("Generated Random Integer Number (within range of 0 to 2): " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("Generated Random Double Number: " + randomDouble);

        randomDouble = random.nextDouble(3);
        System.out.println("Generated Random Double Number (with given range): " + randomDouble);

        float randomFloat = random.nextFloat();
        System.out.println("Generated Random Float Number: " + randomFloat);

        randomFloat = random.nextFloat(5);
        System.out.println("Generated Random Float Number (bounded range): " + randomFloat);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Generated Random Boolean Value: " + randomBoolean);

    }

}