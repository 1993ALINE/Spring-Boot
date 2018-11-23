<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Add Bank Account</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script language="JavaScript" src="https://code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<script>
  function validatemobileNo(mobileNo){
      var maintainplus = '';
      var numval = mobileNo.value
      if ( numval.charAt(0)=='+' )
      {
          var maintainplus = '';
      }
      curmobileNovar = numval.replace(/[\\A-Za-z!"£$%^&\,*+_={};:'@#~,.Š\/<>?|`¬\]\[]/g,'');
      mobileNo.value = maintainplus + curmobileNovar;
      var maintainplus = '';
      mobileNo.focus;
  }
  function validateaccountNo(accountNo) {
      var maintainplus = '';
      var numval = accountNo.value
      if (numval.charAt(0) == '+') {
          var maintainplus = '';
      }
      curaccountNovar = numval.replace(/[\\A-Za-z!"£$%^&\,*+_={};:'@#~,.Š\/<>?|`¬\]\[]/g, '');
      accountNo.value = maintainplus + curaccountNovar;
      var maintainplus = '';
      accountNo.focus;
  }
</script>
<style>
  .navbar-inverse{
    background-color: #122b40;
  }
  .panel-primary>.panel-heading
  {
    background: #122b40;

  }
  .panel-primary>.panel-body
  {
    background-color: #EDEDED;
  }
</style>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Erapay</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Gallery</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Options
          <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Pay</a></li>
          <li><a href="#">Withdraw</a></li>
          <li><a href="#">Transfer</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
<div class="container" style="width: 50%;margin-top: 4%">
  <div class="row">
    <div class="row">
      <div class="col-lg-12 col-lg-12 col-lg-12">
        <div class="panel panel-primary">
          <div class="panel-heading" style="text-align: center;font-weight: bold">Add Bank Account</div>
          <div class="panel-body">
            <form:form method="post" modelAttribute="bankAccount" name="bankAccount" action="/addbank">
              <fieldset>
              <div class="form-group">
                <label for="bankName">Bank Name</label>
                <form:select path="bankName" id="status" class="form-control">
                  <form:option value="test" label="Select an Option" />
                  <form:options items="${bankAccount.bankMapValue}"></form:options>
                </form:select>
              </div>
              <div class="form-group">
                <label for="branchName">Branch Name</label>
                <form:select path="branchName" id="status" class="form-control">
                  <form:option value="test" label="Select an Option" />
                  <form:options items="${bankAccount.mapValue}"></form:options>
                </form:select>
              </div>
              <div class="form-group">
                <label for="accountNo">Account No</label>
                <input id="accountNo" name="accountNo" class="form-control" placeholder="Please Enter valid account no" type="text" maxlength="15" onkeyup="validateaccountNo(this)" value="${bankAccount.accountNo}" data-validation="required">
              </div>
              <div class="form-group">
                <label for="accountTitle">Account Title</label>
                <input id="accountTitle" name="accountTitle" class="form-control" placeholder="Account Title" type="text" value="${bankAccount.accountTitle}" data-validation="required">
              </div>
              <div class="form-group">
                <label for="mobileNo">Mobile No</label>
                <input id="mobileNo" name="mobileNo" class="form-control" placeholder="Please Enter valid mobile no" type="text" maxlength="11" onkeyup="validatemobileNo(this)" value="${bankAccount.mobileNo}" data-validation="required">
              </div>
              </fieldset>
              <div class="text-center">
                <a href="" class="btn btn-default btn-rounded" data-toggle="modal" data-target="#modalLoginAvatar" style="background-color: #122b40;color: white">Submit</a>
              </div>
              <div class="modal fade" id="modalLoginAvatar" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
                   aria-hidden="true">
                <div class="modal-dialog cascading-modal modal-avatar modal-sm" role="document">
                  <div class="modal-content">
                    <div class="modal-header">
                      <img src="${img}/otp.png" alt="avatar" class="rounded-circle img-responsive">
                    </div>
                    <div class="modal-body text-center mb-1">
                      <h5 class="mt-1 mb-2">OTP</h5>
                      <div class="md-form ml-0 mr-0">
                        <input type="password" type="text" id="form29" class="form-control form-control-sm validate ml-0">
                        <label data-error="wrong" data-success="right" for="form29" class="ml-0">Enter Your OTP Here</label>
                      </div>
                      <div class="text-center mt-4">
                        <button class="btn btn-cyan mt-1" style="alignment: left;background-color: #122b40;color: white">Submit<i class="fa fa-sign-in ml-1"></i></button>
                        <button class="btn btn-cyan mt-1" style="alignment: right;background-color: #122b40;color: white">Close<i class="fa fa-sign-in ml-1"></i></button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
    </div>
    </div>
    <footer class="page-footer font-small cyan darken-3" style="margin-top: 3%">
      <div class="footer-copyright text-center py-3">
        © 2018 Copyright: Erapay
      </div>
    </footer>
</body>
</html>