package lab;
public class konstanta {
public static final double CM_PER_INCH = 2.54;

public static void main(String[] asdf){
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("ukuran kertas dalam sentimeter =" + paperWidth * CM_PER_INCH + "cm" + "x"+ paperHeight *CM_PER_INCH + " cm");
    convertToCM(3.2);
}    
   
    static void convertToCM(double inputInch){
         System.out.println(inputInch+" cm"+"'' "+inputInch*CM_PER_INCH+"cm");
            
           

        }
}

