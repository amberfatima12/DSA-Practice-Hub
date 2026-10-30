
package PRACTICLE.Practice;

import java.nio.channels.IllegalSelectorException;

public class stackpractice {
public interface Innerstackpractice {
public int size();
public Object peek();
public Object pop();
public void push(Object obj);     
}
public  static  class stack implements Innerstackpractice{
    int size;
    Node top;
    public  class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data=data;
            this.next=null;
        }
           Node(Object data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    // size
    public int size(){
        if(size == 0){
            System.out.println("Stack is empty");
        }
        return size;
    }

    // peek
    public Object peek(){
        if(size==0){
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
// push
    public void push(Object obj){
        top = new Node(obj,top);
        size ++;
    }
    // dis
    public void display(){
        for(Node i = top;i!=null;i=i.next){
            System.out.print(i.data+" ");
        }
        System.out.println(" ");
    }

    // pop
    public Object pop(){
            if(size==0){
            throw new IllegalStateException("Stack is empty");
        }
   Node temp = top;
      top = top.next;
      size--;
return temp.data;
    }

    // mid
    public Object mid(){
            if(size==0){
            throw new IllegalStateException("Stack is empty");
        }
        Node temp = top;
        int count = 0;
        while (count<size/2) {
            temp=temp.next;
            count++;
        }
        return temp.data;
    }

    // bottom
    public Object bottom(){
            if(size==0){
            throw new IllegalStateException("Stack is empty");
        }
        Node temp = top;
        while (temp.next!=null) {
            temp=temp.next;
        }
        return temp.data;
    }

    // reverse 
public  void reverse(){
    Object list[] = new Object[size];
Node temp = top;
for(int i = 0; i<size; i++){
list[i]=temp.data;
temp=temp.next;
}
top = null;
for(int i = 0; i<size; i++){
top = new Node(list[i],top);

}
}

// opy 
public stack copy(){
    stack temp = new  stack();
    stack ll = new stack();
for(Node i = top ; i!=null; i=i.next){
    temp.push(i.data);
}
while(temp.size>0){
    ll.push(temp.pop());
}
return ll;

}


// split
public stack[] split(){
stack s1 = new stack();
stack s2= new stack();
int count = 0;
for(Node i = top; i!=null; i=i.next){
if(count<size/2){
    s1.push(i.data);
}else{
    s2.push(i.data);
}
count ++;
}
return new stack[]{s1,s2};
}
// convert
public Object[] convert(){
    Object a[]= new Object[size];
    Node temp = top;
    for(int i = 0; i<size; i++){
        a[i]= temp.data;
        temp=temp.next;
    }
    return a;
}

// equals
public boolean equals(stack ls){
    if(this.size!=ls.size){
        return false;
    }
    Node temp = ls.top;
    for(Node i = top; i!=null; i=i.next,temp=temp.next){
        if(!i.data.equals(temp.data)){
            return false;
        }
    }
    return true;
}

// 
public String toString(){
    StringBuffer temp = new StringBuffer();
    temp.append("amber");
    temp.append("rajper");
    for(Node i = top ; i!=null; i=i.next){
        temp.append(i.data);
    }
    return temp.toString();
}

// public 
public void even(){
for(Node i = top; i!=null; i=i.next){
        if((Integer)i.data%2==0){
System.out.println(i.data);
        }
    }
}

public void odd(){
for(Node i = top; i!=null; i=i.next){
        if((Integer)i.data%2!=0){
System.out.println(i.data);
        }
    }
}

public int  max(){
    int max= (Integer)top.data;
    for(Node i = top; i!=null; i=i.next){
        if((Integer)i.data>max){
            max = (Integer)i.data;
        }
    }
    return max;
}

// sum
public int sum(){
    int sum = 0; 
    for(Node i = top; i!=null; i=i.next){
        sum+=(Integer)i.data;
    }
    return sum;
}

// search 
public boolean search(Node top, int x){
    Node temp = top;
    while(temp!=null){
        if((Integer)temp.data==x){
            return true;
       
        }
             temp=temp.next;
    }
    return false;
}

// merge
public stack merge(stack s1, stack s2){
    stack s3 = new stack();
    for(Node i= s1.top; i!=null; i=i.next){
s3.push(i.data);
    }
      for(Node i= s2.top; i!=null; i=i.next){
s3.push(i.data);
    }
    return s3;
}

// check
public boolean check(){
    if(size>=5){
        return true;
    }
return false;
}


// peek2
    public Object peek2(){
        if(size==0){
            throw new IllegalStateException("Stack is empty");
        }
stack ll = new stack();
 for(Node i = top; i!=null; i= i.next){
   ll.push(i.data);
      }
while(ll.size<=8){
ll.pop();
    
      }
 ll.pop();          // 0 remove
    return ll.peek();
    }


    // equlas
    public boolean check2(stack ls){
    if(!bottom().equals(ls.bottom())){
    return false;
    }
return true;
    }
    
// print list
public void print(Node head){
if(top==null){
    return ;
}
System.out.println(top.data);
print(top.next);
}











public Object remove(){
    Object temp = head.next;
    head.next= head.next.next;

    head.prev.next=head;
    size--;
    return temp;
}







































}



 public static void main(String[] args)  {
    stack s = new stack();
for(int i = 0; i<=10; i++){
   s.push(i);
}
s.display();

System.out.println(s.pop());

System.out.println("Middle elemenet "+s.mid());
System.out.println("ottom element "+ s.bottom());
s.reverse();
s.display();

s.copy();
s.display();

stack[] stackin = s.split();
stack s1 = stackin[0];
stack s2 = stackin[1];

s1.display();
s2.display();
System.out.println("merge");
System.out.println(s.merge(s1, s2));

System.out.println(s1.equals(s2));
System.out.println("bottom elemenyssssssssssssssssss");

System.out.println(s1.check2(s2));

System.out.println("arrray");
s.convert();
s.display();


s.toString();
s.display();

System.out.println("eveen");
s.even();

System.out.println("eveen");
s.odd();

System.out.println("max "+ s.max());

System.out.println("sum "+ s.sum());

System.out.println(s.search(s.top, 5));

System.out.println("check if the stack at least contain 5 elements ");
System.out.println(s.check());
s.display();

// for(int i = 0; i<=7; i++){
//   System.out.println(s.pop());
// }
// try{
//     System.out.println("peek = "+ s.peek2());
// }catch(IllegalStateException e){
//     System.out.println(e.getMessage());
// }

// s.display();



try{
    System.out.println("peek = "+ s.peek2());
}catch(IllegalStateException e){
    System.out.println(e.getMessage());
}


 } 

}