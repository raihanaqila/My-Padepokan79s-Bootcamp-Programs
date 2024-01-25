package org.example.OOP;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pulpen pulpen1 = new Pulpen("H6077 Series", "Celebrity", "Retractable Ball Pen",
                "Ultra-Light Aluminium Body", "Textured Body at Grip for Better Hold", "Stylish Matt Finish", 0.7);
        Pulpen pulpen2 = new Pulpen("H2005 Series", "Stylus", "Ball Pen",
                "Futuristic Stylus Embedded Design", "Twist Mechanism", "Satin Finish Body", "Stylus", 1.0);
        Pulpen pulpen3 = new Pulpen();

        pulpen3.series = "H6101 Series";
        pulpen3.name = "Brussels";
        pulpen3.type = "Retractable Ball Pen";
        pulpen3.feature1 = "Brush Finish Body";
        pulpen3.feature2 = "Textured Grip for Better Writing";
        pulpen3.feature3 = "Designer Clip";
        pulpen3.tipSize = 0.7;

        Scanner input = new Scanner(System.in);
        System.out.print("Tulis nomor produk pulpen yang tersedia (1-3): ");
        int nomorPulpen = input.nextInt();

        switch (nomorPulpen) {
            case 1:
                printPulpenInfo(pulpen1);
                break;
            case 2:
                printPulpenInfo(pulpen2);
                break;
            case 3:
                printPulpenInfo(pulpen3);
                break;
            default:
                System.out.println("Nomor pulpen tidak tersedia.");
        }
    }
    private static void printPulpenInfo(Pulpen pulpen) {
        System.out.println("The " + pulpen.series + " " + pulpen.name + " " + pulpen.type + " boasts " + pulpen.feature1 +
                " complemented by a " + pulpen.feature2 + ". ");
        System.out.println("It's " + pulpen.feature3 + " adds to the pen's allure, making it both functional and visually appealing. ");
        System.out.println("This pen is " + pulpen.refillAble + " with a " + pulpen.tipSize + "mm tip size, available in both " + pulpen.inkColour + " ink. ");
        System.out.println("Conveniently packaged in a " + pulpen.packingDetails1 + ", it is also shipped in a " + pulpen.packingDetails2 + " Box, ensuring you have an ample supply of these high-quality pens."
        );
    }
}
