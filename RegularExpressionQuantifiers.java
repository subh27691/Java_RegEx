import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionQuantifiers {
    public static void main(String[] args) {
        /*a-----------------------Exactly one 'a'
a+----------------------At least one 'a'
a*----------------------Any no of a's including zero number
a? ----------------------At most one 'a' */
        Pattern p=Pattern.compile("a?");
        Matcher m=p.matcher("abaabaaab");
        while(m.find()){
            System.out.println(m.start()+"-----"+m.group());
        }
    }
    
}
