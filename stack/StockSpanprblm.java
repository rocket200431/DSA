import java.util.Stack;

public class StockSpanprblm {

    public static void Spanarr(int Stock[],int span[]){
        Stack<Integer>s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<span.length;i++){
            int currPrice=Stock[i];
        while(!s.isEmpty()&&currPrice>Stock[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            span[i]=i+1;
        }else{
        int prevHigh=s.peek();
        span[i]=i-prevHigh;
     }  
        s.push(i);
    }

    }


    public static void main(String[] args) {
        int Stock[]={100,80,60,70,60,85,100};
        int Span[] =new int[Stock.length];

        Spanarr(Stock,Span);

        for(int i=0;i<Stock.length;i++){
            System.out.println(Span[i]);
        }

      

    }
    
}
