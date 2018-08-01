/*	Student information:
	STUDENT 1:                                    
	Last name: Gagbegnon                                   
	First name: Santos                                       
	Student #: 300010769                                     
	Section: C    

	STUDENT 2:                                               
	Last name: Hope                                          
	First name: Graydon                                      
	Student #: 300045044                                      
	Section: C   
*/       
/** 
*The interface Queue insures the methods that implememnt have all the valid methods of a queue.
*/
public interface Queue<T> {
	void enqueue(T object);
	T dequeue();
	boolean isEmpty();
}