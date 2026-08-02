<template>
  <div class="three-table-layout">

    <!-- 左侧：楼栋楼层面板 -->
    <div class="panel left-panel">
      <div class="panel-header">
        <h3>楼栋 - 楼层</h3>
        <div class="header-btn-group">
          <el-button class="btn-add_blue" circle icon="el-icon-plus" size="mini" type="text"
            @click="openAddDialog"></el-button>
          <!-- <el-button class="btn-del-red" circle icon="el-icon-delete" size="mini" type="danger"
            @click="deleteBuild"></el-button> -->
        </div>
      </div>
      <el-table ref="treeTable" :data="buildingList" border width="100%" empty-text="暂无楼栋数据" height="calc(100% - 40px)"
        :default-sort="{ prop: 'buildingName', order: 'ascending' }" row-key="id"
        :tree-props="{ children: 'floorInfoList' }" @row-click="handleRowClick">

        <el-table-column type="index" label="序号" width="50" align="center" />
        <el-table-column label="楼栋" prop="buildingName" min-width="110">
          <template slot-scope="scope">
            <span v-if="!scope.row.floorInfoList">
              {{ scope.row.floorName }}
            </span>
            <span v-else>
              {{ scope.row.buildingName }}
            </span>
          </template>
        </el-table-column>
        <el-table-column label="操作" width="110" align="center" fixed="right">
          <template slot-scope="scope">
            <!-- 父楼栋：新增楼层、编辑楼栋 -->
            <template v-if="scope.row.floorInfoList">
              <el-button class="btn-no-border" icon="el-icon-plus" size="mini" circle
                @click.native.stop="addFloor(scope.row)"></el-button>
              <el-button class="btn-no-border" icon="el-icon-edit" size="mini" circle
                @click.native.stop="editBuildDialog(scope.row)"></el-button>
              <el-button class="btn-no-border" icon="el-icon-delete" size="mini" circle
                @click.native.stop="deleteBuild(scope.row)"></el-button>
            </template>

            <!-- 子楼层：仅编辑/删除楼层 -->
            <template v-else>
              <el-button class="btn-no-border" icon="el-icon-edit" size="mini" circle
                @click.native.stop="editFloor(scope.row)"></el-button>
              <el-button class="btn-no-border" icon="el-icon-delete" size="mini" circle
                @click.native.stop="deleteFloor(scope.row)"></el-button>
            </template>
          </template>
        </el-table-column>

      </el-table>
    </div>

    <!-- 中间：房间面板 -->
    <div class="panel center-panel">
      <div class="panel-header">
        <h3>房间</h3>
        <div class="header-btn-group">
          <el-button class="btn-add_blue" circle icon="el-icon-plus" size="mini" type="text"
            @click="openRoomDialog"></el-button>
        </div>
      </div>
      <el-table :data="roomList" border width="100%" empty-text="暂无数据" height="calc(100% - 40px)"
        :default-sort="{ prop: 'roomName', order: 'ascending' }" @row-click="handleRoomRowClick">
        <el-table-column label="序号" type="index" align="center" width="60" fixed="left" />
        <el-table-column label="房间名称" prop="roomName" min-width="120" align="center" fixed="left">
        </el-table-column>
        <el-table-column label="房间面积 (m²)" prop="roomArea" min-width="130" align="center" />
        <el-table-column label="房间类型" prop="roomType" min-width="100" align="center">
          <template slot-scope="scope">
            {{ scope.row.roomType === '1' ? '单人间' :
              scope.row.roomType === '2' ? '两人间' :
                scope.row.roomType === '3' ? '三人间' : '四人间' }}
          </template>
        </el-table-column>
        <el-table-column label="房间朝向" prop="roomOrientation" min-width="100" align="center">
          <template slot-scope="scope">
            {{ scope.row.roomOrientation === '1' ? '东' :
              scope.row.roomOrientation === '2' ? '西' :
                scope.row.roomOrientation === '3' ? '南' : '北' }}
          </template>
        </el-table-column>
        <el-table-column label="操作" width="100" fixed="right" align="center">
          <template slot-scope="scope">
            <el-button class="btn-no-border" icon="el-icon-edit" size="mini" circle
              @click.native.stop="editRoomDialog(scope.row)"></el-button>
            <el-button class="btn-no-border" icon="el-icon-delete" size="mini" circle
              @click.native.stop="deleteRoom(scope.row)"></el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>


    <!-- 右侧：床位面板 -->
    <div class="panel right-panel">
      <div class="panel-header">
        <h3>床位</h3>
        <el-button class="btn-add_blue" circle icon="el-icon-plus" size="mini" type="text"
          @click="openBedDialog"></el-button>
      </div>

      <div class="bed-card-wrap">
        <div class="bed-card" v-for="(item, index) in bedList" :key="index">
          <!-- 顶部整行容器 -->
          <div class="card-top-wrap">
            <div class="room-tag">{{ item.bedName }}</div>
            <div class="center-text">{{
              item.bedState === 1 ? '空闲' :
                item.bedState === 2 ? '预订' :
                  item.bedState === 3 ? '入住' :
                    item.bedState === 4 ? '试住' : '变更占用'
            }}</div>
            <!-- <img class="qrcode" src="@/assets/images/qr_code.png" /> -->
          </div>

          <!-- 床位图标+价格区域 -->
          <div class="bed-info">
            <!-- <img class="bed-icon" src="@/assets/images/login_left_bg.jpg" /> -->
            <div class="price-text">
              <!-- <div class="bed-num">{{ item.bedNum }}</div> -->
              <div class="price-day">{{ item.bedDayPrice }}元/日</div>
              <div class="price-month">{{ item.bedMonthPrice }}元/月</div>
            </div>
          </div>

          <!-- 分割线 -->
          <div class="divider-line"></div>

          <!-- 底部操作按钮 -->
          <div class="btn-group">
            <div class="btn-item edit-btn" @click="handleEdit(item)">修改</div>
            <div class="divider-vertical"></div>
            <div class="btn-item del-btn" @click="handleDelete(item)">删除</div>
          </div>
        </div>
      </div>

    </div>


    <!-- 楼栋 新增、编辑弹窗 -->
    <BuildFloorDialog :visible.sync="buildAddDialogVisible" :editData="editBuildData" @submited="getBuildList" />

    <!-- 楼层 新增、编辑弹窗 -->
    <FloorDialog :visible.sync="floorDialogVisible" :buildId="buildId" :editData="editFloorData"
      @submited="getRoomList" />

    <!-- 房间 新增、编辑弹窗 -->
    <BuildRoomDialog :visible.sync="roomAddDialogVisible" :selectBuildingId="selectBuildingId"
      :selectFloorId="selectFloorId" :editData="editRoomData" @submited="getRoomList" />

    <!-- 床位 新增、编辑弹窗 -->
    <BuildBedDialog :visible.sync="bedAddDialogVisible" :selectBuildingId="selectBuildingId"
      :selectFloorId="selectFloorId" :selectRoomId="selectRoomId" :editData="editBedData" @submited="getBedList" />

  </div>
