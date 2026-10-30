package PRACTICLE.DSA;



public class STACK {
    public interface stack{
        public int size();
        public void push(Object obj);
        public Object pop();
        public Object peek();
    }
    public static class ll implements stack{
        private int size;
        private Node top;
        class Node{
            Object data;
            Node next;   
            
            // constructor
            Node(Object data){
                this.data=data;
                this.next=null;
            }
            // constructor 2 
              Node(Object data, Node next){
                this.data=data;
                this.next=next;
            }
        }

        // size function
        public int size(){
            // if(size==0){
            //     System.out.println("Stack is empty ");
            //     return 0;
            // }
            return size;
        }

        // peek function
        public Object peek(){
            if(size==0){
                throw new IllegalStateException("Stack is empty ");
            }
            return top.data;
        }

        // push function
        public void push(Object obj){
             top = new Node(obj, top);
            size++;
        }

        // display Function
        public void display(){
            Node temp = top;
            while(temp!=null){
           System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println(" ");
        }

        // pop Function
        public Object pop(){
            if(size==0){
                throw new IllegalStateException("Stack is empty ");
            }
      Node temp = top;
            top=top.next;
               size--;
               return temp.data;
              
        }
// Middle function
 public Object mid(){
    Node temp = top;
    for(int i = 0; i<size/2; i++){
        temp=temp.next;
    }
    return temp.data;
 }

 public Object getMiddle(){
    int count = 0; 
    Node temp = top;
    if(count<size/2){
        count ++;
    }
    return temp.data;
 }

// Bottom element
public Object bottom(){
    Node temp = top;
    while(temp.next!=null){
        temp=temp.next;
    }
          return temp.data;

   
}

// reverse stack
public void reverse(){
    Object list[] = new Object[size];
    Node temp = top;

    for(int i=0; i<size; i++){
        list[i]=temp.data;
        temp=temp.next;
    }
    top=null;
      for(int i=0; i<size; i++){
        top=new Node(list[i],top);
    }
}

// copy function 
public ll copy(){
    ll ls = new ll();
    ll tempStack = new ll();

    for(Node i = top; i != null; i = i.next){
        tempStack.push(i.data);
    }

    while(tempStack.size > 0){
        ls.push(tempStack.pop());
    }

    return ls;
}


// split Function
public ll[] split(){
    ll s1= new ll();
    ll s2 = new ll();
    int count = 0;
    for(Node i = top; i!=null; i=i.next){
        if(count<size/2){
            s1.push(i.data);
           
        }else{
            s2.push(i.data);
        }
         count ++;
    }
    return new  ll[]{s1,s2};

}

// Equal Function
public boolean equals(ll ls){
    if(this.size!=ls.size)
        return false;
    
    Node q = ls.top;
    for(Node i=top; i!=null; i=i.next, q=q.next){
        if(!i.data.equals(q.data))
        return false;
    }
    return true;
}

// ToArray String Function
public Object[] convert(){
    Object a[] = new Object[size];
    Node temp = top;
    for(int i = 0; i<size; i++){
        a[i]=temp.data;
        temp=temp.next;
    }

    // int index= 0;
    // for(Node i = top; i!=null; i=i.next){
    //     a[index]=i.data;
    //     index++;
    // }
    // if we don't want to create temp Node
    return a;
}

// StringBuffer
public String toString(){
    StringBuffer temp = new StringBuffer();
    // temp.append("Rajper");
    // temp.append("fatima");
    // System.out.println(temp);
    for(Node i = top; i!=null; i=i.next){
        // System.out.println(i.data);
         temp.append(i.data);
    }
    return temp.toString();
}

// merge
    public ll merge(Node s1, Node s2){
        ll s3 = new ll();
        for(Node i = s1; i!=null; i=i.next){
s3.push(i.data);
        }

          for(Node i = s2; i!=null; i=i.next){
s3.push(i.data);
        }
    return s3;
    }





    // delete 3rd element from bottom


public void delete(){
    ll temp = new ll();
    for(int i = 0; i<size-3; i++){
        temp.push(pop());
    }
    pop();
    while(temp.size()>0){
        push(temp.pop());
    }
}

    

// public Object get(int n){
//     int index = top-(n-1);
//     if(index>0){
//         return null;
//     }
//     return data[index];
//         }}

// recursion
public void print(Node top){
    if(top==null){
        return;
    }
    System.out.println(top.data);
    print(top.next);
}
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<=========Main METHOD=======>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
    public static void main(String[] args ){
        ll stack = new ll();

        for(int i = 0; i<=10; i++){
            stack.push(i);
        }
stack.display();

try{
    System.out.println("Peek element = " + stack.peek());
}catch(IllegalStateException e){
    System.out.println(e.getMessage());
}


Object[] arr = stack.convert();
System.out.println("Array Stack");
for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]+ " ");
}
System.out.println(" ");

System.out.println("Copy stack");
ll copyStack = stack.copy();
copyStack.display();

System.out.println("Split stack");
ll[] splitstack = stack.split();
ll s1 = splitstack[0];
ll s2 = splitstack[1];

s1.display();
s2.display();
 System.out.println(" equals  "+ s1.equals(s2));

System.out.println(" Buffer "+stack.toString());
System.out.println("Size of the Stack = " + stack.size());
System.out.println("Mid Element = " + stack.mid());
System.out.println("Bottom Element = " + stack.bottom());
System.out.println("Removed Element = " + stack.pop());
System.out.println("Mid Element = " + stack.mid());
stack.reverse();
stack.display();
System.out.println("delete 3rd element from ottom");
stack.display();
stack.delete();
stack.display();
System.out.println("recursion ");
 stack.print(stack.top);
    
}}}


