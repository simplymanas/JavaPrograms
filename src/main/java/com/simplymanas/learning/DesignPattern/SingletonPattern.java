package com.simplymanas.learning.DesignPattern;

public class SingletonPattern {
    private boolean isSingleton = false;
    private SingletonPattern() {
    }

    private static SingletonPattern uniqueInstance = null;

    public static SingletonPattern getInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new SingletonPattern();
        }

        return  uniqueInstance;
    }

    public void isSingleton(){
        System.out.println("Checking singleton : " + isSingleton);
        if(!isSingleton){
            isSingleton=true;
        }
        System.out.println(this.hashCode());
    }


    public static void main(String[] args) {

        SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();
        SingletonPattern instance3 = SingletonPattern.getInstance();

        instance1.isSingleton();
        instance2.isSingleton();
        instance3.isSingleton();
    }
}


/*
there might be
eager loading
lazy loading singleton as well

for thread safety use synchronized block
when concurrency is an issue
but it might slow down the process
 */