<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../common.jsp" %>
<script type="text/javascript">
	function register(){
		location.href="registerForm.me"; // => MemberRegisterController.java
	}
	
	function memberList(){
		
	}
</script>
<form method="post" action="loginForm.me">
	<table border="1" width="40%" height="150px">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="customer_id" value="park"></td>
		</tr>
		
		<tr>
			<td>비번</td>
			<td><input type="password" name="customer_passwd"></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="로그인">
				<input type="button" value="아이디/비밀번호 찾기">
				<input type="button" value="회원가입" onClick="register()">
				<input type="button" value="회원목록보기"  onClick="memberList()">   
			</td>
		</tr>
	</table>
</form>