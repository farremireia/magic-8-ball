// Using java Random class: is part of the java.util package.

import java.util.Random;

class Magic8 {

    // Create Main method.
    public static void main (String[] args) {

        // Instance of the class Random.
        Random rand = new Random();

        // Invoke method of rand object.
        // Generates random values from 0 to 21.
        int upperbound = 20;

        // Generates and return a new random integer within the bounds of the distribution. 0 to 21(-1)
        int int_random = rand.nextInt(upperbound);

        // IF ELSE STATEMENT
        
        // negative answers
        if (int_random == 0) {
            System.out.println("Don't count on it.");
        
        } 
        
        else if (int_random == 1) {
            System.out.println("My reply is no.");
        } 
        
        else if (int_random == 2) {
            System.out.println("My sources say no.");
        } 
        
        else if (int_random == 3) {
            System.out.println("Outlook not so good.");
        } 
        
        else if (int_random == 4) {
            System.out.println("Very doubtful.");
        } 
        
        // non-committal answers
        else if (int_random == 5) {
            System.out.println("Reply hazy, try again.");
        } 
        
        else if (int_random == 6) {
            System.out.println("Ask again later.");
        } 
        
        else if (int_random == 7) {
            System.out.println("Better not tell you now.");
        } 
        
        else if (int_random == 8) {
            System.out.println("Cannot predict now.");
        } 
        
        else if (int_random == 9) {
            System.out.println("Concentrate and ask again.");
        } 
        
        // affirmative answers
        else if (int_random == 10) {
            System.out.println("As I see it, yes.");
        } 
        
        else if (int_random == 11) {
            System.out.println("Most likely.");
        } 
        
        else if (int_random == 12) {
            System.out.println("Outlook good.");
        } 
        
        else if (int_random == 13) {
            System.out.println("Yes.");
        } 
        
        else if (int_random == 14) {
            System.out.println("Signs point to yes.");
        } 
        
        else if (int_random == 15) {
            System.out.println("It is certain.");
        } 
        
        else if (int_random == 16) {
            System.out.println("It is decidedly so.");
        } 
        
        else if (int_random == 17) {
            System.out.println("Without a doubt.");
        } 
        
        else if (int_random == 18) {
            System.out.println("Yes – definitely.");
        } 
        
        else {
            System.out.println("You may rely on it.");
        }

    }

}
