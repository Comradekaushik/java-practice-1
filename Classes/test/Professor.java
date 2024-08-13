
package Classes.test;
import Classes.*;
public class Professor extends Person {
    int Salary = 50000;
    @Override public void Display(){
        System.out.println("person name is " + super.name +" Person salary is " + this.Salary);
         
    }
    public Professor(String name,int Salary){
        super(name);
        this.Salary = Salary;

    }


    
}
