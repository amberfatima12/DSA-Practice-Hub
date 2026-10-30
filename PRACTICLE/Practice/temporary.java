package PRACTICLE.Practice;

// public class temporary {

//     public static class test{
//         String book_name;
//         int book_pages;
//         String writer_name;
//         float size;

//         test( String book_name, int book_pages, String writer_name,float size){
//             this.book_name=book_name;
//             this.book_pages=book_pages;
//             this.writer_name=writer_name;
//             this.size=size;
//         }
// public String toString(){
// return book_name+" "+book_pages+" "+writer_name+" " + size;
// }



//     }
//        public interface Innerpreacticstack{
//         public int size();
//         public void push(Object obj);
//         public Object pop();
//         public Object peek();
//        }
//     public static class stack implements Innerpreacticstack{
//     Node top;
//     int size;
//     public class Node{
//         Object data;
//         Node next;
//         Node(Object data){
//             this.data=data;
//             this.next=null;
//         }
//           Node(Object data,Node next){
//             this.data=data;
//             this.next=next;
//         }
//     }

//     // size
//     public int size(){
//         if(size==0){
//             System.out.println("stack is empty");
//         }
//         return size;
//     }

//     // insert
//     public  void push(Object obj){
//         top=new Node(obj,top);
//         size++;
//     }
//     // display
//     public void display(){
//         for(Node i = top; i!=null; i=i.next){
//             System.out.print(i.data+" ");
//         }
//         System.out.println(" ");
//     }

//     // merge
// public stack merge(stack s1, stack s2){
//     stack s3 = new stack();
//     for(Node i = s1.top; i!=null; i=i.next){
// s3.push(i.data);
//     }
//        for(Node i = s2.top; i!=null; i=i.next){
// s3.push(i.data);
//     }
//     return s3;
// }

//     // bottom
//     public Object bottom(){
//         Node temp = top;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         return temp.data;
//     }

//     // peek
//     public Object peek(){
//                    if(size==0){
// throw new IllegalStateException("stack is empty")   ;     
// }
// return top.data;
//     }
//     // pop
//    public Object pop(){

//             if(size==0){
// throw new IllegalStateException("stack is empty")   ;     
// }
//         Node temp = top;
//         top = top.next;
// size--;
//         return temp.data;
//     }
    
//     // find
// public void find(){
//     int count = 0; 
//     Node prev  = null;
//     for(Node i = top; i!=null;i = i.next){
//         if(count == 8){
//             prev.next=i.next;
//             size--;
//             break;
//         }
//         prev=i;
//         count ++;
//     }
// }

// public boolean equals(stack ls){
//     if(this.size!=ls.size){
//         return false;
//     }

//     Node temp = ls.top;
//     for(Node i = top; i!=null; i= i.next, temp=temp.next){
//         if(!i.data.equals(temp.data)){
//             return false;
//         }
//     }
//     return true;
// }
// }
//    public static void main(String[] args){
//     stack s = new stack();
//         stack ss = new stack();
//         // test b1 = new test("hello", 100, "fatima", 3.76f);
//         // test b2 = new test("hello", 100, "fatima", 3.76f);
//         // test b3 = new test("hello", 100, "fatima", 3.76f);


//   s.push(10);
//   s.push(20);
//   s.push(30);
//     s.display();

//     ss.push(40);
//     ss.push(50);
//     ss.push(60);

//     ss.display();


// s.find();
// s.display();

// System.out.println(s.equals(ss));
// stack sss = new stack();
//  sss=sss.merge(ss, s);
// sss.display();
//    } 
// }







// package PRACTICLE.Practice;
// import java.util.Arrays;

// class temporary{
//     public interface Innertemporary {
//     public int size();
//     public void add(Object obj);
//     // public Object remove();
//     // public Object peek();   
//     }
//     public static class Queue implements Innertemporary{
//         int size;
//         Node head = new Node(null);
//     public class Node{
// Object data;
// Node prev = this,
// next=this;

// Node(Object data){
//     this.data=data;
// }
// Node(Object data,Node prev, Node next){
//     this.data=data;
//     this.prev=prev;
//     this.next=next;
// }
//     }

//     // size
//     public int size(){
//     return size;
//     }
// // add
//     public void add(Object obj){
//         size++;
//         head.prev.next= new Node(obj,head.prev,head);
//       head.prev=head.prev.next;
//     }

// // display
// public String toString(){
//     StringBuffer temp = new StringBuffer();
//     for(Node i = head.next;i!=head; i=i.next){
//         temp.append(i.data);
//         temp.append(" ");
//     }
//     return temp.toString();
// }

// // reverse
// public void  reverse(){
//     Object list[]= new Object[size];
//     Node temp = head.next;

//     for(int i = 0; i<size; i++){
// list[i]=temp.data;
// temp=temp.next;
// }

// for(int i = size-1; i>=0; i--){
//   System.out.print(list[i] + " ");
// }
// System.out.println();
// }

// // searh
// public boolean search(Object obj){
//     for(Node i = head.next; i!=head; i = i.next){
//         if(i.data.equals(obj)){
//             return true;
//         }
//     }
//     return false;
// }
// // array
// public Object[] toArray(){
//     Object temp[] = new Object[size];
//     int index=0;
//     for(Node i = head.next; i!=head; i=i.next){
//         temp[index]=i.data;
//         index ++;
//     }
//     return temp;
// }

