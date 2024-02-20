package TranVietHoang.beans;

public class Product {
	private String code;
	private String name;
	private Float price;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Product(String code, String name, Float price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	
	
	
}
