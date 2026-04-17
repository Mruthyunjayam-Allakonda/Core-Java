import java.util.*;

class RPS
{
    public static void main(String args[])
    {
        int uc,cc;
        RPS ob=new RPS();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter User choice ");
        uc=sc.nextInt();
        ob.display(uc);
        //System.out.println("Computer choice"+cc);
        Random r=new Random();
        cc=r.nextInt(3);
        ob.display(cc);
        System.out.println("Computer choice"+cc);
        if(uc==cc)
            System.err.println("Game Draw");
        else if(uc==0 && cc==2)
            System.err.println("User wins");
        else if(uc==2 && cc==0)
            System.err.println("Computer Wins");
        else if(cc>uc)
            System.err.println("Computer wins");
        else if(uc>cc)
            System.err.println("User wins");

    }
     void display(int x)
    {
        String Rock="""
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""";

String Paper="""
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""";

String Scissor="""
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""";
        if(x==0)
            System.out.println(Rock);
        else if(x==1)
          System.out.println(Paper) ;
        else
           System.out.println(Scissor);  
    }
}