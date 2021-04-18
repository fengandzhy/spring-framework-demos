package org.zhouhy.spring;

/**
 * 1. 如果设置parent 这个属性, 表示这个bean的配置, 某些属性要照抄另外一个bean, 这两个bean并不一定是父子类
 * 例如在本例中user1 parent设置成了department, 但这两个类毫无关系, 但是，当一个bean的parent 设置成了另外的一个bean
 * 例如在本例中user1 parent设置成了department, 而department这个bean设置了id 和 name两个属性, 那么在user1中必须要有
 * setId 和 setName 方法, 而且入参必须要和department的 setId 和 setName 方法一致. 因为它是通过setter方法来实例化user1的
 * 而 parent是department, 所以它会根据department为模板来调用 user1 的 setId 和 setName
 * 
 * 2. abstract="true" 跟类本身是不是abstract类没有关系, 在这里abstract="true" 表示spring 容器不会实例化它
 * 
 * 3. depends-on 就是告诉spring 容器按照一定的顺序来实例化容器里的bean, 本例中cacheManager 必须要在 sysinit 实例化了之后再实例化
 * 并不是说cacheManager 依赖于 sysinit 而是按照业务的需要, cacheManager 必须要在sysinit 实例化之后再实例化, 所以就有了 depends-on
 * 因为cacheManager用到了一个SystemSettings里的值, 而这个值在sysinit 被创建的时候才初始化, 那么cacheManager 一定要在sysinit实例化了之后再实例化
 * 
 * 4. 关于bean的scope 一共有5种 
 *  1) singleton：单例模式，在整个Spring IoC容器中，使用 singleton 定义的 bean 只有一个实例
 *  2) prototype：原型模式，每次通过容器的getbean方法获取 prototype 定义的 bean 时，都产生一个新的 bean 实例
 *  3) request：对于每次 HTTP 请求，使用 request 定义的 bean 都将产生一个新实例，即每次 HTTP 请求将会产生不同的 bean 实例
 *  4) session：同一个 Session 共享一个 bean 实例
 *  5) global-session：同 session 作用域不同的是，所有的Session共享一个Bean实例
 * 
 * 5. 关于这个lazy-init="true"的, 当设置lazy-init="true"的时候, 它不会再ApplicationContext启动的时候创建bean, 只有在
 * getBean 调用的时候才会去创建bean, 无论scope设置成什么, 只要lazy-init="true" 它都不会再容器启动的时候创建bean
 * 
 * 
 * 
 * */
public class IOCApp3 {
    public static void main(String[] args) {
        
    }
}
