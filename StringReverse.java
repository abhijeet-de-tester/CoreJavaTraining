import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        byte[] revA = new byte[A.length()];
        byte[] bytesA = A.getBytes();
        for(int i=0; i<A.length(); i++){
            revA[i] = bytesA[A.length()-1-i];
        }
        
        String strRevA = new String(revA);
        //System.out.println(strRevA);
        if (strRevA.compareTo(A)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