</template>

<script>
import BuildFloorDialog from '../../components/build/buildFloorDialog.vue'
import FloorDialog from '../../components/build/floorDialog.vue'
import BuildRoomDialog from '../../components/build/buildRoomDialog.vue'
import BuildBedDialog from '../../components/build/buildBedDialog.vue'
export default {
  components: {
    BuildFloorDialog,
    FloorDialog,
    BuildRoomDialog,
    BuildBedDialog
  },
  data() {
    return {
      buildingList: [],
      roomList: [],
      bedList: [],
      // 楼栋弹窗
      buildAddDialogVisible: false,
      editBuildData: {},
      // 楼层弹窗
      floorDialogVisible: false,
      buildId: '',
      editFloorData: {},
      // 房间弹窗
      roomAddDialogVisible: false,
      editRoomData: {},
      // 床位弹窗
      bedAddDialogVisible: false,
      selectedRows: [],
      //选择的楼层
      selectBuildingId: '',
      selectFloorId: '',
      selectRoomId: '',
    }
  },
  mounted() {
    // 初始化数据加载
    console.log('页面已加载')
  },
  created() {
    this.getBuildList()
  },
  methods: {
    //获取楼栋列表
    getBuildList() {
      this.$http.post("insBaseBuildingInfo/queryBuildingFloor", {}).then((res) => {
        if (200 == res.data.code) {
          this.buildingList = res.data.data
        } else {
          this.$message.warning(res.data.message)
        }
      })
    },
    //获取 房间 床位列表
    getRoomList() {
      const params = {
        buildingId: this.selectBuildingId,
        floorId: this.selectFloorId
      }
      this.$http.post("insBaseBuildingInfo/queryRoom", params).then((res) => {
        if (200 == res.data.code) {
          this.roomList = []
          this.roomList = res.data.data
        } else {
          this.$message.warning(res.data.message)
        }
      })
    },
    //查询床位 列表
    getBedList() {
      const params = { roomId: this.selectRoomId }
      this.$http.post("insBaseBuildingInfo/queryBed", params).then((res) => {
        if (200 == res.data.code) {
          this.bedList = []
          this.bedList = res.data.data
        } else {
          this.$message.warning(res.data.message)
        }
      })
    },
    //选择楼栋
    handleRowClick(row) {
      if (!this.$refs.treeTable) return
      const checked = this.selectedRows.some(item => item.id === row.id)
      this.$refs.treeTable.toggleRowSelection(row, !checked)
      this.selectedRows = !checked ? [row] : []

      if (row.floorInfoList) {
        this.selectBuildingId = !checked ? row.id : ""
        this.$refs.treeTable.toggleRowExpansion(row)
        this.selectBuildingId = row.id;
      } else {
        this.selectBuildingId = this.getParentBuildingId(row)
        this.selectFloorId = !checked ? row.id : ""
        this.selectFloorId = row.id;
        console.log("id", this.selectBuildingId, this.selectFloorId)
        this.getRoomList();
      }
    },
    // 新增楼栋弹窗
    openAddDialog() {
      this.editBuildData = {}
      this.buildAddDialogVisible = true;
    },
    //编辑楼栋
    editBuildDialog(row) {
      this.editBuildData = row
      this.buildAddDialogVisible = true;
    },
    //删除楼栋
    deleteBuild(row) {
      this.$confirm('确定将选择数据删除?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning', // 黄色感叹号警告图标，和截图匹配
        closeOnClickModal: false,
      }).then(async () => {
        this.$http.post("insBaseBuildingInfo/delete", { id: row.id }).then((res) => {
          if (200 == res.data.code) {
            this.$message.success('删除成功');
            this.getBuildList()
          }
        })
      }).catch(() => {

      })
    },

    //添加楼层 
    addFloor(row) {
      this.buildId = row.id
      console.log(this.buildId)
      this.editFloorData = {}
      this.floorDialogVisible = true
    },


    //编辑楼层
    editFloor(row) {
      this.editFloorData = row
      this.floorDialogVisible = true
    },

    getParentBuildingId(floorRow) {
      let pid = ""
      for (const b of this.buildingList) {
        if (b.floorInfoList.find(f => f.id === floorRow.id)) {
          pid = b.id
          break
        }
      }
      return pid
    },

    //删除楼层
    deleteFloor(row) {
      this.$confirm('确定删除此楼层？', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning', // 黄色感叹号警告图标，和截图匹配
        closeOnClickModal: false,
      }).then(async () => {
        this.$http.post("insBaseFloorInfo/delete", { id: row.id }).then((res) => {
          if (200 == res.data.code) {
            this.$message.success('删除成功');
            this.getBuildList()
          }
        })
      }).catch(() => {

      })
    },

    //选择房间
    handleRoomRowClick(row) {
      this.selectRoomId = row.id
      console.log("房间id", this.selectRoomId)
      this.getBedList()
    },
    //打开 房间弹窗
    openRoomDialog() {
      if (!this.selectFloorId) {
        this.$message.warning("请选择楼层")
        return
      }
      this.editRoomData = {}
      this.bedAddDialogVisible = false
      this.roomAddDialogVisible = true
    },
    //修改房间
    editRoomDialog(row) {
      this.editRoomData = row
      this.roomAddDialogVisible = true
    },
    //删除房间
    deleteRoom(row) {
      this.$confirm('确定删除此房间？', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning', // 黄色感叹号警告图标，和截图匹配
        closeOnClickModal: false,
      }).then(async () => {
        this.$http.post("insBaseRoomInfo/delete", { id: row.id }).then((res) => {
          if (200 == res.data.code) {
            this.$message.success('删除成功');
            this.getRoomList()
          }
        })
      }).catch(() => {

      })
    },
    //打开 床位弹窗
    openBedDialog() {
      if (!this.selectFloorId) {
        this.$message.warning("请选择楼层")
        return
      }
      if (!this.selectRoomId) {
        this.$message.warning("请点击房间")
        return
      }
      this.editBedData = {}
      this.roomAddDialogVisible = false
      this.bedAddDialogVisible = true
    },
    // 修改床位
    handleEdit(row) {
      this.editBedData = row
      this.bedAddDialogVisible = true
    },
    // 删除床位
    handleDelete(row) {
      this.$confirm(`确认删除此床位？`, "提示", {
        type: "warning"
      }).then(() => {
        this.$http.post("insBaseBedInfo/delete", { id: row.id }).then((res) => {
          if (200 == res.data.code) {
            this.$message.success('删除成功');
            this.getRoomList()
          }
        })

      }).catch(() => { })
    },

  },
}
</script>

