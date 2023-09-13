import java.util.ArrayList;

public class ArrayList2D{

    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Sweets");
        bakeryList.add("Cakes");
        // bakeryList.add("Bread");

        ArrayList<String> snacksList = new ArrayList<>();
        snacksList.add("Cookies");
        snacksList.add("Donuts");
        snacksList.add("Chips");

        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Potato");
        vegetableList.add("Tomato");
        vegetableList.add("Garlic");

        groceryList.add(bakeryList);
        groceryList.add(snacksList);
        groceryList.add(vegetableList);

        System.out.println(groceryList);

        System.out.println(groceryList.get(0).get(1));
        System.out.println(groceryList.get(1).get(0));
        System.out.println(groceryList.get(2).get(2));

        System.out.println(groceryList.size());
        System.out.println(groceryList.get(0).size());

        groceryList.get(0).add("Chocolates");

        groceryList.get(1).add("DoraCakes");

        groceryList.get(2).add("Brinjal");

        ArrayList<String> otherItemsList = new ArrayList<>();

        groceryList.add(otherItemsList);

        System.out.println(groceryList);

    }

}