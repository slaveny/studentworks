import java.io.*;


public class Main {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
		    // У FileReader есть конструктор, принимающий адрес
		    // файла, который необходимо читать
		    fr = new FileReader(args[0]);

		    // *Тут работаем с файлом*
		    BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
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
            	if((set[i]>='А')& (set[i]<='Я')){set[i]+=32;continue;}
            	if((set[i-2]=='.')&(set[i-1]=='_'))set[i]+=32;
            	if((set[i]>='а')& (set[i]<='я')){set[i]-=32;continue;}
            	

            }          
            	if((set[set.length-1]>='А')& (set[set.length-1]<='Я')){set[set.length-1]+=32;}
            	else if ((set[set.length-1]>='а')& (set[set.length-1]<='я')){set[set.length-1]-=32;}
            
            line=new String(set);
            words=line.split("_");
            for (int i = 0; i < words.length; i++)if(words[i].contains("Т")|words[i].contains("т"))
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
		    // Указанный файл не найден или произошла ошибка доступа
		    // (например, нет прав на чтение)
		    e.printStackTrace();
		} catch (@SuppressWarnings("hiding") IOException e) {
		    // Произошла общая ошибка ввода-вывода
		    // (например, попытались прочесть больше, чем возможно)
		    e.printStackTrace();
		} finally {
		    // FileReader должен быть закрыт в любом случае
		    if (fr != null) {
		        try {
		            // Закрытие тоже может сгенерировать исключение
		            fr.close();
		        } catch (IOException e) {}
		    }
		}

	}

}
