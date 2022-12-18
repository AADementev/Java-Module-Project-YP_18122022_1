import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
public class Calculate {
    void personsCalculate(int numberPerson) {
        ArrayList<Product> productList = addProducts();
        double totalSum = 0;
        for (int p = 0; p < productList.size(); p++) {
            totalSum += productList.get(p).price;
            System.out.println(productList.get(p).name + "\t" + productList.get(p).price);
        }
        double allSum = totalSum / numberPerson;
        String sumTwoDots = String.format("%.2f", allSum);
        double countRubDouble = Math.floor(allSum);
        int rubInt = (int) countRubDouble;
        String ending = "";
        if (rubInt % 10 == 1) {
            if (rubInt % 100 == 11) ending = "рублей";
            else ending = "рубль";
        } else if (rubInt % 10 == 2 || rubInt % 10 == 3 || rubInt % 10 == 4) {
            if (rubInt % 100 == 12 || rubInt % 100 == 13 || rubInt % 100 == 14) ending = "рублей";
            else ending = "рубля";
        } else ending = "рублей";
        System.out.println("Каждый должен заплатить" + sumTwoDots + " " + ending);
    }
    private ArrayList<Product> addProducts() {
        ArrayList<Product> productList = new ArrayList<Product>();
        while (true) {
            System.out.println("Put in product name");
            String nameProduct = new Scanner(System.in).nextLine();
            System.out.println("Put in product price");
            while (true) {
                try {
                    double priceProduct = new Scanner(System.in).nextDouble();
                    Product product = new Product(nameProduct, priceProduct);
                    productList.add(product);
                    System.out.println("Good choice! All in bag");
                    break;
                } catch (InputMismatchException i) {
                    System.out.println("Input only numbers");
                }
            }
            System.out.println("Another product?");
            String finalWord = new Scanner(System.in).nextLine();
            String exit = "Завершить";
            if (exit.equalsIgnoreCase(finalWord))
                break;
        }
        return productList;
    }
}