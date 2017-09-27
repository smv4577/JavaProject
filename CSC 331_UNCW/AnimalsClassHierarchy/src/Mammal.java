
public abstract class Mammal extends Animal {

	private double weight;
	private int lifeSpan;
	private String food;
	
	public void describe() {
		super.describe();
		System.out.println("Have hair!");
	}
	
	public abstract void eat();
	public abstract void makeSound();
	
	public final boolean willDie() {
		return true;
	}
	
}
