/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$("#btnLog").click(function () {
//   console.log("Hello"); 
    var userName = $("#userID").val();
    var password = $("#password").val();

//    console.log(userName+" :"+password);
    obj = {
        userName: userName,
        password: password
    };

//invoked ajax
    $.ajax({
        url: 'loginuser',
        method: 'POST',
        data: "userName=" + obj.userName + "&password=" + obj.password,
        success: function (res) {
            console.log(res);
            if (res.status == "200") {
                swal("Login success!", "You clicked the button!", "success");
                window.location = "Home.jsp";

            } else {
                swal("User name or password incorrect!", "You clicked the button!", "error");

            }
        }
    });
});


