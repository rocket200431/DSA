package backtrack;
class arraybacktrack{
    public  static void changeArr(int arr[],int idx,int val){
        if(idx==arr.length){
            return;
        }
    arr[idx]=val;
    changeArr(arr, idx+1, val+1);
    arr[idx]=arr[idx ]-2;


    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]=new  int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

    }
}