package TranVietHoang.beans;

public class UserAccount {
	public static final String GENDER_MALE = "M";
	public static final String GENDER_FEMALE = "F";
	
	private String user_name;
	private String gender;
	private String password;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserAccount(String user_name, String gender, String password) {
		super();
		this.user_name = user_name;
		this.gender = gender;
		this.password = password;
	}
	public UserAccount() {
		super();
	}
	



	
	
}
