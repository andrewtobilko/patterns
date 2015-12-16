package com.tobilko.singleton;

public class SingletonByDemandHolderIdiom {

    private SingletonByDemandHolderIdiom() {}

    private static class Keeper {
        private final static SingletonByDemandHolderIdiom INSTANCE = new SingletonByDemandHolderIdiom();
    }

    public static SingletonByDemandHolderIdiom getInstance() {
        return Keeper.INSTANCE;
    }
}
