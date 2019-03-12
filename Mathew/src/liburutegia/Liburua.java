package liburutegia;

import java.util.ArrayList;

public class Liburua {

	private String izena;
	private String helbidea;
	private int ikasle_kop;
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
		return ikasle_kop;
	}
	public void setIkasle_kop(int ikasle_kop) {
		this.ikasle_kop = ikasle_kop;
	}
	public ArrayList<Liburua> getLiburuak() {
		return Liburuak;
	}
	public void setLiburuak(ArrayList<Liburua> liburuak) {
		Liburuak = liburuak;
	}
	
	
	
}
