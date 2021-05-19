package org.zhouhy.spring.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"org.zhouhy.spring.entity.Student","org.zhouhy.spring.entity.Teacher"};
    }
}
