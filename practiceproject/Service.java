package practiceproject;

public class Service {
	private int pId;
	private String pname;
	private float price;
	public Service(int pId, String pname, float price) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Service [pId=" + pId + ", pname=" + pname + ", price=" + price + "]";
	}
}
