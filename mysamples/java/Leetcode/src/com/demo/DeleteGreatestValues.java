package com.demo;
//Program Statement:https://leetcode.com/problems/delete-greatest-value-in-each-row/

import java.util.Arrays;

public class DeleteGreatestValues { 
	
    public int deleteGreatestValue(int[][] grid) {
        
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        
        int ans = 0;
        
       
        
        return ans;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
        DeleteGreatestValues solution = new DeleteGreatestValues();
        System.out.println(solution.deleteGreatestValue(grid1)); 

        // Example 2
        int[][] grid2 = {{10}};
        System.out.println(solution.deleteGreatestValue(grid2)); 
    }
}
