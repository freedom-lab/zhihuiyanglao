$(document).ready(function(){
//form表单样式
layui.use(['layer', 'form','element'], function() {
    var layer = layui.layer,
    element=layui.element,
    form = layui.form;
    element.render();
        form.render();
    });
    //绑定标签栏事件
    $(document).on('click','.layui-tab-title li',function(){
        var action =$(this).data('action');
        switch (action) {
        case "base"://基本资料
            goBase();
            break;
        case "functions"://多功能
            goFunctions();
            break;
        case "extends"://扩展
            goExtends();
            break;
        }
    })
    //加载第一个标签
    $('.layui-tab-title li').eq(0).click();
});

//跳转基本信息
function goBase(){
    var url=ctx+'/${beanNameSmall}/query${beanName}BaseInfo?id='+$('#${beanNameSmall}Id').val();
    $('.layui-tab-content').load(url);
}
//跳转多功能输入
function goFunctions(){
    var url=ctx+'/${beanNameSmall}/query${beanName}FunctionsInfo?${beanNameSmall}.id='+$('#${beanNameSmall}Id').val();
    $('.layui-tab-content').load(url);

}
//跳转到扩展
function goExtends(){

    var url=ctx+'/${beanNameSmall}/query${beanName}ExtendsInfo?${beanNameSmall}.id='+$('#${beanNameSmall}Id').val();
    $('.layui-tab-content').load(url);
}

function goBack(){
    var url=ctx+'/${beanNameSmall}/index?pageIndex='+$('#pageIndex').val();
    window.location=url;
}


//保存
function save${beanName}(){

    $(".fa-save").attr("disabled","disabled");
    $('.fa-save').html('正在保存...')
    $.ajax({
        url:ctx+"/${beanNameSmall}/save${beanName}",
        type:"POST",
        dataType:'json',
        data:$("#layui-form").serializeArray(),
        complete:function(){
            $(".fa-save").removeAttr("disabled");
            $('.fa-save').html('保存')
        },
        success:function(service){
            layer.confirm('保存成功,是否前往列表？', {
                btn: ['确认','取消'] //按钮
            }, function(){
                $('.goback').trigger('click');
            }, function(){
                layer.closeAll();
            });
        }
    });
}
