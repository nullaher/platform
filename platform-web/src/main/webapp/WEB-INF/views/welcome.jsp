<%@ include file="taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<link type="text/css"
	href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<link type="text/css"
	href='<spring:url value="/resources/jquery/css/redmond/jquery-ui-1.8.21.custom.css"/>'
	rel="stylesheet" />
<script type="text/javascript"
	src='<spring:url value="/resources/jquery/js/jquery-1.7.2.min.js"/>'></script>
<script type="text/javascript"
	src='<spring:url value="/resources/jquery/js/jquery-ui-1.8.21.custom.min.js"/>'></script>
<script>
	$(function() {
		alert('jQuery Initialized successfully');
	});

	$(document).ready(function() {
		// 使用 jQuery 异步提交表单
		$('#editRealMsgForm').submit(function() {
			jQuery.ajax({
				url : 'editRealMsg.eri',
				data : $('#editRealMsgForm').serialize(),
				type : "POST",
				beforeSend : function() {
					$('#submitButton').hide();
					$('#editRealMsgImg').show();
				},
				success : function() {
					$('#editRealMsgImg').hide();
					$('#modifyButton').show();
					$('#realName').attr("disabled", "true");
					$('#tel').attr("disabled", "true");
				}
			});
			return false;
		});
	});
</script>
</head>

<body>
	Welcome!!
	<h2>List of Users:</h2>
	<div>
		<c:if test="${USERS != null }">
			<c:forEach items="${USERS}" var="user">
				<p>${user.userId}- ${user.userName}</p>
			</c:forEach>
		</c:if>
	</div>
</body>

</html>