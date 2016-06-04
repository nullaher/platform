<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="taglib.jsp"%>
<script src="js/angular.min.js"></script>

<center>

	<div ng-app="platform-web" ng-controller="svcApiCtrl">
		<label>IP地址:</label><input id="ipAddress" ng-model="ipAddress">
		<label>端 口:</label><input id="port" ng-model="port">
		<h2>${svcInfo.name }:<lable id="svcUrl">http://{{ipAddress}}:{{port}}${svcInfo.value }</lable>
		</h2>
		<input id="cfgId" type="hidden" value="${svcInfo.id }">
		<form id="svcTestFm">
			<div id="reqDiv">
				<table>
					<tr>
						<th align="right">请求字段名</th>
						<th align="center">输入值</th>
						<th>描述</th>
					</tr>
					<c:if test="${!empty svcParamList }">
						<c:forEach items="${svcParamList}" var="item" varStatus="status">
							<tr>
								<td align="right">${item.name}(${item.key})</td>
								<td><input id="${item.key}" name="${item.key}"
									value="${item.value}" /></td>
								<td>${item.remark}</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="3" align="center">
								<!-- 							<input type="button"value="angular请求" ng-click="showReqResult()" />  -->
								<!-- 							<input type="submit" value="jquery请求" /> --> <input
								type="button" value="发送请求" ng-click="showReqResult()" /> <!-- 							<input type="submit" value="jquery请求" /> -->
								<input type="reset" value="重置" /> <input type="button"
								value="清空" onclick="clearForm()" />
							</td>
						</tr>
					</c:if>
				</table>
			</div>
			<div id="resultDiv">
				<p>以下显示的为返回信息
				<p>
				<table>
					<tr>
						<th align="right">返回字段名</th>
						<th align="center">输入值</th>
						<th>描述</th>
					</tr>
					<tr ng-repeat="item in resultList">
						<td>{{ item.name }}</td>
						<td>{{ item.value }}</td>
						<td>{{ item.remark }}</td>
					</tr>
				</table>
			</div>
		</form>
	</div>

	
</center>

<script>
	$(document).ready(
			function() {
				// 使用 jQuery 异步提交表单
				$('#svcTestFm').submit(
						function() {
							jQuery.ajax({
								url : "svcInfo/" + $('#cfgId').val() + "/"
										+ $('#companyid').val() + '/send',
								contentType : 'application/json;charset=UTF-8',
								data : JSON.stringify({
									'url' : $('#svcUrl').html(),
									'jsonParamStr' : JSON.stringify($(
											'form#svcTestFm')
											.serializeJsonObject())
								}),
								type : "POST",
								beforeSend : function() {
									alert($('#svcUrl').html());
									return true;
								},
								success : function(response) {
									alert("操作成功");
								}
							});
							return false;
						});
			});

	var app = angular.module('platform-web', []);
	app.controller('svcApiCtrl',
			function($scope, $http) {
				$("#resultDiv").hide();
// 				$scope.ipAddress = "192.168.3.51";
// 				$scope.port = "30400";
						$scope.ipAddress="localhost";
						$scope.port="35100";

				$scope.showReqResult = function() {
					$scope.resultList = "";
					$("#resultDiv").hide();
					var compId = typeof (exp) == $('#companyId').val() ? $(
							'#companyId').val() : $('#companyid').val();
					var reqUrl = "svcInfo/" + $('#cfgId').val() + "/" + compId
							+ "/send";
					var param = {
						url : $('#svcUrl').html(),
						jsonParamStr : JSON.stringify($('form#svcTestFm')
								.serializeJsonObject())
					}
					var paramData = $('form#svcTestFm').serializeJsonObject();
					// 					$http({
					// 						url:reqUrl,
					// 				        method: 'POST'      
					// 				        ,data: {url:$('#svcUrl').html(),jsonParamStr:paramData}  

					// 					}).success(function(response) {
					// 						$scope.resultList = response;
					// 						$("#resultDiv").show();
					// 					});
					$http.post(reqUrl, param).success(function(response) {
						$scope.resultList = response;
						$("#resultDiv").show();
					});

				}
			});

	function clearForm() {
		$(':input', '#svcTestFm').not(':button, :submit, :reset, :hidden').val('').removeAttr('checked').removeAttr('selected')
	}
</script>
