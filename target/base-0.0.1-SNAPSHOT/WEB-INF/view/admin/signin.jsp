<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html class="login-bg">
<head>
	<title>Detail Admin - Sign in</title>
    
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
    <!-- bootstrap -->
    <link href="${path}/static/css/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="${path}/static/css/bootstrap/bootstrap-responsive.css" rel="stylesheet" />
    <link href="${path}/static/css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

    <!-- global styles -->
    <link rel="stylesheet" type="text/css" href="${path}/static/css/layout.css" />
    <link rel="stylesheet" type="text/css" href="${path}/static/css/elements.css" />
    <link rel="stylesheet" type="text/css" href="${path}/static/css/icons.css" />

    <!-- libraries -->
    <link rel="stylesheet" type="text/css" href="${path}/static/css/lib/font-awesome.css" />
    
    <!-- this page specific styles -->
    <link rel="stylesheet" href="${path}/static/css/compiled/signin.css" type="text/css" media="screen" />

    <!-- open sans font -->
    <!-- <link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' /> -->
    <link href='${path}/static/css/google_fount.css' rel='stylesheet' type='text/css' />

    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
<body>


    <!-- background switcher -->
    <div class="bg-switch visible-desktop">
        <div class="bgs">
            <a href="#" data-img="landscape.jpg" class="bg active">
                <img src="${path}/static/img/bgs/landscape.jpg" />
            </a>
            <a href="#" data-img="blueish.jpg" class="bg">
                <img src="${path}/static/img/bgs/blueish.jpg" />
            </a>            
            <a href="#" data-img="7.jpg" class="bg">
                <img src="${path}/static/img/bgs/7.jpg" />
            </a>
            <a href="#" data-img="8.jpg" class="bg">
                <img src="${path}/static/img/bgs/8.jpg" />
            </a>
            <a href="#" data-img="9.jpg" class="bg">
                <img src="${path}/static/img/bgs/9.jpg" />
            </a>
            <a href="#" data-img="10.jpg" class="bg">
                <img src="${path}/static/img/bgs/10.jpg" />
            </a>
            <a href="#" data-img="11.jpg" class="bg">
                <img src="${path}/static/img/bgs/11.jpg" />
            </a>
        </div>
    </div>


    <div class="row-fluid login-wrapper">
        <a href="index.html">
            <img class="logo" src="${path}/static/img/logo-white.png" />
        </a>

        <div class="span4 box">
            <div class="content-wrap">
                <h6>Log in</h6>
                <input class="span12" type="text" id="username" placeholder="E-mail address" />
                <input class="span12" type="password" id="pwd" placeholder="Your password" />
                <a href="#" class="forgot">忘记密码?</a>
                <div class="remember">
                    <input id="remember-me" type="checkbox" />
                    <label for="remember-me">记住我</label>
                </div>
                <a class="btn-glow primary login" href="#" id="btnlogin">登陆</a>
            </div>
        </div>

        <div class="span4 no-account">
            <p>没有账户?</p>
            <a href="/login">登陆</a>
        </div>
    </div>

	<!-- scripts -->
    <script src="${path}/static/js/jquery-latest.js"></script>
    <script src="${path}/static/js/bootstrap.min.js"></script>
    <script src="${path}/static/js/theme.js"></script>
    <script src="${path}/static/js/jquery.md5.js"></script>

    <!-- pre load bg imgs -->
    <script type="text/javascript">
        $(function () {
            // bg switcher
            var $btns = $(".bg-switch .bg");
            $btns.click(function (e) {
                e.preventDefault();
                $btns.removeClass("active");
                $(this).addClass("active");
                var bg = $(this).data("img");

                $("html").css("background-image", "url('${path}/static/img/bgs/" + bg + "')");
            });
        });
        //
        jQuery(document).ready(function() {  
        	$("#btnlogin").click("click",function(e){
        	var username=$("#username").val();
			var ud=$("#userpswd").val();
			var pwd = $.md5(ud);
			if(username==null ||username=="" || ud==""|| ud==null){
				//nullid nullid
				//$("#nullid").css("display","block");
				alert("请输入用户名或密码");
				return false;
			}else{
				//$("#nullid").css("display","none");
			}
			$.ajax({  
	            type: "POST", 
	            url: "/login", 
	            cache: false, //将不会从浏览器缓存中加载请求信息。 
	            data:{'name':username,'password':pwd},    
	            dataType: 'json', 
	            success: function(data,statusText){
	              if(data.status==0){
	            	  window.location.href="/research/admin/main";
	              }else{
	            	 //$("#errid").css("display","block");
	            	 alert("登陆失败");
	              }
	            }, 
	            error: function(XMLHttpRequest, textStatus, errorThrown){ 
	                  alert( "系统异常!");
	            } 
	           }); 
		}); 
    }); 
        document.onkeyup = function(e){      //onkeyup是javascript的一个事件、当按下某个键弹起 var _key;                                                 //的时触发  
		    if (e == null) { // ie  
		        _key = event.keyCode;  
		    } else { // firefox              //获取你按下键的keyCode  
		        _key = e.which;          //每个键的keyCode是不一样的  
		    }  

		    if(_key == 13){   //判断keyCode是否是13，也就是回车键(回车的keyCode是13)  
		     //if (validator(document.loginform)){ //这个因该是调用了一个验证函数  
		         document.getElementById('btnlogin').click();    //验证成功触发一个Id为btnLogin的  
		        //}                                                                        //按钮的click事件，达到提交表单的目的  
		    }  
		};  
    </script>
<!-- <div style="display:none">
<script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'>
</script>
</div> -->
</body>
</html>