import java.util.StringTokenizer;

public class RegularExpressionStringToken {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("he isn't and doesn't","'");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    
}
