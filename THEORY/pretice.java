package THEORY;

import javax.sound.sampled.SourceDataLine;

public class pretice {
    public class student{
        String rollno;
        String name;
        String dptname;
        String contactnumber;
        student(String rollno, String name,String dptname,String contactnumber){
            this.rollno=rollno;
            this.name=name;
            this.dptname=dptname;
            this.contactnumber=contactnumber;
        }
        public Object[] toArray(){
return new Object[] {rollno,name,dptname,contactnumber} ;    }
    }

    public static class linklist{
Node head;
int size;
public class Node{
    int data;
    Node next;

    Node(int data ){
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

public Node insert(Node head, String x){
    if(head==null||(String)head.data>x){
        head= new Node(x,head);
        size++;
        return head;
    }

    Node temp= head;
    while(temp.next!=null){
        if(temp.next.data>x)break;
        temp=temp.next;
    }
    temp.next=new Node(x,temp.next);
    size++;
    return head;
}

public void display(){
    for(Node i = head; i!=null; i=i.next){
        System.out.print(i.data+ " ");
    }
    System.out.println(" ");
}

public void search(){
if(head.data.equlas("25bs200")){
    System.out.println("found");
}
System.out.println("not found ");
}
System.out.println("notfound");}
    }

public static void main(String[] args){
student[] s = new student[5];
s[0]= new student{"bsai044","amber","ai","20412035615"};
s[1]= new student{"bsai032","amber","ai","20412035615"};
s[2]= new student{"bsai030","amber","ai","20412035615"};
s[3]= new student{"bsai023","amber","ai","20412035615"};
s[4]= new student{"25SW200","amber","ai","20412035615"};


System.out.println(s.search(head,"25SW200"));

linklist l1= new linklist();
linklist l2 = new linklist();

l1.head= l1.insert(l1.head,"file1");
l1.head= l1.insert(l1.head,"file2");
l1.head= l1.insert(l1.head,"file3");
l1.head= l1.insert(l1.head,"file4");
l1.head= l1.insert(l1.head,"file5");

l2.head= l2.insert(l2.head,"100k");
l2.head= l2.insert(l2.head,"100k");
l2.head= l2.insert(l2.head,"100k");
l2.head= l2.insert(l2.head,"100k");
l2.head= l2.insert(l1.head,"100k");

for(int i = 0 ; i<6; i++){
System.out.println(l1.data+" "+l2.data);
}


}
 
}
