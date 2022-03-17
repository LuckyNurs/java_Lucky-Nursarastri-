package Section_11_OOP;

public class Challenge3 {
public static void main (String[]args) {
	Vehicle mesin = new Vehicle("Gerobak","'no engine'");
	mesin.identify_myself();
System.out.println(" ");
	
	Bikes sepeda1 = new Bikes("Pedal","'no engine'", 2);
	sepeda1.identify_myself();
	Bikes sepeda2 = new Bikes("Motor","'engine'", 2);
	sepeda2.identify_myself();
	System.out.println("----------------------------------");
	Cars car1 = new Cars("Sport", "'with engine'", 4, "V8");
	car1.identify_myself();
	Cars car2 = new Cars("Pickup","with engine",4 ,"Solar");
	car2.identify_myself();
	System.out.println("----------------------------------");
	Buses bus1 = new Buses("Trans Jakarta", "with engine",4, " Public Bus");
	bus1.identify_myself();
	

}
}

class Vehicle {
	private String name; // penulisan attribute private,tipe data,nama attribute
	private String with_engine;

	public Vehicle(String name, String with_engine) {
		super();
		this.name = name;
		this.with_engine = with_engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWith_engine() {
		return with_engine;
	}

	public void setWith_engine(String with_engine) {
		this.with_engine = with_engine;
	}

	public void identify_myself() {
System.out.println("Hi I'm Parent of All Vehicles, My Name is " +getName()+ " My Engine Status is" +getWith_engine()+ "I have" );
	}
}

class Bikes extends Vehicle {
	private int wheel_count;

	public Bikes(String name, String with_engine, int wheel_count) {
		super(name, with_engine);
		this.wheel_count = wheel_count;
	}

	public int getWheel_count() {
		return wheel_count;
	}

	public void setWheel_count(int wheel_count) {
		this.wheel_count = wheel_count;
	}

	@Override
	public void identify_myself() {
		// TODO Auto-generated method stub
		System.out.println("Hi I'm Bike, My Name is" +getName()+",My Engine Status is" +getWith_engine()+"I have " +getWheel_count()+ " Wheel");
	}

}

class Cars extends Vehicle {
	private int wheel_count;
	private String engine_type;

	public Cars(String name, String with_engine, int wheel_count, String engine_type) {
		super(name, with_engine);
		this.wheel_count = wheel_count;
		this.engine_type = engine_type;
	}

	public int getWheel_count() {
		return wheel_count;
	}

	public void setWheel_count(int wheel_count) {
		this.wheel_count = wheel_count;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	@Override
	public void identify_myself() {
		// TODO Auto-generated method stub
		System.out.println("Hi I'm Car, My Name is" +getName()+" Bikes ,My Engine Status is" +getEngine_type()+ "I have" +getWheel_count()+ "Wheel");	
	}

}

class Buses extends Vehicle {
	private int wheel_count;
	private String private_bus;

	public Buses(String name, String with_engine, int wheel_count, String private_bus) {
		super(name, with_engine);
		this.wheel_count = wheel_count;
		this.private_bus = private_bus;
	}

	public int getWheel_count() {
		return wheel_count;
	}
	

	public void setWheel_count(int wheel_count) {
		this.wheel_count = wheel_count;
	}

	public String getPrivate_bus() {
		return private_bus;
	}

	public void setPrivate_bus(String private_bus) {
		this.private_bus = private_bus;
	}

	@Override
	public void identify_myself() { //overide
		// TODO Auto-generated method stub
	System.out.println("Hi I'm Bus" +getPrivate_bus()+ ", My Name is "+getName()+" , My Engine Status is " +getWith_engine()+ ", I have " +getWheel_count()+" wheel");
	}
	

}