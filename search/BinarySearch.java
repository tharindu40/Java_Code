package search;

import java.util.Arrays;

public class BinarySearch {
   int bSearch(int arr[],int n){
        int lowIndex=0;
        int topIndex=arr.length-1;

        //algorithm logic
        while(lowIndex<=topIndex){
            int index=lowIndex+(topIndex-lowIndex)/2;
            if(arr[index]==n){
                return index;
            }
            if(n>arr[index]){
                lowIndex=index+1;
            }else{
                topIndex=index-1;
            }
            
        }
        // if there are no item in  array
        return -1;
    }
    public static void main(String[] args){
        BinarySearch binarySearch=new BinarySearch();

        int numArray[]={12,32,45,56,677};
        // sort array because binary search work sorted array
        Arrays.sort(numArray);

        int num=45;

        int result=binarySearch.bSearch(numArray, num);
        
        //output
        if(result != -1){
            System.out.printf("%d is %d th item in array \n",num,result+1);
        }else{
            System.out.printf("%d is not in array \n",num);
        }


    }
}
