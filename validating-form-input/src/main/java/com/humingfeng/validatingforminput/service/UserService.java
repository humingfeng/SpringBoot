package com.humingfeng.validatingforminput.service;



import com.humingfeng.validatingforminput.domain.User;

import java.util.List;

/**
     * @ProjectName:
     * @Package:        com.humingfeng.validatingforminput.service
     * @ClassName:      UserService
     * @Description:    java类作用描述
     * @Author:         胡铭锋
     * @CreateDate:     2019/9/7 3:05 下午
     * @Version:        1.0
     */
public interface UserService {

    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);
}
