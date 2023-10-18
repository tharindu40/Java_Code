package search;

import java.util.*;

public class JumpSearch {
    int jSearch(int arr[],int item){
        int lengthArray=arr.length;
        //find the steps moves on array
        int step=(int)Math.sqrt(lengthArray);

        int nowPossition=0;

        for(int lStep=Math.min(step,lengthArray)-1; arr[lStep]<item ; lStep=Math.min(step,lengthArray)-1){
            nowPossition=step;
            step+=(int)Math.sqrt(lengthArray);
            if (nowPossition>=lengthArray){
                return -1;
            }


        }
        while(arr[nowPossition]<item){
            nowPossition++;

            if(nowPossition==Math.min(step, item)){
                return -1;
            }
        }

        if (arr[nowPossition] == item){
            return nowPossition;
        }


        return -1;
    }
    public static void main(String[] args){
        JumpSearch jumpSearch=new JumpSearch();

        int numArray[]={12,32,45,56,677,12,13,45,678,54,4,21,56};
        // sort array because jump search work sorted array
        Arrays.sort(numArray);
        for (int i=0;i<numArray.length;i++){
            System.out.println(numArray[i]);
        }
        int num=32;

        int result=jumpSearch.jSearch(numArray, num);
        
        //output
        if(result != -1){
            System.out.printf("%d is %d th item in array \n",num,result+1);
        }else{
            System.out.printf("%d is not in array \n",num);
        }

    }
}
