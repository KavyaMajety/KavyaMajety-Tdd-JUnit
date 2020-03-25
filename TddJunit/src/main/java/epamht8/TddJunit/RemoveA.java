package epamht8.TddJunit;

public class RemoveA {
	
	public String removeA(String str) {
		String newStr = "";
		if(str.length()<=2) {
			if(str.length()<=1) {
				if(str.charAt(0)=='A' || str.charAt(0)==' ') {
					newStr=" ";
				}
				else {
					newStr=str;
				}
			}
			else {
				if(str.charAt(0)=='A' && str.charAt(1)=='A') {
					newStr=" ";
				} else if(str.charAt(0)=='A')	{
					newStr=str.substring(1);
				} else if(str.charAt(1)=='A') {
					newStr=str.substring(0,1);
				} else{
					newStr=str;
				}
			}
		} else {
			if(str.charAt(0)=='A' && str.charAt(1)=='A') {
				newStr=str.substring(2);
		      }
		      else if(str.charAt(0)=='A') {
			    newStr=str.substring(1);
		      }
		      else if(str.charAt(1)=='A') {
			    newStr=str.charAt(0)+str.substring(2);
		      }
		      else {
			    newStr=str;
		      }
	    }
		return newStr;	
		
	}
}

