import java.util.*;

 
public class Anagramcheck {  
    static boolean is Anagram(String s1, S tring s2) {
        String str1 =  s1.replaceAll("\\s" , ""

          
        if (str1.length() != str2.length()) {
             r e
             els {  
               car[] c h 1 = str1.toLowerCase().toCharArra

            
               Arrays.sort(ch

             
            return Arrays.equals(ch1, ch2);
     

    

         
               System.out.println(isAnagram(" listen", "si lent"));// ou
           System.out.println(isAnagram("hello", "world"));// output -false
    }
}
