package obfus;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Haven Ho=new Haven();
	static double Cat,Dog,Parrot,Fish,Ferret,Pig,Hamster,Bomb;char Relations;
	
	static int[] NumerOfMeals= {1,2,3};
	static int WalkTimesInDay[]= {0,1,2};
	static String FoodType[]= {"Мясо","Рыба","Зерно","Мотыль","Фрукты","Каша","Овощи"};
	static Map<Integer, String> idPets,Meals;
	static Map<Integer, Integer> Walks,Feed;
	
	static Map<Integer, String> AnimalCMP;
	Scanner scanner = new Scanner(System.in);
	
	boolean BANG(double Psss) {
		Calendar cal = Calendar.getInstance();
		int Pu=(int) Psss;
		int Lu=(int) ((Psss-Pu)*100);
		return (Pu==cal.get(Calendar.DAY_OF_MONTH))&&(Lu==cal.get(Calendar.MONTH)+1);		
	}
	
	double New(double Animals) throws IOException {
		Animals=-1;
		while(Animals==-1) {
		try {Animals=scanner.nextDouble();} catch(InputMismatchException NotDead) {
		String S=Ho.Speach("10000100000 10000110000 10000110111 10000110100 10000110101 10000111011 10000111000 10001000010 10000110101 10000111011 10001001100 100000 10000110100 10001000000 10000111110 10000110001 10000111101 10000111110 10000111001 100000 10001000111 10000110000 10001000001 10001000010 10000111000 100000 10000111100 10000111110 10000110110 10000110101 10001000010 100000 10000110001 10001001011 10001000010 10001001100 100000 10001000010 10000111110 10000111011 10001001100 10000111010 10000111110 100000 10000110111 10000110000 10000111111 10001001111 10001000010 10000111110 10000111001 100001");
		System.out.println(S);
		scanner.nextLine();
		}
	}
		return Animals;
	}
	void inLove() throws IOException{
		String S=Ho.Speach("10000010010 10000110010 10000110101 10000110100 10000111000 10001000010 10000110101 100000 10000010000 111010 100000");
		System.out.print(S);
		Cat=New(Cat);
		S=Ho.Speach("10000011110 10000111111 10000110101 10001000000 10000110000 10001000110 10000111000 10001001111 1011011 101011 101111 101101 101111 101010 101111 111010 1011101 100000");
		System.out.print(S);
		Relations=scanner.next(".").charAt(0);
		S=Ho.Speach("10000010010 10000110010 10000110101 10000110100 10000111000 10001000010 10000110101 100000 1000010 111010 100000 ");
		System.out.print(S);
		Dog=New(Dog);
	}
double Accept(){
	return Cat+Dog;
}
double Decline() {
	return Cat-Dog;
}
double Understand() {
	return Cat*Dog;
}
double Aggression() {
		return Cat/Dog;
}

void Verify() throws UnsupportedEncodingException{
	String S=Ho.Speach("10000100000 10000110101 10000110111 10001000011 10000111011 10001001100 10001000010 10000110000 10001000010 111010 100000 100101 1100110");
	if (Dog!=0)
	{Bomb=Aggression();System.out.printf(S, Bomb);}
else 
    System.out.println(Ho.Speach("10000011110 10001001000 10000111000 10000110001 10000111010 10000110000 100000 101101 100000 10000110100 10000110101 10000111011 10000110101 10000111101 10000111000 10000110101 100000 10000111101 10000110000 100000 10000111101 10000111110 10000111011 10001001100 100001"));
}

