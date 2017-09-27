
public class Test {
	public static void main(String [] args) {
		
		Mammal [] zoo = new Mammal[2];
		//Mammal m = new Mammal();
		
		
		Dog d = new Dog();
		zoo[1] = d;
		
		
		
		PersianCat p = new PersianCat();
		zoo[0] = p;
		
		for(int i=0; i < zoo.length; i++)
			zoo[i].makeSound();
		
		
		if ( zoo[0] instanceof Mammal) {
		Dog x = (Dog)  zoo[0];
		x.rollOver();
		}
		
		Pettable [] a = new Pettable[2];
		a[0] = new Dog();
		a[1] =  new PersianCat();
		
		
		
	}

}
