
import java.util.Random;
import java.util.Scanner;
class NumberSlider
{
    static int board[][]=new int[4][4];
    static int x,y;
    public static void main(String[] args) throws InterruptedException
    {
        int i,j,num,count=0,swap_temp;
        char ch;
        int temp[]=new int[16];
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        while(count<16)
        {
            num=r.nextInt(16);
            for(j=0;j<count;j++)
                {
                     if(temp[j]==num)
                        break;
                }
            if(j==count)
                temp[count++]=num;
        }
        int k=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                board[i][j]=temp[k++];
            }
        }
        stop_game:while (true) 
        { 
        clear();
        displayBoard();
        System.out.print("\n\n YOUR OPTION ?");
        ch=sc.next().charAt(0);
        findPosition();
        switch(ch)
        {
            case 'w':if(x==0){
                     System.out.println("Invalid Move");
                     Thread.sleep(2000);}
                     else
                     {
                        swap_temp=board[x][y];
                        board[x][y]=board[x-1][y];
                        board[x-1][y]=swap_temp;
                     }
                     break;
            case 'a':if(y==0){
                     System.out.println("Invalid Move");
                     Thread.sleep(2000);}
                     else
                     {
                        swap_temp=board[x][y];
                        board[x][y]=board[x][y-1];
                        board[x][y-1]=swap_temp;
                     }
                     break;
            case 's':if(x==3){
                     System.out.println("Invalid Move");
                     Thread.sleep(2000);}
                     else
                     {
                        swap_temp=board[x][y];
                        board[x][y]=board[x+1][y];
                        board[x+1][y]=swap_temp;
                     }
                     break;
            case 'd':if(y==3){
                     System.out.println("Invalid Move");
                     Thread.sleep(2000);}
                     else
                     {
                        swap_temp=board[x][y];
                        board[x][y]=board[x][y+1];
                        board[x][y+1]=swap_temp;
                     }
                     break;
            case 'q':break stop_game;
        }
    }

    }
    static void clear()
    {
        try {
               if (System.getProperty("os.name").toLowerCase().contains("win")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                        }
            } catch (Exception e) {
                        e.printStackTrace();
                }
    }
    static void findPosition()
    {
        int i,j;
     outer:for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(board[i][j]==0) 
                {
                    x=i;
                    y=j;
                    break outer;
                }
            }  
    }
    }
    static void displayBoard()
    {
        int i,j;
        System.out.println("\n\n");        
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(board[i][j]==0)
                    System.out.print("\t");
                else
                    System.out.print(board[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n\nArrange the numbers in Ascending order...\n");
        System.out.println("Use the following game Controls to move space\n ");
        System.out.println("w --> Up");
        System.out.println("a --> Left");
        System.out.println("s --> Down");
        System.out.println("d --> Right");
        System.out.println("q --> Quit");
    }
}