<style scoped>
/* 三栏弹性布局核心 */
.three-table-layout {
  display: flex;
  flex-wrap: nowrap;
  gap: 8px;
  width: 100%;
  height: calc(100vh - 120px);
  padding: 8px;
  box-sizing: border-box;
  background-color: #F1F2F5;
  overflow-x: auto;
}

/* 统一面板样式 */
.panel {
  border-radius: 8px;
  box-sizing: border-box;
  padding: 12px;
  display: flex;
  flex-direction: column;
  overflow: hidden;
  background: #fff;
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.05);
  min-width: 0;
}

.panel-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 10px;
  flex-shrink: 0;
}

.panel-header h3 {
  margin: 0;
  font-size: 14px;
  font-weight: 600;
  color: #303133;
  display: flex;
  align-items: center;
  gap: 6px;
}

.panel-header h3::before {
  content: '';
  display: inline-block;
  width: 5px;
  height: 15px;
  background: #4B66F1;
  border-radius: 3px;
  margin-right: 6px;
}

.header-btn-group {
  display: flex;
  gap: 2px;
}

.header-btn-group .el-button {
  margin-left: 3px;
}

/* 左中右三栏按比例分配宽度，始终横向排列 */
.left-panel {
  flex: 0 0 calc((100% - 16px) * 0.2);
  max-width: calc((100% - 16px) * 0.2);
  min-width: 0;
}

