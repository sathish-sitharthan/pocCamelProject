<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page
	import="java.sql.*,java.net.*,java.io.*,java.lang.*,java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OneMFA</title>
<style>
a:link, a:visited {
	background-color: #E74C3C;
	color: white;
	padding: 15px 25px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
}

a:hover, a:active {
	background-color: red;
}
</style>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="icon" href="http://10.128.157.148:8080/mfa/sailpoint.ico"
	type="image/gif">
<body align="center">
	<div>
		<img src="http://10.128.157.148:8080/mfa/logo.png" alt="" />
	</div>

	<h2 style="color: #276A87;">OneMFA - VPN Connect</h2>
	<br>
	<br>

	<h3 style="color: #276A87;">Connected Successfully</h3>
	<br>
	<a href="http://10.128.157.148:8080/mfa">Disconnect VPN</a>
</html>
