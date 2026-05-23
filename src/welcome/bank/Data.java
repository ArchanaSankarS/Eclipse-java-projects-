package welcome.bank;

public class Data {
  int size = 10;
  int arr[] = new int[size];
   
 int front;
 
 public  Data() {
	  front = -1;
  } 
 
  void push (int val) {
   
  if(front == size-1) {
	  throw new IndexOutOfBoundsException("Stack is full");
  }
  arr[++front] = val;
  System.out.println(val + " push");
 }

 public static void main(String[]args){
	  Data s = new Data();
	  s.push(10);
	  s.push(60);
	  s.push(30);
	  s.push(20);
	  s.push(40);
	  s.push(50);
	  s.push(70);
	  s.push(80);
	  s.push(90);
	  s.push(100);
	  s.push(110);
	  
	  															

 }
}


