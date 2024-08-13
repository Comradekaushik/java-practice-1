package Classes;

public class Pizza {
    public String bread;
	public String sauce;
	public String cheese;
	public String topping;
	
	public Pizza(){
		
	}
	
	public Pizza(String bread){
		
		this.bread = bread;
	}
	
	public Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	public Pizza(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	public Pizza(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
    public String toString() {
  
        return (bread +"\n"+sauce+"\n"+cheese+"\n"+topping);
        
    } 
    
}
