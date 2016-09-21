import java.util.*;
public class ArrayQueue {

    
 private int capacity;
 private String[] arr;
 private int size = 0;
 private int tail = -1;
 private int head = 0;
 private int count = 0;
 
  public ArrayQueue(int s) {
    capacity = s;
    // assign the value of size to capacity
    arr = new String[capacity];
    
  }

 
 public void show() {
    // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
    for (int i = 0; i <=capacity-1; i++) {
      System.out.println("queue[" + i + "] =" + arr[i]);
      
    }
    System.out.println();
  }
  
 public void enqueue (String j){
            if (isFull()){
                System.out.println("Puno na po!!!!");
            }
            else{
            arr[head++] = j;
            size++;}
            count += 1;
 }


    public void dequeue(){
        if (isEmpty()) {
      // print error message
      System.out.println("no element to dequeue"); 
    } else {
        head--;
       for(int i = 0; i< count-1; i++){
        arr[i] = arr[i+1];}
        
        }
        arr[count-1] = null;
        count -= 1;
    }
    public boolean isEmpty(){
    if (arr[0] == null) {
      // print error message
      System.out.println("stack is empty");
        System.out.println();
  
      return true;
    } 
    return false;
    }

    public boolean isFull(){
        if (head == capacity) {
      // print error message
      System.out.println("stack is full");
      return true;
    } 
    return false;
  }
     public void peekhead() {
    if (isEmpty()) {
      System.out.println("nothing to see here");
      System.out.println();
    } else {
      System.out.println("Peek head = " + arr[0]);
      System.out.println();
    }
  }
  
public void peektail() {
    if (isEmpty()) {
      System.out.println("nothing to see here");
      System.out.println();
    } else {
      System.out.println("Peek tail = " + arr[count-1]);
      System.out.println();
    }
  }
    
    


 
        public static void main (String[]args){
  
                
           ArrayQueue arr =new ArrayQueue(10);
        arr.show();
        arr.enqueue("one");
        arr.show();
        arr.enqueue("two");
        arr.show();
        arr.enqueue("three");
        arr.show();
        arr.enqueue("four");
        arr.show();
        arr.enqueue("five");
        arr.show();
        arr.enqueue("six");
        arr.show();
        arr.enqueue("seven");
        arr.show();
        arr.enqueue("eight");
        arr.show();
        arr.enqueue("nine");
        arr.show();
        arr.enqueue("ten");
        arr.show();
        arr.peektail();
        arr.peekhead();
        arr.dequeue();
        arr.show();
        arr.peekhead();
        arr.peektail();
        }
}