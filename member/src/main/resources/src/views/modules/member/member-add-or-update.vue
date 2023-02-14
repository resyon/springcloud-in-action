<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="小程序 openid" prop="miniOpenid">
      <el-input v-model="dataForm.miniOpenid" placeholder="小程序 openid"></el-input>
    </el-form-item>
    <el-form-item label="服务号 openid" prop="mpOpenid">
      <el-input v-model="dataForm.mpOpenid" placeholder="服务号 openid"></el-input>
    </el-form-item>
    <el-form-item label="微信 unionid" prop="unionid">
      <el-input v-model="dataForm.unionid" placeholder="微信 unionid"></el-input>
    </el-form-item>
    <el-form-item label="会员等级" prop="levelId">
      <el-input v-model="dataForm.levelId" placeholder="会员等级"></el-input>
    </el-form-item>
    <el-form-item label="用户账号名" prop="userId">
      <el-input v-model="dataForm.userId" placeholder="用户账号名"></el-input>
    </el-form-item>
    <el-form-item label="用户名" prop="useName">
      <el-input v-model="dataForm.useName" placeholder="用户名"></el-input>
    </el-form-item>
    <el-form-item label="密码" prop="password">
      <el-input v-model="dataForm.password" placeholder="密码"></el-input>
    </el-form-item>
    <el-form-item label="昵称" prop="nickname">
      <el-input v-model="dataForm.nickname" placeholder="昵称"></el-input>
    </el-form-item>
    <el-form-item label="手机号" prop="phone">
      <el-input v-model="dataForm.phone" placeholder="手机号"></el-input>
    </el-form-item>
    <el-form-item label="" prop="email">
      <el-input v-model="dataForm.email" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="avatar">
      <el-input v-model="dataForm.avatar" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="gender">
      <el-input v-model="dataForm.gender" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="birth">
      <el-input v-model="dataForm.birth" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="所在城市" prop="city">
      <el-input v-model="dataForm.city" placeholder="所在城市"></el-input>
    </el-form-item>
    <el-form-item label="用户来源 0:扫描, 1:搜索, 2:分享" prop="sourceType">
      <el-input v-model="dataForm.sourceType" placeholder="用户来源 0:扫描, 1:搜索, 2:分享"></el-input>
    </el-form-item>
    <el-form-item label="积分" prop="integration">
      <el-input v-model="dataForm.integration" placeholder="积分"></el-input>
    </el-form-item>
    <el-form-item label="注册时间" prop="registerTime">
      <el-input v-model="dataForm.registerTime" placeholder="注册时间"></el-input>
    </el-form-item>
    <el-form-item label="删除标记==1?被删:正常" prop="delFlag">
      <el-input v-model="dataForm.delFlag" placeholder="删除标记==1?被删:正常"></el-input>
    </el-form-item>
    <el-form-item label="" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder=""></el-input>
    </el-form-item>
    <el-form-item label="" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder=""></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          miniOpenid: '',
          mpOpenid: '',
          unionid: '',
          levelId: '',
          userId: '',
          useName: '',
          password: '',
          nickname: '',
          phone: '',
          email: '',
          avatar: '',
          gender: '',
          birth: '',
          city: '',
          sourceType: '',
          integration: '',
          registerTime: '',
          delFlag: '',
          createTime: '',
          updateTime: ''
        },
        dataRule: {
          miniOpenid: [
            { required: true, message: '小程序 openid不能为空', trigger: 'blur' }
          ],
          mpOpenid: [
            { required: true, message: '服务号 openid不能为空', trigger: 'blur' }
          ],
          unionid: [
            { required: true, message: '微信 unionid不能为空', trigger: 'blur' }
          ],
          levelId: [
            { required: true, message: '会员等级不能为空', trigger: 'blur' }
          ],
          userId: [
            { required: true, message: '用户账号名不能为空', trigger: 'blur' }
          ],
          useName: [
            { required: true, message: '用户名不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '密码不能为空', trigger: 'blur' }
          ],
          nickname: [
            { required: true, message: '昵称不能为空', trigger: 'blur' }
          ],
          phone: [
            { required: true, message: '手机号不能为空', trigger: 'blur' }
          ],
          email: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          avatar: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          gender: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          birth: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          city: [
            { required: true, message: '所在城市不能为空', trigger: 'blur' }
          ],
          sourceType: [
            { required: true, message: '用户来源 0:扫描, 1:搜索, 2:分享不能为空', trigger: 'blur' }
          ],
          integration: [
            { required: true, message: '积分不能为空', trigger: 'blur' }
          ],
          registerTime: [
            { required: true, message: '注册时间不能为空', trigger: 'blur' }
          ],
          delFlag: [
            { required: true, message: '删除标记==1?被删:正常不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/member/member/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.miniOpenid = data.member.miniOpenid
                this.dataForm.mpOpenid = data.member.mpOpenid
                this.dataForm.unionid = data.member.unionid
                this.dataForm.levelId = data.member.levelId
                this.dataForm.userId = data.member.userId
                this.dataForm.useName = data.member.useName
                this.dataForm.password = data.member.password
                this.dataForm.nickname = data.member.nickname
                this.dataForm.phone = data.member.phone
                this.dataForm.email = data.member.email
                this.dataForm.avatar = data.member.avatar
                this.dataForm.gender = data.member.gender
                this.dataForm.birth = data.member.birth
                this.dataForm.city = data.member.city
                this.dataForm.sourceType = data.member.sourceType
                this.dataForm.integration = data.member.integration
                this.dataForm.registerTime = data.member.registerTime
                this.dataForm.delFlag = data.member.delFlag
                this.dataForm.createTime = data.member.createTime
                this.dataForm.updateTime = data.member.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/member/member/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'miniOpenid': this.dataForm.miniOpenid,
                'mpOpenid': this.dataForm.mpOpenid,
                'unionid': this.dataForm.unionid,
                'levelId': this.dataForm.levelId,
                'userId': this.dataForm.userId,
                'useName': this.dataForm.useName,
                'password': this.dataForm.password,
                'nickname': this.dataForm.nickname,
                'phone': this.dataForm.phone,
                'email': this.dataForm.email,
                'avatar': this.dataForm.avatar,
                'gender': this.dataForm.gender,
                'birth': this.dataForm.birth,
                'city': this.dataForm.city,
                'sourceType': this.dataForm.sourceType,
                'integration': this.dataForm.integration,
                'registerTime': this.dataForm.registerTime,
                'delFlag': this.dataForm.delFlag,
                'createTime': this.dataForm.createTime,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
