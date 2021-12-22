package com.practice.javabasic.concept;

/**
 * 四种引用：强引用、软引用、弱引用，虚引用
 * 强引用： 只要引用还存在，引用的对象就不会被gc回收
 * 软引用： 当内存不足时，会先去回收软引用指向的对象，这可以用于非必要但有用的数据，如缓存数据
 * 弱引用： 即使引用还存在，当发生gc时，还是会回收掉引用对象
 * 虚引用： 实际上不指向对象
 * 引用队列： gc在回收对象前，会将对象相关联的引用放于一个队列中，我们可以通过判断某个对象被加入到该队列，
 * 来得知一个对象是否要被回收了，需要时就可以在回收前做处理
 */
public class ReferenceDemo {


    // 强引用
    private void strongRef() {

        String str = new String("123");

        System.out.println(str);

        System.gc();

        System.out.println(str);

    }



}
