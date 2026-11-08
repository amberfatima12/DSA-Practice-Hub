package PRACTICLE.DSA;
public class recursion {
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

    public int  fact(int n){
        if(n==1){
            return 1;
        }
    else{
        return n*fact(n-1);
    }
    }
public static   int print(int arr[], int n){
    if(arr.length==n){return 1;}
    System.out.print( arr[n] +" " );
    return print(arr, n+1);
}
public static   int show(int arr[], int n){
    if(arr.length==n){return 1;}
    show(arr, n+1);
    System.out.print(arr[n]+ " ");
    return 1;}

    // even numbers
    public void even(int n){
        if(n>20){
            return ;
        }
System.out.print(n+ " ");
      even(n+2);
    
    }
//   through llinlist
public void pri(Node head){
    if(head==null){
        return;
    }
System.out.print(head.data + " ");
pri(head.next);
}

// sum 
public int sum(int n){
    if(n==5){
        return 5;
    }
    else{
        return n+sum(n+1);
    }
}
    
public static  void main(String[] args) {
recursion r= new recursion();
System.out.println("Factorial of 5 = "+ r.fact(5)+ " " );
int arr[] = {10, 20, 30, 40};
print(arr, 0);
System.out.println(" ");
System.out.print("Numbers in reverse order = ");
int arr1[] = {10,20,30,40};
show(arr1, 0);
System.out.println(" ");
System.out.print("even numbers = ");
r.even(0);
System.out.println(" ");
System.out.println("sum of 5 numbers "+r.sum(0));
}  
}
