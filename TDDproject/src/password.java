import java.util.regex.Pattern;

import java.util.regex.Matcher;


public class password {
	Pattern pattern;
	Matcher matcher;
	String validateBy="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*&%$#@!])[A-Za-z0-9*&%$#@]*$";
	public boolean passwordValidation(String password){
		pattern=Pattern.compile(validateBy);
		matcher=pattern.matcher(password);
		if(matcher.matches() && (password.length()>8))
			return true;
		else
			return false;
	}
	

}
