import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpressionDemo1{
    /*Write a regular expression to represent all valid identifiers in yava language.
Rules:
The allowed characters are:
1. a to z, A to Z, 0 to 9, -,#
2. The 1st character should be alphabet symbol only.
3. The length of the identifier should be at least 2. */
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
        Matcher m=p.matcher(args[0]);
        if(m.find()&&m.group().equals(args[0])){
            System.out.println("Valid identifier");
        }
        else System.out.println("Invalid identifier");

        
    }
}