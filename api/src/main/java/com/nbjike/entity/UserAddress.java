package com.nbjike.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 15:34
 */
@Data
@AllArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    private String  userAddress; // 用户地址
    private String  userId; // 用户id
    private String  consignee; // 收货人
    private String  phoneNum; // 电话号码
    private String  isDefault; // 是否为默认地址 yes / no
}
