import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class ZoombieKiller {
    public static void main(String [] args){
        System.out.println("Welcome to our killer prograam!!!");
        String backpack[]= {"Shotgun", "Assault", "Sniper"};
        String zoombies[]= {"close-range", "Mid-range zoombie", "Long-range zoombie"};
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        System.out.println(zoombies[0]);
        System.out.println(zoombies[1]);
        System.out.println(zoombies[2]);
        System.out.println(backpack[2]);
        System.out.println(backpack[2]);
        System.out.println(backpack[2]);
        System.out.println(backpack[0]);
        int numbersZoombiesHATE[]= {4, 90, 70, 12, 4, 561, 1};
        System.out.println(numbersZoombiesHATE[5]);
    }
    //public long sum(int[] array){
       //Arrays.stream(array).sum;
    
   // }
    public long sumArray(int[] array){ //methos name sumArray that takes an array 
                                       //of integers as input and returns the sum 
                                       //of all elemetns in the array as long
        int sum=0;                     //it initializes a variable sum of type int 
                                       //to store the sum of the array elements
                                       //initially is set to zero 
        for(int element : array){      //it itirates over each element of the input array
                                        //using an enhanced for loop
                                        // in this loop element represents each 
                                        //individual element in the array during each 
                                        //iteration 
                                        
            sum+=element;                //inside the loop, it adds the current element 
                                         //to the sum variable
                                         //this statement effictively accumulates
                                         //the sum of all elements in the array.
                                         //Once the loop has iterated thought all elements 
                                         //of the array, the methos returns the final value of sum
                                         //Overall, this method computes the sum of all elements in the 
                                         //given array and returns it as a long data type
                                         //which is suitable for storing lsrfe integer values



        }
        return sum;
    }
}
    public long sumArray2(int[] array){
        long sum=0;
        for(int i=0; i<array.length; i++){
            sum+= array[i];

        }
        return sum;

    }
    


