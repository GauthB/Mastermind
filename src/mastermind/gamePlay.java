package mastermind;

public class gamePlay {

	
	
	//condition si l'utilisateur encode un mauvais numero	private static int combiIn[]= {0,0,0,0};	// la combi que l'utilisateur encode
	private static int combiIn= 8 ;
	
	public static void main(String[] args){  
	  
	      // ----- affichage de la correction -----
	      String error = ifError();
	      System.out.println(error);
    }
    
 
	   public static String ifError() {
		   
	    	// correction
	         String error = "/!\\  Vous devez encoder un nombre entre 1 et 6 compris";
	         if (combiIn < 1) {					
	             return error;
	         } else if (combiIn > 6){
	             return error ;
	         }	         
	         
	    }
}
