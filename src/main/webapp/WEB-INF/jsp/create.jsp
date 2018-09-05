<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Create Task</title>
</head>
<body>
<font color="red">${errorMessage}</font>
<form method="post">
    Start Date : <input type="date" name="Start Date"/>
    <BR>
    End Date : <input type="date" name="End Date"/>
    <BR>
    Is repeated : <input type="checkbox" name="isRepeated">

    <select name="days">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
    </select>
    <input type="submit"/>
</form>
</body>
</html>