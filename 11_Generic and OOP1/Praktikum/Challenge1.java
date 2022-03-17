package Section_11_OOP;

public class Challenge1 {
	public static void main(String[] args) {
		Cat kucing1 = new Cat("Hitam", 4); // manggil kelas cat buat dijadiin objek
		kucing1.show_identity();
		Cat kucing2 = new Cat("Putih", 3);
		kucing2.show_identity();
		Cat kucing3 = new Cat("Hitam Putih", 4);
		kucing3.show_identity();
		Cat kucing4 = new Cat("Poleng poleng", 3);
		kucing4.show_identity();
		Cat kucing5 = new Cat("bintik bintik", 4);
		kucing5.show_identity();
		
		System.out.println(" ");
		Fish fish1 = new Fish("paus", "plankton"); // manggil kelas fish buat dijadiin objek //penulisan string pake ""
		fish1.show_identity();
		Fish fish2 = new Fish("cupang", "cacing");
		fish2.show_identity();
		Fish fish3 = new Fish("arwana", "jangkrik");
		fish3.show_identity();
		Fish fish4 = new Fish("sapu-sapu", "pelet");
		fish4.show_identity();
		
		System.out.println(" ");
		Flower flower1 = new Flower ("bangkai", "merah", 12); // manggil kelas flower buat dijadiin objek //penulisan string pake ""
		flower1.show_identity();
		Flower flower2 = new Flower("anggrek", "putih",8);
		flower2.show_identity();
		Flower flower3 = new Flower ("mawar", "merah",3);
		flower3.show_identity();
		Flower flower4 = new Flower("melati", "kuning",5);
		flower4.show_identity();
		
		System.out.println(" ");
		car car1 = new car ("sedan", "merah", 4); // manggil kelas car buat dijadiin objek //penulisan string pake ""
		car1.show_identity();
		car car2 = new car("truk", "hijau",6);
		car2.show_identity();
		car car3 = new car ("tronton", "coklat",12);
		car3.show_identity();
		car car4 = new car("angkot", "kuning",4);
		car4.show_identity();
	
		
		
		
		
		
	}

}

class Cat {
	private String fur_color;// attribute
	private int num_of_leg;

	public Cat(String fur_color, int num_of_leg) //method konstraktor 
	{
		super();
		this.fur_color = fur_color;
		this.num_of_leg = num_of_leg;
	}

	public String getFur_color() { // ngambil data (dipanggil)
		return fur_color;
	}

	public void setFur_color(String fur_color) { // ngisi nilai/update data
		this.fur_color = fur_color;
	}

	public int getNum_of_leg() {
		return num_of_leg;
	}

	public void setNum_of_leg(int num_of_leg) {
		this.num_of_leg = num_of_leg;
	}

	public void show_identity() { // ga pake static
		System.out.println(
				"Saya Kucing dengan detail, Warna Bulu : " + getFur_color() + " dengan jumlah kaki : " + getNum_of_leg());

	}
}

class Fish {
	private String type;
	private String feed;

	public Fish(String type, String feed) {
		super();
		this.type = type;
		this.feed = feed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public void show_identity() {
		System.out.println("Saya Ikan dengan detail, Jenis : " +getType()+    " makanan : " +getFeed());
	
	}
}

class Flower {
	private String nama;
	private String color;
	private int num_of_petal;

	public Flower(String nama, String color, int num_of_petal) {
		super();
		this.nama = nama;
		this.color = color;
		this.num_of_petal = num_of_petal;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum_of_petal() {
		return num_of_petal;
	}

	public void setNum_of_petal(int num_of_petal) {
		this.num_of_petal = num_of_petal;
	}

	public  void show_identity() {
		System.out.println("Saya Bunga dengan detail, Jenis : "+getNama()+ ", color : "+getColor()+ ", num of petal :"+getNum_of_petal());
		

	}
}

class car {
	private String type;
	private String color;
	private int num_of_tire;

	public car(String type, String color, int num_of_tire) {
		super();
		this.type = type;
		this.color = color;
		this.num_of_tire = num_of_tire;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNum_of_tire() {
		return num_of_tire;
	}

	public void setNum_of_tire(int num_of_tire) {
		this.num_of_tire = num_of_tire;
	}

	public  void show_identity() {
		System.out.println("Saya mobil dengan detail Type: " +getType()+ " ,color:" +getColor()+",num of tire :" +getNum_of_tire());

	}

}
