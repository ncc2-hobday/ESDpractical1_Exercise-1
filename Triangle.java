
package Exercise1;

public class Triangle {
    
    String type = "";
    int equalEdges = 0;
    int edge1 = 0;
    int edge2 = 0;
    int edge3 = 0;
    
    public Triangle(int edge1, int edge2, int edge3){        
        this.edge1 = edge1; 
        this.edge2 = edge2; 
        this.edge3 = edge3;         
    }
    
    // Comparison
    void checkScalene (int edge1,int edge2,int edge3)
    {
        if ((edge1 != edge2) && (edge1 != edge3) && (edge2 != edge3)){
            if (this.equalEdges == 0){
                this.type = "Scalene";
                System.out.printf("Triangle is " + this.type);
            }
        }        
    }
    
    void checkIsoceles (int edge1,int edge2,int edge3)
    {
         if (edge1 == edge2){
             this.equalEdges++;
         }
         if (edge2 == edge3){
             this.equalEdges++;
         }
         if (edge1 == edge3){
             this.equalEdges++;
         }
         if (this.equalEdges == 1){
                this.type = "Isoceles";
                System.out.printf("Triangle is " + this.type);
         }
    }
    
    void checkEquilateral (int edge1,int edge2,int edge3)
    {
        
        if ((edge1 == edge2) && (edge1 == edge3)){
            this.equalEdges =2;
        }
        if (this.equalEdges == 2){
                this.type = "Equilateral";
                System.out.printf("Triangle is " + this.type);
        }
    }
    
}
