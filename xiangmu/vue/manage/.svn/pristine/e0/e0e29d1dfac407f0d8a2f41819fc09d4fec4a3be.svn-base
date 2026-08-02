<template>
  <div class="organizationManagement" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <el-breadcrumb-item>组织管理 /</el-breadcrumb-item>
    </el-breadcrumb>
    <!-- 内容主体 -->
    <div class="bgwhite bort">
      <el-row>
        <!-- 左侧树结构 -->
        <el-col :xs="6" :sm="6" :md="5" :lg="5" class="tree-left">
          <aside class="left-box">
            <div class="left-list-box">
              <div class="tree">
                <!-- 下拉菜单 -->
                <el-form>
                  <el-form-item class="left-search">
                    <el-row type="flex" class="row-bg" justify="space-between">
                      <el-select
                        v-model="value"
                        placeholder="请选择"
                        class="selma"
                      >
                        <el-option
                          v-for="item in options"
                          :key="item.value"
                          :label="item.label"
                          :value="item.value"
                        >
                        </el-option>
                      </el-select>
                      <!-- <el-tooltip
                        class="item"
                        effect="dark"
                        content="新建组织架构"
                        placement="bottom"
                      >
                        <el-button
                          type="primary"
                          size="small"
                          plain
                          class="is-circle"
                          @click="openOrganization"
                          ><i class="el-icon-plus fw900 f16"></i
                        ></el-button>
                      </el-tooltip> -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="添加根节点"
                        placement="bottom"
                      >
                        <el-button
                          type="primary"
                          size="small"
                          plain
                          class="is-circle"
                          @click="rootNodeDialog = true"
                          ><i class="el-icon-plus fw900 f16"></i
                        ></el-button>
                      </el-tooltip>
                    </el-row>
                  </el-form-item>
                </el-form>

                <div class="syste-list tree-editor">
                  <!-- 搜索框 -->
                  <div class="mt10">
                    <el-input
                      placeholder="组织名称"
                      class="mr10"
                      v-model="filterText"
                    >
                      <el-button
                        slot="append"
                        icon="el-icon-search"
                        @click="filterMenu(filterText)"
                      ></el-button>
                    </el-input>
                  </div>
                  <div class="tree-box-warp">
                    <el-tree
                      :data="treeData"
                      node-key="organCode"
                      :default-checked-keys="defaultKyes"
                      :current-node-key="defaultId"
                      :props="defaultProps"
                      :filter-node-method="filterNode"
                      ref="tree"
                      :highlight-current="true"
                      :expand-on-click-node="false"
                      @node-click="handleNodeClick"
                    >
                      <span
                        class="custom-tree-node"
                        slot-scope="{ node, data }"
                      >
                        <span>{{ node.label }}</span>
                        <span class="treeTool">
                          <el-tooltip
                            class="item"
                            effect="dark"
                            content="新建组织"
                            placement="bottom"
                          >
                            <el-button
                              type="text"
                              size="mini"
                              icon="el-icon-document-add"
                              @click="() => append(data)"
                            >
                            </el-button>
                          </el-tooltip>
                          <!-- <el-tooltip
                            class="item"
                            effect="dark"
                            content="添加现有组织"
                            placement="bottom"
                          >
                            <el-button
                              type="text"
                              size="mini"
                              icon="el-icon-folder-add"
                              @click="() => appendExisting(data)"
                            >
                            </el-button>
                          </el-tooltip> -->
                          <el-tooltip
                            class="item"
                            effect="dark"
                            content="删除"
                            placement="bottom"
                          >
                            <el-button
                              type="text"
                              size="mini"
                              icon="el-icon-delete"
                              @click="() => remove(node, data)"
                            >
                            </el-button>
                          </el-tooltip>
                        </span>
                      </span>
                    </el-tree>
                  </div>
                </div>
              </div>
            </div>
          </aside>
        </el-col>
        <!-- 右侧对应内容 -->
        <el-col :xs="18" :sm="18" :md="19" :lg="19" class="tree-right">
          <div class="right-box">
            <!-- 基本信息 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      基本信息
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="保存基本信息"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            @click="submitForm('ruleForm')"
                            >保存</el-button
                          >
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="ruleForm"
                  :rules="rules"
                  ref="ruleForm"
                  label-width="150px"
                  class="ruleForm"
                  size="mini"
                >
                  <el-row>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织名称" prop="displayName">
                        <el-input v-model="ruleForm.displayName"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织类型" prop="orgType">
                        <el-select
                          v-model="ruleForm.orgType"
                          placeholder="请选择"
                          class="wp100"
                          disabled
                        >
                          <el-option label="现实类型" value="on"></el-option>
                          <el-option label="虚拟类型" value="off"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织排序">
                        <el-input-number
                          v-model="ruleForm.orgSort"
                          controls-position="right"
                          @change="handleSortChange"
                          :min="0"
                          :max="10"
                        ></el-input-number>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织描述">
                        <el-input v-model="ruleForm.description"></el-input>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div>
            <!-- 扩展属性 -->
            <div class="right-info-box">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      扩展属性
                    </el-col>
                    <el-col :span="12">
                      <!-- <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="扩展属性"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            plain
                            class="is-circle"
                            ><i class="el-icon-plus fw900 f16"></i
                          ></el-button>
                        </el-tooltip>
                      </div> -->
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <el-form
                  :model="ruleForm"
                  ref="ruleForm"
                  label-width="150px"
                  class="ruleForm"
                  size="mini"
                >
                  <el-row>
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织id">
                        <el-input v-model="ruleForm.yangLiOrgId"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="上级部门ID">
                        <el-input
                          v-model="ruleForm.yangLiOrgParentOrgId"
                        ></el-input>
                      </el-form-item>
                    </el-col> -->
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织负责人id">
                        <el-input
                          v-model="ruleForm.yangLiOrgManagerEmpId"
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="部门排序码">
                        <el-input
                          v-model="ruleForm.yangLiOrgOrderCode"
                        ></el-input>
                      </el-form-item>
                    </el-col> -->
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="部门状态">
                        <el-input v-model="ruleForm.yangLiOrgStatus"></el-input>
                      </el-form-item>
                    </el-col>
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="扬力组织序号">
                        <el-input
                          v-model="ruleForm.yangLiOrgSerial"
                        ></el-input>
                      </el-form-item>
                    </el-col> -->
                    <!-- <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="扬力微信组织id">
                        <el-input
                          v-model="ruleForm.yangLiWeiXinOrgId"
                        ></el-input>
                      </el-form-item>
                    </el-col> -->
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织负责人名称">
                        <el-input
                          v-model="ruleForm.yangLiOrgManagerEmpName"
                        ></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="执行负责人">
                        <el-input v-model="ruleForm.yangLitest"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织等级">
                        <el-input v-model="ruleForm.orgLevel"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="组织事业群">
                        <el-select
                          v-model="ruleForm.orgGroup"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="集团" value="集团"></el-option>
                          <el-option label="重机" value="重机"></el-option>
                          <el-option label="液压" value="液压"></el-option>
                          <el-option label="数控" value="数控"></el-option>
                          <el-option label="精机" value="精机"></el-option>
                          <el-option label="扬机" value="扬机"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div>

            <!-- 下属人员 -->
            <div class="mb20">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      下属人员
                    </el-col>
                    <!-- <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="下属人员"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            plain
                            class="is-circle"
                            ><i class="el-icon-plus fw900 f16"></i
                          ></el-button>
                        </el-tooltip>
                      </div>
                    </el-col> -->
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  :data="staffData"
                  border
                  fit
                  height="240px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column
                    label="姓名"
                    prop="name"
                    align="center"
                    min-width="140"
                  >
                  </el-table-column>
                  <el-table-column
                    label="员工账号"
                    align="center"
                    prop="ad"
                    min-width="140"
                  ></el-table-column>
                  <el-table-column
                    label="电话"
                    align="center"
                    min-width="140"
                    prop="phone"
                  >
                  </el-table-column>
                  <el-table-column
                    label="邮箱"
                    align="center"
                    min-width="240"
                    prop="email"
                  >
                  </el-table-column>

                  <el-table-column
                    label="状态"
                    prop="status"
                    align="center"
                    min-width="100"
                  >
                    <template slot-scope="scope">
                      <span>{{
                        scope.row.status == "1"
                          ? "在职"
                          : scope.row.status == "2"
                          ? "离职"
                          : scope.row.status == "3"
                          ? "产期休假"
                          : scope.row.status == "4"
                          ? "代理"
                          : scope.row.status == "5"
                          ? "供应商"
                          : "外部"
                      }}</span>
                    </template>
                  </el-table-column>
                  <!-- <el-table-column
                    label="操作"
                    align="center"
                    class-name="small-padding"
                    fixed="right"
                    width="100"
                  >
                    <el-tooltip
                      class="item"
                      effect="dark"
                      content="删除"
                      placement="bottom"
                    >
                      <i
                        class="el-icon-close textblue f16 ml20 fw700"
                        @click="del(1)"
                      ></i>
                    </el-tooltip>
                  </el-table-column>-->
                </el-table>
                <!-- 新增按钮 -->
                <!-- <div class="handle-btn wp100">
                  <el-button plain class="add-column-btn"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div> -->
                <!-- 分页区域 -->
                <el-pagination
                  @size-change="handleUserSizeChange"
                  @current-change="handleUserCurrentChange"
                  :current-page="staffQueryInfo.pagenum"
                  :page-sizes="[2, 5, 10, 15]"
                  :page-size="staffQueryInfo.pagesize"
                  layout="total, sizes, prev, pager, next, jumper"
                  :total="staffTotle"
                ></el-pagination>
              </div>
            </div>
            <!-- 岗位信息 -->
            <div class="mb20">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      岗位信息
                    </el-col>
                    <el-col :span="12">
                      <div class="flex align-center justify-end h50">
                        <el-tooltip
                          class="item"
                          effect="dark"
                          content="岗位信息"
                          placement="bottom"
                        >
                          <el-button
                            type="primary"
                            size="small"
                            plain
                            class="is-circle"
                            ><i class="el-icon-plus fw900 f16"></i
                          ></el-button>
                        </el-tooltip>
                      </div>
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  v-loading="loading"
                  :data="tableData"
                  border
                  fit
                  height="240px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column
                    label="岗位名称"
                    prop="AD"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="scope">
                      <span>{{ scope.row.AD }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="是否标识部门" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.Account }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column label="部门名称(可不填)" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.email }}</span>
                    </template>
                  </el-table-column>
                </el-table>
                <!-- 分页区域 -->
                <el-pagination
                  @size-change="handleSizeChange"
                  @current-change="handleCurrentChange"
                  :current-page="queryInfo.pagenum"
                  :page-sizes="[2, 5, 10, 15]"
                  :page-size="queryInfo.pagesize"
                  layout="total, sizes, prev, pager, next, jumper"
                  :total="totle"
                ></el-pagination>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>

      <!-- 新建组织架构弹出框 -->
      <el-dialog title="新建组织架构" :visible.sync="organizationDialog">
        <el-form
          :model="orgDialogForm"
          :rules="orgDialogRules"
          ref="orgDialogForm"
          label-width="100px"
          class="dia-gap"
          size="mini"
        >
          <el-form-item label="组织结构别名" prop="name">
            <el-input
              v-model="orgDialogForm.name"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <el-form-item label="组织结构名称" prop="nameDesc">
            <el-input
              v-model="orgDialogForm.nameDesc"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <el-form-item label="组织结构描述" prop="relationDesc">
            <el-input
              v-model="orgDialogForm.relationDesc"
              autocomplete="off"
            ></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="submitForm('orgDialogForm')"
            >确 认</el-button
          >
          <el-button @click="organizationDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 添加根节点弹出框 -->
      <el-dialog title="添加根节点" :visible.sync="rootNodeDialog">
        <el-form
          :model="rootDialogForm"
          :rules="rootDialogRules"
          ref="rootDialogForm"
          label-width="100px"
          class="dia-gap"
          size="mini"
        >
          <el-form-item label="组织名称" prop="displayName">
            <el-input
              v-model="rootDialogForm.displayName"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <el-form-item label="组织类型" prop="orgType">
            <el-select
              v-model="rootDialogForm.orgType"
              placeholder="请选择"
              class="wp100"
            >
              <el-option label="现实类型" value="现实类型"></el-option>
              <el-option label="虚拟类型" value="虚拟类型"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="组织排序" prop="sort">
            <el-input-number
              v-model="rootDialogForm.orderIndex"
              controls-position="right"
              @change="handleSortChange"
              :min="0"
              :max="10"
            ></el-input-number>
          </el-form-item>
          <el-form-item label="组织描述">
            <el-input
              v-model="rootDialogForm.orgDesc"
              autocomplete="off"
            ></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="submitForm('rootDialogForm')"
            >确 定</el-button
          >
          <el-button @click="rootNodeDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 新建组织弹出框 -->
      <el-dialog title="新建组织" :visible.sync="appendOrgDialog">
        <el-form
          :model="appendOrgForm"
          :rules="rootDialogRules"
          ref="appendOrgForm"
          label-width="100px"
          class="dia-gap"
          size="mini"
        >
          <el-form-item label="组织名称" prop="displayName">
            <el-input
              v-model="appendOrgForm.displayName"
              autocomplete="off"
            ></el-input>
          </el-form-item>
          <el-form-item label="组织类型" prop="orgType">
            <el-select
              v-model="appendOrgForm.orgType"
              placeholder="请选择"
              class="wp100"
            >
              <el-option label="现实类型" value="on"></el-option>
              <el-option label="虚拟类型" value="off"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="组织排序">
            <el-input-number
              v-model="appendOrgForm.orderIndex"
              controls-position="right"
              @change="handleSortChange"
              :min="0"
              :max="10"
            ></el-input-number>
          </el-form-item>
          <el-form-item label="组织描述">
            <el-input
              v-model="appendOrgForm.orgDesc"
              autocomplete="off"
            ></el-input>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="submitForm('appendOrgForm')"
            >确 定</el-button
          >
          <el-button @click="appendOrgDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 添加现有组织弹出框 -->
      <el-dialog
        title="新建组织架构"
        :visible.sync="appendExistingOrgDialog"
        class="selectorDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="岗位类型" class="mr10">
                <el-button slot="append" icon="el-icon-search"></el-button>
              </el-input>
            </el-col>
          </el-row>
        </div>

        <div class="org-selected">
          <el-row>
            <el-col :xs="24" :sm="16" :md="16" :lg="16">
              <el-table
                ref="multipleTable"
                :data="selectTableData"
                tooltip-effect="dark"
                style="width: 100%; margin-top: 0"
                @selection-change="handleSelectionChange"
                border
                fit
                height="354px"
                highlight-current-row
              >
                <el-table-column type="selection" width="55" align="center">
                </el-table-column>
                <el-table-column
                  prop="orgname"
                  label="组织名称"
                  width="300"
                  align="center"
                >
                </el-table-column>
                <el-table-column prop="orgType" label="组织类型" align="center">
                </el-table-column>
              </el-table>
              <!-- 分页 -->
              <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                :current-page="queryInfo.pagenum"
                :page-size="queryInfo.pagesize"
                layout="total, prev, pager, next"
                :total="totle"
                class="ml10"
                style="margin-bottom: 15px"
              ></el-pagination>
            </el-col>
            <el-col
              :xs="24"
              :sm="8"
              :md="8"
              :lg="8"
              class="selectedUl pr10 bbox"
            >
              <p class="wp100 bbox flex justify-between textblue">
                <span>已选择</span>
                <span class="pointer" @click="empty"
                  ><i class="el-icon-delete"></i> 清空</span
                >
              </p>
              <div class="selectedUl-box">
                <ul>
                  <li
                    class="clearfix"
                    v-for="(item, i) in multipleSelection"
                    :key="item.id"
                  >
                    <span class="floatLeft rightOrderBox">{{
                      item.orgname
                    }}</span>
                    <i
                      class="
                        el-icon-close
                        floatRight
                        iconOrganization
                        iconblue
                        fw700
                        f15
                      "
                      @click="del(item.id, i)"
                    ></i>
                    <i
                      class="
                        el-icon-sort-up
                        floatRight
                        iconOrganization
                        iconblue
                        fw700
                      "
                      @click="changeup(item.id, i)"
                    ></i>
                    <i
                      class="
                        el-icon-sort-down
                        floatRight
                        iconOrganization
                        iconblue
                        fw700
                      "
                      @click="changedown(item.id, i)"
                    ></i>
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirm">确 认</el-button>
          <el-button @click="appendExistingOrgDialog = false">取 消</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
