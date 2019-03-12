package liburutegia;

public class Liburutegia {
	//Atributuak.
	private String Izena;
	private String helbidea;
	private int IkasleKopurua=0;
	private Liburua [] Liburuak;
	private int libkop=0;
	
	public Liburutegia(String izena, String helbidea, int ikasleKopurua, Liburua[] liburuak) {
		Izena = izena;
		this.helbidea = helbidea;
		IkasleKopurua = ikasleKopurua;
		Liburuak = new Liburua [10];
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
	
	//Liburu bat gehitu.
	public void GehituIkaslea(Liburua lib, int posizioa) {
		this.Liburuak[posizioa]=lib;
		this.libkop++;
	}
	
}
