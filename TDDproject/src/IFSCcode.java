import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IFSCcode {
	Pattern pattern;
	Matcher matcher;
	String validateBy="^[^\\s]{4}\\d{7}$";
	public boolean validatingIFSC(String code){
		pattern=Pattern.compile(validateBy);
		matcher=pattern.matcher(code);
		if(matcher.matches())
			return true;
		else
			return false;
	}

}
