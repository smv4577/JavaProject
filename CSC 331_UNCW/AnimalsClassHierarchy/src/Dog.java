
public class Dog extends Mammal implements Pettable {

	
	public void describe() {
		
		System.out.println("Have canine teeth!");
		
	}

	public void rollOver() {
		System.out.println("Rolling over");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat kibbles");
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bark");
		
	}

	@Override
	public String petSound() {
		// TODO Auto-generated method stub
		return "sigh";
	}

	@Override
	public void pettableArea() {
		// TODO Auto-generated method stub
		System.out.println("Ears");
		
	}
	
	
}

