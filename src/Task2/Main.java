package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe c1 = new Cafe();
        c1.loadMenuData();


        for (String coffee : c1.getCoffeMenu()){
            System.out.println(coffee);
        }

    }
}


class Cafe {
    private ArrayList<String> coffeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeMenu() {
        return coffeMenu;
    }

    void loadMenuData(){

    try {
    File file = new File("coffee.txt");
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()){
        coffeMenu.add(scanner.nextLine());
    }

    } catch (FileNotFoundException e) {
        System.out.println("File not found. Check path and filename");


    }


    }


}


