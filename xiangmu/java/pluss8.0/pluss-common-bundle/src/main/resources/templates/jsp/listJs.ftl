//分页查询
var layer;
var tableIns;
layui.use(['table','jquery','layer','element'], function() {
    //分页
    var $= layui.jquery,
    table = layui.table,
    element = layui.element,
    layer=layui.layer;
    tableIns =table.render({
        elem: '#tableData',
        url:ctx+'/${beanNameSmall}/query${beanName}ByPage?rnd='+Math.random() ,
        where: {time:new Date()},
        id:"listReload",
        page: {
            layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'],
            method: 'POST',
            groups: 1,
            curr:$('#pageIndex').val(),
            first: false ,
            last: false
        },
        cols: [[
            {type: 'checkbox',fixed: 'left'},
            <#list fieldList as tableField>
            {field:'${tableField.fieldName}', title: '${tableField.fieldComment}'},
            </#list>
            {fixed: 'right',title: '操作',toolbar: '#toolBar',width: 150}
        ]],
        rowStyle: function (index, row) {//index第几行，row当前行的值
            return " data-id="+row.id;
        }
    });
    //行数据处理
    table.on('tool(tableData)', function(obj) {
        var data = obj.data;
        if (obj.event === 'del') {
            layer.confirm('真的删除行么', function(index) {
                obj.del();
                layer.close(index);
                delete${beanName}(data.id);
            });
        } else if (obj.event === 'edit') {
            show${beanName}Details(data.id);
        }
    });
    //顶部操作定义
    var active={
        initBatchDelete:function(){
            initBatchDelete${beanName}();
        },
        initAdd:function(){
            initAdd${beanName}();
        },
        search:function(){
            table.reload('listReload', {
                page: {
                    method: 'POST',
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    time:new Date(),
                    id: $('#demoReload').val()
                }
                },'data');
        }
    }
    //顶部操作事件触发
    $('#toolOper').find('a').on('click', function(){
        var type = $(this).data('event');
        active[type] ? active[type].call(this) : '';
    });
});


//回车事件
$(document).keyup(function (e) {
    if (e.keyCode === 13) {
    document.getElementById("search").click();
    }
});

//初始化新增
function initAdd${beanName}(){
    window.location=ctx+'/${beanNameSmall}/query${beanName}Details';
}

//初始化修改
function show${beanName}Details(id){
    window.location=ctx+'/${beanNameSmall}/query${beanName}Details?id='+id+'&pageIndex='+tableIns.config.page.curr;
}


//删除
function delete${beanName}(id){
    $.ajax({
        url:ctx+'/${beanNameSmall}/delete${beanName}',
        data:[{
            name:'id',
            value:id
        }],
        type:'POST',
        async:false,
        dataType:'json',
        success:function(){
            layer.msg('删除成功!');
        }
    });
}
//批量删除
function delete${beanName}Batch(ids){
    $.ajax({
        url:ctx+'/${beanNameSmall}/delete${beanName}Batch',
        data:[{
            name:'ids',
            value:ids
        }],
        type:'POST',
        async:false,
        dataType:'json',
        success:function(){
        layer.msg('删除成功!');
            //刷新页面
            document.getElementById("search").click();
        }
    });
}
//头部批量删除
function initBatchDelete${beanName}(){
    var count=0;
    $(".layui-table-cell").find("div").each(function () {
        if($(this).hasClass('layui-form-checked')){
            count++;
        }
    })

    if(count==0){
        layer.msg('请选中一行记录!');
        return ;
    }
    layer.open({
        type: 1,
        closeBtn: 1,
        title: '提示',
        offset: 'm', //具体配置参考：offset参数项
        area: ['300px', '180px'],
        content: '<div style="padding:10px;" class="textc mt20">确认删除吗？</div>',
        btn: ['确认','取消'],
        btnAlign: 'r', //按钮居中
        shade: 0.3, //不显示遮罩
        yes: function() {
            layer.closeAll();
            deleteBatch${beanName}();
        }
    });

}

//批量删除
function deleteBatch${beanName}(){
    var ids=new Array();
    $(".layui-table-cell").find("div").each(function () {
        if($(this).hasClass('layui-form-checked')){
            var id=$(this).parent().parent().parent().data('id');
            if(id!=undefined&&id!=''){
                ids.push(id);
             }
        }
    })
    delete${beanName}Batch(ids);
}
