package liburutegia;

public class Liburutegia {
	//Atributuak.
	private String Izena;
	private String helbidea;
	private int IkasleKopurua;
	private Liburua [] Liburuak;
	
	public Liburutegia(String izena, String helbidea, int ikasleKopurua, Liburua[] liburuak) {
		Izena = izena;
		this.helbidea = helbidea;
		IkasleKopurua = ikasleKopurua;
		Liburuak = liburuak;
	}

	//Getter eta Setter
	public String getIzena() {
		return Izena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public int getIkasleKopurua() {
		return IkasleKopurua;
	}

	public Liburua[] getLiburuak() {
		return Liburuak;
	}

	public void setIzena(String izena) {
		Izena = izena;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public void setIkasleKopurua(int ikasleKopurua) {
		IkasleKopurua = ikasleKopurua;
	}

	public void setLiburuak(Liburua[] liburuak) {
		Liburuak = liburuak;
	}
	
	
	
}
