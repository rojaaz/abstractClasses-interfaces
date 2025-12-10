
package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Playable> players = new ArrayList<>();

        System.out.println("Select media types to add:");
        System.out.println("1 = Add Music Player");
        System.out.println("2 = Add Video Player");
        System.out.println("3 = Finish");
        
        while (true) {
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                players.add(new MusicPlayer());
                System.out.println("Music Player added.");
            } 
            else if (option == 2) {
                players.add(new VideoPlayer());
                System.out.println("Video Player added.");
            } 
            else if (option == 3) {
                break;  
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n--- Playing All Selected Media ---");
        for (Playable player : players) {
            player.play();
        }

        scanner.close();
    }
}
