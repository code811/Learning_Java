package Lesson56_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        //ArrayList<Object> name = new ArrayList<>(); // follows this syntax
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);

//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.14);
//        list.add(1.99);
//        list.add(2.01);

//        System.out.println(list);

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Coconut");

//        fruits.remove(1);
//        fruits.set(0, "Pineapple");
//        System.out.println(fruits.get(0));
//        System.out.println(fruits.size());

//        Collections.sort(fruits); // Collections Framework works with ArrayLists
//
//        System.out.println(fruits);
//
//        for(String fruit : fruits) {
//            System.out.println(fruit);
//        }


        // Exercise
        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < numOfFood; i++) {
            System.out.print("Enter food #" + (i + 1) + ": ");
            String food = sc.nextLine();

            foods.add(food);
        }

        System.out.println(foods);

        sc.close();
    }
}
