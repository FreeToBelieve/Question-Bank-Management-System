<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator" %>
<%@page import="manager.ManagerImp" %>
<%@page import="student.Student" %>
<%@page import="manager.PageBean" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/background.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body {
	background-image: url(image/background.jpeg);
	background-repeat:no-repeat;
	background-size:cover;
}
</style>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 163px;
	height: 480px;
	z-index: 1;
	left: 96px;
	top: 82px;
}
#apDiv2 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 281px;
	top: 480px;
	visibility: hidden;
}
#apDiv3 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 281px;
	top: 480px;
	visibility: hidden;
}
#apDiv4 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 281px;
	top: 480px;
	visibility: hidden;
}
#apDiv5 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 281px;
	top: 480px;
	visibility: hidden;
}
#apDiv6 {
	position: absolute;
	width: 657px;
	height: 83px;
	z-index: 3;
	left: 98px;
	top: 750px;
}
#apDiv7 {
	position: absolute;
	width: 80px;
	height: 83px;
	z-index: 3;
	left: 200px;
	top: 20px;
}
#apDiv8 {
	position: absolute;
	width: 494px;
	height: 250px;
	z-index: 3;
	left: 281px;
	top: 150px;
}
#apDiv9 {
	position: absolute;
	width: 494px;
	height: 250px;
	z-index: 3;
	left: 781px;
	top: 150px;
}
#apDiv10 {
	position: absolute;
	width: 500px;
	height: 100px;
	z-index: 3;
	left: 280px;
	top: 4px;
}
#apDiv11 {
	position: absolute;
	width: 500px;
	height: 100px;
	z-index: 3;
	left: 800px;
	top: 4px;
}
</style>
<script type="text/javascript">
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
function MM_showHideLayers() { //v9.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) 
  with (document) if (getElementById && ((obj=getElementById(args[i]))!=null)) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
    obj.visibility=v; }
}
function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
</script>
</head>

