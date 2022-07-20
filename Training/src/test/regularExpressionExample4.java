package test;
import java.util.regex.*;
public class regularExpressionExample4 {
   public static void main(String[] args) {
	   System.out.println(Pattern.matches("011-[0-9]{8}", "011-53038949"));
	   System.out.println(Pattern.matches("91[0-9]{4}[0-9]{3}[0-9]{3}", "91 5678 789 890"));	
}
	
	
}
