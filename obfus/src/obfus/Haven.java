package obfus;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.*;

public class Haven {
	
	   String Speach(String d) throws UnsupportedEncodingException {
			if(d.length()!=0) {
				String words[];
			    words = d.split(" ");
//System.out.println(words.length);
String Str="";
		for(int i=0;i<words.length;i++) {
			try {
				//b[i]="0b"+words[i];
		        //b = (int)Integer.valueOf(words[i]);
				int b=Integer.parseInt(words[i],2);
				Str+=(char)b;
		    } catch (NumberFormatException e) {
		        System.err.println("Неправильный формат строки!");
		        break;
		    }

		}
		//System.out.println(Str);
		return Str;
			}
			return d;
		}
	  void Coding(String str) throws UnsupportedEncodingException {
String S="";
		    new StringBuilder();
		    for (char c : str.toCharArray()) {
		    	// s=c;
		    	int b=(int)c;
		    	S+=Integer.toBinaryString(b);
		    	S+=' ';
		    }
	    	System.out.println(S);
	  }

///////////////////////////

}
