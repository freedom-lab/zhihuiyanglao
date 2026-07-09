<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="layui-tab-item layui-show">
    <div class="ml20 mr20 pb10 ">
        <table class="layui-hide" id="test" lay-filter="test"></table>
    </div>
    <div id="addGroup" style="display: none;">
        <form class="layui-form" action="" style="margin: 40px 40px 0 0;">
            <div class="layui-form-item">
                <label class="layui-form-label">名称:</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required lay-verify="required"
                           placeholder="请输入名称" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">名称:</label>
                <div class="layui-input-block">
                    <input type="text" name="title" required lay-verify="required"
                           placeholder="请输入名称" autocomplete="off" class="layui-input">
                </div>
            </div>
        </form>
    </div>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-normal layui-btn-xs">编辑</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</div>

<script>
		//Demo
		layui.use([ 'form', 'element', 'upload', 'jquery','table' ],
						function() {
							var form = layui.form, upload = layui.upload, $ = layui.jquery, element = layui.element,table = layui.table;
							form.render();

							table.render({
								elem: '#test',
								title: '用户数据表',
								cols: [
									[{
										type: 'checkbox',
										fixed: 'left'
									}, {
										field: 'id',
										title: 'ID',
										sort: true,
										width:80
									}, {
										field: 'username',
										title: '用户名',
										width:80
									}, {
										field: 'sex',
										title: '性别',
										width:80
									}, {
										field: 'city',
										title: '城市',
										width:80
									}, {
										field: 'sign',
										title: '签名',
										width:200
									}, {
										field: 'ip',
										title: 'IP',
										width:150
									}, {
										field: 'logins',
										title: '登入次数'

									}, {
										title: '操作',
										toolbar: '#barDemo',
										width: 150
									}]
								],
								data: [{
									"id": "001",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "002",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "003",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "004",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "005",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "006",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "007",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "008",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "009",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23",
								}, {
									"id": "010",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23"
								}, {
									"id": "011",
									"username": "xxx",
									"sex": "xxx",
									"city": "xxx",
									"sign": "人生是一场美妙的旅行",
									"ip": "127.0.0.1",
									"logins": "23"
								}],
								page: true
							});

						});
	</script>
