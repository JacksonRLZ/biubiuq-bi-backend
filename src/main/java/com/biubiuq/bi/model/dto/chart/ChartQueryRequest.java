package com.biubiuq.bi.model.dto.chart;

import com.biubiuq.bi.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChartQueryRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 分析目标
     */
    private String goal;
    /**
     * 图表类型
     */
    private String chartType;
    /**
     * 用户id
     */
    private Long userId;
}