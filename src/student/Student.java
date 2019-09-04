package student;

public class Student {
	private int no;
	private String name;
	private String pwd;
	private String discipline;
	private int grade;
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
	public String getDiscipline() {
		return discipline;
	}
	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "ѧ���û� [���=" + no + ", ����=" + name + ", ����=" + pwd + ", רҵ=" + discipline + ", �꼶="
				+ grade + "]";
	}
	public Student(int no, String name, String pwd, String discipline, int grade) {
		super();
		this.no = no;
		this.name = name;
		this.pwd = pwd;
		this.discipline = discipline;
		this.grade = grade;
	}
}
