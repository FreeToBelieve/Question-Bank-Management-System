package student;

import java.util.List;

import test.anwser;
import test.problem;
import test.problem_select;
import test.test;

public interface StuInter {
	public problem select_pro(int no);
	public anwser select_ans(int no);
	public test select_tst(int no);
	public List<problem> list_pro();
	public List<anwser> list_ans();
	public List<test> list_tst();
	public problem_select select_pro_sel(int no);
	public List<problem_select> list_pro_sel();
}
