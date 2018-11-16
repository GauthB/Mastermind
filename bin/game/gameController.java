package game;

public class gameController extends gamePc  {
	
	//-------------------------------------
		//Correction de la CombiIn
	//-------------------------------------
	
	
	private static int combiIn[]= {3,4,3,5};	// la combi que l'utilisateur encode
	
	private static int combi[]= {1,6,3,5};		// la combi que le pc va générer (gamePC)
					//--> il faut encore faire l'héritage entre les tables
	
	
	private static char correct = 'V';			// si le chiffre est au bon endroit
	private static char miCorrect = '/';		// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';		// si le chiffre n'existe pas dans la combi
	private static char result;					
	
	
	public gameController(){
		
	}
	
	
		public static void main(String[] args){  
		  
		      // ----- affichage de la correction -----
		      char result1 = correction1();
		      System.out.print("| "+result1+" | ");
		      char result2 = correction2();
		      System.out.print(result2+" | ");
		      char result3 = correction3();
		      System.out.print(result3+" | ");
		      char result4 = correction4();
		      System.out.print(result4+" |");
		      
		     
	    }
	    
			// correction du CombiIn 1
		   public static char correction1() {
		    											         
		         if (combiIn[0] == combi[0]) {				// premier chiffre
		             result = correct;
		         } else if (combiIn[0] == (combi[1])) {		// deuxieme chiffre
		             result = miCorrect; 
		         } else if (combiIn[0] == (combi[2])) {		// troisieme chiffre
		             result = miCorrect;
		         } else if (combiIn[0] == (combi[3])) {		// quatrieme chiffre
		             result = miCorrect;
		         } else {
		             result = noCorrect;
		         }	         
		         return result;  
		    }
		   
		   		// correction du CombiIn 2
			    public static char correction2() {
													
			         if (combiIn[1] == combi[1]) {				// premier chiffre
			             result = correct;
			         } else if (combiIn[1] == (combi[0])) {		// deuxieme chiffre
			             result = miCorrect;
			         } else if (combiIn[1] == (combi[2])) {		// troisieme chiffre
			             result = miCorrect;
			         } else if (combiIn[1] == (combi[3])) {		// quatrieme chiffre
			             result = miCorrect;
			         } else {
			             result = noCorrect;
			         }
			         return result;	         
			    }
			    
			    	// correction du CombiIn 3
				    public static char correction3() {
				    				
				         if (combiIn[2] == combi[2]) {				// premier chiffre
				             result = correct;
				         } else if (combiIn[2] == (combi[0])) {		// deuxieme chiffre
				             result = miCorrect;
				         } else if (combiIn[2] == (combi[1])) {		// troisieme chiffre
				             result = miCorrect;
				         } else if (combiIn[2] == (combi[3])) {		// quatrieme chiffre
				             result = miCorrect;
				         } else {
				             result = noCorrect;
				         }
				         return result;	         
				    }
				    
				    	// correction du CombiIn 4
					    public static char correction4() {
					    				
					         if (combiIn[3] == combi[3]) {				// premier chiffre
					             result = correct;
					         } else if (combiIn[3] == (combi[0])) {		// deuxieme chiffre
					             result = miCorrect;
					         } else if (combiIn[3] == (combi[1])) {		// troisieme chiffre
					             result = miCorrect;
					         } else if (combiIn[3] == (combi[2])) {		// quatrieme chiffre
					             result = miCorrect;
					         } else {
					             result = noCorrect;
					         }
					         return result;	         
					    }
					    
	    
}
