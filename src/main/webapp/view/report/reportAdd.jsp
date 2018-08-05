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
    <title>产品添加</title>
</head>
<body>
<div class="pd-20 product-add">
    <form class="layui-form" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">产品名称</label>
            <div class="layui-input-block">
                <input type="text" name="productname" lay-verify="username" autocomplete="off" placeholder="请输入产品名称" class="layui-input" />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">分类类目</label>
            <div class="layui-input-block">
                <select name="classify"><option value="">请选择类目</option><optgroup label="众星宝"><option value="稳健型">稳健型</option><option value="进取型">进取型</option></optgroup><optgroup label="双融宝"><option value="双融宝">双融宝</option></optgroup></select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">产品单价</label>
            <div class="layui-input-block">
                <input type="text" name="productprice" lay-verify="identity" autocomplete="off" placeholder="请输入产品单价" class="layui-input" />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">销售状态</label>
            <div class="layui-input-block">
                <input type="checkbox" name="status" lay-skin="switch" />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">上传图片</label>
            <div class="layui-input-block">
                <input type="file" name="file" class="layui-upload-file" />
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">产品描述</label>
            <div class="layui-input-block">
                <textarea name="productdesc" placeholder="请输入产品描述" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">上传图片</label>
            <div class="layui-input-block">
                <div id="zyupload" class="zyupload"></div>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label"></label>
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit="" lay-filter="productadd">保存并提交</button>
                <button class="layui-btn" lay-submit="" lay-filter="productsave">保存草稿</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<script src="${path}/static/js/lib/layui/layui.js"></script>
<script src="${path}/static/js/define/common.js"></script>
<script src="${path}/static/js/define/product-add.js"></script>
</body>
</html>