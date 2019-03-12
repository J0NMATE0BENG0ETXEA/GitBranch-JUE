package liburutegia;

import java.util.ArrayList;

public class Liburutegia {
	
	private String izena;
	private String helbidea;
	private int liburu_kop;
	private ArrayList<Liburua> Liburuak = new ArrayList<Liburua>();
	
	
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getHelbidea() {
		return helbidea;
	}
	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}
	public int getIkasle_kop() {
		return liburu_kop;
	}
	public void setIkasle_kop(int ikasle_kop) {
		this.liburu_kop = ikasle_kop;
	}
	public ArrayList<Liburua> getLiburuak() {
		return Liburuak;
	}
	public void setLiburuak(ArrayList<Liburua> liburuak) {
		Liburuak = liburuak;
	}
	
	public void GehituLiburua(Liburua lib) {
		this.Liburuak.add(lib);
		this.liburu_kop++;
	}
	
	public void AnikilatuLiburua(Liburua lib) {
		this.Liburuak.remove(lib);
		this.liburu_kop--;
	}

	public void LiburuakErakutsi() {
		int i=0;
		do {
			System.out.println(Liburuak.get(i));
		} while (i < Liburuak.size());

}
}
