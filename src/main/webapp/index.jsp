<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert CarInfo here</title>
</head>
<body>
	<form action="add_person">
		<label for="name">차주 성함</label><br>
		<input id="name" type="text" name="name"><br> 
		<label for="phone_number">차주 전화번호</label><br>
		<input id="phone_number" type="text" name="phone_number"><br>
		<label for="car_number">차량 번호</label><br>
		<input id="car_number" type="text" name="car_number"><br>
		<label for="car_type">차 종류</label><br>
		<input id="car_type" type="text" name="car_type"><br>
		<label for="parked_location">주차 구역</label><br>
		<input id="parked_location" type="text" name="parked_location"><br>
		<input type="submit">        
	</form>
</body>
</html>

