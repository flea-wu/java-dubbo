package com.nbjike.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nbjike.entity.UserAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 16:45
 */
@Service
public class TestServiceImpl implements TestService {

  @Reference(version = "1.0.0")
  private UserService userService;

  @Override
  public List<UserAddress> getUserAddressList(String userId) {
    return userService.getUserAddressList(userId);
  }

}