.center-panel {
  flex: 0 0 calc((100% - 16px) * 0.6);
  max-width: calc((100% - 16px) * 0.6);
  min-width: 0;
}

.right-panel {
  flex: 0 0 calc((100% - 16px) * 0.2);
  max-width: calc((100% - 16px) * 0.2);
  min-width: 0;
}

/* 表格高度适配父容器 */
.el-table {
  flex: 1;
  min-width: 0;
}

/* 楼栋和楼层行样式 */
.building-row {
  display: flex;
  align-items: center;
  gap: 6px;
  color: #6C9EF7;
}

.floor-row {
  padding-left: 24px;
  color: #606266;
}

/* 表格行选中样式 */
.el-table--enable-row-hover .el-table__body tr:hover>td {
  background-color: #f5f7fa;
}

/* 全局mini圆形统一尺寸 */
:deep(.el-button--mini.is-circle) {
  width: 30px !important;
  height: 30px !important;
  padding: 0 !important;
  border-radius: 15px;
}

/* ========== 蓝色新增 btn-add_blue ========== */
:deep(.btn-add_blue.el-button--text.el-button--mini.is-circle) {
  border: 1px solid #409EFF !important;
  background: #ecf5ff !important;
}

:deep(.btn-add_blue.el-button--text.el-button--mini.is-circle i) {
  color: #409EFF !important;
}

:deep(.btn-add_blue.el-button--text.el-button--mini.is-circle:hover) {
  background: #409EFF !important;
  border-color: #409EFF !important;
}

:deep(.btn-add_blue.el-button--text.el-button--mini.is-circle:hover i) {
  color: #fff !important;
}

/* ========== 黄色编辑 btn-edit-yellow ========== */
:deep(.btn-edit-yellow.el-button--mini.is-circle) {
  width: 30px !important;
  height: 30px !important;
  padding: 0 !important;
  border-radius: 15px;
  border: 1px solid #e6b86c !important;
  background-color: #fff9e8 !important;
}

:deep(.btn-edit-yellow.el-button--mini.is-circle i) {
  color: #e6b86c !important;
}

:deep(.btn-edit-yellow.el-button--mini.is-circle:hover) {
  background-color: #e6b86c !important;
  border-color: #e6b86c !important;
}

:deep(.btn-edit-yellow.el-button--mini.is-circle:hover i) {
  color: #ffffff !important;
}

/* ========== 红色删除 btn-del-red ========== */
:deep(.btn-del-red.el-button--mini.is-circle) {
  width: 30px !important;
  height: 30px !important;
  padding: 0 !important;
  border-radius: 15px;
  border: 1px solid #e88686 !important;
  background-color: #fff2f2 !important;
}

:deep(.btn-del-red.el-button--mini.is-circle i) {
  color: #e88686 !important;
}

:deep(.btn-del-red.el-button--mini.is-circle:hover) {
  background-color: #e88686 !important;
  border-color: #e88686 !important;
}

