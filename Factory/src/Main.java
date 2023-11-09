import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String type;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the type of vehicle:");
        type=myObj.next();
        VechicleFactory vechicleFactory = new VechicleFactory();
        System.out.println(vechicleFactory.createVehicle(type).getVechicle());
    }
}