// public static void main(String[] args){
//     Queue q = new Queue();
//     q.add("Oject 1");
//     q.add("Oject 2");
//     q.add("Oject 3");
//     q.add("Oject 4");

//     System.out.println(q);

// q.reverse();
// System.out.println(q);

// System.out.println(q.search("Oject 3"));

// System.out.println(Arrays.toString(q.toArray()));
// }
//     }
// }











// package PRACTICLE.Practice;

// public class temporary{
//       Node head;
//         int size;
// public static class Node{
// Object data;
// Node next;
// Node(Object data ){
//     this.data=data;
//     this.next=null;
// }
// Node(Object data, Node next){
//     this.data=data;
//     this.next=next;
// }}

// // size
// public int size(){
//     if(size==0){
//         System.out.println("list is empty ");
//         return 0;  
//     }
//     return size;
// }


// public Node  insert(Node head, String x){
//     if(head==null||head.data.equals(x)){
//         head = new Node(x,head);
//         size++;
//      return head;
//     }

//     Node temp = head;
//     while(temp.next!=null){
//         if(temp.next.data.equals(x))break;
//           temp=temp.next;       
    
//     }
//     temp.next= new Node(x,temp.next);
//       size ++;
//     return head;
// }
// // display
// public void display(){
//     for(Node i = head; i!=null; i=i.next){
//         System.out.print(i.data+ " ");
//     }
//     System.out.println(" ");
// }

// // search 
// public boolean search(String x){
//     for(Node i = head; i!=null; i=i.next){
//         if(i.data.equals(x)){
//             return true;
//         }
//     }
//     return false;
// }
// public static void main(String[] args){
//     temporary s1 = new temporary();
//     temporary s2 = new temporary();

//     s1.head= s1.insert(s1.head, "biscuit");
//     s1.head= s1.insert(s1.head, "patties");
//     s1.head= s1.insert(s1.head, "samosa");
//     s1.head= s1.insert(s1.head, "sandwich");
//     s1.head= s1.insert(s1.head, "read");

//     s1.display();


//     s2.head= s2.insert(s2.head, "bis");
//     s2.head= s2.insert(s2.head, "pat");
//     s2.head= s2.insert(s2.head, "sam");
//     s2.head= s2.insert(s2.head, "sand");
//     s2.head= s2.insert(s2.head, "re");

//     s2.display();

//     System.out.println(s1.search("biscuit"));

// }

// }






// package PRACTICLE.DSA;

// public class TollQuestion {

//     // Vehicle class
//     public static class Vehicle {
//         String type;
//         String number_plate;

//         Vehicle(String type, String number_plate) {
//             this.type = type;
//             this.number_plate = number_plate;
//         }

//         public String toString() {
//             return type + " - " + number_plate;
//         }
//     }


//     // FIFO Queue
//     public static class FIFO {

//         private Node head = new Node(null);
//         private int size;

//         public static class Node {
//             Object data;
//             Node prev;
//             Node next;

//             Node(Object data) {
//                 this.data = data;
//                 this.prev = this;
//                 this.next = this;
//             }

//             Node(Object data, Node prev, Node next) {
//                 this.data = data;
//                 this.prev = prev;
//                 this.next = next;
//             }
//         }


//         // Add at rear
//         public void add(Object obj) {
//             head.prev.next = new Node(obj, head.prev, head);
//             head.prev = head.prev.next;
//             size++;
//         }


//         // Display
//         public void display() {
//             for (Node i = head.next; i != head; i = i.next) {
//                 System.out.println(i.data);
//             }
//         }


//         // 1st position
//         public Object firstPosition() {
//             return head.next.data;
//         }


//         // 7th position
//         public Object seventhPosition() {
//             Node temp = head.next;

//             for (int i = 1; i < 7; i++) {
//                 temp = temp.next;
//             }

//             return temp.data;
//         }


//         // Print in reverse order
//         public void printInReverseOrder() {
//             for (Node i = head.prev; i != head; i = i.prev) {
//                 System.out.println(i.data);
//             }
//         }
//     }


//     public static void main(String[] args) {

//         // FIFO named v_Crossing_Toll
//         FIFO v_Crossing_Toll = new FIFO();

//         // Store 10 vehicles
//         v_Crossing_Toll.add(new Vehicle("Car", "ABC-101"));
//         v_Crossing_Toll.add(new Vehicle("Bus", "ABC-102"));
//         v_Crossing_Toll.add(new Vehicle("Truck", "ABC-103"));
//         v_Crossing_Toll.add(new Vehicle("Car", "ABC-104"));
//         v_Crossing_Toll.add(new Vehicle("Bike", "ABC-105"));
//         v_Crossing_Toll.add(new Vehicle("Van", "ABC-106"));
//         v_Crossing_Toll.add(new Vehicle("Car", "ABC-107"));
//         v_Crossing_Toll.add(new Vehicle("Truck", "ABC-108"));
//         v_Crossing_Toll.add(new Vehicle("Bus", "ABC-109"));
//         v_Crossing_Toll.add(new Vehicle("Car", "ABC-110"));


//         // 1st vehicle
//         System.out.println("Vehicle at 1st position:");
//         System.out.println(v_Crossing_Toll.firstPosition());


//         // 7th vehicle
//         System.out.println("\nVehicle at 7th position:");
//         System.out.println(v_Crossing_Toll.seventhPosition());


//         // Reverse order
//         System.out.println("\nVehicles in reverse order:");
//         v_Crossing_Toll.printInReverseOrder();
//     }
// }


