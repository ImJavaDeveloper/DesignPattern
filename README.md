# Design Pattern

**Java Design Patterns are divided into three categories – creational, structural, and behavioral design patterns. This post serves as an index for all the java design patterns articles I have written so far.**

[Creational Design Patterns](#creational-design-patterns)
- [Singleton Pattern](#singleton-pattern)
- Factory Pattern
- Abstract Factory Pattern
- Builder Pattern
- Prototype Pattern
#  Structural Design Patterns
- Adapter Pattern
- Composite Pattern
- Proxy Pattern
- Flyweight Pattern
- Facade Pattern
- Bridge Pattern
- Decorator Pattern
# Behavioral Design Patterns
- Template Method Pattern
- Mediator Pattern
- Chain of Responsibility Pattern
- Observer Pattern
- Strategy Pattern
- Command Pattern
- State Pattern
- Visitor Pattern
- Interpreter Pattern
- Iterator Pattern
- Memento Pattern
# Miscellaneous Design Patterns
- DAO Design Pattern
- Dependency Injection Pattern
- MVC Pattern

### Creational Design Patterns
Creational design patterns provide solution to instantiate a object in the best possible way for specific situations
#### Singleton-Pattern
To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
