import java.util.Scanner;
import java.util.Random;
public class SumAveMax {
    
    
    public int [] arr;
    public int max = 0;
    public int sum = 0;
    
    public void SumAveMax(int size){
        arr = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(1000);
        }
    }
    public void show(){
        int ln = 0;
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
            ln += 1;
            if(ln == 10){
                System.out.print("\n");
                ln = 0;
            }
        }
    }
    public void getSum(){
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        } 
        System.out.println("\n\nSum = " + sum);
    }
    public void getAve(){ 
        double average = sum / arr.length;  
        System.out.println("Average = " + average);
    }
    public void getMax(){
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("\nMax = " + max);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        SumAveMax call = new SumAveMax();
        int size = 0;
    
        System.out.print("Enter array size: ");
        size=input.nextInt();
        call.SumAveMax(size);
        
        call.show();
        call.getSum();
        call.getAve();
        call.getMax();
    }
}