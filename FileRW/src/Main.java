import java.io.*;


public class Main {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
		    // � FileReader ���� �����������, ����������� �����
		    // �����, ������� ���������� ������
		    fr = new FileReader(args[0]);

		    // *��� �������� � ������*
		    BufferedReader reader = new BufferedReader(fr);
            // ������� ������� ������ ������
            String line = reader.readLine();
            fr.close();
            StringBuilder builder = new StringBuilder();
            String words[]=line.split("_");
            if(words.length>2)for (int i = 0; i < words.length-1; i++)builder.append(words[i]).append('_');
            builder.append(words[words.length-1]);
            builder.reverse();
            line=builder.toString();
            char[] set=line.toCharArray();
        	for(int i=5;i<set.length;i++)if((set[i-1]=='.')&(set[i-2]=='_'))set[i-3]+=32;
            for(int i=5;i<set.length;i+=2) {
            	if((set[i]>='�')& (set[i]<='�')){set[i]+=32;continue;}
            	if((set[i-2]=='.')&(set[i-1]=='_'))set[i]+=32;
            	if((set[i]>='�')& (set[i]<='�')){set[i]-=32;continue;}
            	

            }          
            	if((set[set.length-1]>='�')& (set[set.length-1]<='�')){set[set.length-1]+=32;}
            	else if ((set[set.length-1]>='�')& (set[set.length-1]<='�')){set[set.length-1]-=32;}
            
            line=new String(set);
            words=line.split("_");
            for (int i = 0; i < words.length; i++)if(words[i].contains("�")|words[i].contains("�"))
            	words[i]+=words[i];
            fw = new FileWriter(args[1]);
            builder.delete(0, builder.length());
            if(words.length>2)for (int i = 0; i < words.length-1; i++)builder.append(words[i]).append('_');
            builder.append(words[words.length-1]);
            fw.write(builder.toString());
            fw.flush();
            fw.close();
            //System.out.println(builder.toString());
		} catch (FileNotFoundException e) {
		    // ��������� ���� �� ������ ��� ��������� ������ �������
		    // (��������, ��� ���� �� ������)
		    e.printStackTrace();
		} catch (@SuppressWarnings("hiding") IOException e) {
		    // ��������� ����� ������ �����-������
		    // (��������, ���������� �������� ������, ��� ��������)
		    e.printStackTrace();
		} finally {
		    // FileReader ������ ���� ������ � ����� ������
		    if (fr != null) {
		        try {
		            // �������� ���� ����� ������������� ����������
		            fr.close();
		        } catch (IOException e) {}
		    }
		}

	}

}
