package com.github.delta.ln.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LambadaTest {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 1818.18),
            new Employee("李四", 12, 1212.12),
            new Employee("王五", 39, 3939.39),
            new Employee("赵六", 27, 2727.27)
    );

    @Test
    public void test1() {
        employees.stream().filter((e) -> e.getAge() > 20).limit(1).forEach(System.out::println);
    }
}
