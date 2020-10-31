package lab5;

import java.io.Serializable;

public class Chuyenbay implements Serializable {
	private static final long serialVersionUID = 1L;
	String sh;
	String nbay;
	String ndi;
	String nden;
	String tg;
	int g;
	int gban;
	int gt;

	public String getSh() {
		return sh;
	}

	public void setSh(String sh) {
		this.sh = sh;
	}

	public String getNbay() {
		return nbay;
	}

	public void setNbay(String nbay) {
		this.nbay = nbay;
	}

	public String getNdi() {
		return ndi;
	}

	public void setNdi(String ndi) {
		this.ndi = ndi;
	}

	public String getNden() {
		return nden;
	}

	public void setNden(String nden) {
		this.nden = nden;
	}

	public String getTg() {
		return tg;
	}

	public void setTg(String tg) {
		this.tg = tg;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getGban() {
		return gban;
	}

	public void setGban(int gban) {
		this.gban = gban;
	}

	public int getGt() {
		return gt;
	}

	public void setGt(int gt) {
		this.gt = gt;
	}

	public Chuyenbay(String sh, String nbay, String ndi, String nden, String tg, int g, int gban, int gt) {
		super();
		this.sh = sh;
		this.nbay = nbay;
		this.ndi = ndi;
		this.nden = nden;
		this.tg = tg;
		this.g = g;
		this.gban = gban;
		this.gt = gt;
	}

	public Chuyenbay() {
		super();
	}

	@Override
	public String toString() {
		return "Chuyenbay [sohieu=" + sh + ", ngaybay=" + nbay + ", noidi=" + ndi + ", noiden=" + nden + ", thoigian="
				+ tg + ", ghe=" + g + ", ghedaban=" + gban + ", ghetrong=" + gt + "]";
	}

}
