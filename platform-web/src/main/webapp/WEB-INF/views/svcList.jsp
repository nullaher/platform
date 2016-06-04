<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="taglib.jsp"%>

<script>
// 	$(function() {
// 		alert('jQuery Initialized successfully');
// 	});
</script>
<center>
	<h2>数据转送平台对外接口</h2>
	<div>
		<table>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>value</th>
				<th>desc</th>
				<th>handel</th>
			</tr>

			<c:if test="${!empty svcList}">
				<c:forEach items="${svcList}" var="item">
					<tr>
						<td>${item.id}</td>
						<td>${item.name}</td>
						<td>${item.value}</td>
						<td>${item.remark}</td>
						<td>
							<a href="svcInfo/${item.id}"> 
								test
							</a>
<!-- 							&nbsp;|&nbsp; -->
<%-- 							<a href="svcInfo/${item.id}">  --%>
<!-- 								下载接口文档 -->
<!-- 							</a> -->
<!-- 							&nbsp;|&nbsp; -->
<%-- 							<a href="svcInfo/${item.id}">  --%>
<!-- 								返回编码列表 -->
<!-- 							</a> -->
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</center>
