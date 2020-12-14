package org.zhouhy.springframework.annotation;

import org.springframework.context.annotation.Import;
import org.zhouhy.springframework.selector.UserImportSelector;

import java.lang.annotation.*;

/**
 * Enable 的核心就是把这个UserImportSelector 给引入进来
 * */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(UserImportSelector.class)
public @interface EnableUserConfig {
}
