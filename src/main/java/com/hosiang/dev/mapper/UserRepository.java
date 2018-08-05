package com.hosiang.dev.mapper;

import com.hosiang.dev.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
public interface UserRepository extends JpaRepository<UserBean, String> {

}
