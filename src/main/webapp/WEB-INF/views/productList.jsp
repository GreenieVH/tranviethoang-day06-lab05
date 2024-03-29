<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_navTop.jsp"></jsp:include>
	
	<section class="container">
		<h3>Product List</h3>
		<a href="productCreate" class="btn btn-primary">Create Product</a>
		<p style="color: red;">${errorString}</p>
		<table class="table table-bordered">
			<thead style="background: #f1f1f1;">
				<tr>
					<th>Code</th>
					<th>Name</th>
					<th>Price</th>
					<th>Tuỳ chọn</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td>${product.code}</td>
						<td>${product.name}</td>
						<td>${product.price}</td>
						<td>
							<a href="productEdit?code=${product.code}" class="btn btn-success">Edit</a>
							<a href="productDelete?code=${product.code}" class="btn btn-danger">Delete</a>
						</td>					
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>