public class paixu{
    public static void main(String[] args){
        int[] arr={1,2,3,7,5,4,9};
        for(int i=0;i<arr.length-1;i++){

            int min=i;
            for(int j=i+1;j<arr.length-1;j++){
                int tmp;

                if(arr[min]>arr[j]){
                    min=j;
                }
                if(i!=min){
                    tmp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=tmp;
                }


            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
