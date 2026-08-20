/*public class Main8 {
    public static void main(String[] args){
          int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        String a = "HelloJjcb45@##$";
         for(char x:a.toCharArray()){
         if(x >= 'A' && x <= 'Z'){
                count1++;
            }
            else if(x >= 'a' && x <= 'z'){
                count4++;
            }
            else if(x >= '0' && x <= '9'){
                count2++;
            }
            else{
                count3++;
            }
        }
        System.out.println("Uppercase letters: " + count1);
        System.out.println("Lowercase letters: " + count4);
        System.out.println("Digits: " + count2);
        System.out.println("Special characters: " + count3);
    }
}
*/
public class Main8 {
    public static void main(String[] args) {

        String a = "HelloJjcb45@##$";

        int upper = 0, lower = 0, digit = 0, special = 0;

        for (char x : a.toCharArray()) {        
            if (Character.isUpperCase(x))
                upper++;
            else if (Character.isLowerCase(x))
                lower++;
            else if (Character.isDigit(x))
                digit++;
            else
                special++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Special: " + special);
    }
}
