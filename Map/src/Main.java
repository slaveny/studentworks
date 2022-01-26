import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		

		ArrayList<String> Table = new ArrayList<>();
		ArrayList<String> Green = new ArrayList<>();
		ArrayList<String> Cat = new ArrayList<>();
		ArrayList<String> Dog = new ArrayList<>();
		ArrayList<String> Window = new ArrayList<>();
		Table.add("Таблица");
		Table.add("Стол");
		Table.add("Доска");
		Table.add("Расписание");
		Green.add("Зелёный");
		Green.add("Зелень");
		Green.add("Трава");
		Cat.add("Кот");
		Dog.add("Собака");
		Window.add("Окно");
		Window.add("Витрина");		
		HashMap<String, ArrayList<String>> Work = new HashMap <>();

		// TODO Auto-generated method stub
		Work.put("Table", Table);
		Work.put("Green", Green);
		Work.put("Cat", Cat);
		Work.put("Dog", Dog);
		Work.put("Window", Window);
		try {
			int val=args.length;
			for(int ind=0;ind<val;ind++) {
				if(Pattern.matches("^[A-Za-z]+$",args[ind]))
				{if(Work.containsKey(args[ind])) {
					//System.out.println(args[ind].toString());
					System.out.println(Work.get(args[ind]).toString());}}
				else
				{
					Set set = Work.entrySet();
					Iterator i = set.iterator();
					boolean tab=false;
					while(i.hasNext()) {
				         Map.Entry me = (Map.Entry)i.next();
				         ArrayList<String> As = (ArrayList<String>) me.getValue();
				         //System.out.println(me.getKey() + " - " + me.getValue());
				         
				         for(String Sas:As) {
				        	 if(args[ind].equals(Sas))
				        	 {	 //System.out.println(args[ind]);
				        		 System.out.println(me.getKey().toString());tab=true;break;}
				         }
				         if(tab)break;
				      }
				}
			}
		} catch(ArrayIndexOutOfBoundsException E) {
			System.out.println(E.getMessage());

	};	

}
}
