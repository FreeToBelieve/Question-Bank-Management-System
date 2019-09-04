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
		return "学生用户 [编号=" + no + ", 姓名=" + name + ", 密码=" + pwd + ", 专业=" + discipline + ", 年级="
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
