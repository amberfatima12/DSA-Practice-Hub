package PRACTICLE.Practice;

public class recpractice {
    Node head;
    
    public class Node{
        int data;
        Node next;
Node(int data){
    this.data=data;
    this.next=null;
}
Node(int data, Node next){
    this.data=data;
    this.next=next;
}
    }
    // print function
    public void print(int n){
if(n==0){
    return;
}
     System.out.print(n+" ");
        print(n-1);
    }
    // factorial function
    public long fact(int n){
        if(n==1){
            return 1;
        }
     return n*fact(n-1);
    }
// array print 
public void printarr(int arr[] , int n){
    if(arr.length==n){
        return;
    }
        System.out.println(arr[n]);
    printarr(arr,n+1);
}
// sum 
public int sum(int n ){
    if(n==1){
        return 1;
    }
    return n+sum(n-1);
}
// even
public void even(int n){
    if(n>20){
        return;
    }
         System.out.print(n+" ");
   even(n+2);
}
// linklist
public void printll(Node head){
    if(head==null){
        return; 
    }
    System.out.println(head.data+" ");
    printll(head.next);
}
// fibonachii series
public int fibonachii(int n){
    if(n==0){
        return 0;
    }
    if(n<3){
        return 1; 
    }
    return fibonachii(n-1)+fibonachii(n-2);
}
    public static void main(String[] args){
        recpractice r= new recpractice();
    r.print(4);
    System.out.println(" ");
    long start = System.currentTimeMillis();
    System.out.println(r.fact(5));
    long end = System.currentTimeMillis();
    System.out.println("time ="+(end-start)+"ms");

    int arr[]={10,20,30,40};
    r.printarr(arr,0);

    System.out.println(r.sum(7));
r.even(0);
System.out.println("through linklist");
r.head=r.new Node(1);
r.head.next=r.new Node(2);
r.head.next.next=r.new Node(3);
r.head.next.next.next=r.new Node(4);


r.printll(r.head);

System.out.println("fibonachii series "+ r.fibonachii(8));
    } 
}
