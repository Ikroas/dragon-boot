package org.dragon.common.base;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @program: dragon-boot
 * @description:
 * @author: longhu@xingzheyi.com
 * @create: 2023-05-10 16:45
 */
public class BaseEntity implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
