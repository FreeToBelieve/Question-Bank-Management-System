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
<script language="JavaScript">
			function valStuAll()
			{
				var f1 = valStuUser();
				var f2 = valStuPwd();
				return f1&&f2;
			}
			function valStuUser()
			{
				var userInput = document.getElementById("stu_user");
				var userSpan = document.getElementById("stu_userSpan");
				if(userInput.value.length==0)
				{
					userSpan.innerHTML = "请输入用户名";
					return false;
				}
				else
				{
					userSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
			function valStuPwd()
			{
				var pwdInput = document.getElementById("stu_pwd");
				var pwdSpan = document.getElementById("stu_pwdSpan");
				if(pwdInput.value.length==0)
				{
					pwdSpan.innerHTML = "请输入密码";
					return false;
				}
				else
				{
					pwdSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
			function valTeaAll()
			{
				var f1 = valTeaUser();
				var f2 = valTeaPwd();
				return f1&&f2;
			}
			function valTeaUser()
			{
				var userInput = document.getElementById("tea_user");
				var userSpan = document.getElementById("tea_userSpan");
				if(userInput.value.length==0)
				{
					userSpan.innerHTML = "请输入用户名";
					return false;
				}
				else
				{
					userSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
			function valTeaPwd()
			{
				var pwdInput = document.getElementById("tea_pwd");
				var pwdSpan = document.getElementById("tea_pwdSpan");
				if(pwdInput.value.length==0)
				{
					pwdSpan.innerHTML = "请输入密码";
					return false;
				}
				else
				{
					pwdSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
			function valManAll()
			{
				var f1 = valManUser();
				var f2 = valManPwd();
				return f1&&f2;
			}
			function valManUser()
			{
				var userInput = document.getElementById("man_user");
				var userSpan = document.getElementById("man_userSpan");
				if(userInput.value.length==0)
				{
					userSpan.innerHTML = "请输入用户名";
					return false;
				}
				else
				{
					userSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
			function valManPwd()
			{
				var pwdInput = document.getElementById("man_pwd");
				var pwdSpan = document.getElementById("man_pwdSpan");
				if(pwdInput.value.length==0)
				{
					pwdSpan.innerHTML = "请输入密码";
					return false;
				}
				else
				{
					pwdSpan.innerHTML = "";
					return true;
				}
				// alert(userInput.value.length);
			}
		</script>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 487px;
	height: 63px;
	border: 1px none #000000;
	border: 1px none #000000;
	z-index: 1;
	left: 94px;
	top: 76px;
	font:黑体;
}
#apDiv2 {
	position: absolute;
	width: 459px;
	height: 105px;
	border: 1px none #000000;
	border: 1px none #000000;
	z-index: 2;
	left: 181px;
	top: 247px;
}
#apDiv3 {
	position: absolute;
	width: 148px;
	height: 367px;
	border: 1px none #000000;
	border: 1px none #000000;
	z-index: 2;
	left: -9px;
	top: 122px;
}
#apDiv4 {
	position: absolute;
	width: 459px;
	height: 105px;
	border: 1px none #000000;
	border: 1px none #000000;
	z-index: 2;
	left: 181px;
	top: 247px;
	visibility: hidden;
}
#apDiv5 {
	position: absolute;
	width: 459px;
	height: 105px;
	border: 1px none #000000;
	border: 1px none #000000;
	z-index: 2;
	left: 181px;
	top: 247px;
	visibility: hidden;
}
</style>
<script language="javascript">
function MM_showHideLayers() { //v9.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) 
  with (document) if (getElementById && ((obj=getElementById(args[i]))!=null)) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
    obj.visibility=v; }
}
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
</script>
</head>

<body onload="MM_preloadImages('image/button-teacher-after.jpg','image/button-manager-after.jpg')">
<div id="apDiv1" align="center" style="background-color: #999">
  <p>试题库管理系统</p>
  <div id="apDiv2">
    <form action="Login_student" method="post">
    <table>
    <tr><td>
    学生账号:
    </td><td><input name="stu_user" id = "stu_user" type="text" maxlength="20" onblur = "valStuUser()">
    <span id="stu_userSpan" style="font-size:14px"></span>
    </td></tr>
    <tr><td>
    密码:
    </td><td><input name="stu_pwd" id = "stu_pwd" type="password" maxlength="20" onblur = "valStuPwd()">
    <span id="stu_pwdSpan" style="font-size:14px"></span>
    </td></tr>
    <tr>
      <td><input name="stu_sub" type="submit" value="提交" onclick="return vallStuAll()"/>
    </td>
    <td align="right"><input name="res" type="reset" value="重置"/>
    </td></tr>
    </table>
    </form>
    </div>
    <div id="apDiv3">
    <table height="360" width="180">
    <tr height="120"><th height="120"  onClick="MM_showHideLayers('apDiv2','','show','apDiv4','','hide','apDiv5','','hide')"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image1','','image/button-student-after.jpg',0)"><img src="image/button-student-before.jpg" width="180" height="120" id="Image1" /></a>
    </th></tr>
    <tr height="120" onClick="MM_showHideLayers('apDiv2','','hide','apDiv4','','show','apDiv5','','hide')"><th height="120"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image2','','image/button-teacher-after.jpg',1)"><img src="image/button-teacher-before.jpg" width="180" height="120" id="Image2" /></a>
    </th></tr>
    <tr height="120" onClick="MM_showHideLayers('apDiv2','','hide','apDiv4','','hide','apDiv5','','show')"><th height="120"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image3','','image/button-manager-after.jpg',1)"><img src="image/button-manager-before.jpg" width="180" height="120" id="Image3" /></a>
    </th></tr>
    </table>
  </div>
  <div id="apDiv4">
  <form action="Login_teacher" method="post">
  <table>
    <tr><td>
    教师账号:
    </td><td><input name="tea_user" id = "tea_user" type="text" maxlength="20" onblur = "valTeaUser()">
    <span id="tea_userSpan" style="font-size:14px"></span>
    </td></tr>
    <tr><td>
    密码:
    </td><td><input name="tea_pwd" id = "tea_pwd" type="password" maxlength="20" onblur = "valTeaPwd()">
    <span id="tea_pwdSpan" style="font-size:14px"></span>
    </td></tr>
    <tr>
      <td><input name="tea_sub" type="submit" value="提交" onclick="return vallTeaAll()"/>
    </td>
    <td align="right"><input name="res" type="reset" value="重置" />
    </td></tr>
    </table>
    </form>
  </div>
  <div id="apDiv5">
  <form action="Login_manager" method="post">
  <table>
    <tr><td>
    管理员账号:
    </td><td><input name="man_user" id = "man_user" type="text" maxlength="20" onblur = "valManUser()">
    <span id="man_userSpan" style="font-size:14px"></span>
    </td></tr>
    <tr><td>
    密码:
    </td><td><input name="man_pwd" id = "man_pwd" type="password" maxlength="20" onblur = "valManPwd()">
    <span id="man_pwdSpan" style="font-size:14px"></span>
    </td></tr>
    <tr>
      <td><input name="man_sub" type="submit" value="提交" onclick="return vallManAll()"/>
    </td>
    <td align="right"><input name="res" type="reset" value="重置" />
    </td></tr>
    </table>
    </form>
  </div>
</div>
</body>
</html>