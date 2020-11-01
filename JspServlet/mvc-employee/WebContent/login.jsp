<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="AuthController">
		<div id=row1>
			<p>
				Username : <input type="text" name="username" id="username" /> <font
					color="red"><span id="usernameFailed"></span></font>
			</p>
		</div>
		<div id=row2>
			<p>
				Password : <input type="password" name="password" id="password" />
				<font color="red"><span id="passwordFailed"></span></font>
			</p>
		</div>
		<input type="submit" name="guest" value="Guest">
		<button onclick="login()">Login</button>
	</form>
</body>
<script>
	var inputName = document.querySelector("#username");
	var inputPass = document.querySelector("#password");
	function login() {
		if (inputName.value == '') {
			document.querySelector("#usernameFailed").innerHTML = "*";
			event.preventDefault();
		}
		if (inputPass.value == '') {
			document.querySelector("#passwordFailed").innerHTML = "*";
			event.preventDefault();
		}
	}
</script>
</html>