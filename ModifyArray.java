public class ModifyArray {
    public static void modifyArray(int[] array){
        array[0]=99;

    }
    public static void main(String[] args) {
        int[] myArray={1,2,3};
        modifyArray(myArray);
        System.out.println(myArray[0]);
        
    }
    
}
