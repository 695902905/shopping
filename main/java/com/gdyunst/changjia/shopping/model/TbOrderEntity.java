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
@Table(name="tb_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbOrderEntity
{
	/**
	*主键
	**/
	@Id
	@Column(name="id")
	private String id;
	/**
	*订单金额
	**/
	@ApiModelProperty(value="订单金额")
	@Column(name="order_money")
	private Double orderMoney;
	/**
	*订单状态
	**/
	@ApiModelProperty(value="订单状态")
	@Column(name="order_state")
	private String orderState;
	/**
	*微信订单状态
	**/
	@ApiModelProperty(value="微信订单状态")
	@Column(name="weixin_order_id")
	private String weixinOrderId;
	/**
	*服务id
	**/
	@ApiModelProperty(value="服务id")
	@Column(name="service_id")
	private String serviceId;
	/**
	*服务名称
	**/
	@ApiModelProperty(value="服务名称")
	@Column(name="service_name")
	private String serviceName;
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
	/**
	*手机号码
	**/
	@ApiModelProperty(value="手机号码")
	@Column(name="phone")
	private String phone;
	



	
}
