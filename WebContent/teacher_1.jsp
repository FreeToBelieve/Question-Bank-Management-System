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
	height: 480px;
	z-index: 1;
	left: 80px;
	top: 82px;
}
#apDiv2 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 260px;
	top: 81px;
	visibility: hidden;
}
#apDiv3 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 260px;
	top: 81px;
	visibility: hidden;
}
#apDiv4 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 260px;
	top: 81px;
	visibility: hidden;
}
#apDiv5 {
	position: absolute;
	width: 494px;
	height: 493px;
	z-index: 2;
	left: 260px;
	top: 81px;
	visibility: hidden;
}
#apDiv6 {
	position: absolute;
	width: 656px;
	height: 72px;
	z-index: 3;
	left: 99px;
	top: 600px;
}
#apDiv7 {
	position: absolute;
	width: 400px;
	height: 300px;
	z-index: 3;
	left: 500px;
	top: 380px;
	visibility: hidden;
}
#apDiv8 {
	position: absolute;
	width: 400px;
	height: 300px;
	z-index: 3;
	left: 500px;
	top: 380px;
	visibility: hidden;
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

<body onload="MM_preloadImages('image/teacher1-1-after.jpg','image/teacher1-2-after.jpg','/image/teacher1-3-after.jpg','/image/teacher1-4-after.jpg')">
<div id="apDiv1">
<table border="0">
<tr><th height="120" onclick="MM_showHideLayers('apDiv2','','show','apDiv3','','hide','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','image/teacher1-1-after.jpg',1)"><img src="image/teacher1-1-before.jpg" width="180" height="120" id="Image1" /></a></th>
</tr>
<tr><th height="120" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','show','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','image/teacher1-2-after.jpg',1)"><img src="image/teacher1-2-before.jpg" width="180" height="120" id="Image2" /></a></th>
</tr>
<tr><th height="120" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','show','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image3','','image/teacher1-3-after.jpg',1)"><img src="image/teacher1-3-before.jpg" width="180" height="120" id="Image3" /></a></th>
</tr>
<tr><th height="120" onclick="MM_showHideLayers('apDiv2','','hide','apDiv3','','hide','apDiv4','','hide','apDiv5','','show')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','image/teacher1-4-after.jpg',1)"><img src="image/teacher1-4-before.jpg" width="180" height="120" id="Image4" /></a></th>
</tr>
</table></div>
<div id="apDiv2">
<%String pro_add = (String)session.getAttribute("pro_add"); 
if(pro_add == "false"){%>
<script>alert("添加失败，请重新添加！");</script>
<%session.setAttribute("pro_add", null);}
if(pro_add == "true"){%>
<script>alert("添加成功！");</script>
<%session.setAttribute("pro_add", null);} %>
<form action="add_problem" method = "post">
<div>请填写要录入的习题信息:</div>
<table>
<tr><td>编号:</td><td><input type="text" name="add_no" id="add_no"></td></tr>
<tr><td>题目:</td><td><textarea rows="10" cols="20" name = "add_detail" id = "add_detail"></textarea></td></tr>
<tr><td>关键字:</td><td><input type="text" name="add_keyw" id="add_keyw"></td></tr>
<tr><td>难度系数:</td><td><input type="text" name="add_dif" id="add_dif"></td></tr>
<tr><td>章节编号:</td><td><input type="text" name="add_chano" id="add_chano"></td></tr>
<tr><td>章节标题:</td><td><input type="text" name="add_title" id="add_title"></td></tr>
<tr><td>章节要点:</td><td><input type="text" name="add_mpiont" id="add_mpiont"></td></tr>
<tr><td>习题类型:</td><td><input type="text" name="add_type" id="add_type"></td></tr></table>
<div>请填写对应答案信息:</div>
<table>
<tr><td>答案编号:</td><td><input type="text" name="add_ans1no" id="add_ans1no"></td></tr>
<tr><td>答案内容:</td><td><textarea rows="10" cols="20" name = "add_ans1detail" id = "add_ans1detail"></textarea></td><td><input type="button" value="点此添加答案" onclick="MM_showHideLayers('apDiv7','','show')"></td></tr>
</table>
<div><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></div>
<div id="apDiv7" align="left">
<div>请填写对应答案信息:</div>
<table>
<tr><td>答案编号:</td><td><input type="text" name="add_ans2no" id="add_ans2no" value="here"  onfocus="if(value=='here'){value=''}" onblur="if(value==''){value='here'}"></td></tr>
<tr><td>答案内容:</td><td><textarea rows="10" cols="20" name = "add_ans2detail" id = "add_ans2detail"  onfocus="if(value=='here'){value=''}" onblur="if (value ==''){value='here'}" >here</textarea></td></tr>
</table>
</div>
</form>
</div>
<%String pro_upt = (String)session.getAttribute("pro_upt"); 
if(pro_upt == "false"){%>
<script>alert("修改失败！");</script>
<%session.setAttribute("pro_upt", null);}
if(pro_upt == "true"){%>
<script>alert("修改成功！");</script>
<%session.setAttribute("pro_upt", null);} %>
<div id="apDiv3"><form action="upt_problem" method="post">
<table>
<tr><td>请输入要修改的习题号:</td><td><input type="text" name="upt_oldno" id="upt_oldno"></td></tr>
<tr><td>编号:</td><td><input type="text" name="upt_no" id="upt_no"></td></tr>
<tr><td>题目:</td><td><textarea rows="10" cols="20" name = "upt_detail" id = "upt_detail"></textarea></td></tr>
<tr><td>关键字:</td><td><input type="text" name="upt_keyw" id="upt_keyw"></td></tr>
<tr><td>难度系数:</td><td><input type="text" name="upt_dif" id="upt_dif"></td></tr>
<tr><td>章节编号:</td><td><input type="text" name="upt_chano" id="upt_chano"></td></tr>
<tr><td>章节标题:</td><td><input type="text" name="upt_title" id="upt_title"></td></tr>
<tr><td>章节要点:</td><td><input type="text" name="upt_mpiont" id="upt_mpiont"></td></tr>
<tr><td>习题类型:</td><td><input type="text" name="upt_type" id="upt_type"></td></tr></table>
<table>
<tr><td>请输入要修改的原答案编号:</td><td><input type="text" name="upt_ans1oldno" id="upt_ans1oldno"></td></tr>
<tr><td>答案编号:</td><td><input type="text" name="upt_ans1no" id="upt_ans1no"></td></tr>
<tr><td>答案内容:</td><td><textarea rows="10" cols="20" name = "upt_ans1detail" id = "upt_ans1detail"></textarea></td><td><input type="button" value="点此添加答案" onclick="MM_showHideLayers('apDiv8','','show')"></td></tr>
</table>
<div><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></div>
<div id="apDiv8" align="left">
<table>
<tr><td>请输入要修改的原答案编号:</td><td><input type="text" name="upt_ans1oldno" id="upt_ans1oldno" value="here"  onfocus="if(value=='here'){value=''}" onblur="if(value==''){value='here'}"></td></tr>
<tr><td>答案编号:</td><td><input type="text" name="upt_ans2no" id="upt_ans2no" value="here"  onfocus="if(value=='here'){value=''}" onblur="if(value==''){value='here'}"></td></tr>
<tr><td>答案内容:</td><td><textarea rows="10" cols="20" name = "upt_ans2detail" id = "upt_ans2detail"  onfocus="if(value=='here'){value=''}" onblur="if (value ==''){value='here'}" >here</textarea></td></tr>
</table>
</div>
</form></div>
<%String pro_delete = (String)session.getAttribute("pro_delete"); 
if(pro_delete == "false"){%>
<script>alert("删除失败！");</script>
<%session.setAttribute("pro_delete", null);}
if(pro_delete == "true"){%>
<script>alert("删除成功！");</script>
<%session.setAttribute("pro_delete", null);} %>
<div id="apDiv4"><form action="del_problem" method="post">
<table>
<tr><td>请输入要删除的习题号:</td></tr>
<tr><td><input type="text" name="delete_no" id="delete_no"></td></tr>
<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
</table></form></div>
<div id="apDiv5">
<table>
<tr><td height="280"></td></tr>
<tr><td height="200"></td></tr>
</table></div>
<div id="apDiv6">
<input type="button" onclick="MM_goToURL('parent','teacher.jsp');return document.MM_returnValue" value="上一步"/></div>
</body>
</html>