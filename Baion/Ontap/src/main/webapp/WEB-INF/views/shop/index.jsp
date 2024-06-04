<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="/shop/list/add" method="post">
Name : <input type="text" name="name">
    Price : <input type="text" name="price">
    CreateDate : <input type="date" name="createDate">
    Category : <input type="text" name="category">
    <button type="submit">ADD</button>
</form>
<br>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>CreateDate</th>
        <th>Category</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="${list}" items="x">
    <tr>
        <td>${x.id}</td>
        <td>${x.name}</td>
        <td>${x.price}</td>
        <td>${x.createDate}</td>
        <td>${x.category.name}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>