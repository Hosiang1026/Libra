<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<html>
 <head>
  <meta charset="UTF-8" />
  <title>首页</title>
  <meta name="renderer" content="webkit" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1" />
  <link rel="stylesheet" href="${path}/static/css/index.css" />
  <link rel="stylesheet" href="${path}/static/js/lib/layui/css/layui.css" />
 </head>
 <body>
  <div class="layui-layout-admin fly-body">
   <div class="layui-header">
    <div class="admin-title dp-ib">
     <h1 class="fs-24 dp-ib c-fff mgl-20 mgt-10">后台管理</h1>
    </div>
    <div class="layui-top-nav dp-ib ve-t">
     <ul class="layui-nav">
      <li class="layui-nav-item layui-this"><a href="javascript:">大数据</a></li>
      <li class="layui-nav-item"><a href="javascript:">全栈开发</a>
       <dl class="layui-nav-child">
        <dd>
         <a href="javascript:">顶部菜单2-1</a>
        </dd>
        <dd>
         <a href="javascript:">顶部菜单2-2</a>
        </dd>
        <dd>
         <a href="javascript:">顶部菜单2-3</a>
        </dd>
       </dl></li>
     </ul>
    </div>
    <div href="#!" class="layui-right user">
     <a href="#!" class="user-avatar"><img src="${path}/static/images/common/user-photo.jpg" alt="" class="layui-circle" /><span class="c-fff mgl-20">超级管理员</span></a>
     <ul class="user-nav">
      <li class="user-nav-item"><a href="#!"><i class="layui-icon"></i> 个人设置</a></li>
      <li class="user-nav-item"><a href="javascript:" id="btn-exit" data-url="/login"><i class="layui-icon"></i> 退出</a></li>
     </ul>
    </div>
   </div>
   <div class="layui-side">
    <ul class="layui-nav layui-nav-tree" id="sideNav" lay-filter="sideNav">
     <li class="layui-nav-item"><a>产品管理</a>
      <dl class="layui-nav-child">
       <dd>
        <a href="javascript:" data-url="product/productlist"><label>产品列表</label></a>
       </dd>
      </dl></li>
     <li class="layui-nav-item"><a>订单管理</a>
      <dl class="layui-nav-child">
       <dd>
        <a href="javascript:" data-url="order/orderlist"><label>订单列表</label></a>
       </dd>
      </dl></li>
     <li class="layui-nav-item"><a>报表管理</a>
      <dl class="layui-nav-child">
       <dd>
        <a href="javascript:" data-url="report/reportlist"><label>报表统计</label></a>
       </dd>
      </dl></li>
     <li class="layui-nav-item"><a>用户管理</a>
      <dl class="layui-nav-child">
       <dd>
        <a href="javascript:" data-url="user/userlist"><label>用户列表</label></a>
       </dd>
       <dd>
        <a href="javascript:" data-url="user/usercollect"><label>用户统计</label></a>
       </dd>
      </dl></li>
    </ul>
   </div>
   <div class="layui-body">
    <div class="layui-tab fly-tab layui-tab-card" lay-filter="page-tab" lay-allowclose="true">
     <ul class="layui-tab-title" id="tabTitle">
      <li class="layui-this" lay-id="0"><label>首页</label></li>
     </ul>
     <div class="layui-tab-content" id="tabContainers">
      <div class="layui-tab-item layui-show">
       <p>提示<span class="icon-i-b tips-icon mgl-5 ve-m"><span class="dialog-warp right"><label class="dialog-box">床前明月光，疑是地上霜，举头望明月，低头思故乡。</label></span></span></p>
       <div class="fly-echart echart-map sw-100" id="user-form-map">
        地图
       </div>
       <div class="fly-echart echart-pie sw-50 fl" id="user-form-pie">
        饼状图
       </div>
       <div class="fly-echart echart-line sw-50 fl" id="user-form-line">
        折线图
       </div>
       <div class="fly-echart echart-bar sw-100 fl" id="user-form-bar">
        柱状和折线
       </div>
      </div>
     </div>
    </div>
   </div>
  </div>
  <script src="${path}/static/js/lib/layui/layui.js"></script>
  <script src="${path}/static/js/define/index.js"></script>
  <script src="${path}/static/js/define/common.js"></script>
  <script src="//cdn.bootcss.com/echarts/3.3.2/echarts.min.js"></script>
  <script src="${path}/static/js/lib/echarts/macarons.js"></script>
  <script src="${path}/static/js/lib/echarts/china.js"></script>
  <script src="${path}/static/js/define/user-collect.js"></script>
 </body>
</html>