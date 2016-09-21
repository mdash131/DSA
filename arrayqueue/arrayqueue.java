public class arrayqueue {
  
  private int queue[];
  private int rear = 0;
  private int capacity;
  private int front = 0;
  
  public arrayqueue(int size){
    capacity = size;
    queue = new int[capacity];
        
  }
  
  public void show(){
    for(int i=0;i<capacity;i++){
      System.out.println("index["+(i+1)+"]: "+queue[i]);
    }System.out.println();
  }
  
  public boolean isFull(){
    if (rear == capacity){
      System.out.println("You have reached the maximum limit of queue!");
      System.out.println();
      return true;
    }return false;
  }
  
  public boolean isEmpty(){
    if (front == rear){
      System.out.println("Queue is Empty!");
      System.out.println();
      return true;
      
    }return false;
  }
  
  public void enqueue(int value){
    if(isFull()==true){
      System.out.println("Error Enqueuing!");
    }
    else if(isEmpty()==true){
      System.out.println("Trying to enqueue: "+value);
      queue[rear]= value;
      queue[front] = value;
      rear++;
      System.out.println("Enqueue Successful");
    }
    else{
      System.out.println("Trying to enqueue: "+value);
      queue[rear]= value;
      rear++;
      System.out.println("Enqueue Successful");
    }
      
    
    System.out.println();
  }
  
  public void dequeue(){
    if(isEmpty()==true){
      System.out.println("Error Dequeuing!");
      return;
    }
    
    else if(front == rear) {
      System.out.println("Error Dequeuing!");
      
    }
    else{
      System.out.println("Trying to Dequeue "+queue[front]+"...");
      queue[front]=0;
      front++;
    }
    
  }
  
  public void peekFront(){
    System.out.println("Front Value: "+queue[front]);
  }
  
  public void peekRear(){
    System.out.println("Rear Value: "+queue[rear-1]);
  }
  
  public void rearrange(){
   if(isEmpty()==true){
      System.out.println("Unable to Rearrange!");
            
    }
    else{
      System.out.println("Rearranging indexes...");
      do{for(int i=0;i<rear;i++){
        queue[i] = queue[i+1];
          
      }
      
      for(int i=rear;i<capacity;i++){
        queue[i]=0;
      }
      
      front = 0;
      rear = rear-1;
      }while(queue[front]==0);
      
    }
    System.out.println("Rearrange Successful!");
  }
  
  
  public static void main(String[] args) {
    arrayqueue QueueApp = new arrayqueue(10);
    QueueApp.show();
    QueueApp.enqueue(10);
    QueueApp.enqueue(13);
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.enqueue(44);
    QueueApp.enqueue(36);
    
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.dequeue();
    QueueApp.rearrange();
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.enqueue(77);
    QueueApp.enqueue(93);
    QueueApp.enqueue(43);
    QueueApp.enqueue(99);
    QueueApp.rearrange();
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.enqueue(88);
    QueueApp.enqueue(56);
    QueueApp.show();
    QueueApp.peekFront();
    QueueApp.peekRear();
    QueueApp.enqueue(56);
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.dequeue();
    QueueApp.show();
    
    

  }

}