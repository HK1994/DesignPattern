/**
 * Created by hemantkumar on 2/6/2018.
 * Bridge Design Pattern
 */
package com.design.structural.bridgeDesignPattern;

// bridge works with new code whereas the adapter works with legacy code.

/*Concept
------------
The concepts surrounding why you would choose the bridge pattern are that it is meant to decouple abstraction and implementation.
To do this you utilize a few techniques, namely encapsulation, composition, and inheritance.
A key concept with the bridge pattern and why it is more than just inheritance is that changes in the abstraction won't affect the client.
What is meant by this is that the client is unaware of the abstraction on the back-end.
This is important because this decouples the implementation from the contract or interface that the client is using.
One of the key reasons for choosing this pattern is that we know the details won't be right to begin with.
This may sound a little strange at first, but the bridge allows for a level of indirection that we add into our application.
If you aren't quite sure of what the end product of what you're building will be, the bridge is great for giving us flexibility without breaking things with change.
Examples of this are drivers. We use drivers all the time and the bridge is in a lot of ways just a driver.
A good example of this in the Java API are JDBC drivers.
We have an interface that we work with and a driver that works with the underlying database.*/

/*
* Design
*It will utilize interfaces and abstract classes.
* It also places an emphasis on composition over inheritance, but it is more than just composition.
* Your application is designed to expect change from both sides.
* The pieces of the diagram are an abstraction, implementer, refined abstraction, and a concrete implementer.
* */