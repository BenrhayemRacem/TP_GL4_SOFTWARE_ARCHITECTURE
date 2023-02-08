package com.directi.training.lsp.exercise_refactored;

public class NormalDuck implements IDuck
{
    public void quack()
    {
        System.out.println("Quack...");
    }

    public void swim()
    {
        System.out.println("Swim...");
    }
}
