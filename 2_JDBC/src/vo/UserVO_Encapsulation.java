package vo;
//1 2 3 순서
public class UserVO_Encapsulation {
	private String id, password, name, role;
	
	

	public UserVO_Encapsulation(String id, String password, String name, String role) {
		super();
		setId(id);
		setPassword(password);
		setName(name);
		setRole(role);
		//전부 set으로 바꾸기
//		this.id = id;
//		this.password = password;
//		this.name = name;
//		this.role = role;
	}

	public UserVO_Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) { //set 전부 똑같이 하기
		if (id != null) {
			this.id = id;
		} else {
			System.out.println("id를 입력하세요");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}

	
}
