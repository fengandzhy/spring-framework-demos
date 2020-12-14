package org.zhouhy.springframework.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 这个实现了ImportSelector 返回的是一个数组, Spring 会根据这个数组来创建UserBean 和 RoleBean
 * */
public class UserImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"org.zhouhy.springframework.entity.RoleBean",
                "org.zhouhy.springframework.entity.UserBean"};
    }
}
