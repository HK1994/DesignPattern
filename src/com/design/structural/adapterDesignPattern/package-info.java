/**
 * Created by hemantkumar on 2/6/2018.
 */
package com.design.structural.adapterDesignPattern;

/*
*  it's a great pattern for connecting new code to legacy code without having to change the working contract that was produced from the legacy code originally.
*  Real example is plug adapter but it doesn't cover all it's features
*  choose when we want a client to talk to an existing interface.This is usually the case when on portion of system is a legacy app or module that either we can't do or possibly change.
*  It effectively is translating requests from the client ,the code that we adapting to ,basically a clint to talking to a legacy app or an adaptee that we have used an adapter to talk to.
*  Ex. Collection API in Java, Stram classes surrounding I/O
*  Arrays->Lists
*
*  Design Consideration
*  -----------------------
*   The adapter is very client centric.
*   It is typically implemented to adapt or integrate a new client to legacy components.
*   Oftentimes it is implemented to an interface, but it doesn't necessarily have to be.
*   It can simply just be a new class.
*   The adaptee can be the new portion of the code too, it typically isn't, but that is one portion of the this pattern that people often don't thing about or overlook.
*   Looking at the UML, you can see we have a client with a specific method that wants to do something.
*   The legacy API doesn't support it, or we don't want to modify the client to work with it in that manner,
*   so we will add an adapter that will carry out that operation for us,
*   and finally integrate with the client to do what we want to get completed in our legacy operation.
*
*   PitFalls
*  ----------
*  If you are adding functionality to your legacy code through the adapter, then you should probably be considering the decorator or some other type of structural pattern.
*
*
* Contrast to Bridge Design Pattern
* ------------------------------------
* To contrast the adapter pattern against another one, let's compare it with the bridge.
* The adapter makes things work after they were designed, basically dealing with legacy code.
* The adapter is almost always retrofitted to make unrelated classes work together.
* It is essentially created to provide a different interface to our legacy code than was originally intended.
*
* The bridge on the other hand was designed up front to let abstraction and implementation vary independently.
* It is built in advanced so that we can provide a layer of abstraction and let both systems be flexible while we are implementing and creating them.
* Both the bridge and the adapter are meant to adapt multiple disparate systems and work in concert with one another.
*
*
*
*
* */