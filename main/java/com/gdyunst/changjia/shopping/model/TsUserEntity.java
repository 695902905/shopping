package com.gdyunst.changjia.shopping.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 说明： 
 * @author: xieya
 * @date: Created in 15:18 2018/4/4
 * @modified: by autor in 15:18 2018/4/4
 */
@ApiModel(value="")
@Table(name="ts_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TsUserEntity
{
	/**
	*主键
	**/
	@Id
	@Column(name="id")
	private String id;
	/**
	*账号名称(手机号)
	**/
	@ApiModelProperty(value="账号名称(手机号)")
	@Column(name="user_name")
	private String userName;
	/**
	*员工姓名
	**/
	@ApiModelProperty(value="员工姓名")
	@Column(name="nick_name")
	private String nickName;
	/**
	*密码
	**/
	@ApiModelProperty(value="密码")
	@Column(name="password")
	private String password;
	/**
	*状态;Y：可用；N：不可用
	**/
	@ApiModelProperty(value="状态;Y：可用；N：不可用")
	@Column(name="status")
	private Boolean status;
	/**
	*备注
	**/
	@ApiModelProperty(value="备注")
	@Column(name="note")
	private String note;
	/**
	*是否逻辑删除;Y是；N否
	**/
	@ApiModelProperty(value="是否逻辑删除;Y是；N否")
	@Column(name="is_delete")
	private Boolean isDelete;
	/**
	*修改日期
	**/
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	@Column(name="update_date")
	private Date updateDate;
	/**
	*修改人
	**/
	@ApiModelProperty(value="修改人")
	@Column(name="updater_id")
	private String updaterId;
	/**
	*创建日期
	**/
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	@Column(name="create_date")
	private Date createDate;
	/**
	*创建人
	**/
	@ApiModelProperty(value="创建人")
	@Column(name="creater_id")
	private String createrId;
	



	
}
