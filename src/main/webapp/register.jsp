<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/collaboration.png">
                <h1>
Register Account</h1>
<form action="RegisterServlet" method="post">

<p>Name</p>
<input type="text" placeholder="Name" name="name" required>

<p>Email</p>
<input type="email" placeholder="Email" name="email" required>

<p>Password</p>
<label for="pass">Password (6 characters minimum):</label>
<input type="password" placeholder="Password" name="password" minlength="6" required>
                  
                  
                   <input type="submit" value="Register">
                   <a href="index.jsp">Already have Account?</a>
                </form>
</div>
</div>
</body>
</html>
