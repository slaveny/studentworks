package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException {
		if(args.length>=4) {
			DataInputStream fr=new DataInputStream(new FileInputStream(args[0]));
			DataOutputStream fw=new DataOutputStream(new FileOutputStream(args[1]));
			byte data;
			byte key=Byte.parseByte(args[3]);
			while (fr.available() > 0) {
			    data = fr.readByte();
			    data^=key;
			fw.write(data);
		}
			fw.close();
			fr.close();
			fr=new DataInputStream(new FileInputStream(args[1]));
			fw=new DataOutputStream(new FileOutputStream(args[2]));
			byte mbyte=fr.readByte();
			mbyte = (byte) (mbyte+17);
			fw.writeByte(mbyte);
			long mlong=fr.readLong();
			mlong=(long) (mlong*17);
			fw.writeLong(mlong);
			int mint=fr.readInt();
			mint=(int) (mint-17);
			fw.writeInt(mint);
			fw.close();
	}
		if(args.length==6) {
			DataInputStream fr=new DataInputStream(new FileInputStream(args[2]));
			DataOutputStream fw=new DataOutputStream(new FileOutputStream(args[4]));
			while (fr.available() > 0) {
			byte data=(byte) (fr.readByte()^Byte.parseByte(args[5]));
			fw.write(data);
			}
			fw.close();
		}
	}

}
