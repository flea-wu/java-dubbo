package com.nbjike.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.nbjike.entity.UserAddress;
import com.nbjike.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-09-20 15:46
 */
@Component
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "河北省衡水市", "1", "carson", "12345678911", "Y");
        UserAddress address2 = new UserAddress(2, "山东省德州市", "2", "eason", "4562144", "Y");

        return Arrays.asList(address1, address2);
    }
}
