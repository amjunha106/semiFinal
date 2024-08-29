package htproject.z01_vo;

public class Mem {
	private String m_id;
	private String m_pwd;
	private String m_name;
	private String m_email;
	private String m_number;
	private int m_age;
	public Mem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mem(String m_id, String m_pwd, String m_name, String m_email, String m_number, int m_age) {
		super();
		this.m_id = m_id;
		this.m_pwd = m_pwd;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_number = m_number;
		this.m_age = m_age;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
	}
	public int getM_age() {
		return m_age;
	}
	public void setM_age(int m_age) {
		this.m_age = m_age;
	}
	
}