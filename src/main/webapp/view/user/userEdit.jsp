<html><head><meta charset="utf-8"><meta name="renderer" content="webkit"><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1"><link rel="stylesheet" href="../../css/index.css"><link rel="stylesheet" href="../../js/lib/layui/css/layui.css"><title>用户资料编辑</title></head><body><div class="pd-20 user-add"><form class="layui-form" action=""><div class="layui-form-item"><label class="layui-form-label">用户名</label><div class="layui-input-inline"><input type="text" name="username" lay-verify="username" autocomplete="off" placeholder="请输入用户名" class="layui-input"></div></div><div class="layui-form-item"><label class="layui-form-label">密码</label><div class="layui-input-inline"><input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" maxlength="20" class="layui-input"></div><div class="layui-form-mid layui-word-aux">请填写6到20位密码</div></div><div class="layui-form-item"><label class="layui-form-label">手机号</label><div class="layui-input-inline"><input type="tel" name="phone" lay-verify="phone" autocomplete="off" placeholder="请输入手机号" class="layui-input"></div></div><div class="layui-form-item" lay-verify=""><label class="layui-form-label">选择地址</label><div class="layui-input-inline"><select name="province" id="province" lay-filter="province"></select></div><div class="layui-input-inline"><select name="city" id="city" lay-filter="city"></select></div><div class="layui-input-inline"><select name="county" id="county" lay-filter="county"></select></div></div><div class="layui-form-item"><label class="layui-form-label">身份证</label><div class="layui-input-inline"><input type="text" name="identity" lay-verify="identity" autocomplete="off" placeholder="请输入身份证号码" class="layui-input"></div></div><div class="layui-form-item"><label class="layui-form-label">邮箱</label><div class="layui-input-inline"><input type="text" name="email" lay-verify="email" autocomplete="off" placeholder="请输入邮箱" class="layui-input"></div></div><div class="layui-form-item"><label class="layui-form-label">性别</label><div class="layui-input-block"><input type="radio" name="sex" value="男" title="男" checked> <input type="radio" name="sex" value="女" title="女"> <input type="radio" name="sex" value="密" title="保密"></div></div><div class="layui-form-item"><label class="layui-form-label"></label><div class="layui-input-inline"><button class="layui-btn" lay-submit="" lay-filter="useradd">立即提交</button> <button type="reset" class="layui-btn layui-btn-primary">重置</button></div></div></form></div><script src="../../js/lib/layui/layui.js"></script><script src="../../js/define/common.js"></script><script src="../../js/lib/selectCity.js"></script><script src="../../js/define/user-edit.js"></script></body></html>