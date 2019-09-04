<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
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
	width: 1200px;
	height: 1000px;
	z-index: 1;
	left: 86px;
	top: 61px;
}
</style>
<script type="text/javascript">
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
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
function MM_showHideLayers() { //v9.0
	  var i,p,v,obj,args=MM_showHideLayers.arguments;
	  for (i=0; i<(args.length-2); i+=3) 
	  with (document) if (getElementById && ((obj=getElementById(args[i]))!=null)) { v=args[i+2];
	    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
	    obj.visibility=v; }
	}
</script>
</head>

<body onload="MM_preloadImages('image/student-after.jpg')">
<div id="apDiv1">
<table>
<tr><td height="500" width="180">
  <a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','image/student-after.jpg',1)"><img src="image/student-before.jpg" width="180" height="120" id="Image1" /></a></td>
  <td><div style="white-space:  pre-line;"><form action="select_test" method="post"><table>
  <tr><td>请输入要查看的试卷号:</td><td><input type="text" name="test_no"></td></tr>
  <tr><td><input type="submit" value="查询"></td></tr></table>
  <table><div>试题名称:${tst.name}  试题类型:${tst.type}  试题难度:${tst.dif}  试题分数:${tst.score}</div>
  <%int i = 1; 
  List<String> list_ans = (List<String>)request.getAttribute("list_ans");%>
  <c:forEach var= "pro" items="${list}">
  <tr height="100"><td valign="top"><%=i %>.</td><td width="660" valign="top">${pro.detail}</td>
  <td><input type="radio" value="A"></td>
  <td><input type="radio" value="B"></td>
  <td><input type="radio" value="C"></td>
  <td><input type="radio" value="D"></td>
  <td><input type="button" value="查看答案" onclick="MM_showHideLayers('<%=i %>','','show')"></td><td><div id="<%=i %>" style="visibility: hidden;"><%if(list_ans!=null)out.print(list_ans.get(i-1));%></div></td></tr>
  <%i++; %>
  </c:forEach>
  </table></form></div></td></tr>
<tr><td height="100" align="center"><input name="back" type="button"  onclick="MM_goToURL('parent','index.jsp');return document.MM_returnValue" value="上一步"/>
</td>
<td height="100" width="700">
</td>
</tr>
</table>
</div>
</body>
</html>