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
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <jsp:include page="../../common.jsp" />
    <!-- 编辑器 -->
    <link href="${r"$"}{ctx }/page/umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script src="${r"$"}{ctx }/page/umeditor/third-party/template.min.js"></script>
    <script src="${r"$"}{ctx }/page/umeditor/umeditor.config.js"></script>
    <script src="${r"$"}{ctx }/page/umeditor/umeditor.min.js"></script>
    <script src="${r"$"}{ctx }/page/umeditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript">
	require("js/${beanNameSmall}/${beanNameSmall}Details.js");
</script>
    <title>编辑</title>
</head>
<body>
<div class="margin20 whitebg">
    <div class="layui-tab ">
        <ul class="layui-tab-title pl20 pr20 pt10">
            <li class="layui-this" data-action="base">基本配置</li>
            <li  data-action="functions">其他配置</li>
            <li data-action="extends">列表配置</li>
        </ul>
        <div class="layui-tab-content">
        </div>
    </div>
</div>
<!-- 隐藏域 -->
<input type="hidden" id="${beanNameSmall}Id" value="${r"$"}{${beanNameSmall}.id }" />
<input type="hidden" id="pageIndex" value="${r"$"}{pageIndex }" />
</body>
</html>