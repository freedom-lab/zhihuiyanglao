<template>
  <div class="employeeDetail positionr" v-loading="loading">
    <!-- 面包屑导航区 -->
    <el-breadcrumb>
      <el-breadcrumb-item class="pointer" :to="{ path: '/employee' }"
        >人员管理</el-breadcrumb-item
      >
      <el-breadcrumb-item>人员管理详情</el-breadcrumb-item>
    </el-breadcrumb>

    <!-- 头像更换 -->
    <div class="avatar-uploader positiona">
      <el-upload
        action="http://120.55.60.66:8001/upload/uploadImage"
        :show-file-list="false"
        :limit="1"
        :on-success="handleAvatarSuccess"
        :before-upload="beforeAvatarUpload"
      >
        <img
          :src="imageUrl"
          class="avatar"
          onerror="this.src='https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2100401123,2895311668&fm=26&gp=0.jpg'"
        />
      </el-upload>
    </div>

    <!-- 内容主体 -->
    <div class="bgwhite bort">
      <el-row>
        <!-- tabbar -->
        <el-col :span="3">
          <div id="navigation">
            <ul>
              <li
                class="menu-item text-cut"
                v-for="(item, i) in tabs"
                :key="item"
                :class="seeThis == i ? 'active' : ''"
              >
                <a href="javascript:void(0)" @click="goAnchor(i)">{{ item }}</a>
              </li>
            </ul>
          </div>
        </el-col>
        <!-- tabbar对应内容 -->
        <el-col :span="21">
          <div class="menu-content">
            <!-- 基本信息 -->
            <div class="p1" id="a1">
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
                          content="保存基本信息和扩展属性"
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
                      <el-form-item label="姓" prop="lastName">
                        <el-input v-model="ruleForm.lastName"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="名" prop="firstName">
                        <el-input v-model="ruleForm.firstName"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="员工账号" prop="employeeName">
                        <el-input v-model="ruleForm.employeeName"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="邮箱" prop="email">
                        <el-input v-model="ruleForm.email"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="工号" prop="employeeNo">
                        <el-input v-model="ruleForm.employeeNo"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="推送开关标识">
                        <el-select
                          v-model="ruleForm.switch"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="开" :value="1"></el-option>
                          <el-option label="关" :value="0"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="状态">
                        <el-select
                          v-model="ruleForm.jobStatus"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="在职" :value="1"></el-option>
                          <el-option label="离职" :value="2"></el-option>
                          <el-option label="产期休假" :value="3"></el-option>
                          <el-option label="代理" :value="4"></el-option>
                          <el-option label="供应商" :value="5"></el-option>
                          <el-option label="外部" :value="6"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="性别">
                        <el-select
                          v-model="ruleForm.sex"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="女" :value="2"></el-option>
                          <el-option label="男" :value="1"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="手机号" prop="phone">
                        <el-input v-model="ruleForm.phone"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="用户昵称">
                        <el-input v-model="ruleForm.nickname"></el-input>
                      </el-form-item>
                    </el-col>
                    <el-col :sm="24" :md="24" :lg="12">
                      <el-form-item label="员工类型">
                        <el-select
                          v-model="ruleForm.employeeType"
                          placeholder="请选择"
                          class="wp100"
                        >
                          <el-option label="内部员工" :value="1"></el-option>
                          <el-option label="外部员工" :value="2"></el-option>
                        </el-select>
                      </el-form-item>
                    </el-col>
                  </el-row>
                </el-form>
              </div>
            </div>
            <!-- 子系统账户 -->

            <!-- 与组织的关系 -->
            <div class="p1" id="a3">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      与组织的关系
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  v-loading="loading"
                  :data="orgTableData"
                  border
                  fit
                  height="240px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column label="组织名称" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.organName }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="组织类型" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.organType }}</span>
                    </template>
                  </el-table-column>
                  <!-- <el-table-column
                    label="主要负责人"
                    align="center"
                  >
                    <template slot-scope="scope">
                      <span>{{ scope.row.Account }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="次要负责人"
                    prop="email"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="scope">
                      <span>{{ scope.row.email }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="主部门"
                    prop="email"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="scope">
                      <span>{{ scope.row.email }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="负责领域"
                    prop="email"
                    sortable="custom"
                    align="center"
                  >
                    <template slot-scope="scope">
                      <span>{{ scope.row.email }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column label="审批领导" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.email }}</span>
                    </template>
                  </el-table-column> -->

                  <el-table-column
                    label="操作"
                    align="center"
                    class-name="small-padding"
                    fixed="right"
                    width="100"
                  >
                    <template slot-scope="scope">
                      <!-- <el-tooltip
                      class="item"
                      effect="dark"
                      content="保存"
                      placement="bottom"
                    >
                      <i class="el-icon-s-claim textblue f16"></i>
                    </el-tooltip> -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="删除"
                        placement="bottom"
                      >
                        <i
                          class="el-icon-close textblue f16 fw700"
                          @click="delOrg(scope.row.id)"
                        ></i>
                      </el-tooltip>
                    </template>
                  </el-table-column>
                </el-table>
                <!-- 新增按钮 -->
                <div class="handle-btn wp100">
                  <el-button
                    plain
                    class="add-column-btn"
                    @click="selectOrgDialog = true"
                    :disabled="disabledFalg"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div>
              </div>
            </div>
            <!-- 与岗位的关系 -->
            <div class="p1" id="a4">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      与岗位的关系
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  v-loading="loading"
                  :data="postTableData"
                  border
                  fit
                  height="240px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column label="岗位名称" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.postName }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="岗位类型" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.postTypeName }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column label="岗位描述" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.description }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="操作"
                    align="center"
                    class-name="small-padding"
                    fixed="right"
                    width="100"
                  >
                    <template slot-scope="scope">
                      <!-- <el-tooltip
                      class="item"
                      effect="dark"
                      content="保存"
                      placement="bottom"
                    >
                      <i class="el-icon-s-claim textblue f16"></i>
                    </el-tooltip> -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="删除"
                        placement="bottom"
                      >
                        <i
                          class="el-icon-close textblue f16 fw700"
                          @click="delPost(scope.row.id)"
                        ></i>
                      </el-tooltip>
                    </template>
                  </el-table-column>
                </el-table>
                <!-- 新增按钮 -->
                <div class="handle-btn wp100">
                  <el-button
                    plain
                    class="add-column-btn"
                    :disabled="disabledFalg"
                    @click="selectPostDialog = true"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div>
              </div>
            </div>
            <!-- 与权限的关系 -->
            <div class="p1" id="a5">
              <div class="header-search">
                <div class="title">
                  <el-row>
                    <el-col :span="12">
                      <span class="line"></span>
                      与权限的关系
                    </el-col>
                  </el-row>
                </div>
              </div>
              <div class="header-input">
                <!-- 表格 -->
                <el-table
                  v-loading="loading"
                  :data="roleTableData"
                  border
                  fit
                  height="240px"
                  highlight-current-row
                  style="width: 100%"
                >
                  <el-table-column label="描述" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.description }}</span>
                    </template>
                  </el-table-column>
                  <el-table-column label="权限" align="center">
                    <template slot-scope="scope">
                      <span>{{ scope.row.name }}</span>
                    </template>
                  </el-table-column>

                  <el-table-column
                    label="操作"
                    align="center"
                    class-name="small-padding"
                    fixed="right"
                    width="100"
                  >
                    <template slot-scope="scope">
                      <!-- <el-tooltip
                      class="item"
                      effect="dark"
                      content="保存"
                      placement="bottom"
                    >
                      <i class="el-icon-s-claim textblue f16"></i>
                    </el-tooltip> -->
                      <el-tooltip
                        class="item"
                        effect="dark"
                        content="删除"
                        placement="bottom"
                      >
                        <i
                          class="el-icon-close textblue f16 fw700"
                          @click="delRole(scope.row.id)"
                        ></i>
                      </el-tooltip>
                    </template>
                  </el-table-column>
                </el-table>
                <!-- 新增按钮 -->
                <div class="handle-btn wp100">
                  <el-button
                    plain
                    class="add-column-btn"
                    :disabled="disabledFalg"
                    @click="selectAuthorityDialog = true"
                    ><i class="el-icon-plus fw900 f16"></i> 新增</el-button
                  >
                </div>
              </div>
            </div>
          </div>
        </el-col>
      </el-row>

      <!-- 选择组织弹窗 -->
      <el-dialog
        title="选择组织"
        :visible.sync="selectOrgDialog"
        class="selectorDialog"
        id="selectorOrgDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="组织名称" class="mr10">
                <el-button slot="append" icon="el-icon-search"></el-button>
              </el-input>
            </el-col>
          </el-row>
        </div>

        <div class="org-selected">
          <el-row>
            <el-col :xs="24" :sm="12" :md="12" :lg="12">
              <div style="margin-top: 5px">
                <el-tree
                  :data="treeData"
                  node-key="organCode"
                  :current-node-key="defaultId"
                  :props="defaultProps"
                  ref="tree"
                  show-checkbox
                  :highlight-current="true"
                  :check-strictly="true"
                  :check-on-click-node="true"
                  @check-change="handleCheckChange"
                >
                </el-tree>
              </div>
            </el-col>
            <el-col
              :xs="24"
              :sm="12"
              :md="12"
              :lg="12"
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
                      item.organName
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
                    <!-- <i
                      class="el-icon-sort-up floatRight iconOrganization iconblue fw700"
                      @click="changeup(item.id, i)"
                    ></i>
                    <i
                      class="el-icon-sort-down floatRight iconOrganization iconblue fw700"
                      @click="changedown(item.id, i)"
                    ></i> -->
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirmOrg">确 认</el-button>
          <el-button @click="selectOrgDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 岗位信息弹窗 -->
      <el-dialog
        title="岗位信息"
        :visible.sync="selectPostDialog"
        class="selectorDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="岗位名称" class="mr10">
                <el-button slot="append" icon="el-icon-search"></el-button>
              </el-input>
            </el-col>
          </el-row>
        </div>

        <div class="org-selected">
          <el-row>
            <el-col :xs="24" :sm="14" :md="14" :lg="14">
              <div class="pl10 pr10 bbox">
                <div class="checkbox">
                  <el-checkbox
                    :indeterminate="isIndeterminate"
                    v-model="checkAll"
                    @change="handleCheckAllChange"
                    >全选</el-checkbox
                  >
                </div>
                <div class="checkbox-group borb">
                  <el-checkbox-group
                    v-model="checkedItems"
                    @change="handleCheckedItemsChange"
                  >
                    <div
                      class="checkboxItem"
                      v-for="item in selectPostData"
                      :key="item.id"
                    >
                      <el-checkbox :label="item.postName">{{
                        item.postName
                      }}</el-checkbox>
                    </div>
                  </el-checkbox-group>
                </div>
              </div>

              <!-- 分页 -->
              <el-pagination
                @size-change="handleSizeChangePost"
                @current-change="handleCurrentChangePOst"
                :current-page="queryInfoPost.page"
                :page-size="queryInfoPost.size"
                layout="total, prev, pager, next"
                :total="totlePost"
                style="margin: 10px"
              ></el-pagination>
            </el-col>
            <el-col
              :xs="24"
              :sm="10"
              :md="10"
              :lg="10"
              class="selectedUl pr10 bbox"
            >
              <p class="wp100 bbox flex justify-between textblue">
                <span>已选择</span>
                <span class="pointer" @click="emptyPostInfo"
                  ><i class="el-icon-delete"></i> 清空</span
                >
              </p>
              <div class="selectedUl-box" style="height: 240px !important">
                <ul>
                  <li
                    class="clearfix"
                    v-for="(item, i) in multipleSelection2"
                    :key="item.id"
                  >
                    <span class="floatLeft rightOrderBox">{{
                      item.postName
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
                      @click="delPostInfo(item.postName, i)"
                    ></i>
                    <!-- <i
                      class="el-icon-sort-up floatRight iconOrganization iconblue fw700"
                      @click="changeup(item.id, i)"
                    ></i>
                    <i
                      class="el-icon-sort-down floatRight iconOrganization iconblue fw700"
                      @click="changedown(item.id, i)"
                    ></i> -->
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirmPost">确 认</el-button>
          <el-button @click="selectPostDialog = false">取 消</el-button>
        </div>
      </el-dialog>

      <!-- 选择权限弹窗 -->
      <el-dialog
        title="选择权限"
        :visible.sync="selectAuthorityDialog"
        class="selectorDialog"
      >
        <div class="search-condition box">
          <el-row type="flex" justify="end">
            <el-col :span="16">
              <el-input placeholder="描述/权限组" class="mr10">
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
                :data="selectAuthorityData"
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
                <el-table-column prop="description" label="描述" align="center">
                </el-table-column>
                <el-table-column prop="name" label="权限组" align="center">
                </el-table-column>
              </el-table>
              <!-- 分页 -->
              <el-pagination
                @size-change="handleSizeChangeAuthority"
                @current-change="handleCurrentChangeAuthority"
                :current-page="queryInfoAuthority.page"
                :page-size="queryInfoAuthority.size"
                layout="total, prev, pager, next"
                :total="totleAuthority"
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
                <span class="pointer" @click="emptyAuthority"
                  ><i class="el-icon-delete"></i> 清空</span
                >
              </p>
              <div class="selectedUl-box">
                <ul>
                  <li
                    class="clearfix"
                    v-for="(item, i) in multipleSelection3"
                    :key="item.id"
                  >
                    <span class="floatLeft rightOrderBox">{{ item.name }}</span>
                    <i
                      class="
                        el-icon-close
                        floatRight
                        iconOrganization
                        iconblue
                        fw700
                        f15
                      "
                      @click="delAuthority(item.id, i)"
                    ></i>
                    <!-- <i
                      class="el-icon-sort-up floatRight iconOrganization iconblue fw700"
                      @click="changeup(item.id, i)"
                    ></i>
                    <i
                      class="el-icon-sort-down floatRight iconOrganization iconblue fw700"
                      @click="changedown(item.id, i)"
                    ></i> -->
                  </li>
                </ul>
              </div>
            </el-col>
          </el-row>
        </div>
        <div slot="footer" class="dialog-footer">
          <el-button type="primary" @click="confirmAuthority">确 认</el-button>
          <el-button @click="selectAuthorityDialog = false">取 消</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    // 自定义邮箱规则
    var checkEmail = (rule, value, callback) => {
      const regEmail = /^\w+@\w+(\.\w+)+$/;
      if (regEmail.test(value)) {
        // 合法邮箱
        return callback();
      }
      callback(new Error("请输入合法邮箱"));
    };
    // 自定义手机号规则
    var checkMobile = (rule, value, callback) => {
      const regMobile = /^1[34578]\d{9}$/;
      if (regMobile.test(value)) {
        return callback();
      }
      // 返回一个错误提示
      callback(new Error("请输入合法的手机号码"));
    };
    return {
      seeThis: 0,
      tabs: ["基本信息", "与组织的关系", "与岗位的关系", "与权限的关系"], //  // "扩展属性",
      // "汇报关系",
      ruleForm: {
        lastName: "",
        firstName: "",
        employeeName: "",
        email: "",
        employeeNo: "",
        switch: "",
        jobStatus: "",
        sex: "",
        phone: "",
        nickname: "",
        employeeType: "",
        K2Acount: ""
      },
      rules: {
        lastName: [
          { required: true, message: "【姓】不能为空", trigger: "blur" }
        ],
        firstName: [
          { required: true, message: "【名】不能为空", trigger: "blur" }
        ],
        employeeName: [
          { required: true, message: "【员工账号】不能为空", trigger: "blur" }
        ],
        employeeNo: [
          { required: true, message: "【AD】不能为空", trigger: "blur" }
        ],
        email: [{ validator: checkEmail, trigger: "input" }],
        phone: [{ validator: checkMobile, trigger: "input" }]
      },
      tableData: [],
      id: "",
      userCode: "",
      disabledFalg: false,
      loading: true,
      imageUrl: "",
      userName: "",
      orgTableData: [], //与组织的关系表格数据
      treeData: [], // 组织树形结构数据
      defaultProps: {
        children: "childrens",
        label: "organName"
      },
      defaultKyes: [], //选中节点
      defaultId: "", //当前节点
      multipleSelection: [], // 组织选中列表
      selectOrgDialog: false, //选择组织弹窗
      postTableData: [], //与岗位的关系表格数据
      selectPostDialog: false, // 选择岗位弹窗
      selectPostData: [], // 岗位信息表格数据
      multipleSelection2: [], // 岗位选中列表
      checkAll: false, //全选状态
      checkedItems: [], // 默认选中
      isIndeterminate: true, //表示 checkbox 的不确定状态，一般用于实现全选的效果
      queryInfoPost: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 20
      },
      totlePost: "",
      roleTableData: [], // 与权限的关系表格数据
      selectAuthorityDialog: false, //选择权限弹窗
      selectAuthorityData: [
        { id: 1, des: "1111", groupName: "11111111" },
        { id: 2, des: "1111", groupName: "11111111" },
        { id: 3, des: "1111", groupName: "11111111" },
        { id: 4, des: "1111", groupName: "11111111" },
        { id: 5, des: "1111", groupName: "11111111" },
        { id: 6, des: "1111", groupName: "11111111" }
      ], // 选择权限列表
      multipleSelection3: [], // 权限选中列表
      queryInfoAuthority: {
        // 当前页数
        page: 1,
        // 每页显示多少数据
        size: 10
      },
      totleAuthority: ""
    };
  },
  created() {
    if (this.$route.query.id == undefined || this.$route.query.id == "") {
      this.userCode = this.randomString(11);
      this.disabledFalg = true;
    } else {
      this.userCode = this.$route.query.userCode;
      this.disabledFalg = false;
    }
    this.getDataById();
    this.userName = localStorage.getItem("userName");
    this.getTreeData();
    this.getOrgData(this.userCode);
    this.getPostInfoData();
    this.getPostData(this.userCode);
    this.getRoleInfo();
    this.getRoleTableData();
  },
  methods: {
    goAnchor(index) {
      // 也可以用scrollIntoView方法， 但由于这里头部设置了固定定位，所以用了这种方法
      // document.querySelector('#anchor'+index).scrollIntoView()
      this.seeThis = index;
      var i = index + 1;
      var anchor = this.$el.querySelector("#a" + i);
      this.$nextTick(() => {
        this.$el.querySelector(".menu-content").scrollTop = anchor.offsetTop;
      });
    },
    handleScroll() {
      //console.log("滚动了");
      var scrollTop = this.$el.querySelector(".menu-content").scrollTop;
      var scrollHeight = this.$el.querySelector(".menu-content").scrollHeight;
      var height = this.$el.querySelector(".menu-content").offsetHeight;
      var anchorOffset1 = this.$el.querySelector("#a1").offsetTop;
      var anchorOffset2 = this.$el.querySelector("#a2").offsetTop;
      var anchorOffset3 = this.$el.querySelector("#a3").offsetTop;
      var anchorOffset4 = this.$el.querySelector("#a4").offsetTop;
      var anchorOffset5 = this.$el.querySelector("#a5").offsetTop;
      // var anchorOffset6 = this.$el.querySelector("#a6").offsetTop;
      if (scrollTop > anchorOffset1 && scrollTop < anchorOffset2) {
        this.seeThis = 0;
      }
      if (scrollTop > anchorOffset2 && scrollTop < anchorOffset3) {
        this.seeThis = 1;
      }
      if (scrollTop > anchorOffset3 && scrollTop < anchorOffset4) {
        this.seeThis = 2;
      }
      if (scrollTop > anchorOffset4 && scrollTop < anchorOffset5) {
        this.seeThis = 3;
      }
      if (scrollTop > anchorOffset4) {
        this.seeThis = 4;
      }
      if (scrollTop + height == scrollHeight) {
        this.seeThis = 4;
      }
      // if (scrollTop > anchorOffset5 && scrollTop < anchorOffset6) {
      //   this.seeThis = 4;
      // }
      // if (scrollTop > anchorOffset6) {
      //   this.seeThis = 5;
      // }
      // if (scrollTop + height == scrollHeight) {
      //   this.seeThis = 5;
      // }
    },
    // 表单提交
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          var that = this;
          console.log(that.id);
          var user = {};
          user.familyName = that.ruleForm.lastName;
          user.name = that.ruleForm.firstName;
          user.loginName = that.ruleForm.employeeName;
          user.email = that.ruleForm.email;
          user.ad = that.ruleForm.employeeNo;
          user.pushSwitch = that.ruleForm.switch;
          user.status = that.ruleForm.jobStatus;
          user.sex = that.ruleForm.sex;
          user.phone = that.ruleForm.phone;
          user.nickName = that.ruleForm.nickname;
          user.employeeType = that.ruleForm.employeeType;
          user.userCode = that.userCode;
          if (that.id == undefined || that.id == "") {
            user.creator = that.userName;
            user.password = that.$md5("123456");
            that.$http
              .post("/userInfo/add", user)
              .then(function(response) {
                that.$notify.success({
                  title: "提示",
                  message: "增加成功",
                  showClose: true
                });
                that.$router.push({
                  path: "/employee"
                });
              })
              .catch(function(error) {
                that.$notify.info({
                  title: "提示",
                  message: "增加失败",
                  showClose: true
                });
              });
          } else {
            user.updator = that.userName;
            user.id = that.id;
            that.$http
              .post("/userInfo/update", user)
              .then(function(response) {
                that.$notify.success({
                  title: "提示",
                  message: "更改成功",
                  showClose: true
                });
              })
              .catch(function(error) {
                that.$notify.info({
                  title: "提示",
                  message: "更改失败",
                  showClose: true
                });
              });
          }
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    // 监听排序
    sortChange() {},

    //头像
    errorHandler() {
      return true;
    },
    handleAvatarSuccess(res, file) {
      this.imageUrl = URL.createObjectURL(file.raw);
    },
    beforeAvatarUpload(file) {
      const isJPG = file.type === "image/jpeg";
      const isLt2M = file.size / 1024 / 1024 < 2;

      if (!isJPG) {
        this.$message.error("上传头像图片只能是 JPG 格式!");
      }
      if (!isLt2M) {
        this.$message.error("上传头像图片大小不能超过 2MB!");
      }
      return isJPG && isLt2M;
    },

    // 与组织的关系删除事件
    async delOrg(id) {
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
        that.$http.delete("/userOrgan/" + id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "成功删除1条数据",
            showClose: true
          });
          that.getOrgData(that.userCode);
        });
      }
    },

    // 与岗位的关系删除事件
    async delPost(id) {
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
        that.$http.delete("/userPost/" + id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "成功删除1条数据",
            showClose: true
          });
          that.getPostData(that.userCode);
        });
      }
    },

    // 与权限的关系删除事件
    async delRole(id) {
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
        that.$http.delete("/roleUserInfo/" + id).then(function(response) {
          that.$notify.success({
            title: "提示",
            message: "成功删除1条数据",
            showClose: true
          });
          that.getRoleTableData();
        });
      }
    },

    // 监听组织数是否选中状态
    handleCheckChange(data, checked) {
      // console.log(data, checked);
      if (checked == true) {
        this.multipleSelection.push(data);
      } else {
        // console.log( this.multipleSelection);
        var result = this.multipleSelection.filter((item, i) => {
          return item.id != data.id;
        });
        // console.log(result)
        this.multipleSelection = result;
      }
    },
    // 清空
    empty() {
      this.multipleSelection = [];
      this.$refs.tree.setCheckedKeys([]);
    },
    //删除
    del(id, i) {
      this.$refs.tree.setChecked(id);
      this.multipleSelection.splice(i, 1);
    },
    // 组织选择确认
    confirmOrg() {
      var organCodeList = [];
      for (var i in this.multipleSelection) {
        organCodeList.push(this.multipleSelection[i].organCode);
      }
      this.selectOrgDialog = false;
      // this.orgTableData.push(this.multipleSelection[i]);
      var that = this;
      console.log(that.userCode);
      that.$http
        .post("/userOrgan/add", {
          organCode: organCodeList.toString(),
          userCode: that.userCode
        })
        .then(function(response) {
          that.orgTableData = [];
          that.getOrgData(that.userCode);
        })
        .catch(function(error) {});
    },

    // 全选
    handleCheckAllChange(val) {
      console.log(val);
      var selectPostData = [];
      for (var i in this.selectPostData) {
        selectPostData.push(this.selectPostData[i].postName);
      }
      this.checkedItems = val ? selectPostData : [];
      this.multipleSelection2 = val ? this.selectPostData : [];
      this.isIndeterminate = false;
    },
    // 选择
    handleCheckedItemsChange(value) {
      // console.log(value)
      var arr = this.selectPostData;
      this.multipleSelection2 = arr.filter((item, i) => {
        for (var j in value) {
          if (value[j] == item.postName) {
            return item;
          }
        }
      });
      let checkedCount = value.length;
      this.checkAll = checkedCount === this.selectPostData.length;
      this.isIndeterminate =
        checkedCount > 0 && checkedCount < this.selectPostData.length;
    },
    // 清空选择的岗位信息
    emptyPostInfo() {
      this.multipleSelection2 = [];
      this.checkAll = false;
      this.checkedItems = [];
    },
    // 删除选择的岗位信息
    delPostInfo(postName, i) {
      this.checkedItems = this.checkedItems.filter((item, i) => {
        if (item != postName) {
          return true;
        } else {
          return false;
        }
      });
      this.multipleSelection2.splice(i, 1);
      this.getPostInfoData();
    },
    // 岗位信息确认
    confirmPost() {
      var postCodeList = [];
      for (var i in this.multipleSelection2) {
        postCodeList.push(this.multipleSelection2[i].postCode);
      }
      this.selectPostDialog = false;
      var that = this;
      // console.log(that.userCode);
      // console.log(postCodeList.toString());
      that.$http
        .post("/userPost/add", {
          postCode: postCodeList.toString(),
          userCode: that.userCode
        })
        .then(function(response) {
          that.postTableData = [];
          that.getPostData(that.userCode);
          // console.log(that.postTableData)
        })
        .catch(function(error) {});
    },

    // 监听 pagesize改变的事件
    handleSizeChangePost(newSize) {
      // console.log(newSize)
      this.queryInfoPost.size = newSize;
      this.getPostInfoData();
    },
    // 监听 页码值 改变事件
    handleCurrentChangePOst(newSize) {
      // console.log(newSize)
      this.queryInfoPost.page = newSize;
      this.getPostInfoData();
    },

    //权限选择器选择事件
    handleSelectionChange(val) {
      this.multipleSelection3 = val;
      //console.log(this.multipleSelection3);
    },

    // 清空
    emptyAuthority() {
      this.multipleSelection3 = [];
      this.$refs.multipleTable.clearSelection();
    },
    //删除
    delAuthority(id, i) {
      this.selectAuthorityData.forEach(row => {
        if (row.id == id) {
          this.$refs.multipleTable.toggleRowSelection(row, false);
        }
      });
      this.multipleSelection3.splice(i, 1);
    },
    // 选择权限确认
    confirmAuthority() {
      var roleCodeList = [];
      for (var i in this.multipleSelection3) {
        roleCodeList.push(this.multipleSelection3[i].roleCode);
      }
      this.selectAuthorityDialog = false;
      var that = this;
      // console.log(that.userCode);
      that.$http
        .post("/roleUserInfo/add", {
          roleCode: roleCodeList.toString(),
          userCode: that.userCode
        })
        .then(function(response) {
          that.getRoleTableData();
          that.$refs.multipleTable.clearSelection();
        })
        .catch(function(error) {});
    },
    // 监听 pagesize改变的事件
    handleSizeChangeAuthority(newSize) {
      // console.log(newSize)
      this.queryInfoAuthority.size = newSize;
      this.getRoleInfo();
    },
    // 监听 页码值 改变事件
    handleCurrentChangeAuthority(newSize) {
      // console.log(newSize)
      this.queryInfoAuthority.page = newSize;
      this.getRoleInfo();
    },

    // 根据id获取用户信息
    getDataById() {
      var that = this;
      that.id = that.$route.query.id;
      console.log(that.id);
      if (that.id != undefined || that.id != "") {
        that.$http.get("/userInfo/" + that.id).then(function(response) {
          //console.log(response.data.data);
          if (response.data.code == 200) {
            that.ruleForm.lastName = response.data.data.familyName;
            that.ruleForm.firstName = response.data.data.name;
            that.ruleForm.employeeName = response.data.data.loginName;
            that.ruleForm.email = response.data.data.email;
            that.ruleForm.employeeNo = response.data.data.ad;
            that.ruleForm.switch = response.data.data.pushSwitch;
            that.ruleForm.jobStatus = response.data.data.status;
            that.ruleForm.sex = response.data.data.sex;
            that.ruleForm.phone = response.data.data.phone;
            that.ruleForm.nickname = response.data.data.nickName;
            that.ruleForm.employeeType = response.data.data.employeeType;
            that.imageUrl = response.data.data.logo;
          }
        });
      } else {
      }
    },

    // 获取树形结构数据
    getTreeData() {
      var that = this;
      that.treeData = [];
      that.$http.post("/organ/queryOrganTreeList", {}).then(function(response) {
        console.log(response, "--------------------------");
        if (response.data.code == 200) {
          that.$nextTick(() => {
            that.defaultId = response.data.data[0]?.organCode;
          });
          that.treeData = response.data.data;
        } else {
          that.$message({
            message: response.data.message,
            duration: 1500,
            type: "error"
          });
        }
      });
    },

    // 获取与组织的关系表格数据
    getOrgData(useCode) {
      var that = this;
      that.orgTableData = [];
      that.$http
        .post("userOrgan/queryListByUserCode", {
          userCode: useCode
        })
        .then(function(response) {
          console.log(response);
          if (response.data.code == 200) {
            that.orgTableData = response.data.data;
          } else {
            that.$message({
              message: response.data.message,
              duration: 1500,
              type: "error"
            });
          }
        });
    },

    // 获取岗位信息数据
    getPostInfoData() {
      var that = this;
      that.$http.get("/post", that.queryInfoPost).then(function(response) {
        //console.log(response.data);
        if (response.data.code == 200) {
          that.selectPostData = response.data.data.data;
          that.totlePost = response.data.data.count;
        } else {
          that.$message({
            message: response.data.message,
            duration: 1500,
            type: "error"
          });
        }
      });
    },

    // 获取与岗位的关系表格数据
    getPostData(useCode) {
      var that = this;
      that.postTableData = [];
      that.$http
        .post("userPost/queryListByUserCode", {
          userCode: useCode
        })
        .then(function(response) {
          console.log(response.data.data);
          if (response.data.code == 200) {
            that.postTableData = response.data.data;
          } else {
            that.$message({
              message: response.data.message,
              duration: 1500,
              type: "error"
            });
          }
        });
    },

    // 获取权限信息数据
    getRoleInfo() {
      var that = this;
      that.$http
        .get("/roleInfo", that.queryInfoAuthority)
        .then(function(response) {
          console.log(response.data.data);
          //console.log(response.data.data.data);
          if (response.data.code == 200) {
            that.selectAuthorityData = response.data.data.data;
            that.totleAuthority = response.data.data.count;
          } else {
            that.$message({
              message: response.data.message,
              duration: 1500,
              type: "error"
            });
          }
        });
    },

    // 获取与权限的关系表格数据
    getRoleTableData() {
      var that = this;
      that.roleTableData = [];
      // console.log(that.userCode)
      that.$http
        .post("roleUserInfo/queryListByUserCode", {
          userCode: that.userCode
        })
        .then(function(response) {
          console.log(response.data);
          if (response.data.code == 200) {
            that.roleTableData = response.data.data;
          } else {
            that.$message({
              message: response.data.message,
              duration: 1500,
              type: "error"
            });
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
    }
  },
  mounted() {
    var that = this;
    this.$el.querySelector(".menu-content").onscroll = () => {
      that.handleScroll();
    }; // 监听滚动事件，然后用handleScroll这个方法进行相应的处理
    that.loading = false;
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
.employeeDetail {
  .el-breadcrumb__inner {
    color: #2f91df;
  }
  .avatar-uploader {
    top: -16px;
    right: 20px;
    z-index: 10;
  }
  .avatar {
    width: 40px;
    height: 40px;
    border-radius: 50%;
  }
  .el-row {
    #navigation {
      background-color: #f6f7fb;
      font-size: 14px;
      height: calc(100vh - 110px);
      margin-top: -14px;
      li {
        height: 50px;
        line-height: 50px;
        a {
          display: block;
          color: #324059;
          padding-left: 20px;
          background-color: transparent;
        }
      }
      li.active,
      li:hover {
        background-color: #fff;
      }
    }
    .menu-content {
      height: calc(100vh - 110px);
      overflow-y: auto;
      padding-left: 10px;
      padding-right: 5px;
      .p1 {
        margin-bottom: 20px;
      }
      .header-search {
        .title {
          height: 50px;
          line-height: 49px;
          font-size: 15px;
          color: #2f405b;
          padding-left: 10px;
          border-bottom: 1px solid #e3eaf0;
          margin-bottom: 10px;
          .line {
            display: inline-block;
            width: 3px;
            height: 15px;
            background-color: #2f91df;
            margin-right: 5px;
            border-radius: 2px;
            margin-bottom: -2px;
          }
          .el-input {
            width: 247px;
          }
          .el-input .el-input__inner {
            width: 217px;
          }
        }
      }
      .header-input {
        font-size: 13px;
      }
      .model-mask {
        .el-form {
          .el-form-item {
            margin-bottom: 0;
          }
        }
        .el-table {
          margin-top: 10px;
        }
      }
    }
  }
  #selectorOrgDialog .el-dialog {
    width: 600px !important;
  }
  #selectorOrgDialog .selectedUl {
    height: 350px;
    max-height: 350px;
  }
  #selectorOrgDialog .org-selected .selectedUl-box {
    height: 320px !important;
  }
}
</style>
