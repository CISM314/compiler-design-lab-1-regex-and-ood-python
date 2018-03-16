package validation;
import java.util.regex.*;

public class SA_number {
 
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String SAnumber_REGEX = "^\\+(27|0)[0-9]{9}";
    
    public SA_number(){
    pattern = Pattern.compile(SAnumber_REGEX);    
    }
    
    public boolean validate(String SANumber){
        matcher = pattern.matcher(SANumber);
        return matcher.matches();
    }
}
