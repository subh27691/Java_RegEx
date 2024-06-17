import java.util.regex.Pattern;

public class RegularExpressionSplitdemo1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\.");
        String [] str=p.split("www.dugrajobs.com");//ashok software solutions");
        for(String s1:str){                              //"\\s"
            System.out.println(s1);
        }
    }
    
}
