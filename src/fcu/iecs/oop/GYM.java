package fcu.iecs.oop;
import java.util.Random;
public class GYM {
	public static void fight(Pokemon p1, Pokemon p2){
		Random a=new Random();
		if(a.nextInt(2)==0){
			p1.setCp(+500);
			
			System.out.println("\"Winner is ["+p1.getName()+"]\"");
		}
		else{
			
			System.out.println("\"Winner is ["+p2.getName()+"]\"");
		}
	}


  
}
