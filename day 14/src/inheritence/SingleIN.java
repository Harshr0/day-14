package inheritence;
class Animal{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void bak()
	{
		System.out.println("barking...");
	}
}
public class SingleIN {

	public static void main(String[] args) {
    Dog d = new Dog();
    d.bak();
    d.eat();
    
	}

}