:deep(.btn-del-red.el-button--mini.is-circle:hover i) {
  color: #ffffff !important;
}



/* 无边框按钮：配置/新增/编辑 */
:deep(.btn-no-border.el-button--mini.is-circle) {
  border: none;
  background: transparent;
}

:deep(.btn-no-border.el-button--mini.is-circle i) {
  color: #409EFF;
}

:deep(.btn-no-border.el-button--mini.is-circle:hover) {
  background: #e6f2ff;
}

/* 删除黄色按钮 */
:deep(.btn-del-yellow.el-button--danger.el-button--mini.is-circle) {
  background: #fff7e6;
  border: 1px solid #ffc53d;
}

:deep(.btn-del-yellow.el-button--danger.el-button--mini.is-circle i) {
  color: #ffc53d;
}

:deep(.btn-del-yellow.el-button--danger.el-button--mini.is-circle:hover) {
  background: #ffc53d;
}

:deep(.btn-del-yellow.el-button--danger.el-button--mini.is-circle:hover i) {
  color: #fff;
}

/* 保留页面原有warning按钮样式，不受干扰 */
:deep(.el-button--warning.el-button--mini.is-circle) {
  background: #faecd8;
  border-color: #faecd8;
}

/* 统一mini圆形尺寸复用，只写一次 */
:deep(.el-button--mini.is-circle.btn-no-border) {
  width: 20px !important;
  height: 20px !important;
  padding: 0 !important;
  border-radius: 10px;
}

/* 按钮圆形样式 */
/* .el-button--circle {
  padding: 8px;
} */

/* 空状态样式 */
.el-table__empty-text {
  color: #909399;
  font-size: 14px;
}

/* 滚动条样式优化 */
.el-table__body-wrapper::-webkit-scrollbar {
  width: 6px;
  height: 6px;
}

.el-table__body-wrapper::-webkit-scrollbar-thumb {
  background: #c0c4cc;
  border-radius: 3px;
}

.el-table__body-wrapper::-webkit-scrollbar-track {
  background: #f5f7fa;
}

/* 响应式适配 */
@media screen and (max-width: 1400px) {
  .left-panel {
    min-width: 260px;
  }

  .center-panel {
    min-width: 400px;
  }

  .right-panel {
    min-width: 240px;
  }
}



/* 外层两列网格容器 */
.bed-card-wrap {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 10px;
  width: 100%;
  box-sizing: border-box;
  height: auto;
  margin-top: 15px;
}

/* 单张卡片：高度完全自适应内容 */
.bed-card {
  background: #ffffff;
  border-radius: 12px;
  box-shadow: 0 2px 12px rgba(0, 0, 0, 0.08);
  padding: 0;
  position: relative;
  overflow: hidden;
  /* 无固定高度，内部内容自动撑高 */
  height: auto;
  min-width: 0;
}

/* 顶部整行容器 */
.card-top-wrap {
  display: flex;
  justify-content: center;
  align-items: flex-start;
  position: relative;
  padding: 2px 2px 12px;
}

.room-tag {
  position: absolute;
  left: 0;
  top: 0;
  background: #409eff;
  color: #fff;
  font-size: 13px;
  font-weight: bold;
  padding: 4px 6px;
  border-radius: 0 0 10px 0;
  z-index: 2;
}

.center-text {
  font-size: 14px;
  color: #409eff;
  font-weight: 500;
}

.qrcode {
  position: absolute;
  right: 2px;
  top: 2px;
  width: 30px;
  height: 30px;
}

/* 床位图标+价格区域 */
.bed-info {
  display: flex;
  align-items: center;
  gap: 14px;
  padding: 10px 12px 14px;
}

.bed-icon {
  width: 60px;
  height: 60px;
  object-fit: contain;
}

.price-text {
  display: flex;
  flex-direction: column;
  color: #666;
}

.bed-num {
  font-size: 16px;
  color: black;
}

.price-day {
  font-size: 13px;
  color: #9E9E9E;
}

.price-month {
  font-size: 13px;
  color: #9E9E9E;
}

/* 水平分割线 */
.divider-line {
  width: 100%;
  height: 1px;
  background: #eee;
}

/* 底部按钮 */
.btn-group {
  display: flex;
  width: 100%;
}

.btn-item {
  flex: 1;
  text-align: center;
  padding: 10px 0;
  font-size: 16px;
  cursor: pointer;
}

.edit-btn {
  color: #67c23a;
}

.del-btn {
  color: #f56c6c;
}

.divider-vertical {
  width: 1px;
  background: #eee;
}
</style>
