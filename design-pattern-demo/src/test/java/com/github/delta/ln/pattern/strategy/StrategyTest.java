package com.github.delta.ln.pattern.strategy;

import com.github.delta.ln.pattern.strategy.impl.CashNormal;
import com.github.delta.ln.pattern.strategy.impl.CashRebate;
import com.github.delta.ln.pattern.strategy.impl.CashReturn;
import org.junit.Assert;
import org.junit.Test;

/**
 * 策略模式测试
 */
public class StrategyTest {

    @Test
    public void test_normal() {
        //原价
        CashContext cc = new CashContext(new CashNormal());

        Double money = 10.0;
        Double result = cc.getResult(money);

        Assert.assertEquals(result ,money);
    }

    @Test
    public void test_rebate(){
        //打八折
        CashContext cc = new CashContext(new CashRebate(0.8));

        Double money = 100.0;
        Double result = cc.getResult(money);

        Assert.assertEquals(result , new Double("80.0"));
    }

    @Test
    public void test_return(){
        //满100 减30
        CashContext cc = new CashContext(new CashReturn(100,30));

        Double money = 100.0;
        Double result = cc.getResult(money);

        Assert.assertEquals(result , new Double("70.0"));
    }
}
