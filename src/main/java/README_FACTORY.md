#FACTORY
Factory is an ambiguous term that stands for a function, method or class that supposed to be producing something

Mechanism
    function, method, class
Example:
    DB Connections, Reports, Users

## 1. Creation Method
    just a wrapper around constructor  ( no example needed )
    not a an official design pattern

## 2. Static Factory Method 
    uses static method instead of constructor
        Examples: Static Factory Method: Integer.valueOf(10) vs a constructor: new Integer(10)

    WHY: 
        can do more descriptive custom method names (constructors can't)
            facilitates a self describing method name when you have to 
            have several different constructors that have different purposes 
            with identical signatures, the method name can identify the purpose
            i.e. createWith

        restrict instantiation: reuse existing instances (singleton, non-instantiated utility classes)
            Examples: Math, it's a java utility class that is not instantiated nor inherited.

        More descriptive method names (can use any method name)
        You want to instance-controlled objects:
        reuse existing objects, instead of instancing new ones

            Can restrict subclassing (facillitates/enforces condensed/restricted API). Math/collections etc.
            
    WHAT:
        NOT considered one of the official design patterns but still *very useful and widely used*
        NOT the same as "FACTORY METHOD PATTERN"
        AKA "Static Creation Method" (more rarely used term for this appraoch)


    PROS:
            More descriptive (can use any method name)
            You want to instance-controlled objects: 
                reuse existing objects, instead of instancing new ones

            Can restrict subclassing (facillitates/enforces condensed/restricted API). Math/collections etc.
            
    CONS:
            Hard to find the creation methods (Note: Java has a naming convention)
            because they are not like constructors where the name is defined;
            however, Java does have a naming convention for these methods that is not enforced
            
[Static Factory Naming Convention](org/jsg/creational/factory/STATIC_FACTORY_METHOD_NAMING_CONVENTION.md)

### IS EQUAL TO TEST
        Fun with static factory methods / non-instantiable utility classes and equals
        staticfactorymethod.equality.IsEqualTest.java

## 3. Factory [Method] Pattern

    an official creational design pattern
    provides a factory for creating objects dynamically
    Advantages: loose coupling and flexibility
        
    https://www.javatpoint.com/factory-method-design-pattern


## 4. [TODO] Abstract Factory
    refactoring guru drops the ball here
        https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

## 5. [TODO] PLUGIN


## REFERENCES
https://en.wikipedia.org/wiki/Design_Patterns
Effective Java Third Edition by Josh Bloch

