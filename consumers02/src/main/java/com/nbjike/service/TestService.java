package com.nbjike.service;

import com.nbjike.entity.UserAddress;

import java.util.List;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 16:44
 */
public interface TestService {

  List<UserAddress> getUserAddressList(String userId);

}
