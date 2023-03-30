package arraylist;

/**
 * The purpose of this class is to efficiently implement a list of different objects from other classes.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Lab 3
 * Spring 2023
 */

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  /*
   *  The addItem method returns false if currentItem is >= the length of the arList array.
   *  The method returns true if the currentItem was added.
   */
  
  public boolean addItem(T item) {
	  
	  if(currentItem >= arList.length) {
		  return false;
	  }//end if
	  arList[currentItem] = item;
	  currentItem++;
		  return true;
	  
  }//end addItem
  
  /*
   * The toString method uses StringBuilder to iterate through the arList array.
   * @return sb.toString()
   */
  
  public String toString() {
	  StringBuilder sb = new StringBuilder();
	  
	  for(int i = 0; i < currentItem; i++) {
		  sb.append(arList[i]);
		  sb.append("\n");
	  }//end for loop
	  
	  return sb.toString();
	  
  }//end toString
}//end class