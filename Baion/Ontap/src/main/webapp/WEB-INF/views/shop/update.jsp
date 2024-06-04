<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/shop/update" method="post">
    ID :<input type="text" name="id" value="${list.id}" readonly>
    <br>
    Name:<input type="text" name="name" value="${list.name}">
    <br>
    Price:<input type="text" name="price" value="${list.price}">
    <br>
    CreateDate:<input type="date" name="createDate" value="${list.createDate}">
    <br>
    Name:<input type="text" name="category" value="${list.category.id}">
    <button type="submit">Update</button>
</form>
</body>
</html>