import java.util.*;
class HangManOut 
{
	public static void main(String[] args) 
	{
		int i,lives=6;
		boolean gameover=false;
		Scanner sc=new Scanner(System.in);
		String words[]={"do","if","int","for","try","else","case","char","void","long","while","catch","float","break","public","switch","final","default","continue"};
		StringBuffer sb= new StringBuffer();
		Random r=new Random();
		int x=r.nextInt(words.length); //x is an index 
		String CW=words[x]; //step 1
		
		
		//step 2
		for(i=0;i<CW.length();i++)
			sb.append("-");
		
		for(i=0;i<CW.length();i++)
			System.out.print(sb.charAt(i)+"  ");
		//step 3
		System.out.println();
		
		while(!gameover)
		   {
			display(lives);
			boolean found=false;
			System.out.print("Guess your letter : ");
			char GL=sc.next().charAt(0);
			//step 4
			for(i=0;i<CW.length();i++)
			   {
				if(CW.charAt(i)==GL)
				   {
					sb.setCharAt(i,GL);
					
					found=true;
				   }
					   }
for(i=0;i<CW.length();i++)
					System.out.print(sb.charAt(i)+"  ");

			   if(found==false)
			   {
				   lives--;
				   if(lives==0)
				   {
					   System.out.println("Sorry you lost the game");
					   gameover=true;
					   display(lives);
				   }
				   
			   }
				   //win case
				   if(sb.toString().indexOf('-')==-1)
			       {
					System.out.println("Congrats you won the game");
					   gameover=true;
					   
			       }
			   
		   }//while
	}
	static void display(int lives)
	{
		String[] hangman = {
    // 0 mistakes
    """
     +---+
         |
         |
         |
        ===
    """,

    // 1 mistake
    """
     +---+
     O   |
         |
         |
        ===
    """,

    // 2 mistakes
    """
     +---+
     O   |
     |   |
         |
        ===
    """,

    // 3 mistakes
    """
     +---+
     O   |
    /|   |
         |
        ===
    """,

    // 4 mistakes
    """
     +---+
     O   |
    /|\\  |
         |
        ===
    """,

    // 5 mistakes
    """
     +---+
     O   |
    /|\\  |
    /    |
        ===
    """,

    // 6 mistakes – OUT
    """
     +---+
     O   |
    /|\\  |
    / \\  |
        ===
    """
};
 
		System.out.println(hangman[6-lives]);
	}
}
