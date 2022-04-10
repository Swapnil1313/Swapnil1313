import java.util.*;
public class Qrune
{
    public static void main(String[] args) 
    {
        Queue<Integer> q1 = new LinkedList<Integer>();
        
        q1.add(56);
        q1.add(89);
        q1.add(25);
        q1.add(64);
        q1.add(47);
        q1.add(82);
        
        System.out.println("Elements Added : "+q1);
        
        System.out.println("Removed Elements : "+q1.remove());
        
        System.out.println("Head of the Queue : "+q1.element());
        
       // System.out.println("Poll():Returned Head of the queue: "+q1.poll());
        
        System.out.println("Removed Elements : "+q1.remove());
        
        System.out.println("Head of the Queue : "+q1.element());
        
        System.out.println("Final Queue:"+q1);
        
    }
}