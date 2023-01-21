
1.                  Iterator

                    Collection

     Set               Queue                List
	*HashSet         *Deque               *ArrayList
	*LinkedHashSet                        *LinkedList
	*Treeset                              *Vector
	                                      *Stack
	
*Itarable is the supermost interface in collection.
*Iterable is extended by the collection interface.

  List
*It allows Duplicate Values.
*Maintains insortional order.
*It is present in java.util package.

  Set
*It Does not allows Duplicate Values.
*It does not maintains insortional order.
*It is present in java.util package.


2.Implementations of Map

             Map
    *HashMap       :It does not maintains insortional order.	 
	*SortedMap     :It Does no maintainsinsortional order.
    *TreeMap       :It maintains acending order.
    *LinkedHashMap :It maintains Insortional order.
	
	
	
3.HashSet
 * Hash set is implemented using HashTable
 *Hash set allows a null object
 *Hash set uses equals method to compare two object
 
 TreeSet
 *The tree set implemented using a tree strucure
 *tree set does not allows the null object
 *tree set uses compare metod for comparing two object
	
4. HashMap is implemented by Map interface.

6. String can be converted by using toChar method.
   it returns character array that is char{}.

13. String Buffer
  * It is thread safe
  * It is Synchronized
  * less efficience compare to string builder
  *it introduced in java 1.0

   String Builder 
 * It is Not thread safe
 * It is not Synchronized
 * It is more efficience compare to stringBuffer
 * It introduced in java 1.5
 
 
 11. the @Componentscan annotation is used to find beans. and injected with @Autowired annotation

 16.
 public class Map{
	 public static void main(String args[]){
		 
		 Map<string,Integer> map=new hashmap();
		 
		 map.put("India",91);
		 map.put("Bangla",54);
		 map.put("Pak", 92);
         map.put("Afgan", 67);
		 map.put("Srilanka",89);
		 
		 map.forEach((n,j)-> System.out.println("Country name:" +n + "code:" + j));
		 
		 Set<Entry<String, Integer>> set = map.entrySet();
		 map.stream().filter(a ->.getKey().equals("Pak")).forEach(a-> System.out.println("Correspond code");
		 
		 Iterator<Entry<String, Integer>> iterator = set.iterator();
		 
		 while(iterator.hasNext()){
			 Entry<String, Integer>  entry= iterator.next();
			 
			 if(entry.getValue().equals(54)){
				 iterator.remove();
				 System.out.println(entry.getKey()+ "..."+ entry.getValue());
			 }
		 }

	 }
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    	
										  