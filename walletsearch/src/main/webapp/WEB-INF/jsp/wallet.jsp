<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Wallet To Wallet</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="jquery.min.js"></script>
  <script src="jquery.form-validator.min.js"></script>
  <script src="module-name.min.js"></script>
</head>
<script>
    function isNumber(evt) {
        evt = (evt) ? evt : window.event;
        var charCode = (evt.which) ? evt.which : evt.keyCode;
        if (charCode > 31 && (charCode < 48 || charCode > 57)) {
            return false;
        }
        return true;
    }
    function openwindow() {
        winURL = "search";
        winName = "search";
        winHeight = 380;
        winWidth = 600;
        winHeight = 380;
        winWidth = 600;
        winTop = ((screen.availHeight / 2) - (winHeight / 2));
        winLeft = ((screen.availWidth / 2) - (winWidth / 2));
        winOpen = "";
        if (winOpen) {
            if (winOpen.closed) {
                winOpen = window
                    .open(
                        winURL,
                        winName,
                        "top="
                        + winTop
                        + ",left="
                        + winLeft
                        + ",width="
                        + winWidth
                        + ",height="
                        + winHeight
                        + ",resizable=no,toolbar=no,scrollbars=yes,location=no,status=no,menubar=no")
            } else {
                winOpen.close();
                winOpen = window
                    .open(
                        winURL,
                        winName,
                        "top="
                        + winTop
                        + ",left="
                        + winLeft
                        + ",width="
                        + winWidth
                        + ",height="
                        + winHeight
                        + ",resizable=no,toolbar=no,scrollbars=yes,location=no,status=no,menubar=no")
            }
        } else {
            winOpen = window
                .open(
                    winURL,
                    winName,
                    "top="
                    + winTop
                    + ",left="
                    + winLeft
                    + ",width="
                    + winWidth
                    + ",height="
                    + winHeight
                    + ",resizable=no,toolbar=no,scrollbars=yes,location=no,status=no,menubar=no")
        }
        winOpen.focus();
    }
</script>
<style>
  .navbar-inverse{
    background-color: #122b40;
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
<div class="col-md-5">
</div>
<div  style="color: #122b40;"class="col-md-4 text center">
  <strong><%out.print(session.getAttribute("WalletMsg"));%></strong>
</div>
</div>
<div class="container" style="width: 50%;margin-top: 4%">
  <div class="row">
    <div class="col-md-12">
      <div class="well well-sm">
        <form:form method="post" modelAttribute="wallet" name="wallet" action="/executewalletowallet">
          <fieldset>
            <center>
            <nav class="container-fluid" style="background-color: #122b40">
              <h3 class="text" style="color: white">Wallet To Wallet</h3>
            </nav>
            </center>
            <hr>
            <div class="col-lg-12">
            <div class="form-group">
              <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user"></i></span>
              <div class="col-md-8">
                <label>Wallet ID</label>
                <div class="input-group">
                  <input id="debit_walletid" name="debit_walletid" type="text"  placeholder="Wallet Id" class="form-control" value="${wallet.debit_walletid}" required="required">
                  <span class="input-group-addon" onclick="return openwindow()"> <i class="glyphicon glyphicon-search"></i>
                  </span>
                </div>
              </div>
            </div>
              <br>
            <div class="form-group">
              <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-address-book "></i></span>
              <div class="col-md-8">
                <label>Name</label>
                <input id="name" name="name" type="text" placeholder="Name" class="form-control" value="${wallet.name}" required="required">
              </div>
            </div>
            <div class="form-group">
              <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-dollar"></i></span>
              <div class="col-md-8">
                <label>Amount</label>
                <input id="amount" name="amount" type="text" placeholder="Amount" class="form-control" value="${wallet.amount}" onkeypress="return isNumber(event)" required="required">
              </div>
            </div>
            <div class="form-group">
              <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-briefcase"></i></span>
              <div class="col-md-8">
                <label>Narration</label>
                <input id="narration" name="narration" type="text" placeholder="Narration" class="form-control" value="${wallet.narration}" required="required">
              </div>
            </div>
            <div class="row">
              <div class="form-group">
                <div class="col-md-12 text-center">
                  <button type="submit" class="btn btn-primary btn-lg" style="margin-top: 2%;background-color: #122b40" >Submit</button>
                </div>
              </div>
            </div>
            </div>
          </fieldset>
        </form:form>
      </div>
    </div>
  </div>
</div>
<div>
</div>
<footer class="page-footer font-small cyan darken-3" style="margin-top: 3%">
  <div class="footer-copyright text-center py-3">
    © 2018 Copyright: Erapay
  </div>
</footer>
</body>
</html>