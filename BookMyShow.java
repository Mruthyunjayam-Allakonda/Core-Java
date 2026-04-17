
import java.util.*;
class BookMyShow
{
     static int seat[][]=new int[10][10];
    public static void main(String args[])
    {     
        int i,j,num=1;
        for (i = 0; i < 10; i++) 
        {
            for(j = 0; j < 10 ; j++) 
            {
             seat[i][j]=num++;
            }
        }
        display();
        System.out.println("1 for Online\n2 for Offline Booking");
        Scanner sc=new Scanner(System.in);
        int mode=sc.nextInt();
        int bill=0,cur_selection;
        if(mode==1)
        {
        while (true)
         { 
         System.out.println("Enter How many tickets");
         int numOfTickets=sc.nextInt();
         for(int k=1;k<=numOfTickets;k++)
         {
            System.out.println("Select Your Seat:"+k);
            cur_selection=sc.nextInt();
            outer:for ( i = 0; i < 10; i++) 
            {
                for( j=0;j<10;j++)
                {
                    if(seat[i][j]==cur_selection)
                    {
                        seat[i][j]=0;
                        if(i>=0 &&i<=4)
                         bill=bill+80;
                        else if(i>=5 &&i<=7)
                         bill=bill+150;
                        else if(i>=8&&i<=9)
                        bill=bill+250;
                        break outer;
                    }
                }
            } //outer
            if(i==10)
            {
            System.out.println("Seat "+k+"already booked. Select other");
            k--;
            } 
            else
            {
             System.out.println(k+"seat booked successfully");  
             System.out.println("Your total bill amount is "+bill);
            }
         } //for to choose desired seats
         display();
         System.out.println("Do You want to continue...");
         char ch=sc.next().charAt(0);
         if(ch=='y')
          continue;
        else
          break;
        }
        }
        else
        {
            System.out.println("The update is currently unavailable. We apologize for the inconvenience");
        }
    }
    static void display()
    {
        System.out.println("\n\t\t          Welcome ALL             ");
        System.out.println();
        System.out.println("\t****************************************************************************");
        System.out.println("\t*                                                                          *");
        System.out.println("\t*                                                                          *");
        System.out.println("\t*                              Screen View                                 *");
        System.out.println("\t*                                                                          *");
        System.out.println("\t*                                                                          *");
        System.out.println("\t****************************************************************************");
        int i,j;
         for (i = 0; i < 10; i++) 
        {
            if(i==0)
             {
                System.out.println("\n\n");
                System.out.println("Lower Balcony: 80 Rs."); 
             }
             else if(i==5)
             {
                System.out.println("\n--------------------------------------------------------------------------------------------");
                System.out.println("Balcony: 150 Rs.\n");
             }
             else if(i==8)
             {
                System.out.println("\n--------------------------------------------------------------------------------------------");
                System.out.println("Upper Gold: 250 Rs.\n");
             }
            for(j = 0; j < 10 ; j++) 
            {
             if(j==7)
             System.out.print("\t");
             System.out.print("\t"+seat[i][j]);
            }
            System.out.println("\n");
        }
    }
}