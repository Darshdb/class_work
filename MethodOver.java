class Animal{
	public void eat(){
		System.out.println("i can eat");
	}
}
class Dog extends Animal{
	@Override				//@Override is keyword for use of method overriding 
	public void eat(){
		super.eat();			//for call base class method
		System.out.println("i eat dog food");	
	}
	public void bark(){
		System.out.println("i can bark");
	}
}
class MethodOver{
	public static void main(String[]args)
	{
		Dog dg=new Dog();			//create object of sub class
		dg.eat();						//call the eat method from the sub class object
		dg.bark();
	}
}	