There are three kinds of software design patterns 
(well-known as GOF patterns that have become a de facto standard in the programmers' world): 
creational, structural and behavioral patterns. Concurrency patterns won't be considered, because they aren't a part of GoF.
  
You could find out about all of them here, in this repository.

* Creational
    * [Singleton](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/singleton/ "Singleton") - to allow a class to create one instance
    * [Simple Factory](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/simplefactory/ "Simple Factory") * [[class diagram](http://i.stack.imgur.com/OX1Pb.png)] - the factory based on concrete implementations
    * [Factory Method](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/factorymethod/ "Factory Method") [[class diagram](http://i.stack.imgur.com/Oo8zs.png)]  - to allow a class to defer instantiation to its subclasses        
    * [Abstract Factory](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/abstractfactory/ "Abstract Factory") [[class diagram](http://i.stack.imgur.com/WgecL.png)] - to create a families of related objects without having to depend on their concrete classes
    * [Builder](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/builder/ "Builder") [[class diagram](http://i.stack.imgur.com/Mivqg.png)] - to allow an object building by the parts
    * [Prototype](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/creational/prototype/ "Prototype") [[class diagram](http://i.stack.imgur.com/RUzda.png)] - to allow a creation of objects based on the currently existing object
* Structural
    * [Adapter](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/adapter/
                "Adapter") - to allow adapting different interfaces to each other without modifying their source code
    * [Facade](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/facade/
               "Facade") - to provide a simpler interface to interact with another interface or subsystem
    * [Decorator](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/decorator/
                  "Decorator") - to expand interface functionality dynamically
    * [Composite](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/composite/
                       "Decorator") [[class diagram](http://i.stack.imgur.com/z5hCt.png)] - to allow presenting a group of an object as a single object without a difference of usage
    * [Bridge](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/bridge/
                       "Bridge") [[class diagram](http://i.stack.imgur.com/K5dDB.png)] - to separate an implementation from an abstraction
    * [Flyweight](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/structural/flyweight/
                       "Flyweight") [[class diagram](http://i.stack.imgur.com/gT4mc.png)] - to allow to reduce memory costs using already created objects
                       
* Behavioral
    * [Template method](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/behavioral/templatemethod/
                        "Template method") [[class diagram](http://i.stack.imgur.com/Z7TIe.png)] <the description>
    * [Iterator](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/behavioral/iterator/
                 "Iterator") [[class diagram](http://i.stack.imgur.com/TUjY1.png)] <the description>
    * [Command](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/behavioral/command/
                "Command") <the description>
    * [Observer](https://github.com/andrewtobilko/patterns/tree/master/src/com/github/tobilko/behavioral/observer/
                 "Observer") [[class diagram](http://i.stack.imgur.com/HDkSG.png)] <the description>

*The patterns marked by * don't relate to GoF patterns. They are simply a part of good practice of software development.*