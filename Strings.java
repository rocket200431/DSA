import java.util.*;
public class Strings {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
    public static float getShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
                
            }else if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='E'){
                x++;
            }else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static String substring(String str,int si,int ei){
        String subString="";
        for(int i=si;i<ei;i++){

       subString+=str.charAt(i);
            
        }
        return subString;
    }
    public static String largestString(String fruits[]){
        String Largest=fruits[0];

        for(int i=1;i<fruits.length;i++){
            if(Largest.compareTo(fruits[i])<0){
                Largest=fruits[i];
            }
            
        
        }
        return Largest;
    }
    public static String touppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
            
        }

        return sb.toString();
    }
    public static String stringCom(String str){
        String newstr=new String("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            newstr+=str.charAt(i);
            if(count>1) newstr+=count.toString();

        }
        return newstr;
    }
    public static String stringComsb(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1) sb.append(count.toString());

        }
        return sb.toString();
    }
    //pratice ques 1
    public static int countvow(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }
        return count;
    }
    
    public static boolean anagramsbf(String str1,String str2){
int count =0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;

                }

            }
        }
        if(count==str1.length()){
            return true;
        }
        return false;

    }
    public static boolean anagrams(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            
        

        char str1Array[]=str1.toCharArray();
        char str2Array[]=str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        boolean eq= Arrays.equals(str1Array,str2Array);
        return eq;}
        else{
            return false;
        }
    
    
    }
    public static void main(String[] args) {
    //  char arr[]={'a','b','c'};
    //  String name="Mallika";
    //  String name1=new String("hello");
    //  Scanner sc=new Scanner(System.in);
    // String name2=sc.next();
    // String name2=sc.nextLine();
    //  System.out.println(name2);
    //  System.out.println(name.length());
     //concatination
    //  String firstname="Mallika";
    //  String Secondname="bramaramba";
    //  String fullName=firstname+Secondname;
     //System.out.println(fullName);

     // charAt() method

     //System.out.println(fullName.charAt(3));
     //rintString(firstname);
    //  String str="racecar";
    //  System.out.println(isPalindrome(str));
     //System.out.println(getShortestPath("WNEESNNNEE"));
    // String s1="tony";
    // String s2="tony";
    // String s3=new String("tony");
    // if(s1==s2){
    //     System.out.println("true");
    // }else{
    //     System.out.println(false);
    // }
    // if(s1==s3){
    //     System.out.println("true");
    // }else{
    //     System.out.println(false);
    // }
    // System.out.println(s1.equals(s2));
    // System.out.println(s1.equals(s3));
     //===>>substring
    //  String str="helloWorld";
    //  System.out.println(substring("helloworld", 0, 5));
    //  System.out.println(str.substring(0,5));
   

// String fruits[]={"mango","banana","apple"};
//      System.out.println(largestString(fruits));
//    StringBuilder sb=new StringBuilder("");
//     for(char ch='a';ch<='z';ch++){
//         sb.append(ch);
//     }
//     sb.toString();
//     System.out.println(sb);
//System.out.println(touppercase("hello i am mallika"));
//System.out.println(stringComsb("abc"));
// System.out.println(countvow("mallika"));
// String str="ApnaCollege".replace("l",""); 
// System.out.println(str);
System.out.println(anagrams("race",  "care"));

    }
    
}
