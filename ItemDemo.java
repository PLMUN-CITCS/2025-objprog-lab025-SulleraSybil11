class ItemUtil {  //Class variable shared by all instances
    
    static int objectCount = 0;  //Declaring static variable
    String itemName;  //Declaring instance variable
    
    public ItemUtil(String itemName) {  //Creating a constructor that takes a string parameter
        this.itemName = itemName;
        objectCount++;
    }
     public static void displayObjectCount() {  //Creating a static method
        System.out.println("Total objects created: " + objectCount);  //Printing the declared object
        
}
public void displayItem() {  //Creating an instance method
        System.out.println("Item: " + itemName);  //Printing the declared item
    }
}

public class ItemDemo {  //Creating main method
    public static void main(String[] args) {
       
        ItemUtil item1 = new ItemUtil("Laptop");  //Creating three objects shared by all instances
        ItemUtil item2 = new ItemUtil("Smartphone");
        ItemUtil item3 = new ItemUtil("Tablet");
        
        item1.displayItem();  //Method to call on each of the Item objects
        item2.displayItem();
        item3.displayItem();
        
        ItemUtil.displayObjectCount();  //Method using the class name
    }
}
