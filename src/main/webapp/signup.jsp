<!DOCTYPE HTML>
<html>
<HEAD>
    <TITLE>Sign Up page</TITLE>
    <link rel="stylesheet" href="style.css">
</HEAD>
<body>
<h1>Signup Page</h1>
<form action="signup" method="post">
    <div id="login_box">
        <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" required> </td>
            </tr>

            <tr>
                <td>Email</td>
                <td><input type="email" name="email" required> </td>
            </tr>

            <tr>
                <td>Password</td>
                <td><input type="password" name="password" required> </td>
            </tr>



            <tr>
                <td>Confirm Password</td>
                <td><input type="password" name="cnf_password" required> </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Signup">
                </td>
            </TR>

        </table>
        <p>Already have an account ?<a href="login.jsp"> Login Here</a></p>


    </div>
</form>
</body>
</html>