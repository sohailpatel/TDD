import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class emailValidation {
	public static String validateBy="[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}+\\.*[a-z]*{2}$";
	Pattern pattern;
	Matcher matcher;
	public boolean validateEmailAddress(String emailAddress)
	{
		pattern=Pattern.compile(validateBy);
		matcher=pattern.matcher(emailAddress.toUpperCase());
		return matcher.matches();
	}

}
