package com.sky.designpatterns.designfactory;
// Use a factory pattern when you want a method to return one of several possible instance of classes that have a common super type

// Car interface has some behaviours represented by abstract methods
// Those behaviours can be achieved through different implementations.
// Car inteface implementated by Ferrari and Porsche. Therefore both those classes become of type Car
// Rather than directly instantiating the type of car you want ferrari or porsche, you have a CarFactory class
// containing a method which accepts a parameters which is used by logic inside it to decide which type of car to instantiate and return

// BENIFITS
// 1) Logic for instantiating classes is abstracted=hidden from the client programme. Programme = everything inside main method using encapsulated code in classes
// like likely to be modified by mistake
// 2) Useful when you dont know which type of car you would need at runtime. E.g. for a programme that allows user to input car name for which
// they want to get details for, the developer cannot have prior knowledge of which type of car they would choose
// 3) New subtypes of cars can be easily added with code only required to be modified in the car factory object


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String exitChoice = "n";
        Scanner userInput = new Scanner(System.in);
        while (exitChoice.equalsIgnoreCase("n")) {
            System.out.println("Choose car to get details from (FERRARI,PORSCHE):");
            if (userInput.hasNext()) {
                CarFactory carFactory = new CarFactory();
                // You wont know which type of car to instantiate until you get user input
                Car carFromFactory = carFactory.getCar(userInput.nextLine());
                carFromFactory.showCarDetails();
                System.out.println("Do you want to exit(y/n):");
                exitChoice = userInput.nextLine();
            }
        }
    }
}

