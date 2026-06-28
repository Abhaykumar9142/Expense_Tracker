<!DOCTYPE HTML>
<html>
<HEAD>
    <TITLE>Sign Up page</TITLE>
    <link rel="stylesheet" href="style.css">
</HEAD>
<body>
<h1>Login Page</h1>
<form action="login" method="post">
    <div id="login_box">
        <table>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" required> </td>
            </tr>

            <tr>
                <td>Password</td>
                <td><input type="password" name="password" required> </td>
            </tr>

            <TR>
                <td colspan="2" align="center">
                    <input type="submit" value="Login">
                </td>
            </TR>

        </table>
        <p>New User ?<a href="signup.jsp"> Sign up Here</a></p>


    </div>
</form>
</body>
</html>