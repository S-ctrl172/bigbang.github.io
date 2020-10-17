class Area
{ 
    double width, height, depth; 
  
    // constructor used when all dimensions 
    // specified 
    Area(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
  
    // constructor used when no dimensions 
    // specified 
    Area() 
    { 
        width = height = depth = 0;
} 
  
    // constructor used when cube is created 
    Area(double len) 
    { 
        width = height = depth = len; 
    } 
  
    // compute and return volume 
    double volume() 
    { 
        return width * height * depth; 
    } 
} 
  
// Driver code 
public class Test 
{ 
    public static void main(String args[]) 
    { 
        // create boxes using the various 
        // constructors 
        Area mybox1 = new Area(10, 20, 15); 
        Area mybox2 = new Area(); 
        Area mycube = new Area(7); 
  
        double vol; 
// get volume of first box 
        vol = mybox1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        // get volume of second box 
        vol = mybox2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
  
        // get volume of cube 
        vol = mycube.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 