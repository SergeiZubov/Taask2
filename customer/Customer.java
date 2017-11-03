package by.home.dz.zadacha.a.customer;
//Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
//Номер банковского счета
public class Customer {
	
	private int id;
	private String familiya;
	private String imya;
	private String otchestvo;
	private String adres;
	private int nomerKarti;
	private int nomerScheta;
	
	public Customer() {
	}
	
	public Customer(int id,String familiya,String imya,String otchestvo,String adres,int nomerKarti,int nomerScheta) {
		this.id = id;
		this.familiya = familiya;
		this.imya = imya;
		this.otchestvo = otchestvo;
		this.adres = adres;
		this.nomerKarti = nomerKarti;
		this.nomerScheta = nomerScheta;		
	}
	/*Конструктор для тестов
	public Customer(int id,String familiya, String imya, String otchestvo) {
		this.id = id;
		this.imya = imya;
		this.familiya = familiya;
		this.otchestvo = otchestvo;
	}*/


	public int getId() {
		return id;
	}
	
	public String getFaminiya() {
		return familiya;
	}
	
	public String getImya() {
		return imya;
	}
	
	public String getOtchestvo() {
		return otchestvo;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public int getNomerKarti() {
		return nomerKarti;
	}
	
	public int getNomerScheta() {
		return nomerScheta;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setFamiliya(String familiya) {
		this.familiya = familiya;
	}
	
	public void setImya(String imya) {
		this.imya = imya;
	}
	
	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void setNomerKarti(int nomerKarti) {
		this.nomerKarti = nomerKarti;
	}
	
	public void setNomerScheta(int nomerScheta) {
		this.nomerScheta = nomerScheta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adres == null) ? 0 : adres.hashCode());
		result = prime * result + ((familiya == null) ? 0 : familiya.hashCode());
		result = prime * result + id;
		result = prime * result + ((imya == null) ? 0 : imya.hashCode());
		result = prime * result + nomerKarti;
		result = prime * result + nomerScheta;
		result = prime * result + ((otchestvo == null) ? 0 : otchestvo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adres == null) {
			if (other.adres != null)
				return false;
		} else if (!adres.equals(other.adres))
			return false;
		if (familiya == null) {
			if (other.familiya != null)
				return false;
		} else if (!familiya.equals(other.familiya))
			return false;
		if (id != other.id)
			return false;
		if (imya == null) {
			if (other.imya != null)
				return false;
		} else if (!imya.equals(other.imya))
			return false;
		if (nomerKarti != other.nomerKarti)
			return false;
		if (nomerScheta != other.nomerScheta)
			return false;
		if (otchestvo == null) {
			if (other.otchestvo != null)
				return false;
		} else if (!otchestvo.equals(other.otchestvo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [id= "+id +" "+", familiya = " + familiya + ", imya = " + imya + ", otchestvo = " + otchestvo+"]";
	}

}
