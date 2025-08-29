import java.io.*;
import java.util.*;
class Node{
    public int freq;
    public char d;
    public Node left,right;
}
public class Solution {
    public static void decode_huff(Node root,String s){
        StringBuilder r=new StringBuilder();
        Node c=root;
        
        for(int l=0;l<s.length();l++){
            char b=s.charAt(l);
            if(b=='0') c=c.left;
            else c=c.right;
            
            if(c.left==null &&c.right==null){
                r.append(c.d);
                c=root;
            }
        }
        System.out.println(r.toString());
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String inp=sc.nextLine();
    System.out.println(inp); 
    }
        
}

