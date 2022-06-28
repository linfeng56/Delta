package com.github.delta.ln.pattern.singleton;

/**
 * 内部类模式
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
        if(InnerClassSingletonHolder.instance != null){
            throw new RuntimeException("单例模式不允许创建多次！");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.instance;
    }

    /**
     * 避免了加锁，是性能最优的实现方法
     */
    private static class InnerClassSingletonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }


}
