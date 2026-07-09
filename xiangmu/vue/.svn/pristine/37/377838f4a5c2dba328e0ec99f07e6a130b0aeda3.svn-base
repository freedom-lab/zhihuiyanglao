<template>
  <div>
    <div v-html="html"></div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      html: "",
      type: "",
    };
  },
  created() {
    this.getHtml();
  },
  methods: {
    // saveHtml() {
    //   var html = this.$refs.portal.innerHTML;
    //   localStorage.setItem("html", html);
    // },
    // 获取原代码
    getHtml() {
      var that = this;
      that.type = this.$route.query.type;
      that.$http
        .post("/portalConfig/queryOne", { id: 1 })
        .then(function (response) {
          //console.log(response.data);
          if (response.data.code == 200) {
            if (that.type == 1) {
              that.html = response.data.data.conserve;
            } else {
              that.html = response.data.data.content;
            }
          }
        });
    },
    // getPreviewHTml() {
    //   var that = this;
    //   that.$http
    //     .post("/portalConfig/queryOne", { id: 1 })
    //     .then(function (response) {
    //       //console.log(response.data);
    //       if (response.data.code == 200) {
    //         // that.html = response.data.data.draft;
    //       }
    //     });
    // },
  },
  mounted() {
    // this.saveHtml();
  },
};
</script>

<style lang="less" scoped>
</style>