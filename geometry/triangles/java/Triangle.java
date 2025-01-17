public class Triangle {
    
    public static final double DEGREES = 180d;
    public static final RIGHT_ANGLE_DEGREES = 90d;
    
    /**
     * 
     * Find area of triangle given base and height
     * 
     * @param base
     * @param height
     * @return area of triangle
     */
    public static double area(double base, double height){
        
        return (base*height)/2;
        
    }
    
    /**
     * 
     * Given the side angle side of triangle find area
     * 
     * @param side1
     * @param side2
     * @param degrees
     * @return area of triangle
     */
    public static double area(double side1, double side2, double degrees){
        
        return (side1*side2*Math.sin(degrees))/2;
        
    }
    
    /**
     * 
     * Given 3 sides of a triangle find area using Heron's Formula
     * 
     * @param side1
     * @param side2
     * @param side3
     * @return area of triangle
     */
    public static double herons(double side1, double side2, double side3){
        
        double s = (side1+side2+side3)/2;
        
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
    }


    /**
     * 
     * Given the sides of triangle check if it's Equilateral
     * 
     * @param side1
     * @param side2
     * @param side3
     * @return true or false
     */
    public static boolean isEquilateral(double side1, double side2, double side3){
        if (side1 == side2 && side1 == side3)
            return true;
        else
            return false;    
    }
    
    /**
     * 
     * Given the sides of triangle check if it's Scalene
     * 
     * @param side1
     * @param side2
     * @param side3
     * @return true or false
     */
    public static boolean isScalene(double side1, double side2, double side3){
        if((side1 != side2 && side1 != side3) && side2 != side3)
            return true;
        else 
            return false;
    }

    /**
     * 
     * Given the sides of triangle check if it's Isosceles
     * 
     * @param side1
     * @param side2
     * @param side3
     * @return true or false
     */
    public static boolean isIsosceles(double side1, double side2, double side3){
        if(side1 == side2 || side2 ==side3 || side1 == side3)
            if(!isEquilateral(side1, side2, side3))
                return true;
        else
            return false;    
    }
}
