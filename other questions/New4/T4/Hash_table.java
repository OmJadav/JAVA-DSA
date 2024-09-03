
import java.util.*;


public class Hash_table {
    public static void main(String[] args) {
        
        Hashtable <Integer,String> h1=new Hashtable<>();
        h1.put(1,"JAVA");
        h1.put(2, "Python");
        h1.put(3, "C");
        h1.put(4, "C++");
System.out.println("Hash table :"+h1);
System.out.println("Keys of table are::"+h1.keySet());
System.out.println("Value of table are::"+h1.values());
System.out.println("entries of hashTable are : "+h1.entrySet());
System.out.println("");

Hashtable <Integer,String> h2=new Hashtable<>();

h2.putAll(h1);
System.out.println("Hash table"+h2);
System.out.println("removing element 10 :"+ h2.remove(10));
System.out.println("removing element 3 :"+h2.remove(3));
System.out.println("removing element 2 cobol :"+h2.remove(2,"cobol"));
System.out.println("removing element 2 Python :"+h2.remove(2,"Python"));
System.out.println(h2 );
h2.clear();
System.out.println("is h2 empty :"+h2.isEmpty());
System.out.println("Does h1 has key 4 : "+h2.containsKey(4));
System.out.println("Does h1 has key 5 : "+h2.containsKey(5));

    }
    
}
