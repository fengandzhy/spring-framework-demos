package org.zhouhy.springframework.component;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.zhouhy.springframework.entity.UserBean;

@Component("userService")
@Import(UserBean.class)
public class UserService {
}
