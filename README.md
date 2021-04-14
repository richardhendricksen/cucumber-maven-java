# Cucumber with Maven written Java [![CI](https://github.com/richardhendricksen/cucumber-maven-java/actions/workflows/ci.yml/badge.svg)](https://github.com/richardhendricksen/cucumber-maven-java/actions/workflows/ci.yml)

Example project using Cucumber with Maven written in Java.

## Best practices

### Write Declarative Scenarios, Not Imperative

Write scenarios/steps that are about what you are doing and why you are doing it rather than about how you do things. Cucumber is a tool for doing BDD. 
The key word here is Behaviour, and its interpretation. The fundamental idea behind Cucumber and steps is that each piece of behaviour (the what) 
has a unique name and place in the application, and in the application context you can talk about that behaviour using that name without ambiguity.

Steps should never describe HOW you do something. 
Good steps never talk about clicking or selecting. Instead they talk about the reason Why you are clicking or selecting.