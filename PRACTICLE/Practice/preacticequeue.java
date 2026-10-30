package PRACTICLE.Practice;
public class preacticequeue {
public interface Innerpreacticequeue {
public int size();
public Object peek();
public Object remove();
public void add(Object obj);
}
public static class Queue implements Innerpreacticequeue{
    Node head= new Node( null);
    int size;
    public class Node{
        Object data;
        Node prev = this,
        next = this;
        Node(Object data){
            this.data=data;
        }
        Node(Object data, Node prev, Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

    // size
    public int size(){
        if(size==0){
            System.out.println("Queue is empty ");
        }
        return size;
    }

    // peek
    public Object peek(){
        if(size==0){
            throw new IllegalStateException("Queue is empty ");
        }
        return head.next.data;
    }

    // add
    public void add(Object obj){
        size++;
        head.prev.next = new Node(obj, head.prev, head);
        head.prev=head.prev.next;
    }

    // remove
    public Object remove(){
            if(size==0){
            throw new IllegalStateException("Queue is empty ");
        }
        Node temp = head.next;
        head.next=head.next.next;
        head.prev.next=head;
        size--;
        return temp.data;
    }

    // display
    public String toString(){
        StringBuffer temp=new StringBuffer();
        for(Node i =head.next; i!=head; i=i.next){
            temp.append(i.data);
            temp.append(" ");
        }
        return temp.toString();
    }

    // equals
    public boolean equals(Queue q){
        if(this.size!=q.size){
            return false;
        }
        Node temp = q.head.next;
        for(Node i = head.next; i!=head; i = i.next, temp=temp.next){
            if(!i.data.equals(temp.data)){
                return false;
            }
        }
        return true;
    }

    // sublist
    public Node sublist(Node head, int p, int q){
        if(head.next==head||p<0||q<p){
            return null;
        }

        Node newqueue = new Node(null);
newqueue.prev= newqueue;
newqueue.next = newqueue;
Node temp = head.next;

int count = 0;

while(temp!=head&&count<=q){
    if(count>=p){
        newqueue.prev.next = new Node(temp.data, newqueue.prev,newqueue);
        newqueue.prev=newqueue.prev.next;
    }
    temp=temp.next;
        count++;
}
    return newqueue;
    }

    // copy 
public Queue copy1(){
Queue qq = new Queue();
int count =0;
    for(Node i = head.next; i!=head; i=i.next){
    if(count==1){
        qq.add(i.data);  
    }
        count ++;
    }
    return qq;
}

public Queue copy2(){
Queue qq = new Queue();
    for(Node i = head.next; i!=head; i=i.next){

          qq.add(i.data);  
    }
    return qq;
}

public String reverse(){
    StringBuffer temp = new StringBuffer();

    for(Node i = head.prev; i != head; i = i.prev){
        temp.append(i.data);
        temp.append(" ");
    }

    return temp.toString();
}

public Object[] toArray(){
            Object temp[]=new Object[size];
            int index = 0;
        for(Node i =head.next; i!=head; i=i.next){
        temp[index] = i.data;
index++;
        }
        return temp;
}

}

    public static void main(String[] args){
        Queue credit = new Queue();
        Queue debt = new Queue();
Queue q1 = new Queue();
Queue q2 = new Queue();
Queue q3 = new Queue();

q1.add("train 1");
q1.add("train 2");
q1.add("train 3");
System.out.println(q1);



q2.add("first");
q2.add("second");
q2.add("third");
System.out.println(q2);


q3.add("KHI TO RWP");
q3.add("HYD TO SUK");
q3.add("LHR TO PHR");
System.out.println(q3);

System.out.println(q1.size());
System.out.println(q2.size());
System.out.println(q3.size());

System.out.println("reverseeeeeeeeee");
System.out.println(q1.reverse());




        for(int i = 1; i<=10; i++){
            credit.add(i);
        }
System.out.println("Credit "+ credit);


        for(int i = 11; i<=20; i++){
            debt.add(i);
        }
System.out.println("debt "+ debt);

System.out.println("size = "+ credit.size());
try{
    System.out.println("debt peek element = "+ debt.peek());
}catch(IllegalStateException e){
    System.out.println(e.getMessage());
}

  System.out.println(credit.equals(debt));   


System.out.println(credit.remove());
System.out.println(credit);

System.out.println("sulist");
Queue.Node sub = credit.sublist(credit.head, 1, 3);
for(Queue.Node i =sub.next; i!=sub; i = i.next ){
    System.out.println(i.data);
}
System.out.println(credit);





int sum= 0; 
for(Queue.Node i =credit.head.next; i!=credit.head; i = i.next){
sum+=(int)i.data;
}
System.out.println(sum);

Queue cc = q1.copy1();
System.out.println(cc);
Queue cl =q1.copy2();
System.out.println(cl);






System.out.println("arrayaaaaaaa");
Object[] arr = q1.toArray();

for(Object i : arr){
    System.out.print(i + " ");
}
    }

}