let id = 1000;
export default {
  data() {
    return {
      loading: true,
      options: [
        {
          value: "POC组织架构",
          label: "POC组织架构"
        }
        // {
        //   value: "POC多岗位管理",
        //   label: "POC多岗位管理",
        // },
      ], // 下拉菜单数据
      value: "POC组织架构", //下拉菜单选中值
      filterText: "", //搜索菜单
      treeData: [], // 树形结构数据
      defaultProps: {
        children: "childrens",
        label: "organName"
      },
      defaultKyes: [], //选中的数组
      defaultId: "", //当前选中id
      appendOrgDialog: false, // 控制新建组织弹窗
      appendOrgForm: {
        displayName: "",
        orgType: "现实类型",
        orderIndex: "",
        orgDesc: ""
      }, //新建组织表单
      appendExistingOrgDialog: false, // 控制添加现有组织弹窗
      ruleForm: {
        displayName: "",
        orgType: "现实类型",
        orgSort: "0",
        description: "",
        id: "",
        yangLiOrgId: "",
        yangLiOrgParentOrgId: "",
        yangLiOrgManagerEmpId: "",
        yangLiOrgOrderCode: "",
        yangLiOrgStatus: "",
        yangLiOrgSerial: "",
        yangLiWeiXinOrgId: "",
        yangLiOrgManagerEmpName: "",
        yangLitest: "",
        orgLevel: "",
        orgGroup: ""
      }, //基本信息
      rules: {
        displayName: [
          { required: true, message: "【组织名称】不能为空", trigger: "blur" }
        ],
        orgType: [
          {
            required: true,
            message: "【组织类型】不能为空",
            trigger: "change"
          }
        ],
        sort: [
          { required: true, message: "【组织排序】不能为空", trigger: "blur" }
        ]
      }, // 基本信息校验规则
      // ruleForm: {
      //   yangLiOrgId: "",
      //   yangLiOrgParentOrgId: "",
      //   yangLiOrgManagerEmpId: "",
      //   yangLiOrgOrderCode: "",
      //   yangLiOrgStatus: "",
      //   yangLiOrgSerial: "",
      //   yangLiWeiXinOrgId: "",
      //   yangLiOrgManagerEmpName: "",
      //   yangLitest: "",
      //   orgLevel: "",
      //   orgGroup: "",
      // }, // 扩展属性
      tableData: [],
      // 获取用户列表查询参数对象
      queryInfo: {
        query: "",
        // 当前页数
        pagenum: 1,
        // 每页显示多少数据
        pagesize: 5
      },
      totle: 40,

      /*  下属人员相关   */
      staffData: [], //下属人员表格数据
      staffQueryInfo: {
        query: "",
        pagenum: 1,
        pagesize: 5
      }, // 下属人员页码参数
      staffTotle: 0, // 下属人员页码总数
      /*  下属人员相关   */

      organizationDialog: false, // 控制新建组织架构弹窗
      orgDialogForm: {
        name: "",
        nameDesc: "",
        relationDesc: ""
      }, //新建组织架构表单
      orgDialogRules: {
        name: [
          {
            required: true,
            message: "【组织结构别名】不能为空",
            trigger: "blur"
          }
        ],
        nameDesc: [
          {
            required: true,
            message: "【组织结构名称】不能为空",
            trigger: "blur"
          }
        ],
        relationDesc: [
          {
            required: true,
            message: "【组织结构描述】不能为空",
            trigger: "blur"
          }
        ]
      }, // 基本信息校验规则
      rootNodeDialog: false, //控制添加根节点弹窗
      rootDialogForm: {
        displayName: "",
        orgType: "现实类型",
        orderIndex: "",
        orgDesc: ""
      }, //添加根节点表单
      rootDialogRules: {
        displayName: [
          {
            required: true,
            message: "【组织名称】不能为空",
            trigger: "blur"
          }
        ],
        orgType: [
          {
            required: true,
            message: "【组织类型】不能为空",
            trigger: "change"
          }
        ]
      }, // 基本信息校验规则

      selectTableData: [
        {
          id: 1,
          orgname: "工艺组",
          orgType: "现实类型"
        },
        {
          id: 2,
          orgname: "JF/JH组",
          orgType: "现实类型"
        },
        {
          id: 3,
          orgname: "重机二车间",
          orgType: "现实类型"
        },
        {
          id: 4,
          orgname: "工艺二科",
          orgType: "现实类型"
        },
        {
          id: 5,
          orgname: "内勤科",
          orgType: "现实类型"
        },
        {
          id: 6,
          orgname: "平台岗位管理",
          orgType: "现实类型"
        },
        {
          id: 7,
          orgname: "POC流程组织架构",
          orgType: "现实类型"
        }
      ],
      multipleSelection: [],
      addData: {}, //添加节点转存数据
      userName: "",
      organCode: "" //组织code
    };
  },
  created() {
    this.getTreeData();
    this.userName = localStorage.getItem("userName");
  },
  mounted() {
    this.loading = false;
  },
  methods: {
    // 点击搜索按钮
    filterMenu(text) {
      this.$refs.tree.filter(text);
    },
    // 树形组件筛选功能
    filterNode(value, data) {
      if (!value) return true;
      return data.label.indexOf(value) !== -1;
    },

    // 树形结构选择
    handleNodeClick(data) {
      console.log(data);
      this.ruleForm.displayName = data.organName;
      this.ruleForm.orgType = data.organType;
      this.ruleForm.orgSort = data.seq;
      this.ruleForm.description = data.description;
      this.ruleForm.id = data.id;
      this.ruleForm.yangLiOrgManagerEmpId = data.userCode;
      this.ruleForm.yangLiOrgStatus = data.status;
      this.ruleForm.yangLiOrgManagerEmpName = data.userName;
      this.ruleForm.yangLitest = data.executeUserName;
      this.ruleForm.orgLevel = data.organLevel;
      this.ruleForm.orgGroup = data.organGroup;
      this.organCode = data.organCode;
      this.getUserList();
    },

    // 添加节点
    append(data) {
      this.addData = data;
      console.log(this.addData);
      this.appendOrgDialog = true;
    },
    // 添加现有节点
    appendExisting(data) {
      this.appendExistingOrgDialog = true;
      // const newChild = { id: id++, label: "testtest", children: [] };
      // if (!data.children) {
      //   this.$set(data, "children", []);
      // }
      // data.children.push(newChild);
    },

    // 删除用户
    async remove(node, data) {
      var that = this;
      const confirmResult = await that
        .$confirm("确定删除吗?", "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        })
        .catch(err => err);
      // 点击确定 返回值为：confirm
      // 点击取消 返回值为： cancel
      if (confirmResult !== "confirm") {
        return that.$notify.info({
          title: "提示",
          message: "已取消删除",
          showClose: true
        });
      } else {
        const parent = node.parent;
        const children = parent.data.childrens || parent.data;
        const index = children.findIndex(d => d.id === data.id);
        children.splice(index, 1);
        that.$http.delete("/organ/" + data.id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "删除成功",
            showClose: true
          });
          // that.treeData = [];
          // that.getTreeData();
        });
      }
    },

    // 组织排序
    handleSortChange(value) {
      console.log(value);
    },

    // 保存
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          if (formName == "orgDialogForm") {
            this.organizationDialog = false;
          }
          // 新建根节点
          if (formName == "rootDialogForm") {
            this.rootNodeDialog = false;
            var saveData = {
              organName: this.rootDialogForm.displayName,
              organType: this.rootDialogForm.orgType,
              seq: this.rootDialogForm.orderIndex,
              description: this.rootDialogForm.orgDesc,
              organCode: this.randomString(15),
              creator: this.userName,
              parentCode: ""
            };
            console.log(saveData);
            var that = this;
            that.$http
              .post("/organ", saveData)
              .then(function(response) {
                //console.log(response);
                that.$notify.success({
                  title: "提示",
                  message: "增加成功",
                  showClose: true
                });
                that.rootDialogForm = {
                  displayName: "",
                  orgType: "",
                  orderIndex: "",
                  orgDesc: ""
                };
                that.treeData = [];
                that.getTreeData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "增加失败",
                  showClose: true
                });
                // console.log(error);
              });
          }
          // 新建组织表单
          if (formName == "appendOrgForm") {
            this.appendOrgDialog = false;
            console.log(this.addData);
            var saveData = {
              organName: this.appendOrgForm.displayName,
              organType: this.appendOrgForm.orgType,
              seq: this.appendOrgForm.orderIndex,
              description: this.appendOrgForm.orgDesc,
              organCode: this.randomString(15),
              creator: this.userName,
              parentCode: this.addData.organCode
            };
            console.log(saveData);
            var that = this;
            that.$http
              .post("/organ", saveData)
              .then(function(response) {
                //console.log(response);
                that.$notify.success({
                  title: "提示",
                  message: "增加成功",
                  showClose: true
                });
                that.appendOrgForm = {
                  displayName: "",
                  orgType: "现实类型",
                  orderIndex: "",
                  orgDesc: ""
                };
                that.treeData = [];
                that.getTreeData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "增加失败",
                  showClose: true
                });
                // console.log(error);
              });
          }
          //保存基本信息
          if (formName == "ruleForm") {
            var arr = {
              organName: this.ruleForm.displayName,
              organType: this.ruleForm.orgType,
              seq: this.ruleForm.orgSort,
              description: this.ruleForm.description,
              id: this.ruleForm.id,
              userCode: this.ruleForm.yangLiOrgManagerEmpId,
              status: this.ruleForm.yangLiOrgStatus,
              userName: this.ruleForm.yangLiOrgManagerEmpName,
              executeUserName: this.ruleForm.yangLitest,
              organLevel: this.ruleForm.orgLevel,
              organGroup: this.ruleForm.orgGroup
            };
            var that = this;
            that.$http
              .put("/organ", arr)
              .then(function(response) {
                //console.log(response);
                that.$notify.success({
                  title: "提示",
                  message: "更改成功",
                  showClose: true
                });
                that.treeData = [];
                that.getTreeData();
              })
              .catch(function(error) {
                this.$notify.info({
                  title: "提示",
                  message: "更改失败",
                  showClose: true
                });
                // console.log(error);
              });
          }
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    // 获取随机字符串
    randomString(e) {
      e = e || 32;
      var t = "ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678",
        a = t.length,
        n = "";
      for (var i = 0; i < e; i++) n += t.charAt(Math.floor(Math.random() * a));
      return n;
    },
    //组织选择器选择事件
    handleSelectionChange(val) {
      this.multipleSelection = val;
      console.log(this.multipleSelection);
    },
    // 清空
    empty() {
      this.multipleSelection = [];
      this.$refs.multipleTable.clearSelection();
    },
    //删除
    del(id, i) {
      this.selectTableData.forEach(row => {
        if (row.id == id) {
          this.$refs.multipleTable.toggleRowSelection(row, false);
        }
      });
      this.multipleSelection.slice(i, 1);
    },
    // 向上交换
    changeup(id, i) {
      if (i != 0) {
        this.multipleSelection.splice(
          i,
          1,
          ...this.multipleSelection.splice(i - 1, 1, this.multipleSelection[i])
        );
      } else {
        return;
      }
    },
    // 向下交换
    changedown(id, i) {
      // arr.splice(0,1,...arr.splice(1,1,arr[0])) 将第一个值换成第二个值
      this.multipleSelection.splice(
        i,
        1,
        ...this.multipleSelection.splice(i + 1, 1, this.multipleSelection[i])
      );
    },

    //组织选择器确定按钮
    confirm() {},

    // 监听 pagesize改变的事件
    handleSizeChange(newSize) {
      // console.log(newSize)
      this.queryInfo.pagesize = newSize;
    },
    // 监听 页码值 改变事件
    handleCurrentChange(newSize) {
      // console.log(newSize)
      this.queryInfo.pagenum = newSize;
      // this.getUserList();
    },

    openOrganization() {
      this.organizationDialog = true;
    },

    // 获取树形结构数据
    getTreeData() {
      var that = this;
      that.treeData = [];
      that.$http.post("/organ/queryOrganTreeList", {}).then(function(response) {
        console.log(response);
        if (response.data.code == 200) {
          that.treeData = response.data.data;
          that.defaultKyes.push(response.data.data[0].organCode);
          that.defaultId = response.data.data[0].organCode;
          that.$nextTick(() => {
            that.$refs.tree.setCheckedKeys(that.defaultKyes);
            that.$refs.tree.setCurrentKey(response.data.data[0].organCode);
          });
          that.ruleForm.displayName = response.data.data[0].organName;
          that.ruleForm.orgType = response.data.data[0].organType;
          that.ruleForm.orgSort = response.data.data[0].seq;
          that.ruleForm.description = response.data.data[0].description;
          that.ruleForm.id = response.data.data[0].organCode;
          that.ruleForm.yangLiOrgManagerEmpId = response.data.data[0].userCode;
          that.ruleForm.yangLiOrgStatus = response.data.data[0].status;
          that.ruleForm.yangLiOrgManagerEmpName =
            response.data.data[0].userName;
          that.ruleForm.yangLitest = response.data.data[0].executeUserName;
          that.ruleForm.orgLevel = response.data.data[0].organLevel;
          that.ruleForm.orgGroup = response.data.data[0].organGroup;
          that.organCode = response.data.data[0].organCode;
          that.getUserList();
          // console.log(that.treeData);
        } else {
          that.$message({
            message: response.data.message,
            duration: 1500,
            type: "error"
          });
        }
      });
    },

    // 下属相关方法
    // 获取对应下属员工
    getUserList() {
      var that = this;
      var data = {
        pageSize: that.staffQueryInfo.pagesize,
        currPage: that.staffQueryInfo.pagenum,
        condition: {
          organCode: that.organCode
        }
      };
      that.$http.post("/userInfo/list", data).then(function(response) {
        // console.log(response.data.data);
        if (response.data.code == 200) {
          that.staffTotle = response.data.data.count;
          that.staffData = response.data.data.data;
        } else {
          that.$message({
            message: response.data.message,
            duration: 1500,
            type: "error"
          });
        }
      });
    },
    // 监听下属员工页码尺寸改变
    handleUserSizeChange(newSize) {
      this.staffQueryInfo.pagesize = newSize;
      this.getUserList();
    },
    // 监听下属员工页码改变
    handleUserCurrentChange(newPage) {
      this.staffQueryInfo.pagenum = newPage;
      this.getUserList();
    }
  }
};
</script>

