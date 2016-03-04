
public class concatArray {
	String concatString="";
	public String concatingArray(String[] givenArray){
		String concatString="";
		for(int length=0;length<givenArray.length;length++){
			concatString+=givenArray[length];
		}
		return concatString;
	}

}
