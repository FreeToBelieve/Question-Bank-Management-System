package connection;

import java.util.List;

import manager.Manager;

public interface LoginManInter {
	Manager select_man(int no,String pwd);
	List list_man();
}
