import java.util.regex.*;
class RegularExpressionDemo{
    public static void main(String[] args) {
        /*1. [abc]-------------------Either 'a' or 'b' or 'c'
2. [^abc] -----------------Except 'a' and 'b' and 'c'
3. [a-z] --------------------Any lower case alphabet symbol
4. [A-Z] --------------------Any upper case alphabet symbol
5. [a-zA-Z] ----------------Any alphabet symbol
6. [0-9] --------------------Any digit from 0 to 9
7. [a-zA-Z0-9] ------------Any alphanumeric character
8. [^a-zA-Z0-9] ------------Any special character */
        Pattern p=Pattern.compile("[^a-zA-Z0-9]");
        Matcher m=p.matcher("a1b7@z#");
        while(m.find()){
            System.out.println(m.start()+"-----"+m.group());
        }

    }
}