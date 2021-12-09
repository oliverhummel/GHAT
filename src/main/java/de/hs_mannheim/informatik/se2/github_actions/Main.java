package de.hs_mannheim.informatik.se2.github_actions;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Calculator c = new Calculator();
        System.out.println("2 + 3 = " + c.add(2, 3));
        
        // PMD violation
        // int number = 12;
    }

}