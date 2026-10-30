// package THEORY;
// // kisi bhi stack mn kiis bhi index pe koi hi value find karsakhte hn
// public Object toget(int n){
//     int index = head.next -(n-1);
//     if(size>0){
//         return null;
//     }
//     return data[index];
// }




// Delete 3rd element from the bottom of LIFO if it exists. 
// public void delete(){
//     stack temp = new stack();
//     for(int i = 0; i<size-3; i++){
//         temp.push(pop());
//     }
//     pop();
//     while(temp.size()>0){
//         push(temp.pop());
//     }
// }



// kisi hi index se koi value lena
// public Object toget(int n){
//     int index = top-(n-1);
//     if(size>0){
//         return null;
//     }
//     return data[index];
// }



// kisi hi index se koi value lena queue k lie
// public Object toget(int n){
//     int index = head.next;
//     Node temp= head.next;
//     for(int i = 1; i<n; i++){
//       temp = temp.next;
//     }
//     return temmp.data;
// }




// kisi bhi position se agar koi value nikalni ho tou
// public void search(String plate){
//     int position = 1; 
//     Node temp = head.next;
// while(temp!=null){
//   if(temp.data.equals(plate)){
//     System.out.println(position);
//   }
//   temp=temp.next;
//   position ++;
// }
// System.out.println("not found");
// }





// // peek2
//     public Object peek2(){
//         if(size==0){
//             throw new IllegalStateException("Stack is empty");
//         }
// stack temp = new stack();
//  for(Node i = top; i!=null; i= i.next){
//    temp.push(i.data);
//       }
// while(ll.size<=8){
// ll.pop();
    
//       }
//  ll.pop();          // 0 remove
//     return ll.peek();
//     }





// public Object[] ToArray(){
//     Object[] temp = new Object[size];
//     int index= 0;
//     for(Node i = top; i!=null; i = i.next){
//         temp[index]=i.data;
//         index ++;
//     }
//     return temp;
// }







// reverse with Queue
// public void reverse(){
//     Object list[] =new Object[size];
//     Node temp=head.next;
//     for(int i = 0;i<size;i++){
//         list[i]=temp.data;
//         temp=temp.next;
//     }
// for(int i = size-1; i>=0; i--){
//     head = new Node(list[i],head.prev,head);
//     head.prev=head.prev.next;
// }
// }







// public void reverse(){
//     Object list[] = new Object[size];
//     Node temp = top;

//     for(int i=0; i<size; i++){
//         list[i]=temp.data;
//         temp=temp.next;
//     }
//     top=null;
//       for(int i=0; i<size; i++){
//         top=new Node(list[i],top);
//     }
// }




package THEORY;
public  class sorting{
    public interface queue{
        pulic 
    }
}

