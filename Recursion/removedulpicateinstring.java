package Recursion;

public class removedulpicateinstring {

    public static void removedulpicate(String str,int index,StringBuilder sb, Boolean map[]){

        if(index==str.length()){
            System.out.println(sb);
            return;
        }


        if(map[str.charAt(index)-'a']==true){
            removedulpicate(str, index+1, sb, map);
        }else{
            map[str.charAt(index)-'a']=true;
            removedulpicate(str, index+1, sb.append(str.charAt(index)), map);
        }



    }


    public static void main(String[] args) {
        String str="apnacollege";
        removedulpicate(str, 0, new StringBuilder(),new Boolean[26]);
    }
    
}
