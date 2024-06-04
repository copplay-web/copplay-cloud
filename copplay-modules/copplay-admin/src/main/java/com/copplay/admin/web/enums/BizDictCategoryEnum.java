package com.copplay.admin.web.enums;

import lombok.Getter;
import com.copplay.common.CommonException;

/**
 * 业务字典分类枚举
 *
 * @author xuyuxiang
 * @date 2022/7/6 22:21
 */
@Getter
public enum BizDictCategoryEnum {

    /**
     * 业务
     */
    BIZ("BIZ");

    private final String value;

    BizDictCategoryEnum(String value) {
        this.value = value;
    }

    public static void validate(String value) {
        boolean flag = BIZ.getValue().equals(value);
        if(!flag) {
            throw new CommonException("不支持的字典分类：{}", value);
        }
    }
}
