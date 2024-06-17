import java.util.regex.*;
public class RegularExpressionCharClass {
    public static void main(String[] args) {
 /* \s---------------------space character
\d---------------------Any digit from o to 9[o-9]
\w---------------------Any word character[a-zA-Z0-9]
. ---------------------Any character including special characters.
\S---------------------any character except space character
\D---------------------any character except digit
\W---------------------any character except word character(special character)
*/
        Pattern p=Pattern.compile("\\W");
        Matcher m=p.matcher("a1b7 @z#");
        while(m.find()){
            System.out.println(m.start()+"----"+m.group());
        }
    }
    
}
