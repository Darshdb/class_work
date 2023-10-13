/*Q36-WAP to get car details from the  user.Here properties to display are  brand,modelname,topspeed  and write corresponding getters and setters
Atleast two car details should be visible.*/

class Car{
	private String brand,modname;
	private int topspeed;


	//getter method
	public String getBrand(){
	return brand;
	}
	//setter method
	public void setBrand(String brand){
	this.brand=brand;
	}
	public int getTopspeed(){
	return topspeed;
	}
	public void setTopspeed(int topspeed){
	this.topspeed=topspeed;
	}
	public String getModname(){
	return modname;
	}
	public void setModname(String Modname){
	this.modname=modname;
	}
}

class Car1{
	private String brand,modname;
	private int topspeed;


	//getter method
	public String getBrand(){
	return brand;
	}
	//setter method
	public void setBrand(String brand){
	this.brand=brand;
	}
	public int getTopspeed(){
	return topspeed;
	}
	public void setTopspeed(int topspeed){
	this.topspeed=topspeed;
	}
	public String getModname(){
	return modname;
	}
	public void setModname(String Modname){
	this.modname=modname;
	}
}


public class CarDetails{
	public static void main(String[]main){

	Car d=new Car();

	//access the privatre variable using the getter and setter

	d.setBrand("Mahindra");
	d.setModname("Thar Turbo");
	d.setTopspeed(220);
	System.out.println("Car Details 1");
	System.out.println("Car Brand:"+d.getBrand());
	System.out.println("Car Name:"+d.getModname());
	System.out.println("Car Topspeed:"+d.getTopspeed());

	Car1 c=new Car1();

	c.setBrand("Tata");
	c.setModname("Harrier");
	c.setTopspeed(250);
	System.out.println("Car Details 2");
	System.out.println("Car Brand:"+d.getBrand());
	System.out.println("Car Name:"+d.getModname());
	System.out.println("Car Topspeed:"+d.getTopspeed());

}
}