//5607101018 Peerapon Ariyabunyotai

public class StackApp {

	public static void main(String[] args)
    {
    StackX theStack = new StackX(10);  // make new stack
    theStack.push(25);               // push items onto stack
    theStack.push(50);
    theStack.push(75);
    theStack.push(100);

    while( !theStack.isEmpty() )     // until it's empty,
       {                             // delete item from stack
       double value = theStack.pop();
       System.out.print(value);      // display it
       System.out.print(" ");
       }  // end while
    System.out.println("");
    }  // end main()
 }  // end class StackApp