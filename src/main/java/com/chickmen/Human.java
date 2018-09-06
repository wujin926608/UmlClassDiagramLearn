package com.chickmen;

/**
 * 人
 * @author chickmen(jin.wu@ucarinc.com)
 * @author chickmen(jin.wu@ucarinc.com)
 * @version 2018/9/6
 * @since 2018/9/6
 */
public class Human extends Mammal implements Ibreakfast {

    public Human(Head head) {
        super(head);
    }

    @Override
    public void eatSomething() {
        System.out.println("豆浆油条");
    }

    @Override
    public void whenToEat() {
        System.out.println("早上");
    }
}
