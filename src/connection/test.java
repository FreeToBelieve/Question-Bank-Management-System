package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import manager.ManagerImp;
import manager.PageBean;
import others.getno;
import student.Student;
import teacher.Teacher;
import teacher.TeacherImp;
import test.problem;

public class test {

	public static void main(String[] args) {
//		ManagerImp imp = new ManagerImp();
//		Student stu = imp.select_stu(1, "123");
//		System.out.println(stu);
//		List<Teacher> list = new ArrayList();
//		PageBean<Teacher> pageBean = new PageBean<Teacher>();
//		pageBean.setCurrentpage(1);
//		imp.list_tea(pageBean);
//		list = pageBean.getPageDate();
//		Iterator<Teacher> it = list.iterator();
//		while(it.hasNext())
//		{
//			Teacher tea = it.next();
//			System.out.println(tea);
//		}
//		System.out.println(imp.stu_getTotalCount());
//		problem pro = imp.select_pro(12);
//		List<Integer> list = new ArrayList<>();
//		list = getno.get_no(pro.getAnsno());
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()){
//			int a = it.next();
//			System.out.println(a);
//		}
		
		
		
		TeacherImp imp = new TeacherImp();
		problem pro = new problem(12, "12", "13", "1", 1, 1, "1", "1", "1");
		imp.update_problem(pro, 15);
		System.out.println(imp.select_pro(12));
	}

}
