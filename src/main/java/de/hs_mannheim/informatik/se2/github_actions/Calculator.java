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
    
    public int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        
        for (int n : numbers)
            if (n > max)
                max = n;
        
        return max;
    }
}
