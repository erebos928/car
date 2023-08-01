<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<table class="table">
<thead>
<th> #</th>
<th> Brand</th>
<th> Color</th>
<th> Model</th>
</thead>
<tbody>
<c:forEach items="${carsList}" var="car" varStatus="index">
<tr>
<td>${index.count}</td>
<td>${car.brand}</td>
<td>${car.color}</td>
<td>${car.model}</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="addcar" class="btn btn-success">Add Car</a>
</div>
<script src="/webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>