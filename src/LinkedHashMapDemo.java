import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String args[]){
        //Implementation of the LinkedHashMap
        Map<Integer,String> l=new HashMap<Integer,String>();
        l.put(100,"John");  // Adding Elements
        l.put(101,"Dev");
        l.put(106,"Arya");
        l.put(104,"kasun");
        l.put(109,"kaml");
        l.put(108,"Nimal");
        l.put(111,"try");
        for(Map.Entry m:l.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

