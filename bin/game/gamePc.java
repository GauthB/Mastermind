package game;

public class gamePc {

	
	private static int combi[];
	

	static int[] genererCombi(int n)
    {
      int x;
      int combi[] = new int [n];
      for (int i = 0 ; i < n ; i++)
      {
  		 x = (int)(Math.random()*6+1);
         combi[i]=x;
      }
 
     return combi;
    }
 
    public static void main(String[] args)
    {  
    // ------ génération des chiffres -----
      int n=4;							// nombre de chiffre qu'il faut deviner
      int [] combi=genererCombi(n);
      /*for (int i = 0 ; i < combi.length ; i++)
      { 
 	    System.out.println (combi[i] );
      } */
      System.out.print ("| "+combi[0] + " | ");	//chiffre 1
      System.out.print (combi[1] + " | ");	//chiffre 2
      System.out.print (combi[2] + " | ");	//chiffre 3
      System.out.print (combi[3] + " |");	//chiffre 4
    }   
}
