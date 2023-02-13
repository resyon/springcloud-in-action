package io.github.resyon.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户-会员表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:02:31
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 小程序 openid
	 */
	private Integer miniOpenid;
	/**
	 * 服务号 openid
	 */
	private String mpOpenid;
	/**
	 * 微信 unionid
	 */
	private String unionid;
	/**
	 * 会员等级
	 */
	private Long levelId;
	/**
	 * 用户账号名
	 */
	private String userId;
	/**
	 * 用户名
	 */
	private String useName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 
	 */
	private String email;
	/**
	 * 
	 */
	private String avatar;
	/**
	 * 
	 */
	private Integer gender;
	/**
	 * 
	 */
	private Date birth;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 用户来源 0:扫描, 1:搜索, 2:分享
	 */
	private Integer sourceType;
	/**
	 * 积分
	 */
	private Integer integration;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 删除标记==1?被删:正常
	 */
	private Integer delFlag;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
