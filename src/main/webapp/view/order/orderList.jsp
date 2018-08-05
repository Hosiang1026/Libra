<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<html>
<head>
    <meta charset="UTF-8" />
    <title>订单列表</title>
    <meta name="renderer" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1" />
    <link rel="stylesheet" href="${path}/static/css/index.css" />
    <link rel="stylesheet" href="${path}/static/js/lib/layui/css/layui.css" />
</head>
<body>
<div class="tab-body">
    <p class="page-tab"><span class="layui-breadcrumb" lay-separator="&gt;"><a href="">首页</a><a><cite>订单列表</cite></a></span></p>
    <div class="handle-box">
        <ul>
            <li class="handle-item"><span class="layui-form-label">输入用户名：</span>
                <div class="layui-input-inline">
                    <input type="text" autocomplete="off" placeholder="请输入搜索条件" class="layui-input" />
                </div><button class="layui-btn mgl-20">查询</button><button class="layui-btn mgl-20" id="refresh">刷新</button><span class="fr"><a class="layui-btn layui-btn-danger radius btn-delect" id="btn-delect-all"><i class="linyer icon-delect"></i> 批量删除</a><a class="layui-btn btn-add btn-default" id="btn-adduser"><i class="linyer icon-add"></i> 添加订单</a></span></li>
        </ul>
    </div>
    <div class="layui-clear">
        <div class="tableTools fr"></div>
    </div>
    <table class="table-box table-sort" id="orderTable">
        <thead>
        <tr>
            <th><input type="checkbox" class="btn-checkall fly-checkbox" /></th>
            <th>asin</th>
            <th>item-status</th>
            <th>quantity</th>
            <th>currency</th>
            <th>item-price</th>
            <th>item-promotion-discount</th>
            <th>promotion-ids</th>
            <th>create-time</th>
            <th>status</th>
            <th>operate</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
        <tfoot>
        <tr>
            <th>汇总</th>
            <th></th>
            <th>1</th>
            <th>33</th>
            <th>44</th>
            <th>55</th>
            <th>6</th>
            <th>67</th>
            <th>88</th>
            <th>88</th>
            <th>99</th>
        </tr>
        </tfoot>
    </table>
</div>
<script src="${path}/static/js/lib/layui/layui.js"></script>
<script src="${path}/static/js/define/common.js"></script>
<script src="${path}/static/js/define/order.js"></script>
</body>
</html>