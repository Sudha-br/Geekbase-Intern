import java.util.*;
public class string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        dup(str);
        palindrome(str);
        reverse(str);
    }
    public static void dup(String s){
        StringBuffer sb=new StringBuffer();
        ArrayList<Character> ch=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!ch.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            ch.add(s.charAt(i));
        }
        sb.toString();
        System.out.println(sb);
    }
    public static void palindrome(String s){
        int i=0;
        int j=s.length()-1;
        boolean b=true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                 i++;
                 j--;
            }else{
            b=false;
            break;}
        }
        System.out.println(b);
    }
    public static void reverse(String s){
        String[] str=s.split(" ");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
        }
        System.out.println(rev);
    }
}