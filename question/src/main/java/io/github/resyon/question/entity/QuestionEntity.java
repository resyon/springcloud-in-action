package io.github.resyon.question.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题库-题目
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:39:18
 */
@Data
@TableName("qms_question")
public class QuestionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private String answer;
	/**
	 * 难度
	 */
	private Integer level;
	/**
	 * 排序
	 */
	private Integer displayOrder;
	/**
	 * 
	 */
	private String subTitle;
	/**
	 * 题目类型
	 */
	private Long type;
	/**
	 * 是否显示
	 */
	private Integer enable;
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
