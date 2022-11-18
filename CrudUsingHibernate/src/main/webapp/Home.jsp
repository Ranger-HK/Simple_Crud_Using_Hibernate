<%-- 
    Document   : Home
    Created on : Oct 27, 2022, 6:01:39 PM
    Author     : Ravindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="assets/boostrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/fonts/css/all.css"/>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital@1&family=Roboto:wght@300&family=Work+Sans:ital,wght@1,500&display=swap" rel="stylesheet">
        <!--                <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">-->
        <link rel="stylesheet" type="text/css" href="https://common.olemiss.edu/_js/sweet-alert/sweet-alert.css">



        <style>


            html,body{
                background-image: url('assets/img/pexels-henry-&-co-2341290.jpg');
                /*                background-size: cover;*/
                background-repeat: no-repeat;
                height: 100%;
                font-family: 'Roboto', sans-serif;

            }

            .table-success{
                position: relative;
                top:-30px;

            }


            #back{
                position: relative;
                font-size: 60px;
                left: 1830px;
                top: 23px;
            }



            .btn-danger{
                position: relative;
                font-size: 25px;
                border-radius: 10px;
                left: -35px;
                top: 5px;
                background-color: #e74c3c;
            }

            .btn-secondary{
                position: relative;
                font-size: 25px;
                border-radius: 10px;
                left:15px;
                top: 5px;
                background-color: #1abc9c;
                color: #ecf0f1;

            }

            .btn-secondary:hover{
                background-color: #16a085;
                color: #ecf0f1;
            }

            .btn-danger:hover{
                background-color: #c0392b;
            }

            h1{
                position: relative;
                top: -68px;
                left: 870px;
                font-family: 'Lato', sans-serif;
                font-size: 45px;
                font-weight: 800;

            }

            section{
                top: -100px;
                position: relative;

            }

            .container{
                height: 100%;
                align-content: center;
            }

            .user-card{
                height: 515px;
                margin-top: 80px;
                margin-bottom: auto;
                width: 900px;
                background-color: rgba(0,0,0,0.8) !important;

            }

            .card-body{
                position: relative;
                top: 20px;
                width: 800px;
                left: 40px;



            }

            .input-group span{
                width:50px;
                background-color: #f1c40f;
                color: black;
                border:0 !important;
            }

            .fa-user::before {
                font-size: 22px;
                left: 0px;
                top: 0px;
                position: relative;
            }
            .fa-solid{
                font-size: 22px;
                position: relative;
            }
            .fa-regular{
                font-size: 22px;
                position: relative;
            }
            .fa-envelope{
                font-size: 22px;
                position: relative;
            }
            .fa-users{
                font-size: 20px;
                position: relative;
            }
            .fa-lock{
                font-size: 20px;
                position: relative;
            }
            input:focus{
                outline: 0 0 0 0  !important;
                box-shadow: 0 0 0 0 !important;
            }

            .tblSection{
                position: relative;
                top: 10px;
                width: 1800px;
                left: 45px;
            }


            #table_filter{
                top: -30px;
                position: relative;
                left: 697px;
                width: 200px;
            }



        </style>
    </head>

    <body>



        <div class="col-5">
            <a href="Login.jsp"><span><i class="fa-solid fa-circle-arrow-left" id="back"></i></span></a>
            <button type="button" class="btn btn-danger btn-sm" id="btnDelete">Delete</button>
            <button type="button" class="btn btn-secondary btn-sm" id="btnUpdate">Update</button>
            <h1>Users Details</h1>
        </div>


        <section>

            <div class="container">
                <div class="row justify-content-center">
                    <div class="user-card">
                        <div class="card-header">



                        </div>
                        <div class="card-body">


                            <form class="form-horizontal" method="post" action="#" id="user">

                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">User Id</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa-solid fa-image-portrait"></i></span>
                                            <input type="text" class="form-control" name="userID" id="txtUserId" placeholder="Enter Your Id" />
                                        </div>

                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="name" class="cols-sm-2 control-label">Name</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="userName" id="txtUserName" placeholder="Enter Your Name" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="email" class="cols-sm-2 control-label">Address</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa-regular fa-address-card"></i></span>
                                            <input type="text" class="form-control" name="userAddress" id="txtUserAddress" placeholder="Enter Your Address" />
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="email" class="cols-sm-2 control-label">Email</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="email" id="txtEmail" placeholder="Enter Your Email" />
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="username" class="cols-sm-2 control-label">Contact</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                            <input type="text" class="form-control" name="contact" id="txtContact" placeholder="Enter Your Contact" />
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="password" class="cols-sm-2 control-label">Password</label>
                                    <div class="cols-sm-10">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                            <input type="password" class="form-control" name="password" id="txtPassword" placeholder="Enter your Password" />
                                        </div>
                                    </div>
                                </div>


                            </form>
                        </div>

                    </div>

                </div>
            </div>
        </section>

        <section class="tblSection">
            <div class="col-12 mt-2">
                <table id="table" class="table table-success table-striped table-bordered table-hover ">

                    <thead class="table-dark">
                        <tr>
                            <th scope="col">User Id</th>
                            <th scope="col">Name</th>
                            <th scope="col">Address</th>
                            <th scope="col">Email</th>
                            <th scope="col">Contact</th>
                            <th scope="col">Password</th>
                        </tr>
                    </thead>
                    <tbody id="userTable">


                    </tbody>
                </table>

            </div>


        </section>
        <script src="assets/jQuery/jquery-3.6.0.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://common.olemiss.edu/_js/sweet-alert/sweet-alert.min.js"></script>
        <script src="controller/UserController.js"></script>    
        <script src="controller/TableClick.js"></script> 
<!--        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>-->
        <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#table').DataTable();
            });
        </script>


    </body>

</html>
