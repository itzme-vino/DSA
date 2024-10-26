import java.util.Scanner;
class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        while(true)
        {
            System.out.println("Enter 1 to insert an element");
            System.out.println("Enter 2 to delete an element");
            System.out.println("Enter 3 to retrieve the peek element");
            System.out.println("Enter 4 to exit");
            int choice = sc.nextInt();
            switch(choice)
            {
               case 1:
               {
                   System.out.println("Enter the element to push");
                   int element = sc.nextInt();
                   stack.push(element);
                   break;
               }
               case 2:
               {
                   int poppedElement = stack.pop();
                   System.out.println("The element popped is "+poppedElement);
                   break;
               }
               case 3:
               {
                   int peekElement = stack.peek();
                   if(peekElement != -1)
                   {
                       System.out.println("The peek element is "+peekElement);
                   }
                   break;
               }
               case 4:{
                   System.out.println("Exiting....");
                   sc.close();
                   return;
               }
               default:
                    System.out.println("Enter the valid option");
                    break;
            }
        }
    }
}
class Stack
{
    private int top;
    private int maxSize;
    private int[] stackArray;
    public Stack(int size)
    {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = new int[size];
    }
    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Stack overflow");
        }
        else
        {
            stackArray[++top] = element;
            System.out.println("Element "+element+" pushed into the stack successfully");
        }
    }
    public int pop(){
        int poppedElement;
        if(isEmpty())
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            return stackArray[top--];
        }
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("No elements are there");
            return -1;
        }
        else
        {
            return stackArray[top];
        }
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == maxSize-1;
    }
}