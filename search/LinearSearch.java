package search;

public class LinearSearch {

    static void lsearch(int arr[],int item){
        int indexCount=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==item){
                System.out.printf("%d is in the array.\n",item);
                indexCount ++;
            }
        }
        if(indexCount==0){
            System.out.printf("%d is not in the array.\n",item);
        }
    }

    public static void main(String [] args){
        int arr1[]={12,1,23,23,454,5656};
        int item1=23;
        lsearch(arr1, item1);
    }
    
}

