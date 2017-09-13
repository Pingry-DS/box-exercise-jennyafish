//The <T> is a generic type
public class Box<T> {

  private T contents;
  private boolean isFull;
  
  /**
   * Make a new empty box
   */
  public Box(){
	  super();
	  this.isFull = false;
  }
  /**
   * Make a new box pre-filled with contents
   * @param t Contents of new box
   */
  public Box(T t){
	  super();
	  contents = t;
	  isFull = true;
  }

  /**
   * Check the contents of the box
   * @return Whatever is in the box
   */
  public T getContents(){
	  return contents;
  }

  /**
   * Tell whether the box is full or not
   * @return true the box is full
   */
  public boolean isFull(){
	  return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   * @return what was in the box
   */
  public T empty(){
	  isFull = false;
	  T save = contents;
	  contents = null;
	  return save;
  }
  
  /**
   * Fills the box
   * @param contents Contents to fill the box with
   * @return if the box was filled successfully
   */
  public boolean fill(T contents){
	  if(!isFull){
		  this.contents = contents;
		  isFull = true;
		  return true;
	  }
	  return false;
  }

  /**
   * Overrides the toString method in Object
   * @return String of contents, else null
   */
  public String toString(){
	  if(isFull)
		return contents.toString();
	  return null;
  }
  
  /**
   * Prints the contents of the box
   */
  public void peek(){
	  System.out.print("        ");
	  System.out.println(contents);
	  System.out.println("   ___________\n  /          /|\n /          / |\n/__________/  |\n|          |  / \n|          | / \n|__________|/ \n");
	  
  }

  /**
   * Main method
   * @param args Command line arguments
   */
  public static void main(String[] args){
	
    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>(5);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box
	stringBox.fill("AAAAA");


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method
	stringBox.peek();
	intBox.peek();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty the boxes
	stringBox.empty();
	intBox.empty();


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
