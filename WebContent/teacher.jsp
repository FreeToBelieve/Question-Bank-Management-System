<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>无标题文档</title>
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
	width: 180px;
	height: 600px;
	z-index: 1;
	left: 16px;
	top: 60px;
}

#apDiv2 {
	position: absolute;
	width: 1000px;
	height: 600px;
	z-index: 2;
	left: 200px;
	top: 61px;
}
#apDiv3 {
	position: absolute;
	width: 582px;
	height: 489px;
	z-index: 2;
	left: 200px;
	top: 61px;
	visibility: hidden;
}
#apDiv4 {
	position: absolute;
	width: 582px;
	height: 489px;
	z-index: 2;
	left: 200px;
	top: 61px;
	visibility: hidden;
}
#apDiv5 {
	position: absolute;
	width: 582px;
	height: 489px;
	z-index: 2;
	left: 200px;
	top: 61px;
	visibility: hidden;
}
#apDiv6 {
	position: absolute;
	width: 50px;
	height: 115px;
	z-index: 3;
	left: 20px;
	top: 800px;
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

<body onload="MM_preloadImages('image/teacher-1-after.jpg','image/teacher-2-after.jpg','image/teacher-3-after.jpg','image/teacher-4-after.jpg')">
<div id="apDiv1">
<table border="0">
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','show','apDiv3','','hide','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','image/teacher-1-after.jpg',1)"><img src="image/teacher-1-before.jpg" width="180" height="120" id="Image1" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','show','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','image/teacher-2-after.jpg',1)"><img src="image/teacher-2-before.jpg" width="180" height="120" id="Image2" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','show','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image3','','image/teacher-3-after.jpg',1)"><img src="image/teacher-3-before.jpg" width="180" height="120" id="Image3" /></a></th>
</tr>
<tr><th height="120" width="180" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','hide','apDiv5','','show')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','image/teacher-4-after.jpg',1)"><img src="image/teacher-4-before.jpg" width="180" height="120" id="Image4" /></a></th>
</tr>
<tr><th height="120" width="180"><a href="teacher_1.jsp"><input name="按钮" type="button" value="习题管理" /></a></th>
</tr>
</table>
</div>
<div id="apDiv2"><div>
<table border="1" style="border-color: blue;">
<tr><td width="50">编号</td><td width="450">题目</td><td width="100">关键字</td><td width="50">难度系数</td><td width="50">所属章节编号</td><td width="100">所属章节标题</td><td width="100">所属章节要点</td><td>习题类型</td></tr>
<c:forEach var= "pro" items="${pro_pageBean.pageDate}">
<tr><td id = "no">${pro.no}</td>
<td id="detail">${pro.detail}</td>
<td id="keyw">${pro.keyw}</td>
<td id="dif">${pro.dif}</td>
<td id="cha_no">${pro.cha_no}</td>
<td id="title">${pro.title}</td>
<td id="mpiont">${pro.mpiont}</td>
<td id="type">${pro.type}</td>
</c:forEach>
<tr><td></td></tr>
</table></div>
<div><table><tr>
<td>当前${pro_pageBean.getCurrentpage()}/${pro_pageBean.getTotalPage()}页</td>
<td><a href="page_problem?pro_currentPage=1"><input type="button" value="首页"></a></td>
<td><a href="page_problem?pro_currentPage=${pro_pageBean.getCurrentpage()-1}"><input type="button" value="上一页"></a></td>
<td><a href="page_problem?pro_currentPage=${pro_pageBean.getCurrentpage()+1}"><input type="button" value="下一页"></a></td>
<td><a href="page_problem?pro_currentPage=${pro_pageBean.getTotalPage()}"><input type="button" value="尾页"></a></td>
</table></div>
</div>
<div id="apDiv3">
<form action="sel_problem" method="post"><div><table>
<tr><td>请选择习题难度</td>
<td><input type="checkbox" name="dif" id="dif_zero" value="0">0</td>
<td><input type="checkbox" name="dif" id="dif_one" value="1">1</td>
<td><input type="checkbox" name="dif" id="dif_two" value="2">2</td>
<td><input type="checkbox" name="dif" id="dif_three" value="3">3</td>
<td><input type="checkbox" name="dif" id="dif_four" value="4">4</td>
<td><input type="checkbox" name="dif" id="dif_five" value="5">5</td>
<td><input type="checkbox" name="dif" id="dif_six" value="6">6</td>
<td><input type="checkbox" name="dif" id="dif_seven" value="7">7</td>
<td><input type="checkbox" name="dif" id="eight" value="8">8</td>
<td><input type="checkbox" name="dif" id="dif_nine" value="9">9</td>
</tr></table></div><div><table>
<tr><td>请选择习题章节号</td>
<td><input type="checkbox" name="select_chano" value="1">1</td>
<td><input type="checkbox" name="select_chano" value="2">2</td>
<td><input type="checkbox" name="select_chano" value="3">3</td>
<td><input type="checkbox" name="select_chano" value="4">4</td>
<td><input type="checkbox" name="select_chano" value="5">5</td>
<td><input type="checkbox" name="select_chano" value="6">6</td>
</tr></table><table><tr><td>请选择习题关键词</td>
<td><input type="checkbox" name="select_keyw" value="计算机网络">计算机网络</td>
<td><input type="checkbox" name="select_keyw" value="计算机体系结构">计算机体系结构</td>
</tr></table></div><div>
<input type="submit" value="查询"><input type="reset" value="重置">
</div></form><div><form action="create_test" method="post"><table>
<tr><td></td><td width="450">题目</td><td width="100">所属章节标题</td><td width="100">所属章节要点</td><td width="100">习题类型</td></tr>
<c:forEach var= "pro" items="${list}">
<tr><td><input type="checkbox" name="test" value="${pro.no}"></td>
<td id="detail">${pro.detail}</td>
<td id="title">${pro.title}</td>
<td id="mpiont">${pro.mpiont}</td>
<td id="type">${pro.type}</td>
</c:forEach>
<tr><td>请输入试卷编号:</td><td><input type="text" name="test_no"></td></tr>
<tr><td>请输入试卷名称:</td><td><input type="text" name="test_name"></td></tr>
<tr><td>请输入试卷类型:</td><td><input type="text" name="test_type"></td></tr>
<tr><td>请输入试卷难度:</td><td><input type="text" name="test_dif"></td></tr>
<tr><td>请输入试卷分数:</td><td><input type="text" name="test_score"></td></tr>
<tr><td><input type="submit" value="生成试卷">
</table></form></div></div>
<%String tst_add = (String)session.getAttribute("tst_add"); 
if(tst_add == "false"){%>
<script>alert("试卷生成失败！");</script>
<%session.setAttribute("tst_add", null);}
if(tst_add == "true"){%>
<script>alert("试卷生成成功！");</script>
<%session.setAttribute("tst_add", null);} %>
<div id="apDiv4">
<div><form action="adj_test" method="post">
<table><tr><td>请输入要调整的试卷号:
</td><td><input type="text" name="test_no"></td></tr>
<tr><td ><input type="submit" value="查询"></td></tr>
<tr><td width="50">编号</td><td width="450">题目</td><td width="100">关键字</td><td width="50">难度系数</td><td width="50">所属章节编号</td><td width="100">所属章节标题</td><td width="100">所属章节要点</td><td>习题类型</td><td></td></tr>
<c:forEach var= "pro" items="${list}">
<tr><td>${pro.no}</td><td>${pro.detail}</td><td>${pro.keyw}</td><td>${pro.dif}</td><td>${pro.cha_no}</td><td>${pro.title}</td><td>${pro.mpiont}</td><td>${pro.type}</td>
<td><a href="del_test?tst_delete=true&pro_no=${pro.getNo()}&test_no=${test_no}"><input type="button" value="删除"></a></td></tr>
</c:forEach>
</table></form>
</div>
<div><form action="add_test" method="post"><table>
<tr><td>请输入要添加习题的试卷号:</td><td><input type="text" name="test_add_no"></td></tr>
<tr><td>请输入要添加的习题号:</td><td><input type="text" name="add_test_no"></td></tr>
<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
</table></form></div>
</div>
<%String addtest = (String)session.getAttribute("addtest"); 
if(addtest == "false"){%>
<script>alert("习题添加失败！");</script>
<%session.setAttribute("addtest", null);}
if(addtest == "true"){%>
<script>alert("习题添加成功！");</script>
<%session.setAttribute("addtest", null);} %>
<%String deltest = (String)session.getAttribute("deltest"); 
if(deltest == "false"){%>
<script>alert("习题删除失败！");</script>
<%session.setAttribute("deltest", null);}
if(deltest == "true"){%>
<script>alert("习题删除成功！");</script>
<%session.setAttribute("deltest", null);} %>
<div id="apDiv5">
<table><tr><td height="420">试卷导出
</td></tr>
<tr><td height="60">
</td></tr></table>
</div>
<div id="apDiv6" align="left">
<input name="back" type="button" onclick="MM_goToURL('parent','index.jsp');return document.MM_returnValue" value="上一步"/></div>
</body>
</html>