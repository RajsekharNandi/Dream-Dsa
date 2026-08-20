public class Main10
 {
     public static void main(String[] args)
     {
        int count = 0;
         String a ="salsa";
        for (int i = 0; i<a.length(); i++) 
            {
                count = 0;
            for(int j = 0; j<a.length();j++)
                {
              if(a.charAt(i) == a.charAt(j))
                {
                count++;
              }
            }
              if(count==1){
                System.out.println(a.charAt(i));
                break;
              }
            
         }
    }
}
