package Pseudocodes.Stack;

public class Implementation {
    public class Stack{
        int n = 10;
        int[] arr = new int[n];
        Stack(){
            int top = 0;
        }
        void push(int[]arr , int size , int top , int val){
            if(top > size-1){
                System.out.println("Stack size is full!!");
            }
            top++;
            arr[top] =  val;

        }

        void pop(){
            
        }
    }
    public static void main(String[] args) {

    }
}
