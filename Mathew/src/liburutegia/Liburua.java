package liburutegia;

public class Liburua {
	//Atributuak
	private String izenburua;
	private String ISBN;
	private int orrialdeKopurua;

	public Liburua(String izenburua, String iSBN, int orrialdeKopurua) {
		this.izenburua = izenburua;
		ISBN = iSBN;
		this.orrialdeKopurua = orrialdeKopurua;
	} 
	
	//Getter eta Setter
	public String getIzenburua() {
		return izenburua;
	}
	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getOrrialdeKopurua() {
		return orrialdeKopurua;
	}
	public void setOrrialdeKopurua(int orrialdeKopurua) {
		this.orrialdeKopurua = orrialdeKopurua;
	}
}
