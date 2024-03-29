package com.humingfeng.validatingforminput.service.impl;

import com.humingfeng.validatingforminput.domain.User;
import com.humingfeng.validatingforminput.domain.UserRepository;
import com.humingfeng.validatingforminput.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
     * @ProjectName:
     * @Package:        com.humingfeng.validatingforminput.service.impl
     * @ClassName:      UserServiceImpl
     * @Description:    java类作用描述
     * @Author:         胡铭锋
     * @CreateDate:     2019/9/7 3:05 下午
     * @Version:        1.0
     */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insertByUser(User user) {
        LOGGER.info("新增用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        LOGGER.info("更新用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);

        LOGGER.info("删除用户：" + user.toString());
        return user;
    }

    @Override
    public User findById(Long id) {
        LOGGER.info("获取用户 ID ：" + id);
        return userRepository.findById(id).get();
    }
}
