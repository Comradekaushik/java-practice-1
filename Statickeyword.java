
// import Classes.*;
import Classes.test.*;
public class Statickeyword {
    // static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member.. Every member will have the same value of Static Member
        // but don't use it in a static way like acessing with the help of objects
    public static void main(String[] args){
        friend friend1 = new friend("Sponegbob");
		friend friend2 = new friend("Patrick");
		friend friend3 = new friend("Patrick");
		
		System.out.println(friend.numberOfFriends);
    } 
}
