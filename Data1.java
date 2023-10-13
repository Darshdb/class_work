class Info{
	private String name;

	//getter method
	public String getName(){
	return this.name;
	}
	//setter method
	public void setName(String name){
	this.name=name;
	}
}
public class Data1{
	public static void main(String[]main){
	Info d=new Info();

	//access the privatre variable using the getter and setter
	d.setName("Ganesha");
	System.out.println(d.getName());
}
}