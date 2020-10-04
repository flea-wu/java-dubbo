package com.nbjike.controller;

import com.nbjike.entity.UserAddress;
import com.nbjike.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 16:58
 */

@RestController
public class TestController {

  @Resource
  private TestService testService;

  @RequestMapping(value = "/user/address", method = RequestMethod.GET)
  public List<UserAddress> getUserAddressList() {
    return testService.getUserAddressList("2");
  }

}
