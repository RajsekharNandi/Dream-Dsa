import java.util.*;
public class Main12 
{
    public static void main(String[] args){
    int s = 1;
    Scanner sc = new Scanner (System.in);
    int mark[] = new int[5];
    String nams[] = new String[5];
    for(int i = 0; i<5;i++)
    {
     System.out.println("Enter the number and names of the student");
     mark[i] = sc.nextInt();
     sc.nextLine();
     nams[i] = sc.nextLine();
    }
     System.out.println("_____________________________");
     for(int i= 0; i<5; i++)
    {
        if(mark[i]>50)
            {
                System.out.println(s +" " + nams[i] + "has scored" + mark[i]);
                s++;
            }
    }
}
}
