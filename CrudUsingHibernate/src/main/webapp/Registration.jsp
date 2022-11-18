<%-- 
    Document   : Registration
    Created on : Oct 27, 2022, 5:58:05 PM
    Author     : Ravindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <link rel="stylesheet" href="assets/boostrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/fonts/css/all.css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" type="text/css" href="https://common.olemiss.edu/_js/sweet-alert/sweet-alert.css">

        <style>


            html,body{
                background-image: url('https://getwallpapers.com/wallpaper/full/e/c/4/92616.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                height: 100%;
                font-family: 'Roboto', sans-serif;

            }

            .container{
                height: 100%;
                align-content: center;
            }

            .user-card{

                height:800px;
                margin-top: 80px;
                margin-bottom: auto;
                width: 800px;
                background-color:white !important;

            }


            .card-body{
                position: relative;
                top: 20px;
            }


            .input-group span{
                width:35px;
                background-color: #FFC312;
                color: black;
                border:0 !important;
            }

            .fa-user::before {
                font-size: 25px;
                left: 5px;
                top: 7px;
                position: relative;
            }

            .fa-solid{
                font-size: 25px;
                left: 8px;
                top: 7px;
                position: relative;
            }

            .fa-regular{
                font-size: 22px;
                left: 5px;
                top: 10px;
                position: relative;
            }
            .fa-envelope{
                font-size: 22px;
                left: 7px;
                top: 10px;
                position: relative;
            }

            .fa-users{
                font-size: 20px;
                left: 6px;
                top: 10px;
                position: relative;
            }

            .fa-lock{
                font-size: 20px;
                left: 8px;
                top: 8px;
                position: relative;
            }

            input:focus{
                outline: 0 0 0 0  !important;
                box-shadow: 0 0 0 0 !important;

            }

            .btn-md{
                position: relative;
                height: 50px;
                width: 200px;
                color: #ecf0f1;
                background: #f39c12;
                font-size: 25px;
                font-weight: 600;
                left: 268px;
                top: 14px;
                border-radius: 12px;
            }


            .fa-light:hover{
                background:#bdc3c7;

            }

            .btn-primary{
                position: relative;
                top: 45px;
                width: 430px;
                left: 156px;
                border-radius: 12px;
                font-weight: 600;
            }

            #back{
                font-size: 50px;
                top: -688px;
                left: 696px;
            }






        </style>
    </head>
    <body>

        <div class="container">
            <div class="row justify-content-center">
                <div class="user-card">
                    <div class="card-header">
                        <h1>Register</h1>



                    </div>
                    <div class="card-body">


                        <form class="form-horizontal" method="post" id="registerForm" action="#">

                            <div class="form-group">
                                <label for="name" class="cols-sm-2 control-label">User Id</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa-solid fa-image-portrait"></i></span>
                                        <input type="text" class="form-control" name="name" id="txtuserID" placeholder="Enter Your Id" />
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="name" class="cols-sm-2 control-label">User Name</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="name" id="txtuserName" placeholder="Enter Your Name" />
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="cols-sm-2 control-label">Address</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa-regular fa-address-card"></i></span>
                                        <input type="text" class="form-control" name="email" id="txtaddress" placeholder="Enter Your Address" />
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="cols-sm-2 control-label">Email</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="email" id="txtemail" placeholder="Enter Your Email" />
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="username" class="cols-sm-2 control-label">Contact</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                        <input type="text" class="form-control" name="username" id="txtcontact" placeholder="Enter Your Contact" />
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="password" class="cols-sm-2 control-label">Password</label>
                                <div class="cols-sm-10">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                        <input type="password" class="form-control" name="password" id="txtpassword" placeholder="Enter your Password" />
                                    </div>
                                </div>
                            </div>



                            <div class="form-group ">
                                <button type="button" id="btnSave" class="btn btn-primary btn-lg btn-block login-button">Registration</button>
                            </div>


                        </form>
                        <a href="Login.jsp"><span><i class="fa-solid fa-circle-arrow-left" id="back"></i></span></a>
                    </div>

                </div>
            </div>
        </div>

        <script src="assets/jQuery/jquery-3.6.0.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="assets/validation/validation.js"></script>
        <script src="https://common.olemiss.edu/_js/sweet-alert/sweet-alert.min.js"></script>
        <script src="controller/RegistrationController.js"></script>



    </body>
</html>
