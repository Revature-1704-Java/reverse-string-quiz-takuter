package quiz;

public class ReverseString {
    public String reverse(String input) {
    	StringBuffer reversal = new StringBuffer();
    	for(int i= input.length() - 1; i>=0 ; i--)
    		reversal.append(input.charAt(i));
    	
    	return reversal.toString();
        //return new StringBuffer(input).reverse().toString();
    }
}