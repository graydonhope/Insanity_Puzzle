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
* The class IllegalColorException signals that a Color is not a proper color
*/
public class IllegalColorException extends IllegalArgumentException{
	/**
	* Constructs an IllegalColorException wth no message
	*/

	public IllegalColorException(){
		super();
	}

	/**
	* Constructs an IllegalColorException wth a message
	*/
	public IllegalColorException(String message){
		super(message);
	}
}