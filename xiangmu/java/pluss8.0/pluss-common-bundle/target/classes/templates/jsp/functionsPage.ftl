<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="layui-tab-item layui-show">
    <div
            class="textc pt10 pb10 pr20 pl20 bdb5 whitebg zindex1000 fixed bottom0 left20 right20">
        <a target="_top"
           class="layui-btn layui-btn-normal layui-btn-normal hidden-xs"
           lay-submit lay-filter="commentInfo">保存</a> <a target="_top"
                                                         class="layui-btn layui-btn-small layui-btn-normal hidden-xs ml10"
                                                         href="javascipt:void(0);" onclick="window.history.go(-1)">返回</a>
    </div>
    <form class="layui-form">
        <div class="bdb5 pb10 pt10 pr20">
            <h4 class="pt10 pb10 bdbdot blue pl20 ml10">信息单元一</h4>
            <div class="clearfix mt20">
                <div class="layui-form-item fl pl30 wp45">
                    <label class="layui-form-label">上级：</label>
                    <div class="layui-input-block w300">
                        <select name="category" lay-verify="required">
                            <option value=""></option>
                            <option value="0">作为一级菜单</option>
                            <option value="1">菜单管理</option>
                        </select>
                    </div>
                </div>
                <div class="layui-form-item fl pl30 wp45">
                    <label class="layui-form-label">是否缓存：</label>
                    <div class="layui-input-block w300">
                        <input type="checkbox" checked="" name="cache"
                               lay-skin="switch" lay-filter="switchTest" lay-text="ON|OFF">
                    </div>
                </div>
                <div class="layui-form-item fl pl30 wp45" pane="">
                    <label class="layui-form-label">原始复选框：</label>
                    <div class="layui-input-block w300">
                        <input type="checkbox" name="like1[write]" lay-skin="primary"
                               title="写作" checked=""> <input type="checkbox"
                                                             name="like1[read]" lay-skin="primary" title="阅读"> <input
                                type="checkbox" name="like1[game]" lay-skin="primary"
                                title="游戏" disabled="">
                    </div>
                </div>
                <div class="layui-form-item fl pl30 wp45">
                    <label class="layui-form-label">静态首页：</label>
                    <div class="layui-input-block w300">
                        <input type="radio" name="static" value="1" title="生成"
                               checked=""> <input type="radio" name="static"
                                                  value="0" title="不生成">
                    </div>
                </div>

            </div>
            <div class="layui-form-item pl30">
                <label class="layui-form-label">上传图片：</label>
                <div class="layui-input-block">
                    <div class="layui-upload-drag" id="test10">
                        <i class="layui-icon">&#xe654;</i>
                        <p>上传</p>
                    </div>
                    <div class="layui-upload-list" id="picBox"></div>
                </div>
            </div>
            <div class="layui-form-item layui-form-text pl30">
                <label class="layui-form-label">统计代码：</label>
                <div class="layui-input-block">
                    <script type="text/plain" id="myEditor" style="width:800px;height:240px;">  </script>
                </div>
            </div>
        </div>
    </form>
</div>

<script>
var um = UM.getEditor("myEditor");
</script>
