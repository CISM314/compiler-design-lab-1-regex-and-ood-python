package validation;
import java.util.*;


public class Validation extends SA_number {

    public int number;
  
    
    public void setNumber(int number){
        this.number=number;
    }
   
     public int getNumber(){
        return number;
    }
    
    public static void main(String[] args) {
       
        SA_number sanumber = new SA_number();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter SA number");
        //int number = input.nextInt();
        System.out.println(sanumber.validate(input.next()));
        
        
      
        
                
    }
    
    
}
