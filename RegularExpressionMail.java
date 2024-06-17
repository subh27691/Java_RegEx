import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMail
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(args[0]);
		if(m.find() && m.group().equals(args[0])) System.out.println("Valid Mail Id");
		else System.out.println("Invalid Mail Id");
	}
}