<style lang="less" scope>
.h50 {
  height: 50px;
}
.handle-btn .el-button.add-column-btn {
  width: 100%;
  font-size: 13px;
  background-color: transparent;
  color: #008eff;
  margin-top: -1px;
  position: relative;
  z-index: 100;
}
.organizationManagement {
  .tree-left {
    width: 280px;
    .left-list-box {
      padding: 20px 10px;
      height: calc(100vh - 110px);
      .el-form-item {
        margin-bottom: 0;
        .el-form-item__content {
          line-height: 30px;
        }
      }
      .selma {
        // width: 72%;
        width: 84%;
      }
      .el-button.is-circle {
        margin-left: 7px;
      }
      .syste-list {
        height: calc(100vh - 195px);
        margin-bottom: 20px;
        position: relative;
        .tree-box-warp {
          position: relative;
          margin-top: 5px;
        }
      }
    }
  }
  .tree-right {
    width: calc(100% - 280px);
    .right-box {
      padding-left: 16px;
      padding-right: 16px;
      height: calc(100vh - 110px);
      overflow: auto;
      border-left: 2px solid #eff4f8;
      .header-search {
        .title {
          height: 50px;
          line-height: 49px;
          font-size: 15px;
          color: #2f405b;
          padding-left: 10px;
          border-bottom: 1px solid #e3eaf0;
          margin-bottom: 18px;
          .line {
            display: inline-block;
            width: 3px;
            height: 15px;
            background-color: #2f91df;
            margin-right: 5px;
            border-radius: 2px;
            margin-bottom: -2px;
          }
        }
      }
      .header-input {
        font-size: 13px;
      }
    }
  }
  .el-dialog {
    margin-top: 15vh;
    width: 600px;
  }
  .el-input-number--mini {
    width: 100%;
  }
  .el-input-number .el-input__inner {
    text-align: left;
  }
  .search-condition {
    padding: 8px 15px;
    border-bottom: 1px solid #e4e7ed;
  }
  .selectorDialog .selectedUl {
    display: inline-block;
    margin: 0;
    height: 280px;
    max-height: 280px;
    border-left: 1px solid #f3f6f8;
    padding: 0 10px;
  }
  .selectorDialog .el-table th {
    padding: 7px 0;
  }
  .org-selected .selectedUl-box {
    height: 320px !important;
    overflow: auto;
  }
  .selectedUl ul li {
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    width: 100%;
    height: 40px;
    margin-bottom: 10px;
    background: rgba(47, 145, 223, 0.1);
    padding: 14px 0 12px 27px;
  }
  .selectedUl .floatLeft {
    float: left;
    display: block;
    color: #51637f;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    color: #2f91df;
  }
  .selectedUl .floatLeft.rightOrderBox {
    display: block;
    width: 130px;
  }
  .selectedUl ul {
    margin: 0;
    padding: 0;
  }
  .selectedUl ul li .iconOrganization {
    display: inline-block;
    width: 28px;
    color: #2f91df;
    font-size: 13px;
    cursor: pointer;
  }
  .selectedUl .floatRight {
    float: right;
  }
}
</style>
