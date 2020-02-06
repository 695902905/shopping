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
@Table(name="tb_business")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbBusinessEntity
{
	/**
	*主键
	**/
	@Id
	@Column(name="id")
	private String id;
	/**
	*商户名称
	**/
	@ApiModelProperty(value="商户名称")
	@Column(name="business_name")
	private String businessName;
	/**
	*商户图片
	**/
	@ApiModelProperty(value="商户图片")
	@Column(name="business_image_url")
	private String businessImageUrl;
	/**
	*备注
	**/
	@ApiModelProperty(value="备注")
	@Column(name="note")
	private String note;
	/**
	*创建人
	**/
	@ApiModelProperty(value="创建人")
	@Column(name="creater_id")
	private String createrId;
	/**
	*创建日期
	**/
	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	@Column(name="create_date")
	private Date createDate;
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
	



	
}
