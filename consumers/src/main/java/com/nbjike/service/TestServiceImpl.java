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

  /**
   * 若服务提供者有具体的版本号，则调用方也需要带上对应的版本号
   */
  @Reference(version = "1.0.0")
  private UserService userService;

  @Override
  public List<UserAddress> getUserAddressList(String userId) {
    return userService.getUserAddressList(userId);
  }

}
