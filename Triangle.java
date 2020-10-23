
package Exercise1;

public class Triangle {
    
    String type = "";
    boolean valid = false;
    int equalEdges = 0;
    int edge1 = 0;
    int edge2 = 0;
    int edge3 = 0;
    
    public Triangle(int edge1, int edge2, int edge3){  
        
        // Validation
        if ((edge1 > edge2) && (edge1 > edge3)){
            if ((edge2 + edge3) > edge1){
                valid = true;                
            }
        } 
        if ((edge2 > edge1) && (edge2 > edge3)){
            if ((edge1 + edge3) > edge2){
                valid = true;                
            }
        } 
        if ((edge3 > edge2) && (edge3 > edge1)){
            if ((edge2 + edge1) > edge3){
                valid = true;                
            }
        }
        if ((edge1 == edge2) && (edge1 == edge3)){
            valid = true;   
        }  
    
        // Comparison
        if (valid == true){  
            
            // Check Scalene
            if ((edge1 != edge2) && (edge1 != edge3) && (edge2 != edge3)){
                this.type = "Scalene";
                System.out.println("Triangle is " + this.type);
            }
            
            // Check Equilateral
            if ((edge1 == edge2) && (edge1 == edge3)){
                this.equalEdges =2;
            }
            if (this.equalEdges == 2){
                this.type = "Equilateral";
                System.out.println("Triangle is " + this.type);
            }
            
            // Check Isoceles
            if ((edge1 == edge2) || (edge2 == edge3) || (edge1 == edge3)){
                this.equalEdges++;
            }
            if (this.equalEdges == 1){
                this.type = "Isoceles";
                System.out.println("Triangle is " + this.type);
            }           
        } 
        
        // If invalid numbers entered
        if (valid == false){
            System.out.println("Not valid numbers to form a triangle...");                   
        }
    }   
}
