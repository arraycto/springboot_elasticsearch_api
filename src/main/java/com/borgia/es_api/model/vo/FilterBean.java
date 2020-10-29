package com.borgia.es_api.model.vo;

import com.borgia.es_api.annotation.FilterType;
import com.borgia.es_api.enums.FType;
import lombok.Data;

@Data
public class FilterBean {

    /**
     * 开始结束时间中间使用#分隔
     */
    @FilterType(value = FType.DATE)
    private String testYear;

    /**
     * 语言 数组逗号分隔
     */
    @FilterType(value = FType.ARRAY)
    private String testArray;


    /**
     * 字符串过滤类型  ignoreValue=0的不过滤
     */
    @FilterType(value = FType.STRING, ignoreValue = "0")
    private String testString;



}
