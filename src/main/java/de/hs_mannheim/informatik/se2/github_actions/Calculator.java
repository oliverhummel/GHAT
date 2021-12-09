package de.hs_mannheim.informatik.se2.github_actions;

public class Calculator {
    public int add(int... numbers) {
        int sum = 0;
        
        for (int n : numbers)
            sum += n;
        
        return sum;
    }
    
    public int mult(int... numbers) {
        int prod = 1;
        
        for (int n : numbers)
            prod *= n;
        
        return prod;
    }
}
