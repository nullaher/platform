<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../common/taglib.jsp"%>
<script src="js/angular.min.js"></script>
<center>
	<div ng-app="platform-web" ng-controller="pageCtrl">

		<p>
			名字 : <input type="text" ng-model="name">
		</p>
		<h1>Hello {{name}}</h1>

		<div id="list">
			<h2>配置信息</h2>
			<input type="button" value="add" id="addBtn" ng-click="addBtnClick()" />
			<input type="button" value="del" id="delBtn" ng-click="delBtnClick()" />
			<input type="button" value="upt" id="uptBtn" ng-click="uptBtnClick()" />
			<input type="button" value="sel" id="selBtn" ng-click="selBtnClick()" />
			<table>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>key</th>
					<th>value</th>
					<th>remark</th>
				</tr>
				<tr ng-repeat="item in dataList">
					<td>{{ item.id }}</td>
					<td>{{ item.name }}</td>
					<td>{{ item.key }}</td>
					<td>{{ item.value }}</td>
					<td>{{ item.remark }}</td>
				</tr>
			</table>
		</div>
		<br>
		<div id="editDiv">
			<form id="editForm">
				<table>
					<!-- 				<tr> -->
					<!-- 					<th>id</th><td><input name="id" /></td> -->
					<!-- 				</tr> -->
					<tr>
						<th>name</th>
						<td><input name="name" /></td>
					</tr>
					<!-- 				<tr> -->
					<!-- 					<th>key</th><td><input name="key" /></td> -->
					<!-- 				</tr> -->
					<tr>
						<th>value</th>
						<td><input name="value" /></td>
					</tr>
					<tr>
						<th>type</th>
						<td><input name="type" value="0" /></td>
					</tr>
					<tr>
						<th>pid</th>
						<td><input name="pid" value="0" /></td>
					</tr>
					<tr>
						<th>remark</th>
						<td><input name="remark" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</center>

<script>
	var app = angular.module('platform-web', []);
	app.controller('pageCtrl', function($scope, $http) {
		$("#editDiv").hide();

		init($scope, $http);

		$scope.addBtnClick = function(type) {
			if ($("#editDiv").is(':hidden')) {
				$("#editDiv").show();
			} else {
				$scope.dataList = "";
				$http.post("cfg/add", $('form#editForm').serializeJsonObject()).success(function() {
					init($scope, $http);
				});
			}
		}
	});
	
	function init($scope, $http){
		$http.post("cfg/list").success(function(response) {
			$scope.dataList = response;
		});
	}
</script>