public class FindMinMax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numbers = { 88, 23, 54, 288, 50, 97 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            if (min>numbers[i])
                min = numbers[i];
            
            if(numbers[i]>max)
                max = numbers[i];
        }
        System.out.println("Smallest number is: "+min);
        System.out.println("Largest number is: "+max);
    }   

}