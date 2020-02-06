package com.gdyunst.changjia.shopping.common.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 说明:
 *
 * @author xieya
 * @Data
@Builder
@NoArgsConstructor
@AllArgsConstructor Created in 2019/8/23 10:51
 * @modified by autor in 2019/8/23 10:51
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "父类查询请求体")
public class BaseQueryRequestForm {

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private String endTime;

    @ApiModelProperty(value = "页数", example = "1")
    private Integer page = 1;

    @ApiModelProperty(value = "条数", example = "10")
    private Integer size = 10;
}
