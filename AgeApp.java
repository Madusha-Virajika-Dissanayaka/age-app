
public class AgeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 40; 
//02		
		if (age > 0 && age < 18) 
		   { 
		System.out.println("You are underage."); 
		   } 
		
		else 
		   { 
		System.out.println("You are an adult."); 
		   } 
		
		System.out.println("Press space to exit."); 
		
		
////03		
		if (age > 0 && age < 18) 
		   { 
		System.out.println("You are underage."); 
		   } 
		
		else if(age>=65) 
		   { 
		System.out.println("You are retired."); 
		   } 
		
		else
		System.out.println("You are an adult."); 
		
////04		
		if (age > 0 && age < 18) 
		   { 
		System.out.println("You are underage."); 
		   if(age>=15)
		     {
			   System.out.println("You can drive a moped.");
		     }
	       }
		else if(age>=65) 
		   { 
		System.out.println("You are retired."); 
		   } 
		
		else
		System.out.println("You are an adult."); 
		
//05		
	
//a		
		
		
		if (age==18) 
		   { 
		System.out.println("You can drive a car."); 
		   } 
		
//b		
		 if (age == 10 || age == 20 || age == 30 || age == 40 || age == 50 || age == 60 || age == 70 || age == 80 || age == 90 || age == 100 || age == 110 || age == 120) 
		   {     
			   System.out.println("Anniversary Party!!");
		   }
		 
//c			 
		 if (age==100) 
		   { 
		System.out.println("Congratulation!"); 
		System.out.println("Congratulation!"); 
		System.out.println("Congratulation!"); 
		   } 
		 
//d		 
		 if(age>=40 && age<50)
		   { 
		System.out.println("wish happy mid-life.");	 
		   }
}
}