<body onload="MM_preloadImages('image/manager-1-after.jpg','image/manager-2-after.jpg','image/manager-3-after.jpg','image/manager-4-after.jpg')">
<div>
<% String man_name = (String)session.getAttribute("name"); %>欢迎管理员<%= man_name %>!
</div>
<div id="apDiv1">
<table border="0" height="120" width="180">
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','show','apDiv3','','hide','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','image/manager-1-after.jpg',1)"><img src="image/manager-1-before.jpg" width="180" height="120" id="Image1" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','show','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','image/manager-2-after.jpg',1)"><img src="image/manager-2-before.jpg" width="180" height="120" id="Image2" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','show','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image3','','image/manager-3-after.jpg',1)"><img src="image/manager-3-before.jpg" width="180" height="120" id="Image3" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','hide','apDiv5','','show')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','image/manager-4-after.jpg',1)"><img src="image/manager-4-before.jpg" width="180" height="120" id="Image4" /></a></th>
</tr>
</table></div>
<div id="apDiv10" style="font-size:12px"><form action="stu_select">
<table width="500" height="30"><tr><td width="100">请输入学号：</td>
<td width="90"><input type = "text" name = "stusel_no" id = "stusel_no"></td>
<td width="100">请输入密码：</td>
<td width="90"><input type = "text" name = "stusel_pwd" id = "stusel_pwd"></td>
<td><input type = "submit" value="查询"></td></tr></table>
<table width="500" height="70">
<tr><td width="30">学号:</td><td width="70">${stusel.no}</td>
<td width="30">姓名:</td><td width="70">${stusel.name}</td>
<td width="30">密码:</td><td width="70">${stusel.pwd }</td>
<td width="30">专业:</td><td width="70">${stusel.discipline }</td>
<td width="30">年级:</td><td width="70">${stusel.grade }</td>
</tr></table></form></div>
<div id="apDiv11" style="font-size:12px"><form action="tea_select">
<table width="500" height="30"><tr><td width="60">请输入工号：</td>
<td width="90"><input type = "text" name = "teasel_no" id = "teasel_no"></td>
<td width="60">请输入密码：</td>
<td width="90"><input type = "text" name = "teasel_pwd" id = "teasel_pwd"></td>
<td><input type = "submit" value="查询"></td></tr></table>
<table width="500" height="70">
<tr><td width="30">学号:</td><td width="70">${teasel.no}</td>
<td width="30">姓名:</td><td width="70">${teasel.name}</td>
<td width="30">密码:</td><td width="70">${teasel.pwd }</td>
<td width="30">专业:</td><td width="70">${teasel.discipline }</td>
<td width="30">邮箱:</td><td width="70">${teasel.mail }</td>
</tr></table></form></div>
<div id="apDiv8"><div><table>
<tr><td>学号</td><td>姓名</td><td>密码</td><td>专业</td><td>年级</td><td></td></tr>
<c:forEach var= "stu" items="${pageBean.pageDate}">
<tr><td id = "no">${stu.no}</td>
<td id = "name">${stu.name}</td>
<td id = "pwd">${stu.pwd }</td>
<td id = "dis">${stu.discipline }</td>
<td id = "grade">${stu.grade }</td>
<td><a href="stu_delete?stu_delete=true&stu_no=${stu.getNo()}&stu_pwd=${stu.getPwd()}"><input type="button" value="删除"></a></td></tr>
</c:forEach>
<%String studel = (String)session.getAttribute("studel"); 
if(studel == "false"){%>
<script>alert("删除失败！");</script>
<%session.setAttribute("studel", null);}
if(studel == "true"){%>
<script>alert("删除成功！");</script>
<%session.setAttribute("studel", null);} %>
</table></div>
<div><table><tr>
<td>当前${pageBean.getCurrentpage()}/${pageBean.getTotalPage()}页</td>
<td><a href="managerServlet?currentPage=1"><input type="button" value="首页"></a></td>
<td><a href="managerServlet?currentPage=${pageBean.getCurrentpage()-1}"><input type="button" value="上一页"></a></td>
<td><a href="managerServlet?currentPage=${pageBean.getCurrentpage()+1}"><input type="button" value="下一页"></a></td>
<td><a href="managerServlet?currentPage=${pageBean.getTotalPage()}"><input type="button" value="尾页"></a></td>
</table></div></div>
<div id="apDiv9"><div><table>
<tr><td>工号</td><td>姓名</td><td>密码</td><td>专业</td><td>邮箱</td><td></td></tr>
<c:forEach var= "tea" items="${tea_pageBean.pageDate}">
<tr><td id = "no">${tea.no}</td>
<td id = "name">${tea.name}</td>
<td id = "pwd">${tea.pwd }</td>
<td id = "dis">${tea.discipline }</td>
<td id = "grade">${tea.mail }</td>
<td><a href="tea_delete?tea_delete=true&tea_no=${tea.getNo()}&tea_pwd=${tea.getPwd()}"><input type="button" value="删除"></a></td></tr>
</c:forEach>
<%String teadel = (String)session.getAttribute("teadel"); 
if(teadel == "false"){%>
<script>alert("删除失败！");</script>
<%session.setAttribute("teadel", null);}
if(teadel == "true"){%>
<script>alert("删除成功！");</script>
<%session.setAttribute("teadel", null);} %>
</table></div>
<div><table><tr>
<td>当前${tea_pageBean.getCurrentpage()}/${tea_pageBean.getTotalPage()}页</td>
<td><a href="tea_mangerServlet?tea_currentPage=1"><input type="button" value="首页"></a></td>
<td><a href="tea_mangerServlet?tea_currentPage=${tea_pageBean.getCurrentpage()-1}"><input type="button" value="上一页"></a></td>
<td><a href="tea_mangerServlet?tea_currentPage=${tea_pageBean.getCurrentpage()+1}"><input type="button" value="下一页"></a></td>
<td><a href="tea_mangerServlet?tea_currentPage=${tea_pageBean.getTotalPage()}"><input type="button" value="尾页"></a></td>
</table></div></div>
<div id="apDiv2">
<form action="add_student" method="post">
<table><tr>请输入要添加的学生用户信息</tr>
<tr><td>学号:</td><td><input type="text" name="stu_no" id="stu_no"></td></tr>
<tr><td>姓名:</td><td><input type="text" name="stu_name" id="stu_name"></td></tr>
<tr><td>密码:</td><td><input type="text" name="stu_pwd" id="stu_pwd"></td></tr>
<tr><td>专业:</td><td><input type="text" name="stu_discipline" id="stu_discipline"></td></tr>
<tr><td>年级:</td><td><input type="text" name="stu_grade" id="stu_grade"></td></tr>
<tr><td><input type = "submit" value="提交"></td><td><input type="reset" value="重置"/></td></tr>
</table>
<%String stu_reg = (String)session.getAttribute("stu_reg"); 
if(stu_reg == "false"){%>
<script>alert("添加失败，请重新添加！");</script>
<%session.setAttribute("stu_reg", null);}
if(stu_reg == "true"){%>
<script>alert("添加成功！");</script>
<%session.setAttribute("stu_reg", null);}%>
</form>
</div>
<div id="apDiv3">
<form action="add_teacher" method="post">
<table><tr>请输入要添加的教师用户信息</tr>
<tr><td>工号:</td><td><input type="text" name="tea_no" id="tea_no"></td></tr>
<tr><td>姓名:</td><td><input type="text" name="tea_name" id="tea_name"></td></tr>
<tr><td>密码:</td><td><input type="text" name="tea_pwd" id="tea_pwd"></td></tr>
<tr><td>专业:</td><td><input type="text" name="tea_discipline" id="tea_discipline"></td></tr>
<tr><td>邮箱:</td><td><input type="text" name="tea_mail" id="tea_mail"></td></tr>
<tr><td><input type = "submit" value="提交"></td><td><input type="reset" value="重置"/></td></tr>
</table>
<%String tea_reg = (String)session.getAttribute("tea_reg"); 
if(tea_reg == "false"){%>
<script>alert("添加失败，请重新添加！");</script>
<%session.setAttribute("tea_reg", null);}
if(tea_reg == "true"){%>
<script>alert("添加成功！");</script>
<%session.setAttribute("tea_reg", null);}%>
</form></div>
<div id="apDiv4">
<table>
<tr align="center"><td><a href="exportDatabase"><input type="button" value="备份数据库"></a></td></tr>
</table></div>
<%String export = (String)session.getAttribute("export"); 
if(export == "false"){%>
<script>alert("备份数据库失败！");</script>
<%session.setAttribute("export", null);}
if(export == "true"){%>
<script>alert("备份数据库成功！");</script>
<%session.setAttribute("export", null);}%>
<div id="apDiv5">
<table>
<tr align="center"><td><a href="restoreDatabase"><input type="button" value="恢复数据库"></a></td></tr>
</table></div>
<%String restore = (String)session.getAttribute("restore"); 
if(restore == "false"){%>
<script>alert("恢复数据库失败！");</script>
<%session.setAttribute("restore", null);}
if(restore == "true"){%>
<script>alert("恢复数据库成功！");</script>
<%session.setAttribute("restore", null);}%>
<div id="apDiv6" align="center">
<input type="button" value="上一步" onclick="MM_goToURL('parent','index.jsp');return document.MM_returnValue"/>
</div>
</body>
</html>