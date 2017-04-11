import java.util.*;
/**
 * Write a description of class a here.
 * 
 * @author Kyle Den Hartog 
 * @version 
 */
public class Lab10{
    public int[] arrayof1000 = new int[10];
    Random rg = new Random();

    public Lab10(){
        for(int x = 0; x < 10; x++){
            arrayof1000[x] = rg.nextInt(50);
        }
    }

    public int search(int[] array, int num){
        int x;
        boolean test = true;
        for(x = 0;x < array.length && x != num; x++){
            if(num == array[x])
                return x;  
        }
        return -1;
    }

    public int binarySearch(int[] array, int num){
        int[] temp = sort(array);
        int mid = temp.length/2;
        int min = 0;
        int max = temp.length;

        for(int x = 0; x < array.length; x++){
            System.out.println(temp[x]);
        }
        
        System.out.println();
        
        while(min <= max){
            mid = midPoint(max, min);
            if(num == temp[mid]){
                return mid;
            }else if(num < temp[mid]){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return -2;
    }

    private static int[] sort(int[] array){
        int n = array.length;
        int temp = 0;
        for(int x = 0; x < n; x++){
            for(int y = 1; y < (n-x); y++){
                if(array[y - 1] > array[y]){
                    temp = array[y-1];
                    array[y-1] = array[y];
                    array[y] = temp;
                }
            }
        }
        return array;
    }

    private static int midPoint(int x, int y){
        return (x-y)/2;
    }

    public static void main(String[] args){
        for(int x = 0; x < 10; x++){
            Lab10 lab = new Lab10();
            Random rg = new Random();
            int testNum = rg.nextInt(50);
            System.out.println(lab.search(lab.arrayof1000, testNum) + "\n");
            System.out.println(lab.binarySearch(lab.arrayof1000, testNum) + "\n");
        }
    }
}
