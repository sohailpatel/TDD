import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class userName {
	Pattern pattern;
	Matcher matcher;
	String validateBy="[A-Z\\.,-_]+";
	public boolean validateUsername(String username){
		pattern=Pattern.compile(validateBy);
		matcher=pattern.matcher(username.toUpperCase());
		if((username.length()>4) &&  matcher.matches()){
			return true;
		}
		else
			return false;
	}

}
