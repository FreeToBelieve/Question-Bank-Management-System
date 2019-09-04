package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class Login_filter
 */
@WebFilter(
		filterName = "Login_filter",
		urlPatterns = "")
public class Login_filter implements Filter {

    /**
     * Default constructor. 
     */
    public Login_filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		String man_user = (String)session.getAttribute("name");
		String tea_user = (String)session.getAttribute("tea_name");
		String stu_user = (String)session.getAttribute("stu_name");
		if(uri.contains("index.jsp")||uri.contains("Login_manager")||uri.contains("Login_student")||uri.contains("Login_teacher"))
		{
			chain.doFilter(request, response);	
		}
		else{
			if(man_user!=null||tea_user!=null||stu_user!=null){
				chain.doFilter(request, response);
			}
			else{
				HttpServletResponse res = (HttpServletResponse)response;
				res.sendRedirect("index.jsp");
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
