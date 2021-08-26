package com.varmilo.shuriken.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 
 * 
 * @author wjx
 * @email 
 * @date 2021-08-25 16:49:02
 */
@Data
@TableName("email")
public class EmailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 邮箱
	 */
	@NotNull(message = "邮箱不能为空")
	private String email;

}
