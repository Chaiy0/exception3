
package exception3;

public class LAB4 {
   public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
            
        } catch (ArithmeticException ex1) {    
        } catch (IndexOutOfBoundsException ex2) {  
            throw ex2;
        } 
        finally{
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    } 
}
