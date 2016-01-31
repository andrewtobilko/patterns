package com.github.tobilko.structural.bridge;

public class Client {

    private interface API {
        void method();
    }

    private class FirstApiImplementation implements API {
        @Override public void method() {}
    }

    private class SecondApiImplementation implements API {
        @Override public void method() {}
    }

    private class Element {
        private API implementation;

        public Element(API implementation) {
            this.implementation = implementation;
        }

        private void realize() {
            implementation.method();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();

        Client.Element firstElement = client.new Element(client.new FirstApiImplementation());
        Client.Element secondElement = client.new Element(client.new SecondApiImplementation());

        firstElement.realize();
        secondElement.realize();
    }
}
