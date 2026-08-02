<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta name="renderer" content="webkit">
    <!-- 移动设备 viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <jsp:include page="../../common.jsp" />
    <script type="text/javascript">
     require("js/${beanNameSmall}/${beanNameSmall}List.js");
</script>
</head>
<body>
<div class="page-content-wrap">
    <div class="layui-form-item" id="toolOper">
        <div class="layui-inline tool-btn">
            <a target="_top" class="layui-btn layui-btn-small layui-btn-normal hidden-xs"  data-event="initAdd" ><i class="layui-icon">&#xe654;</i></a>
            <a class="layui-btn layui-btn-small layui-btn-warm deleteBtn hidden-xs" data-event="initBatchDelete"><i class="layui-icon" href="javascipt:void(0);">&#xe640;</i></a>
        </div>
        <div class="layui-inline">
            <input type="text"  id="demoReload" name="id"  placeholder="请输入内容" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-inline">
            <a class="layui-btn layui-btn-normal" data-event="search"  type="button" id="search">搜索</a>
        </div>
    </div>

    <table class="layui-hide" id="tableData" lay-filter="tableData"></table>
</div>
<div id="addGroup" style="display:none;">
    <form class="layui-form" action="" style="margin:40px 40px 0 0;">
        <div class="layui-form-item">
            <label class="layui-form-label">名称:</label>
            <div class="layui-input-block">
                <input type="text" name="title" required lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">名称:</label>
            <div class="layui-input-block">
                <input type="text" name="title" required lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
            </div>
        </div>
    </form>
</div>
<script type="text/html" id="toolBar">
    <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<!-- 隐藏域 -->
<input type="hidden" id="pageIndex" value="${r"$"}{pageIndex }" />
</body>

</html>
