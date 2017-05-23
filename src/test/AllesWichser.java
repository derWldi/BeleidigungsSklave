package test;

import java.util.Scanner;

public class AllesWichser {
private static String sex;
private static Scanner scan;

public static void main(String[] args){
	int r;
	int r1 = 0;
	sex = null;
	String name;
	scan = new Scanner(System.in);
	
	while(true){
		
		r = (int) (Math.random()*5);
		
	System.out.println("Hallo, ich bin ihr Beleidigunssklave.");
	System.out.print("Geben sie einen Namen ein.");
	name = scan.nextLine();
	System.out.println("Bitte geben sie an Welches Geschlecht die zu beleidigende Persohn hat.(M/W)");
	sex =scan.nextLine();
	
while(r==r1){
	r = (int) (Math.random()*5);
}
	
	
	if (r ==0){
		if ( sex.equals("M")){
		System.out.println(name+" ist ein Mädchen.");
		}
		else{
			System.out.println(name+" ist ein Mann.");
		}
	}
	
	

	
	if (r ==1){
		System.out.println(name+" ist dumm.");
	}
	
	if(r == 2){
		System.out.println(name+" ist ein Hurensohn");
	}

	if(r == 3){
		System.out.println(name+" ist ein Wichser.");
	}
	
	if(r == 4){
		if( sex.equals("M")){
		System.out.println(name+" ist schwul");
		} else {
			System.out.println(name+ "ist Fett.");
		}
	}
	if(r ==5){
		System.out.println(name+" stinckt");
	}
	
	if( name.equals("Jerry")){
		System.out.println(name+" ist der schlimmste Mensch auf der Welt.");
	}
	 r1 = r;
   }

}
}