void Reaction() throws IOException{
	String S=Ho.Speach("10000100000 10000110101 10000110111 10001000011 10000111011 10001001100 10001000010 10000110000 10001000010 111010 100000 100101 1100110");
	boolean[] Version = new boolean[]{false,false,false,false};
	String Demo=Ho.Speach("100001 1101000 100011 100101 100110 100111 101000 101001 101010 101011 101100 101101 101111 111010");
		Version[0]=Relations==Demo.charAt(9);
		Version[1]=Relations==Demo.charAt(11);
		Version[2]=Relations==Demo.charAt(8);
		Version[3]=Relations==Demo.charAt(13);
		if(Version[0])System.out.printf(S,Bomb=Accept());
		else if(Version[1])System.out.printf(S,Bomb=Decline());
		else if(Version[2])System.out.printf(S,Bomb=Understand());
		else if(Version[3])Verify();
		else System.out.println(Ho.Speach("10000011101 10000110101 10000111010 10000111110 10001000000 10001000000 10000110101 10000111010 10001000010 10000111101 10001001011 10000111001 100000 10000110111 10000111101 10000110000 10000111010 100000 10000111110 10000111111 10000110101 10001000000 10000110000 10001000110 10000111000 10000111000"));
}
	public static void main(String[] args) throws Exception {

Main Instinct=new Main();
Instinct.inLove();
Instinct.Reaction();
if(Instinct.BANG(Instinct.Bomb)) {System.out.println(Ho.Speach("1010 10000011111 10000111110 10000110111 10000110100 10001000000 10000110000 10000110010 10000111011 10001001111 10001001110 101100 100000 10000110010 10001001011 100000 10000111101 10000110000 10001001000 10000111011 10000111000 100000 10001000001 10000110101 10000111010 10001000000 10000110101 10001000010 10000111010 10001000011 100001 1010"));
Scanner in = new Scanner(System.in);
System.out.println(Ho.Speach("10000100001 10000111010 10000111110 10000111011 10001001100 10000111010 10000111110 100000 10000110110 10000111000 10000110010 10000111110 10001000010 10000111101 10001001011 10001000101 100000 10001000101 10000111110 10001000010 10000111000 10001000010 10000110101 100000 10000110100 10000111110 10000110001 10000110000 10000110010 10000111000 10001000010 10001001100 111111"));
int k=in.nextInt();String[][] Add=new String[3][k];int[][] Num=new int[2][k];
Cat=0;Dog=0;Parrot=0;Fish=0;Ferret=0;Pig=0;Hamster=0;
for(int n=0;n<k;) {
System.out.println(Ho.Speach("10000011010 10000110000 10000111010 10000111110 10000110101 100000 10000110110 10000111000 10000110010 10000111110 10001000010 10000111101 10000111110 10000110101 100000 10001000101 10000111110 10001000010 10000111000 10001000010 10000110101 100000 10000110100 10000111110 10000110001 10000110000 10000110010 10000111000 10001000010 10001001100 111111"));
System.out.println(Ho.Speach("1000011 1100001 1110100 101100 1000100 1101111 1100111 101100 1010000 1100001 1110010 1110010 1101111 1110100 101100 1000110 1101001 1110011 1101000 101100 1000110 1100101 1110010 1110010 1100101 1110100 101100 1010000 1101001 1100111 101100 1001000 1100001 1101101 1110011 1110100 1100101 1110010"));
String Type = in.next();
idPets=new HashMap<Integer, String>();
Meals=new HashMap<Integer, String>();
Walks=new HashMap<Integer, Integer>();
Feed=new HashMap<Integer, Integer>();
AnimalCMP=new HashMap<Integer, String>();
if(Type.equals("Cat")) {
Cat+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[0]+" и "+FoodType[1];
Num[0][n]=WalkTimesInDay[0];
Num[1][n]=NumerOfMeals[1];
Add[2][n]= "++-----";
n++;
continue;
}
if(Type.equals("Dog")) {
Dog+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[0]+" и "+FoodType[6];
Num[0][n]=WalkTimesInDay[2];
Num[1][n]=NumerOfMeals[1];
Add[2][n]="-+++++-";
n++;
continue;
}
if(Type.equals("Parrot")) {
Parrot+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[2]+" и "+FoodType[4];
Num[0][n]=WalkTimesInDay[0];
Num[1][n]=NumerOfMeals[0];
Add[2][n]="-+++-+-";
n++;
continue;
}
if(Type.equals("Fish")) {
Fish+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[3];
Num[0][n]=WalkTimesInDay[0];
Num[1][n]=NumerOfMeals[0];
Add[2][n]="--+-+++";
n++;
continue;
}
if(Type.equals("Ferret")) {
Ferret+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[3]+" и "+FoodType[4];
Num[0][n]=WalkTimesInDay[1];
Num[1][n]=NumerOfMeals[2];
Add[2][n]="++--++-";
n++;
continue;
}
if(Type.equals("Pig")) {
Pig+=1;
Add[0][n]=Type;
Add[1][n]= FoodType[0]+", "+FoodType[1]+", "+FoodType[2]+", "+FoodType[4]+", "+FoodType[5]+", "+FoodType[6];
Num[0][n]=WalkTimesInDay[1];
Num[1][n]=NumerOfMeals[2];
Add[2][n]="+++++++";
n++;
continue;
}
if(Type.equals("Hamster")) {
Hamster+=1;
Add[0][n]=Type;
Add[1][n]=FoodType[2]+" и "+FoodType[4];
Num[0][n]=WalkTimesInDay[0];
Num[1][n]=NumerOfMeals[2];
Add[2][n]="-+-++++";
n++;
continue;
}
System.out.println(Ho.Speach("10000011110 10001001000 10000111000 10000110001 10000111010 10000110000 100000 101101 100000 10000111111 10000111110 10000111111 10001000000 10000111110 10000110001 10001000011 10000111001 10001000010 10000110101 100000 10001000001 10000111101 10000111110 10000110010 10000110000 100001"));
}
for (int i=0; i<k; i++) {
    idPets.put(i, Add[0][i]);
    Meals.put(i, Add[1][i]);
    Walks.put(i, Num[0][i]);
    Feed.put(i, Num[1][i]);
    AnimalCMP.put(i, Add[2][i]);
    }
System.out.printf(Ho.Speach("10000010010 10000110000 10001001000 10000111000 100000 10000110110 10000111000 10000110010 10000111110 10001000010 10000111101 10001001011 10000110101 111010 100000 100101 1110011"),idPets.values());
}
}
	
}
