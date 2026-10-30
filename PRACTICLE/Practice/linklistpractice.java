package PRACTICLE.Practice;
class linklistpractice{
      Node head;
      int size;
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
// size
public int size(){
    if(size==0){
        System.out.println("list is empty ");
    }
    return size;
}
// first
public Object first(){
    if(size==0){
        throw new IllegalStateException("List is empty");
    }
    return head.data;
}
// insert
public Node insert(Node head, int x){
    if(head==null||head.data>x){
         head = new Node(x,head);
        return head;
    }
    Node temp = head;
    while(temp.next!=null){
        if(temp.next.data>x){
            break;
        }
          temp=temp.next;
      
    }
      temp.next=new Node(x,temp.next);
      size++;
    return head;
}
// display
public void display(){
    for(Node i = head;i!=null; i= i.next){
        System.out.print(i.data+ " ");
    }
    System.out.println();
}

// sum
public int sum(){
    int sum = 0;
    for(Node i = head; i!=null; i=i.next){
        sum+=i.data;
    }
    return sum;
}
// count
public int count(){
    int count = 0;
  for(Node i = head; i!=null; i=i.next){
        count++;
    }
    return count;
}
// search 
public boolean search(Node head, int x){
   for(Node i = head; i!=null; i=i.next){
        if(i.data==x){
            return true;
        }
    }
    return false;
}
public int max(){
    int max = head.data;
     for(Node i = head; i!=null; i=i.next){
        if(i.data>max){
            max=i.data;
        }
     }
     return max;
}
// min
public int min(){
    int min = head.data;
     for(Node i = head; i!=null; i=i.next){
        if(i.data<min){
            min=i.data;
        }
    }
            return min;

}

// even
public void even(){
       for(Node i = head; i!=null; i=i.next){
        if(i.data%2==0){
            System.out.print(i.data+ " ");
        }
    }}

    public void odd(){
       for(Node i = head; i!=null; i=i.next){
        if(i.data%2!=0){
            System.out.print(i.data+ " ");
        }
    }}

    // delete
    public Node delete(Node head, int x){
          if(head==null||head.data>x){
        return head;
    } 
    if(head.data==x){
head = head.next;
    }
    Node temp=head;
    while(temp.next!=null){
        if(temp.next.data>x)break;
        if(temp.next.data==x){
            head= temp.next.next;
            temp=temp.next;
        }
    }
    return head;
    }
    // addfirst
    public Node addirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            return head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    // add last
    public Node addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            return head;
        }
        Node i;
        for( i = head; i.next!=null; i=i.next){

        }
i.next=newnode;
return head;
    }

    // sublist
    public  Node sulist(Node head,int p, int q){
if(head==null||p<0||q<p){
    return null;
}
int count = 0;
Node temp =head;
Node newnode=null;
while(temp!=null&&count<=q){
    if(count>=p){
newnode=insert(newnode,temp.data);
    }
    count ++;
    temp=temp.next;
}
return newnode;
    }

    // split
    public static Node[] split(Node head){
        if(head==null){
            return new Node[]{null,null};
        }
        int count = 0;
        for(Node i = head; i!=null; i=i.next){
            count++;
        }
        int mid=(count+1)/2;
        Node first = head;
        Node second = head;
        for(int i = 1; i<mid; i++){
            second = second.next;
        }
        Node temp2=second.next;
        second.next=null;
second =temp2;
return new Node[]{first,second};
    }


    // mege
    public Node merge(Node s1, Node s2){
        Node s3 = null;
for(Node i = s1; i!=null; i= i.next){
    s3=insert(s3, i.data);
}
for(Node i = s2; i!=null; i= i.next){
    s3=insert(s3, i.data);
}
return s3;
    }

    // replace 
    public static Node replace(Node head, int x, int y){
        if(head==null||head.data>x){
        return head;
        }
        if(head.data==x){
            head.data=y;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data>x){
                break;
            }
            if(temp.next.data==x){
                temp.next.data=y;
            }
            temp=temp.next;
        }
        return head;
    }
public static void main(String[] args){
linklistpractice ll = new linklistpractice();
for(int i = 0; i<=10; i++){
    ll.head=ll.insert(ll.head,i);
}
ll.display();
    System.out.println("Size of the list = "+ ll.size());
    System.out.println("first element = "+ ll.first());
    System.out.println("Sum of all elements = "+ ll.sum());
    System.out.println("count of the list  = "+ ll.count());
    System.out.println("search for a list  = "+ ll.search(ll.head,7));
    System.out.println("maximum number of the list  = "+ ll.max());
    System.out.println("maximum number of the list  = "+ ll.min());
ll.even();
ll.odd();

System.out.println(ll.head= ll.delete(ll.head, 0));
ll.display();

System.out.println("add first element");
ll.addirst(8);
ll.display();

System.out.println("add last element");
ll.addlast(8);
ll.display();

System.out.println("sublist");
Node sub = ll.sulist(ll.head, 0, 3);
for(Node i = sub; i!=null; i=i.next){
    System.out.println(i.data);
}


Node[] parts = split(ll.head);
System.out.print("First part  ");
for(Node i =parts[0]; i!=null; i=i.next){
    System.out.print(i.data);
}
System.out.print("second part  ");

for(Node i =parts[1]; i!=null; i=i.next){
    System.out.print(i.data);
}

Node merged=ll.merge(parts[0], parts[1]);
for(Node i = merged; i!=null; i=i.next){
    System.out.println(i.data);
}

ll.head=replace(ll.head, 3, 4);
ll.display();




    }}