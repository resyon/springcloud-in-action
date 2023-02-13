package io.github.resyon.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户-积分值变化历史
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 16:02:31
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long memberId;
	/**
	 * 改变值, 正负计数
	 */
	private Integer changeCount;
	/**
	 * P.S.
	 */
	private String note;
	/**
	 * 0:扫描, 1:搜索, 2:分享
	 */
	private Integer sourceType;
	/**
	 * 
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
