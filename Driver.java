
package Exercise1;

import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    System.out.printf("Enter the length of the 1st edge of the triangle:");    
    int edge1 = input.nextInt();

    System.out.printf("Enter the length of the 2nd edge of the triangle:");    
    int edge2 = input.nextInt();

    System.out.printf("Enter the length of the 3rd edge of the triangle:");    
    int edge3 = input.nextInt();

    Triangle t1 = new Triangle(edge1,edge2,edge3);
    
    t1.checkEquilateral(edge1, edge2, edge3);
    t1.checkScalene(edge1, edge2, edge3);
    t1.checkIsoceles(edge1, edge2, edge3);
    }       
        
}
