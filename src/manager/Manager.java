package manager;

public class Manager {
	private int no;
	private String name;
	private String pwd;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "����Ա�˻� [���=" + no + ", ����=" + name + ", ����=" + pwd + "]";
	}
	public Manager(int no, String name, String pwd) {
		super();
		this.no = no;
		this.name = name;
		this.pwd = pwd;
	}
}
