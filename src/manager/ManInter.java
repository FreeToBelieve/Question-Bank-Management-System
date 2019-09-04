package manager;

import java.util.List;

import student.Student;
import teacher.Teacher;

public interface ManInter {
	boolean add_student(Student stu);
	boolean add_teacher(Teacher tea);
	boolean delete_student(int no, String pwd);
	boolean delete_teacher(int no, String pwd);
	Student select_stu(int no, String pwd);
	Teacher select_tea(int no, String pwd);
	List<Student> list_stu();
	List<Teacher> list_tea();
	void list_stu(PageBean<Student> pageBean);
	void list_tea(PageBean<Teacher> pageBean);
	int stu_getTotalCount();
	int tea_getTotalCount();
	boolean exportDatabaseTool(String userName, String password, String SID, String savePath, String fileName);
	boolean restoreDatabaseTool(String userName, String password, String SID, String savePath, String fileName);
}
