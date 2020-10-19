
package Exercise1;

import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        
    int edge1 = 0;
    int edge2 = 0;
    int edge3 = 0;
    int equalEdges = 0;
        
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the length of the 1st edge of the triangle:");
    edge1 = input.nextInt();
    
    System.out.printf("Enter the length of the 2nd edge of the triangle:");
    edge2 = input.nextInt();
    
    System.out.printf("Enter the length of the 3rd edge of the triangle:");
    edge3 = input.nextInt();
    
    if (edge1 == edge2){
        equalEdges++;
    }
    if (edge1 == edge3){
        equalEdges++;
    }
    if (edge2 == edge3){
        equalEdges++;
    }
    
    if (equalEdges == 3){
        System.out.println("Triangle is equilateral.");
    }
    
    if (equalEdges == 1){
        System.out.println("Triangle is isoceles.");
    }
    
    if (equalEdges == 0){
        System.out.println("Triangle is scalene.");
    }
    
        
    }
    
}
