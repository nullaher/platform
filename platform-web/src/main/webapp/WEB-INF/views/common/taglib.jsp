<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<head>
<base href="<%=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"%>">
<title>${title }</title>
<link type="text/css" href="css/style.css" rel="stylesheet" />
<link type="text/css" href="css/base.css" rel="stylesheet" />
<link type="text/css" href="core/jquery/css/redmond/jquery-ui-1.8.21.custom.css" rel="stylesheet" />
<script type="text/javascript" src="core/jquery/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="core/jquery/js/jquery-ui-1.8.21.custom.min.js"></script>
<script type="text/javascript" src="js/base.js"></script>
<!-- <meta charset="utf-8"> -->
</head>
