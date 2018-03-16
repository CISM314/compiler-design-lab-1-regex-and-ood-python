package validation;
import java.util.regex.*;

public class SA_domain {
 
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String SAdomain_REGEX = "^[a-zA-Z0-9_.+-]+\\.[a-z]+\\.[a-z]+$";
    
    public SA_domain(){
    pattern = Pattern.compile(SAdomain_REGEX);    
    }
    
    public boolean validate(String SADomain){
        matcher = pattern.matcher(SADomain);
        return matcher.matches();
    }
}
