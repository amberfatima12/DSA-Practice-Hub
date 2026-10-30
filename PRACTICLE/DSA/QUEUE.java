package PRACTICLE.DSA;

public class QUEUE {
    public interface queue {
        public int size();

        public void add(Object obj);

        public Object remove();

        public Object first();
    }

    public static class linkedqueue implements queue {

        int size;
        // head ek node ko point karrha hai or uska data null hai
        private Node head = new Node(null);

        public static class Node {
            Object data;
            Node prev = this,
                    next = this;

            Node(Object data) {
                this.data = data;
            }

            Node(Object data, Node prev, Node next) {
                this.data = data;
                this.prev = prev;
                this.next = next;
            }
        }

        // size function
        public int size() {

            if (size == 0) {
                System.out.println("Queue is Empty");
                return 0;
            }

            return size;
        }

        // first element
        public Object first() {

            if (size == 0) {
                throw new IllegalStateException("Queue is empty");
            }

            return head.next.data;
        }

        // add function
        public void add(Object obj) {

            size++;

            head.prev.next = new Node(obj, head.prev, head);

            head.prev = head.prev.next;
        }

        // display
        // public void display(){
        // // kyunk head dumy hai
        // Node temp = head.next;
        // while(temp!=head){
        // System.out.print(temp.data+ " ");
        // temp=temp.next;
        // }
        // System.out.println(" " );
        // }


        
        public String toString() {
            StringBuffer temp = new StringBuffer();
            for (Node i = head.next; i != head; i = i.next) {
                // System.out.println(i.data);
                temp.append(i.data);
                temp.append(" ");
            }
            return temp.toString();
        }

        // remove
        public Object remove() {

            if (size == 0) {
                throw new IllegalStateException("Queue is empty");
            }

            Object temp = head.next.data;
            head.next = head.next.next;
            head.next.prev = head;
            size--;
            return temp;
        }

        // <<<<<<<<<<<<<<<<<<<<

        // public Object[] To_arr(Node head){
        // Object arr = new Object[size];
        // Node p = head.next;
        // }
        // <<<<<<<<<<<<<<<<<<<<<< Equals Method>>>>>>>>>>>>>>>>>>
        public boolean equals(linkedqueue q) {
            if (this.size != q.size) {
                return false;
            }
            Node a = q.head.next;
            for (Node i = head.next; i != head; i = i.next, a = a.next) {
                if (!i.data.equals(a.data)) {
                    return false;
                }
            }
            return true;

        }


        // reverse
// public void  reverse(){
//     Object list[]= new Object[size];
//     Node temp = head.next;

//     for(int i = 0; i<size; i++){
// list[i]=temp.data;
// temp=temp.next;
// }

// for(int i = size-1; i>=0; i--){
// head=new Node(list[i],head.prev,head);
// head.prev=head.prev.next;
// }
// }


public void reverse() {
    Object list[] = new Object[size];
    Node temp = head.next;
    for(int i = 0; i < size; i++) {
        list[i] = temp.data;
        temp = temp.next;
    }

    // Remove existing elements
    head.next = head;
    head.prev = head;

    // Insert elements in reverse order
    for(int i = size-1; i >= 0; i--) {
        Node newest = new Node(list[i], head.prev, head);

        head.prev.next = newest;
        head.prev = newest;
    }
}

// toarray
public Object[] toArray(){
    Object temp[]=new Object[size];
    int index = 0;
    for(Node i = head.next; i!=head; i=i.next){
        temp[index]=i.data;
        index ++;
    }
    return temp;
}

