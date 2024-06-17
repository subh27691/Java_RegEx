import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExprssionIpAddress {
    public static void main(String[] args) {
       // String zeroto255="(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
       // String pattern=zeroto255+"\\."+zeroto255+"\\."+zeroto255+"\\."+zeroto255;
       String ipPattern = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";

        Pattern p=Pattern.compile(ipPattern);
        Matcher m=p.matcher("00.12.123.123123.123");
        if(m.find()&&m.group().equals(m)) System.out.println("Valid Ip Address");
        else System.out.println("Invalid IpAddress");
    }
    
}
