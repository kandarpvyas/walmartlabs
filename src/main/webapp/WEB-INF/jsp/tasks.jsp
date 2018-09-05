<!doctype html>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet"
          href="bower_components/bootstrap/dist/css/bootstrap.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body ng-app="tasksManager">

<div class="container">
    <div ng-view=""></div>
</div>

<div class="footer">
    <div class="container"></div>
</div>

<script src="bower_components/jquery/dist/jquery.js"></script>
<script src="bower_components/angular/angular.js"></script>
<script src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="bower_components/angular-route/angular-route.js"></script>

<script src="scripts/app.js"></script>
<script src="scripts/controllers/tasksController.js"></script>
<script src="scripts/factories/tasksFactory.js"></script>

<a href="/createTask">Create Task</a>

<br>
<br>
<a href="/logout">Logout</a>
</body>
</html>
