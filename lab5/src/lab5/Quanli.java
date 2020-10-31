package lab5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Quanli extends UnicastRemoteObject implements QuanlyCB {
	private static final long serialVersionUID = 1L;

	public Quanli() throws RemoteException {
		super();
		
	}

	ArrayList<Chuyenbay> data = new ArrayList<Chuyenbay>();
	
	@Override
	public ArrayList<Chuyenbay> taocb() throws RemoteException {
		data.add(new Chuyenbay("VN01", "1/11/2020", "HCM", "VT", "2h", 100, 0, 0));
		data.add(new Chuyenbay("VN02", "1/11/2020", "HCM", "DN", "3h", 100, 0, 0));
		data.add(new Chuyenbay("VN03", "2/11/2020", "HCM", "HN", "4h", 100, 0, 0));
		data.add(new Chuyenbay("VN04", "3/11/2020", "HCM", "QN", "1h", 100, 0, 0));
		return data;
	}

	@Override
	public String xem() throws RemoteException {
		String tmp="";
		for (Chuyenbay cb : data) {
			tmp +=cb.toString()+"\n";
		}
		return tmp;

	}

	@Override
	public boolean muave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSh().equalsIgnoreCase(sh)) {
				int b = cb.getGban();
				cb.setGban(b + sl);
				cb.setGt(cb.getG()-cb.getGban());
				return true;
			}
		}
		return false;
	}
	public boolean trave(String sh, int sl) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSh().equalsIgnoreCase(sh)) {
				int b = cb.getGban();
				if(b>=sl) {
				cb.setGban(b - sl);
				cb.setGt(cb.getG()-cb.getGban());
				return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean themcb(Chuyenbay cbt) throws RemoteException {
		for (Chuyenbay cb : data) {
			if (cb.getSh().equalsIgnoreCase(cbt.getSh()))
				return false;
		}
		data.add(cbt);
		return true;
	}

	@Override
	public boolean xoacb(String sh) throws RemoteException {
		Chuyenbay cb = null;
        int size = data.size();
        for (int i = 0; i < size; i++) {
            if (data.get(i).getSh().equalsIgnoreCase(sh)) {
                cb = data.get(i);
                break;
            }
        }
            return data.remove(cb);
	}

	

}
