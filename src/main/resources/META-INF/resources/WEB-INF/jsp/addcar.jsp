<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form:form action="" method="post" modelAttribute="car">
<fieldset>
<div class="form-group"><form:label path="brand">Brand:</form:label> 
<form:input class="form-control" type="text" path="brand"/>
</div>
</fieldset>
<div class="form-group"><form:label path="color">Color:</form:label> 
<form:input class="form-control" type="text" path="color"/>
</div>
<div class="form-group"><form:label path="model">Model: </form:label>
<form:input class="form-control" type="text" path="model"/>
<form:errors path="model" cssClass="text-warning"/>
</div>
<input type="submit" class="btn btn-success">
</form:form>
</div>
<script src="/webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/3.7.0/jquery.min.js"></script>
</body>
</html>