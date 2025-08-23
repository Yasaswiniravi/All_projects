package oops;
abstract class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
	abstract void sound();
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("sound=barking");
	}
}

public class encapsulation {

	public static void main(String[] args) {
		System.out.println("==Dog===");
		Dog max= new Dog();
		max.eat();
		max.sound();
		
		// TODO Auto-generated method stub

	}

}
