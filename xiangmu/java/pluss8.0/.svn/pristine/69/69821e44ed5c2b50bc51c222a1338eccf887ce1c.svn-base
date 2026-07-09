<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="layui-tab-item layui-show ">
    <div
            class="textc pt10 pb10 pr20 pl20 bdb5 whitebg zindex1000 fixed bottom0 left20 right20">
        <a target="_top" class="layui-btn layui-btn-normal layui-btn-normal hidden-xs fa-save"  lay-submit lay-filter="commentInfo" onclick="save${beanName}()">保存</a>
        <a target="_top" class="layui-btn layui-btn-small layui-btn-normal hidden-xs ml10 goback"  onclick="goBack()">返回</a>
    </div>
    <form class="layui-form" id="layui-form">
        <#list 1..pageNum as i>
        <div class="bdb5 pb10 pt10 pr20">
            <h4 class="pt10 pb10 bdbdot blue pl20 ml10">信息单元${i}</h4>
            <div class="clearfix mt10">
                <#list fieldList as tableField>
                    <#if (i-1)*8<=tableField_index>
                        <#if tableField_index<i*8>
                            <div class="layui-form-item fl pl30 wp45">
                                <label class="layui-form-label">${tableField.fieldComment}：</label>
                                <div class="layui-input-block w300">
                                    <input type="text" name="${tableField.fieldName}" value="${r"$"}{${beanNameSmall}.${tableField.fieldName}}" required lay-verify="required"
                                           placeholder="请输入信息" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                        </#if>
                    </#if>
                </#list>
            </div>
        </div>
        </#list>
    </form>
</div>