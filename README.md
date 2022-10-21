# Sort Manager

## Table of content
1. [About the project](#1.-About-the-project)
   1. [Sorting algorithms](#1.-Sorting-algorithms)
   2. [Design patterns](#2.-Design-patterns)
   3. [Testing](#3.-Testing)
   4. [Dependencies used](#4.-Dependencies-used)
2. [Playing with it](#2.-Playing-with-it)

***

### 1. About the project
Welcome to my Sort Manager! This app allows the user to choose one of the sorting algorithms that it provides to 
sort numbers in **ascending order**. 
Then, 
the user will be prompted to select the amount of numbers they want to generate and be sorted. The generator will 
then create an array with numbers ranging from ```1000``` to ```-1000```.

<br>
<ul>

#### 1. Sorting algorithms
</ul>
The manager offers a total of 5 different sorting algorithms:
<ol>
<li>Bubble Sort</li>
<li>Merge Sort</li>
<li>Binary Tree Sort (in-order traverse)</li>
<li>Quick Sort</li>
<li>Insertion Sort</li>
</ol>
<br>
<ul>

#### 2. Design patterns
</ul>
The app has had two design patterns implemented.

- **Factory pattern**: this creational pattern is the heart of the manager, through which each sorter object is created.
- **MVC**: this pattern has been taken into account on the structuring of the classes.

<br>
<ul>

#### 3. Testing
</ul>
In this case the testing has been divided into two different parts: tests for checking if the algorithms work 
and tests to compare their speed.
<br>
<br>
<ul>

#### 4. Dependencies used
</ul>

```
<dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.9.0</version>
    </dependency>
  </dependencies>
  ```
<br>
<br>

### 2. Playing with it
Before getting started, you need to make sure that you have JDK installed on your machine in order to compile the 
code and run the app.

1. Clone the repository<br>
```https://github.com/yoyesu/sort-manager.git```

2. Open the project with the IDE you prefer.
3. Play with it and send a pull request if you feel like it!