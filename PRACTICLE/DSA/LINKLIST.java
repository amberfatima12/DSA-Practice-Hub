package PRACTICLE.DSA;
    public class LINKLIST {
        Node head;
        int size;
public static class Node{
int data;
Node next;
Node(int data ){
    this.data=data;
    this.next=null;
}
Node(int data, Node next){
    this.data=data;
    this.next=next;
}}

// size
public int size(){
    if(size==0){
        System.out.println("list is empty ");
        return 0;  
    }
    return size;
}

// first
public Object first(){
if(size==0){
    throw new IllegalStateException("list is empty ");
}
return head.data;
}

// insert
public Node  insert(Node head, int x){
    if(head==null||head.data>x){
        head = new Node(x,head);
        size ++;
        return  head;
     
    }

    Node temp = head;
    while(temp.next!=null){
        if(temp.next.data>x)break;
          temp=temp.next;       
    
    }
    temp.next= new Node(x,temp.next);
      size ++;
    return head;
}


// display
public void display(){
    for(Node i = head; i!=null; i=i.next){
        System.out.print(i.data+ " ");
    }
    System.out.println(" ");
}


//sum
public int sum(){
    int sum=0;
    for(Node i = head; i!=null; i=i.next){
        sum+=i.data;
    }
    return sum;
} 
// count 
public int count(){
int count = 0; 
for(Node i = head; i!=null; i=i.next){
    count ++;
}
return count;
}
// search 
public boolean search(Node head, int x){
    for(Node i = head;i!=null; i = i.next){
if(i.data==x){
    return true;
}
    }
    return false;
}
// delete
public Node delete(Node head, int x){
    if(head==null||head.data>x){
        return head;
    }
    if(head.data==x){
        return head.next;
    }
    for(Node i = head; i.next!=null;i=i.next){
        if(i.next.data>x)break;
        if(i.next.data==x){
         i.next=i.next.next;
            break;}
    }
    return head;

}



// add first
public void addfirst(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        return; 
    }
    newNode.next = head;
    head = newNode;
}

// add last
public void addlast(int data){
    Node newNode= new Node(data);
    if(head==null){
      head = newNode;
        return ;
    }
Node i;
    for( i = head; i.next!=null; i=i.next){

    }
    i.next= newNode;
}

// sulist
public  Node  sublist(Node head, int p, int q){
    if(head==null||p<0||q<p){
        return null;
}
Node newlist=null;
Node temp = head;
int count = 0;

while(temp!=null&&count<=q){
    if(count>=p){
        newlist = insert(newlist, temp.data);
    }
    temp=temp.next;
    count++;
}
return newlist;
}

// split
public static Node[] split(Node head){
    if(head==null){
        return new Node[]{null,null};
    }

    int count= 0;
    Node temp = head;
    while(temp!=null){
        temp= temp.next;
        count++;
    }

    int mid = (count +1)/2;
    Node first = head;
    Node second = head;
    for(int i = 1; i<mid; i++){
        second = second.next;
    }
    Node temp2 = second.next;
    second.next = null;
    second= temp2;

    return new Node[] {first, second};
}





// public static Node[] split(Node head){
//     Node s1= head;
//     Node s2 = head;
//     int count = 0;
//     int mid = (count +1)/2;
//     for(Node i = head; i!=null; i=i.next){
//         if(i<mid){
//             s1.insert(i.data);
           
//         }else{
//             s2.insert(i.data);
//         }
//          count ++;
//     }
//     return new  Node[]{s1,s2};

// }

// merge 
public  Node merge(Node s1, Node s2){
    Node s3= null;
    for(Node i = s1; i!=null; i=i.next){
        s3= insert(s3, i.data);
    }

       for(Node i = s2; i!=null; i=i.next){
        s3= insert(s3, i.data);
    }
    return s3;
}
// replace 
public  static Node replace(Node head, int x, int y){
    if(head==null||head.data>x){
        return head;
    }

    if(head.data==x){
        head.data=y;
        return head;
    }
for(Node i = head; i.next!=null; i=i.next){
    if(i.next.data>x){
        break;
    }
    if(i.next.data==x){
        i.next.data=y;
        break;
    }
}
return head;

}



// max
public int max(){
    int max=(int)head.data;
    Node temp= head;
    while(temp!=null){
        if((int)temp.data>max){
    max= (int)temp.data;
        }
        temp=temp.next;
    }
    return max;
}
// min
public int min(){
    int min=(int)head.data;
    Node temp= head;
    while(temp!=null){
        if((int)temp.data<min){
    min= (int)temp.data;
        }
        temp=temp.next;
    }
    return min;
}



// even
public void even(){
for(Node i = head; i!=null; i=i.next){
if((int)i.data % 2==0){
    System.out.print(i.data+ " ");
}
}

}

// odd
public void odd(){
for(Node i = head; i!=null; i=i.next){
if((int)i.data % 2!=0){
    System.out.print(i.data+" ");
}
}}
// array
public Object[] toArray(){
    Object temp[]=new Object[size];
    int index = 0;
    for(Node i = head; i!=null; i=i.next){
        temp[index]=i.data;
        index ++;
    }
    return temp;
}




// main
    public static void main(String[] args ){
    LINKLIST p = new LINKLIST();


   

for(int i = 0; i<=10; i++){
    p.head= p.insert(p.head, i);
}
p.display();



try{
    System.out.println("First element "+p.first());
}catch(IllegalStateException e){
    System.out.println(e.getMessage());
}
System.out.println("Size of the list "+ p.size());
System.out.println("Sum of all data in the list = "+p.sum());
System.out.println("Size of the list = "+ p.count());

System.out.println("Search for a number = "+ p.search(p.head, 5));


System.out.println("delete element");
p.head=p.delete(p.head, 9);
p.display();

System.out.println("add new node at first ");
p.addfirst(0);
p.display();

System.out.println("add new node at last ");
p.addlast(11);
p.display();

System.out.print("sublist ");
Node sub = p.sublist(p.head, 1, 3);
for(Node i = sub; i!=null; i= i.next){
    System.out.print(i.data+ " ");
}

Node[] parts = split(p.head);
System.out.println("first part ");
for(Node b = parts[0]; b!=null; b=b.next ){
    System.out.print(b.data +" ");
}


System.out.println("second part ");
for(Node b = parts[1]; b!=null; b=b.next ){
    System.out.print(b.data+ " ");
}

Node merged = p.merge(parts[0], parts[1]);
System.out.println("Merged list:");
for(Node i = merged; i != null; i = i.next){
    System.out.print(i.data + " ");
}

System.out.print("replace = ");
p.head = replace(p.head, 5, 7);
p.display();



System.out.println("Maximum number in the list "+ p.max());
System.out.println("Minimum number in the list "+ p.min());
System.out.print("Even numbers = ");
p.even();
System.out.print("Odd numbers = ");
p.odd();

     }}
   