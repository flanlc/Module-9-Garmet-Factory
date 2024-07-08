package org.example;

import java.util.Scanner;

/*
Article is an abstract class that is implemented by the abstract top, bottom, and footwear classes. These abstract classes are
used to create the article class with its designated type ex: CausalTop. The ArticleFactory is an abstract class implemented
by Factories used to create each article of clothing. The driver main class is used to ask the user their preferred article and
its type in order to call the proper factory class.
 */


public class Main {
    public static void main(String[] args) {
        //Variables holding product and its desired type
        String Product;
        String Type;
        ArticleFactory Factory;

        Scanner scanner = new Scanner(System.in);

        //Gets user input for the desired product
        System.out.println("---Please Enter the desired Product---");
        System.out.println("1:  Top");
        System.out.println("2:  Bottom");
        System.out.println("3:  Footwear");
        System.out.println();
        Product = scanner.nextLine();
        System.out.println();

        //Gets user input for the desired product type
        System.out.println("---Please Enter the desired Products Type---");
        System.out.println("1:  Casual");
        System.out.println("2:  Professional");
        System.out.println("3:  Party");
        System.out.println();
        Type = scanner.nextLine();
        System.out.println();

        //This if statement checks what type of product the customer is looking for
        if (Product.equalsIgnoreCase("TOP")) {
            //Subsequent if statements check what type they are looking for
            if (Type.equalsIgnoreCase("CASUAL")) {
                //Creates desired factory and product
                Factory = new CasualArticleFactories();
                Factory.CreateTop();
            }
            if (Type.equalsIgnoreCase("PROFESSIONAL")) {
                Factory = new ProfessionalArticleFactories();
                Factory.CreateTop();
            }
            if (Type.equalsIgnoreCase("PARTY")) {
                Factory = new PartyArticleFactories();
                Factory.CreateTop();
            }
        }

        if (Product.equalsIgnoreCase("BOTTOM")) {
            if (Type.equalsIgnoreCase("CASUAL")) {
                //Creates desired factory and product
                Factory = new CasualArticleFactories();
                Factory.CreateBottom();
            }
            if (Type.equalsIgnoreCase("PROFESSIONAL")) {
                Factory = new ProfessionalArticleFactories();
                Factory.CreateBottom();
            }
            if (Type.equalsIgnoreCase("PARTY")) {
                Factory = new PartyArticleFactories();
                Factory.CreateBottom();
            }
        }

        if (Product.equalsIgnoreCase("FOOTWEAR")) {
            if (Type.equalsIgnoreCase("CASUAL")) {
                //Creates desired factory and product
                Factory = new CasualArticleFactories();
                Factory.CreateFootwear();
            }
            if (Type.equalsIgnoreCase("PROFESSIONAL")) {
                Factory = new ProfessionalArticleFactories();
                Factory.CreateFootwear();
            }
            if (Type.equalsIgnoreCase("PARTY")) {
                Factory = new PartyArticleFactories();
                Factory.CreateFootwear();
            }
        }
    }
}