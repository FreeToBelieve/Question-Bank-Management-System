package manager;

import java.util.List;

public class PageBean<T> {
	private int currentPage = 1;
	private int pageCount = 5;
	private int totalCount;
	private int totalPage;
	private List<T> pageDate;
	public int getTotalPage(){
		if(totalCount % pageCount == 0){
			totalPage = totalCount / pageCount;
		}
		else{
			totalPage = totalCount / pageCount + 1;
		}
		return totalPage;
	}
	public int getCurrentpage() {
		return currentPage;
	}
	public void setCurrentpage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getPageDate() {
		return pageDate;
	}
	public void setPageDate(List<T> pageDate) {
		this.pageDate = pageDate;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
}
