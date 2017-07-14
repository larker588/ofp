<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<title>webside	用心、专业、开源免费</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache"/>
<meta http-equiv="Cache-Control" content="no-cache"/>
<meta http-equiv="Expires" content="0"/>
<meta http-equiv="X-UA-Compatible" content="E=edge;chrome=1" />
<meta name="keywords" content="webside,响应式前端解决方案,RBAC权限管理,一站式架构设计,java web" />
<meta name="description" content="webside,响应式前端解决方案,RBAC权限管理,一站式架构设计,java web" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<link href="${ctx }/resources/images/webside.ico" rel="icon"/>
<link href="${ctx }/resources/images/webside.ico" type="image/x-icon" rel="bookmark"/>   
<link href="${ctx }/resources/images/webside.ico" type="image/x-icon" rel="shortcut icon"/>  

<link rel="stylesheet" href="${ctx}/resources/js/bootstrap/bootstrap.min.css"/>
<link rel="stylesheet" href="${ctx}/resources/fonts/fontawesome/font-awesome.min.css" media="all"/>
<link rel="stylesheet" href="${ctx}/resources/fonts/opensans/ace-fonts.min.css"/>
<link rel="stylesheet" href="${ctx}/resources/css/ace/ace.min.css" class="ace-main-stylesheet" id="main-ace-style"/>
<link rel="stylesheet" href="${ctx}/resources/css/customer/webside.min.css"/>
<!--[if lte IE 9]>
	<link rel="stylesheet" href="${ctx}/resources/css/ace/ace-part2.min.css" />
	<link rel="stylesheet" href="${ctx}/resources/css/ace/ace-ie.min.css" />
<![endif]-->
<!-- JQuery script -->
<!-- 非IE浏览器不会识别IE的条件注释，所以这里判断非IE需要如下写法：参照下面jquery-2.1.4.min.js引入的方式 -->
<!--[if !IE]><!-->
<script type="text/javascript" src="${ctx}/resources/js/jquery/jquery-2.1.4.min.js"></script>
<!--<![endif]-->
<!--[if IE]>
	<script type="text/javascript" src="${ctx}/resources/js/jquery/jquery-1.11.3.min.js"></script>
<![endif]-->
<!-- basic scripts -->
<script type="text/javascript">
	if ('ontouchstart' in document.documentElement)document.write("<script src='${ctx}/resources/js/jquery/jquery.mobile.custom.min.js'>" + "<"+"script>");
</script>

<!--[if lt IE 9]>
	<script type="text/javascript" src="${ctx}/resources/js/ie/html5shiv.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/ie/respond.min.js"></script>
<![endif]-->
<!--[if lt IE 8]>
    <script src="${ctx}/resources/js/ie/json2.js"></script>
<![endif]-->
<!--[if lte IE 8]>
	<script type="text/javascript" src="${ctx}/resources/js/ie/excanvas.min.js"></script>
<![endif]-->

<script src="${ctx}/resources/js/jqueryui/jquery-ui.min.js" type="text/javascript"></script>
<script src="${ctx}/resources/js/jqueryui/jquery.ui.touch-punch.min.js" type="text/javascript"></script>

<script type="text/javascript" src="${ctx}/resources/js/layer-v2.3/layer.js"></script>

<link rel="stylesheet" type="text/css" href="${ctx}/resources/js/dlshouwen.grid.v1.2.1/dlshouwen.grid.min.css" />
<script type="text/javascript" src="${ctx}/resources/js/dlshouwen.grid.v1.2.1/dlshouwen.grid.treegrid.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/dlshouwen.grid.v1.2.1/i18n/zh-cn.js"></script>

<script type="text/javascript" src="${ctx}/resources/js/jquery-validation/jquery.validate.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/jquery-validation/localization/messages_zh.js"></script>

<script type="text/javascript" src="${ctx}/resources/js/nicescroll/jquery.nicescroll.min.js"></script>

<script src="${ctx}/resources/js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="${ctx }/resources/js/bootstrap-switch/css/bootstrap3/bootstrap-switch.min.css"/>
<script type="text/javascript" src="${ctx }/resources/js/bootstrap-switch/js/bootstrap-switch.min.js"></script>

<script type="text/javascript" src="${ctx }/resources/js/underscore/underscore-min.js"></script>
<script type="text/javascript" src="${ctx }/resources/js/purl/purl.min.js"></script>

<script type="text/javascript" src="${ctx }/resources/js/scrollreveal/scrollreveal.min.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/customer/index/index.min.js"></script>
<script type="text/javascript" type="text/javascript">
var sys = sys || {};
sys.rootPath = "${ctx}";
sys.pageNum = 10;
sys.gridStyle = "Bootstrap";
window.scrollreveal = ScrollReveal();
</script> 