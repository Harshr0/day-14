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
class Babydog extends Dog{
	void weep() {
		System.out.println("weeping...");
	}
}
public class multilevelIN {

	public static void main(String[] args) {
     Babydog b = new Babydog();
     b.bak();
     b.eat();
     b.weep();
     
	}

}
