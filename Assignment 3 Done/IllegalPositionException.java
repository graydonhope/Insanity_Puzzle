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
* The class IllegalPositionException signals that a Color is not a proper color
*/
public class IllegalPositionException extends IllegalArgumentException{

	/**
	* Constructs an IllegalPositionException with no message
	*/
	public IllegalPositionException(){
		super();
	}
	/**
	* Constructs an IllegalPositionException with a message
	*/

	public IllegalPositionException(String message){
		super(message);
	}
}