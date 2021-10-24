package 팀프로젝트;
public class Member{
	protected static String id;
	protected static String password;
	protected static String name;
	protected static String phone;
	
	// 2. 생성자
	public Member() {}
	public Member(String id, String password, String name, String Phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		Member.id = id;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Member.password = password;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Member.name = name;
	}
	public static String getPhone() {
		return phone;
	}
	public static void setPhone(String phone) {
		Member.phone = phone;
	}

	


}