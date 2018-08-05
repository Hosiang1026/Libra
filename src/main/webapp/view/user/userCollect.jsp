<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<head>
    <meta charset="utf-8" />
    <meta name="renderer" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1" />
    <link rel="stylesheet" href="${path}/static/css/index.css" />
    <link rel="stylesheet" href="${path}/static/js/lib/layui/css/layui.css" />
    <title>用户信息统计</title>
</head>
<body>
<div class="user-collect">
    <div class="fly-echart echart-map sw-100" id="user-form-map"></div>
    <div class="fly-echart echart-pie sw-50 fl" id="user-form-pie"></div>
    <div class="fly-echart echart-line sw-50 fl" id="user-form-line"></div>
    <div class="fly-echart echart-bar sw-100 fl" id="user-form-bar"></div>
</div>
<script src="${path}/static/js/lib/layui/layui.js"></script>
<script src="${path}/static/js/define/common.js"></script>
<script src="//cdn.bootcss.com/echarts/3.3.2/echarts.min.js"></script>
<script src="${path}/static/js/lib/echarts/macarons.js"></script>
<script src="${path}/static/js/lib/echarts/china.js"></script>
<script src="${path}/static/js/define/user-collect.js"></script>
</body>
</html>