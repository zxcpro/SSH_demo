<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>登录/注册</title> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="images/login.js"></script>
<link href="css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>信息发布</h1>

<div class="login" style="margin-top:50px;">
    
  <!--注册-->
    <div class="qlogin" id="qlogin" style="display: block; ">
   
    <div class="web_login"><form name="form2" id="regUser" accept-charset="utf-8"  action="/exchange/addExchangeAction" method="post">
        <ul class="reg_form" id="reg-ul">
        	<div id="userCue" class="cue">请填写发布信息：</div>
                <li>
                    <label for="user"  class="input-tips2">标题：</label>
                    <div class="inputOuter2">
                        <input type="text" id="title" name="title" maxlength="16" class="inputstyle2"/>
                    </div>
                    
                </li>
                
                <li>
                <label for="passwd" class="input-tips2">电话：</label>
                    <div class="inputOuter2">
                        <input type="text" id="mobile"  name="mobile" maxlength="16" class="inputstyle2"/>
                    </div>
                    
                </li>
                <li>
                <label for="passwd2" class="input-tips2">描述：</label>
                    <div class="inputOuter2">
                        <input type="text" id="description" name="description" maxlength="16" class="inputstyle2" />
                    </div>
                    
                </li>
                
                <li>
                    <div class="inputOuter2" style="display: none;">
                        <input type="text" id="name" name="name" maxlength="10" class="inputstyle2" value="${currentUser.username}"/>
                    </div>
                   
                </li>
                
                <li>
                    <div class="inputArea">
                        <input type="submit" style="margin-top:10px;margin-left:85px;" class="button_blue" value="发布"/>
                    </div>
                    
                </li><div class="cl"></div>
            </ul></form>
           
    
    </div>
   
    
    </div>
    <!--注册end-->
</div>
</body></html>