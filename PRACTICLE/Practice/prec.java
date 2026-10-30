package PRACTICLE.Practice;
public class prec {
    public static class linklist{
     Node head;
        int size;
        public class Node {
         int data;
         Node next;
         Node(int data){
            this.data=data;
            this.next=null;
         }
   Node(int data,Node next){
            this.data=data;
            this.next=next;
         }
        }

        // size
        public int size(){
            if(size==0){
                System.out.println("list is empty ");
            }
            return size;
        }

        // first
        public Object peek(){
            if(size==0){
                throw new IllegalStateException("list is empty ");
            }
            return head.data;
        }
        // insert
        public Node insert(Node head, int x){
            if(head==null||head.data>x){
                head = new Node(x,head);
                size ++;
                return head;
            }
            Node temp=head;
            while (temp.next!=null) {
                if(temp.next.data>x)break;
                    temp=temp.next;
                }
    temp.next=new Node(x,temp.next);
    size++;
             return head;
        }
// display
public void display(){
    for(Node i = head; i!=null; i =i.next){
        System.out.print(i.data+" ");
    }
    System.out.println(" ");
}
// sum
public int sum(){
    int sum = 0;
    for(Node i = head; i!=null; i = i.next){
        sum+=i.data;
    }
    return sum;
}
// count
public int count(){
    int count = 0;
    for(Node i = head; i!=null;i=i.next){
        count ++;
    }
    return count;
}
// search 
public boolean search(int x){
    for(Node i = head; i!=null; i =i.next){
        if(i.data==x){
            return true;
        }
    }
    return false;
}

// delate
public Node remove(Node head, int x){
    if(head==null||head.data>x){
        return head;
    }

    if(head.data==x){
        return head.next;
    }
    Node temp=head;
  for(Node i = head; i!=null; i=i.next){
        if(temp.next.data>x)break;
        if(temp.next.data==x){
        temp.next=temp.next.next;
        break;
    }}
    return head;
}
// add first
public Node addfirst(){
    Node temp = head;
    for(Node i = head; i!=null; i=i.next){
temp.next=head;
    }
    return temp;
}
    }
    public static void main(String[] args){
        linklist ll = new linklist();

        for(int i = 0; i<=10; i++){
            ll.head=ll.insert(ll.head, i);
        }
        ll.display();
        System.out.println("size of elements = "+ll.size());
        System.out.println("count of elements = "+ll.count());
        System.out.println("sum of all elements = "+ll.sum());
try{
    System.out.println("first element "+ll.peek());
}catch(IllegalStateException e){
    System.out.println(e.getMessage());
}

System.out.println("search an element "+ll.search(9));

ll.head= ll.remove(ll.head, 0);
ll.display();
    }
}
