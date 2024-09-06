import java.util.Arrays;

public class array {
    public static void main(String args[]){
        int []array={12,13,14,51,16};
        array[0]=15;
        //System.out.println(array[0]);
        System.out.println(array.length);  //print length of array
           Arrays.sort(array); //sort array
           //Arrays.fill(array,10); //all element fill with 10
        int [] newarray=Arrays.copyOf(array,array.length);
        System.out.println("copied array:"+Arrays.toString(newarray)); //copy array and convert to string and display


         for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        boolean areEqual = Arrays.equals(array, newarray);
        System.out.println("array are equal : "+areEqual);
    }
}
