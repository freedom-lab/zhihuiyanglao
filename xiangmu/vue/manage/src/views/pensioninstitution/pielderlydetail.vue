<template>
    <div class="elder-detail-wrap">
        <!-- 左侧侧边栏 -->
        <div class="left-sidebar">
            <!-- 头部头像+姓名+身份证 -->
            <div class="user-head">
                <img src="@/assets/images/bg.png" class="avatar" alt="老人头像" />
                <div class="name-row">
                    <span class="name">施中惠</span>
                    <span class="age">102</span>
                </div>
                <div class="id-card">310202192209083924</div>
            </div>

            <!-- 垂直导航菜单，点击跳转子路由 -->
            <el-menu mode="vertical" :default-active="$route.path.split('/').pop()" class="side-menu" router>
                <el-menu-item index="base">基础信息</el-menu-item>
                <el-menu-item index="health">健康档案</el-menu-item>
                <el-menu-item index="nurse">护理评估</el-menu-item>
                <el-menu-item index="drug">用药管理</el-menu-item>
                <el-menu-item index="cost">费用管理</el-menu-item>
                <el-menu-item index="infoLog">信息变更记录</el-menu-item>
                <el-menu-item index="sign">体征检测数据</el-menu-item>
                <el-menu-item index="check">体检信息</el-menu-item>
                <el-menu-item index="doctor">医嘱信息</el-menu-item>
                <el-menu-item index="record">电子病历</el-menu-item>
                <el-menu-item index="out">外出登记</el-menu-item>
            </el-menu>
        </div>

        <!-- 右侧白色内容容器，子路由页面渲染位置 -->
        <div class="right-content">
            <router-view />
        </div>

    </div>
</template>

<script>
export default {
    data() {
        return {
        };
    },
    methods: {

    },
}
</script>

<style scoped lang="less">
.elder-detail-wrap {
    display: flex;
    gap: 8px;
    /* 左右区域间距缩小 */
    // height: calc(100vh - 60px);
    padding: 8px;
    /* 页面整体外边距缩小 */
    background-color: #f5f7fa;
    align-items: flex-start;
}

/* 左侧侧边栏：高度自适应，底部仅留20px留白 */
.left-sidebar {
    width: 220px;
    background: #ffffff;
    padding: 12px 0 20px 0;
    // height: fit-content;
    

    /* 高度跟随内容，不占满全屏 */
    .user-head {
        text-align: center;
        margin-bottom: 16px;

        .avatar {
            width: 120px;
            height: 120px;
            border-radius: 50%;
            object-fit: cover;
            margin-bottom: 8px;
        }

        .name-row {
            display: flex;
            justify-content: space-around;
            font-size: 16px;
            color: #333;
            margin-bottom: 6px;
        }

        .id-card {
            font-size: 14px;
            color: #555;
        }
    }

    .side-menu {
        width: 180px;
        background: #fff;
        position: relative;

        /* 移除容器border-right，改用伪元素绘制贯穿全菜单的灰色竖基线 */
        &::after {
            content: "";
            position: absolute;
            right: 0;
            top: 0;
            bottom: 0;
            width: 2px;
            background: #e6e6e6;
            z-index: 1;
        }

        :deep .el-menu-item {
            height: 42px;
            line-height: 42px;
            font-size: 16px;
            color: #333;
            padding-left: 36px;
            background: transparent !important;
            position: relative;
            border-right: none;
        }

        // 选中文字蓝色
        :deep .el-menu-item.is-active,
        :deep .el-menu-item.is-active .el-menu-item__inner,
        :deep .el-menu-item.is-active span {
            color: #409eff !important;
        }

        // 蓝色线段z-index更高，完全覆盖灰色基线，同坐标、同宽度1px
        :deep .el-menu-item.is-active::after {
            content: "";
            position: absolute;
            right: -1px;
            top: 0;
            bottom: 0;
            width: 2px;
            background-color: #409eff;
            z-index: 200;
        }

        :deep .el-menu-item:hover {
            background: #f7f8fa !important;
        }
    }

}

/* 右侧内容区域 */
.right-content {
    flex: 1;
    background: #ffffff;
    padding: 16px;
    border-radius: 4px;
    box-shadow: 0 1px 10px rgba(0, 0, 0, 0.06);
}
</style>