package mastermind;

import java.util.Random;

public class gamePc {

	
	public char combi[];
	public String combiRandom = "123456789";
	
	public gamePc(){
		int n=4;							// nombre de chiffre qu'il faut deviner
	    combi=genererCombi(n);
	}
	
	
	public char[] genererCombi(int n)
    {
      /*int x;
      int combi[] = new int [n];
      for (int i = 0 ; i < n ; i++)
      {
  		 x = (int)(Math.random()*6+1);
  		
        combi[i]=x;
      }*/
		
		Random r = new Random();
		int SIZE = combiRandom.length();
		char combi[] = new char [n];
		for(int i = 0; i<4; i++) {
			combi[i]= combiRandom.charAt(r.nextInt(SIZE));
			
			
		}
	
	 
     return combi;
    }
	
	
	
	public char[] getCombi(){
		return this.combi;
	}
	
	
	
 
    public static void main(String[] args)
    {  
    // ------ génération des chiffres -----
      
      
      /*for (int i = 0 ; i < combi.length ; i++)
      { 
 	    System.out.println (combi[i] );
      } */
      /*
      System.out.print ("| "+combi[0] + " | ");	//chiffre 1
      System.out.print (combi[1] + " | ");	//chiffre 2
      System.out.print (combi[2] + " | ");	//chiffre 3
      System.out.print (combi[3] + " |");	//chiffre 4
      */
    }  
}
 

	

