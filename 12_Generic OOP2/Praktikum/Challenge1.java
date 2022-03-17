package Section_11_OOP;

public class Challenge4 {
	public static void main (String[]args) {
		Animal animal = new Animal(" Binatang", "", "");
		animal.identify_myself();
		
		Herbivor herbivor = new Herbivor(" Kambing","tumbuhan"," tumpul"," tumbuhan", " tumpul ");
		herbivor.identify_myself();

		
	}
}

class Animal {
	private String Nama; // penulisan attribute private,tipe data,nama attribute
	private String Jenis_Makanan;
private String Gigi_Binatang;

public Animal(String nama, String jenis_Makanan, String gigi_Binatang) {
	super();
	Nama = nama;
	Jenis_Makanan = jenis_Makanan;
	Gigi_Binatang = gigi_Binatang;
}

public String getNama() {
	return Nama;
}

public void setNama(String nama) {
	Nama = nama;
}

public String getJenis_Makanan() {
	return Jenis_Makanan;
}

public void setJenis_Makanan(String jenis_Makanan) {
	Jenis_Makanan = jenis_Makanan;
}

public String getGigi_Binatang() {
	return Gigi_Binatang;
}

public void setGigi_Binatang(String gigi_Binatang) {
	Gigi_Binatang = gigi_Binatang;
}

public void identify_myself() {
System.out.println("Hi I'm Parent of All Animal, My Name is" +getNama() );
	}
}

class Herbivor extends Animal {
	private String Jenis_makanan_tmbhn;
	private String Jenis_gigi_tumpul;
	public Herbivor(String nama, String jenis_Makanan, String gigi_Binatang, String jenis_makanan_tmbhn,
			String jenis_gigi_tumpul) {
		super(nama, jenis_Makanan, gigi_Binatang);
		Jenis_makanan_tmbhn = jenis_makanan_tmbhn;
		Jenis_gigi_tumpul = jenis_gigi_tumpul;
	}
	public String getJenis_makanan_tmbhn() {
		return Jenis_makanan_tmbhn;
	}
	public void setJenis_makanan_tmbhn(String jenis_makanan_tmbhn) {
		Jenis_makanan_tmbhn = jenis_makanan_tmbhn;
	}
	public String getJenis_gigi_tumpul() {
		return Jenis_gigi_tumpul;
	}
	public void setJenis_gigi_tumpul(String jenis_gigi_tumpul) {
		Jenis_gigi_tumpul = jenis_gigi_tumpul;
	}
	@Override
	public void identify_myself() {
		// TODO Auto-generated method stub
		System.out.println("Hi I'm Herbivor, My Name is" +getNama()+ ", My Food is " +getJenis_makanan_tmbhn()+ ",I have" +getJenis_gigi_tumpul()+ "teeth");
	} 
	
	
	
}
class Carnivor extends Animal{
	private String Jenis_mknn_Daging;
	private String Jenis_gigi_tumpul;
	public Carnivor(String nama, String jenis_Makanan, String gigi_Binatang, String jenis_mknn_Daging,
			String jenis_gigi_tumpul) {
		super(nama, jenis_Makanan, gigi_Binatang);
		Jenis_mknn_Daging = jenis_mknn_Daging;
		Jenis_gigi_tumpul = jenis_gigi_tumpul;
	}
	public String getJenis_mknn_Daging() {
		return Jenis_mknn_Daging;
	}
	public void setJenis_mknn_Daging(String jenis_mknn_Daging) {
		Jenis_mknn_Daging = jenis_mknn_Daging;
	}
	public String getJenis_gigi_tumpul() {
		return Jenis_gigi_tumpul;
	}
	public void setJenis_gigi_tumpul(String jenis_gigi_tumpul) {
		Jenis_gigi_tumpul = jenis_gigi_tumpul;
	}
	@Override
	public void identify_myself() {
		// TODO Auto-generated method stub
		
		System.out.println("Hi I'm Carnivor, My Name is " +getNama()+ ", My Food is " +getJenis_mknn_Daging()+ " , I have" +getJenis_gigi_tumpul()+ "teeth");
	}

	
	
}

class Omnivor extends Animal{
	private String Jenis_mknn_semua;
	private String Jenis_gigi;
	public Omnivor(String nama, String jenis_Makanan, String gigi_Binatang, String jenis_mknn_semua,
			String jenis_gigi) {
		super(nama, jenis_Makanan, gigi_Binatang);
		Jenis_mknn_semua = jenis_mknn_semua;
		Jenis_gigi = jenis_gigi;
	}
	public String getJenis_mknn_semua() {
		return Jenis_mknn_semua;
	}
	public void setJenis_mknn_semua(String jenis_mknn_semua) {
		Jenis_mknn_semua = jenis_mknn_semua;
	}
	public String getJenis_gigi() {
		return Jenis_gigi;
	}
	public void setJenis_gigi(String jenis_gigi) {
		Jenis_gigi = jenis_gigi;
	}
	@Override
	public void identify_myself() {
		// TODO Auto-generated method stub
		System.out.println("Hi I'm Omnivor , My Name is " +getNama()+ ", My Food is" +getJenis_mknn_semua()+ " , I Have " +getJenis_gigi()+ "teeth");
	}
	
}


