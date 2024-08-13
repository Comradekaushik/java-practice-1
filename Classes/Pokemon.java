package Classes;

public class Pokemon {
    
    public String name;
    public int xp;

    public void attack(){
        System.out.println(this.name + " Attacked" + " with " + this.xp + " power .");
    }

    public Pokemon(String name,int xp){
		
		this.name = name;
		this.xp = xp;
		
	}
}
