package teacher;

public class Teacher {
	private int no;
	private String pwd;
	private String name;
	private String discipline;
	private String mail;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "�γ̸������û� [���=" + no + ", ����=" + pwd + ", ����=" + name + ", רҵ=" + discipline + ", ����=" + mail
				+ "]";
	}
	public Teacher(int no, String pwd, String name, String discipline, String mail) {
		super();
		this.no = no;
		this.pwd = pwd;
		this.name = name;
		this.discipline = discipline;
		this.mail = mail;
	}
}
