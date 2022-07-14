package com.github.delta.ln.pattern.adapter;

import org.junit.Test;

/**
 * 适配器模式测试
 */
public class AdapterTest {

    @Test
    public void test(){
        Player player = new Center("center");
        player.defense();

        Yaoming ym = new Yaoming();

        Player adapter = new Adapter("外籍球员", ym);
        adapter.attack();
        adapter.defense();
    }
}
