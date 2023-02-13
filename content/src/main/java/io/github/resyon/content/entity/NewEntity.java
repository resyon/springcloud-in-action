package io.github.resyon.content.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 内容-咨询表
 * 
 * @author resyon
 * @email hirosakae7@gmail.com
 * @date 2023-02-13 15:45:33
 */
@Data
@TableName("cms_new")
public class NewEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String imageUrl;
	/**
	 * 
	 */
	private String title;
	/**
	 * 
	 */
	private Integer displayOrder;
	/**
	 * 跳转路径
	 */
	private String renderUrl;
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
