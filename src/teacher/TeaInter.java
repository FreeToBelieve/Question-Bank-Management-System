package teacher;

import java.util.List;

import manager.PageBean;
import test.anwser;
import test.problem;
import test.test;

public interface TeaInter {
	boolean add_problem(problem pro);
	boolean add_anwser(anwser ans);
	boolean add_test(test tst);
	boolean delete_problem(int no);
	boolean delete_anwser(int no);
	boolean delete_test(int no);
	problem select_pro(int no);
	anwser select_ans(int no);
	test select_tst(int no);
	List<problem> list_pro();
	List<anwser> list_ans();
	List<test> list_tst();
	void list_pro(PageBean<problem> pageBean);
	void list_ans(PageBean<anwser> pageBean);
	void list_tst(PageBean<test> pageBean);
	int pro_getTotalCount();
	int ans_getTotalCount();
	int tst_getTotalCount();
	boolean update_problem(problem pro,int no);
	boolean update_anwser(anwser ans,int no);
	boolean update_test(test tst,int no);
}
