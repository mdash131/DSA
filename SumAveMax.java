import java.util.Scanner;

public class SumAveMax {
int[] array;
  int c, n;
  int max = 0;
  int sum = 0;
  int temp = 0;
  int capacity;
  double average;
Scanner in = new Scanner(System.in);
public SumAveMax (int s){
    capacity = s;
    array = new int[capacity];
}

 public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = 0; i < capacity; i++) {
      System.out.println("array[" + i + "] =" + array[i]);
   
    }
    System.out.println();
  }
 
public void getArray(){
    System.out.println("Enter the values now.");

        for (int i = 0 ; i < capacity; i++ ) {
           array[i] = (int)(Math.random() * 100);;
        }
 }

public void getSum(){
for(int i = 0; i < capacity; i++){
  
      sum+= array[i];
}  
    System.out.println("eto ang sum: " + sum);
}
public void getMax(){

    for(int i = 0; i < capacity; i++){

    if(array[i]>temp){
      temp = array[i];}
  max = temp;
}
    System.out.println("eto ang max: " + max);
}
public void getAve(){
for(int i = 0; i < capacity; i++){
  
      sum+= array[i];
       average = (double)sum / capacity;
  
}  
    System.out.println("eto ang average: " + average);
} 

    public static void main(String[] args) {
   
Scanner in = new Scanner(System.in);

        int b;
        System.out.println("please input how many value are in your array");
   b = in.nextInt();// TODO code application logic here
    SumAveMax git = new SumAveMax(b);
    
    
    git.getArray();
    git.show();
    git.getSum();
   git.getMax();
  git.getAve();
    }
    
}