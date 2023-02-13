package io.github.resyon.question.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题库-题目类型
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:17
 */
@Data
@TableName("qms_type")
public class TypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 类型名称
	 */
	private String typeName;
	/**
	 * P.S.
	 */
	private String comments;
	/**
	 * 
	 */
	private String logoUrl;
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