        // <<<<<<<<<<<<<<<<<<<<<<Sublist>>>>>>>>>>>>>>>>
        public Node sublist(Node head, int p, int q) {
            if (head.next == head || p < 0 || q < p) {
                return null;
            }
            Node newhead = new Node(null);
            newhead.prev = newhead;
            newhead.next = newhead;
            int count = 0;
            Node temp = head.next;
            while (temp != head && count <= q) {
                if (count >= p) {
                    newhead.prev.next = new Node(temp.data,
                            newhead.prev,
                            newhead);
                    newhead.prev = newhead.prev.next;
                }
                temp = temp.next;
                count++;
            }
            return newhead;
        }
// <<<<<<<<<,,,,,search<<<<<<<<<<<<<<<<<
        public boolean search(Object obj){
    for(Node i = head.next; i!=head; i = i.next){
        if(i.data.equals(obj)){
            return true;
        }
    }
    return false;
}

// mid
public Object mid(){
    Node temp= head.next;
    for(int i = 0 ; i<size/2; i++){
temp=temp.next;
    }
    return temp.data;
}

// merge
public linkedqueue merge(linkedqueue q1, linkedqueue q2){
    linkedqueue q3=new linkedqueue();
    for(Node i = q1.head.next; i!=q1.head; i=i.next){
q3.add(i.data);
    }
      for(Node i = q2.head.next; i!=q2.head; i=i.next){
q3.add(i.data);
    }
return q3;
}

// recursion 
public void print(Node head){
    if(head==this.head){
        return;
    }
    System.out.println(head.next.data);
print(head.next.next);
}

    }

    public static void main(String[] args) {
        linkedqueue credit = new linkedqueue();
        linkedqueue deb = new linkedqueue();
        linkedqueue qq = new linkedqueue();

        // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<add>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
        // System.out.println("Credit data");
        // for (int i = 0; i <= 10; i++) {
        // credit.add(i);
        // }
        // System.out.println(credit);

        // System.out.println("debt data");
        // for (int i = 11; i <= 20; i++) {
        // deb.add(i);
        // }
        // System.out.println(deb);

        // System.out.println(credit.toString() + deb.toString());

        credit.add(300);
        credit.add(1000);
        credit.add(500);
        credit.add(750);
        credit.add(200);
        deb.add(230);
        deb.add(700);
        deb.add(320);
        deb.add(570);
        deb.add(190);
        System.out.println("Credit: " + credit);
        System.out.println("Debit: " + deb);

        try {
            System.out.println("First Element = " + deb.first());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Size = " + credit.size());
        // <<<<<<<<<<<<<<<<<<<<<<<Remove>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.print("Removed element ");
        System.out.println(credit.remove());

        // for(int i = 0; i<4; i++){
        // deb.remove();
        // }
        // System.out.println(deb);

        // while(credit.size()>0){
        // credit.remove();
        // }
        // System.out.println(credit);

        // System.out.println(" equals  " + credit.equals(deb));

        // System.out.print("sublist ");
        // linkedqueue.Node sub = credit.sublist(credit.head, 1, 2);
        // for (linkedqueue.Node i = sub.next; i != sub; i = i.next) {
        //     System.out.print(i.data + " ");
        // }

 

        // int size = credit.size();
        // int sum_deb = 0, sum_cred = 0;
        // while (size != 0) {
        //     int cred = (int) credit.remove();
        //     sum_cred += cred;
        //     size--;
        // }
        // size = deb.size();
        // while (size != 0) {
        //     int debit = (int) deb.remove();
        //     sum_deb += debit;
        //     size--;
        // }

        // System.out.println("Total Credit: " + sum_cred);
        // System.out.println("Total Debit: " + sum_deb);
        // System.out.println("Balanace: " + (sum_cred - sum_deb));



        int sum_credit = 0;
        for(linkedqueue.Node i = credit.head.next; i!=credit.head; i=i.next){
            sum_credit+=(int)i.data;
        }
System.out.println("sum of credit amount "+sum_credit);

  int sumdeb = 0;
        for(linkedqueue.Node i = deb.head.next; i!=deb.head; i=i.next){
            sumdeb+=(int)i.data;
        }
System.out.println("sum of debt amount "+sumdeb);

int sum = sum_credit-sumdeb;
System.out.println("total of crerdit and debt "+ sum);

System.out.println("middle element"+credit.mid());
System.out.println(credit);


System.out.println("merged");
System.out.println(qq.merge(credit, deb));
System.out.println("onvert to array");
Object [] arr = credit.toArray();
for(Object x: arr){
    System.out.println(x+" ");
}

System.out.println("recursion");
credit.print(credit.head.next);
    }
}
