package com.humingfeng.validatingforminput.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
     * @ProjectName:
     * @Package:        com.humingfeng.validatingforminput.domain
     * @ClassName:      UserRepository
     * @Description:    java类作用描述
     * @Author:         胡铭锋
     * @CreateDate:     2019/9/7 3:05 下午
     * @Version:        1.0
     */
public interface UserRepository extends JpaRepository<User, Long> {

}
