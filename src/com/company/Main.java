package com.company;
import java.util.Scanner;

class Car{
    String name;
    int model;

    Car(String cname, Integer cmodel)
    {
        name = cname;
        model = cmodel;
    }

    public void displayvalue() {
        System.out.println("Name of Car : " + name);

        System.out.println("Model of Car : " + model);

    }

}

public class Main {

    public static void main(String[] args) {


        Car[] mycar = new Car[3];

        String name;
        int model;

        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
//        System.out.print("Enter Car name and Model : ");


        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Car name : ");
            name = s.nextLine();

            System.out.print("Enter Car Model : ");
            model = t.nextInt();

            mycar[i] = new Car(name, model);
        }

        for (int i = 0; i < 3; i++) {

          mycar[i].displayvalue();
        }

    }
}
