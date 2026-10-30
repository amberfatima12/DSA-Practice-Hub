
package PRACTICLE.DSA;

public class hashpractice {
    public static class country{
    String name;
int population;
String lang;
    country( String name, int population, String lang){
        this.name = name;
        this.population=population;
        this.lang=lang;
    }
  public String toString(){
        return name+" " + population +" "+ lang;
    }
}


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
    // java will generate hash code for every code
    return (key.hashCode()&0x7FFFFFFF)%entries.length;
}
// public Object get(Object key){
//     return entries[hash(key)].value;
// }
// public Object put(Object key, Object value){
//     entries [hash(key)]=new entry(key,value);
//     size ++;
//     return null;
// }

// LINEAR PROBING put
// public Object put(Object key, Object value){
//     int h = hash(key);
//     for(int i = 0; i<entries.length; i++){
//         int j = (h+i)% entries.length;
    
//     entry entry = entries[j];
//     if(entry == null){
//         entries[j] = new entry(key,value);
//         ++size;
//         return null;
//         }}
//     throw new IllegalStateException("table full");
// }


// QUADDRATIC PROBING PUT
public Object put(Object key, Object value){
    int h = hash(key);
    for(int i = 0; i<entries.length; i++){
        int j = (h+i*i)% entries.length;
    
    entry entry = entries[j];
    if(entry == null){
        entries[j] = new entry(key,value);
        ++size;
        return null;
        }}
    throw new IllegalStateException("table full");
}

// remove
public Object remove(Object key){
    Object temp = entries[hash(key)].value;
    entries [hash(key)]=null;
   --size;
   return temp;
}



// get

public Object get(Object key){
    int h = hash(key);
    for(int i = 0; i<entries.length; i++){
        int j = (h+i*i)% entries.length;
    
    entry entry = entries[j];
    if(entry == null)
        return null;
             if(entries[j].key.equals(key))
            return entries[j].value;
        }
   return null;
}

    }
public static void main(String[] args){
country Af = new country("Afghanistan", 296734789 , "urdu");
country ML = new country("MALAYSIA", 2346999 , "HINDI");
country IR = new country("IRAN", 233482799 , "PERSIAN");
country IQ = new country("IRAQ", 29183999 , "ARABIC");
country PAK = new country("PAKISTAN", 299247824 , "urdu");
hashtable hp = new hashtable();
hp.put("PAK", PAK );
hp.put("afgh", Af);
hp.put("mal", ML);
hp.put("IRAQ", IQ);
hp.put("IRAN", IR);

System.out.println(hp.get("PAK"));
System.out.println(hp.get("afgh"));
System.out.println(hp.get("mal"));
System.out.println(hp.get("IRAQ"));
System.out.println(hp.get("IRAN"));


}
}