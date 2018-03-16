package validation;
import java.util.*;


public class Validation extends SA_domain {

    public String domain;
    
    
    public void setdomain(String domain){
        this.domain= domain;
    }
    
     public String getDomain(){
        return domain;
    }
    
    public static void main(String[] args) {
       
        SA_domain sadomain = new SA_domain();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter SA domain");
        //int number = input.nextInt();
        System.out.println(sadomain.validate(input.next()));
        
        
      
        
                
    }
    
    
}
