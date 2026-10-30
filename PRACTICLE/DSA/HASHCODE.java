package PRACTICLE.DSA; 

public class HASHCODE {
public interface hh{
    public int size();
    public Object put(Object key, Object value);
    public Object get(Object key);
    public Object remove(Object key);
}
public static class hashtable implements hh{
private entry[] entries = new entry[11];
private int size;
private class entry{
    Object key;
    Object value;
    entry(Object key, Object value ){
        this.key=key;
        this.value=value;
    }
}
public int size(){
    return size;
}
public int hash(Object key){
    return (key.hashCode()&0x7FFFFFFF)%entries.length;
}
public Object get(Object key){
    return entries[hash(key)].value;
}
public Object put(Object key, Object value){
   entries [hash(key)]= new entry(key,value);
    // entries[5] = new entry("pak",PAK)
    size ++;
    return null;
}
public Object remove(Object key){
    Object temp = entries[hash(key)].value;
    entries [hash(key)]=null;
   --size;
   return temp;
}
}
public static void main(String[] args){

}
}