<h1 align="center">:zap: A Basic Cheat Sheet :zap:</h1>
<p align="center">:small_red_triangle_down: Usefull for this perticular UFCD :small_red_triangle_down:</p>
<p align="center">:construction: :construction: :construction:</p>

 - - -

 <!-- <br /> -->

### :small_blue_diamond:**Basic Class and Object**

```java
class nameofclass {

 public static void main(String[] args) {

   //Block of code
   System.out.println("Hello World");

 }
}
```

##

### :small_blue_diamond:**For Loop**

```java
for(int i=0 ; i<=5 ; i++) {

  // This will repeat 5 times
  System.out.println("Hello World");

}
```

##

### :small_blue_diamond:**While Loop**

```java
int i = 1;
while(i<=10) {

  // This will repeat until i = 10
  System.out.println("Hello World");
  i++; // This will add 1 to i

}
```

##

### :small_blue_diamond:**If Statement**

```java
int i = 50
if ( i == 10 ) {

  // It will fall here if 'i' = 10

} else if ( i == 20 ) {

  // It will fall here if 'i' = 20

} else {

  // It will fall here if it does not match any of the statements

}
```

##

### :small_blue_diamond:**Read Input From User**

```java
import java.util.Scanner; //Import Class

class nameofclass {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in); //Spwan Scanner as 'in'

    System.out.print("Enter a number: ");
    int i = Integer.parseInt(in.next()); //Get input from user as Integer

    System.out.println("i");

  }
}
```

##

### :small_blue_diamond:**Arrays**

```java
import java.util.Scanner; //Import Scanner Class
import java.util.Arrays;  //Import Arrays Class

class nameofclass {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in); //Spwan Scanner as 'in'
    int[] arrayname = new int[5]; //Create an int Array with 5 "spaces"

    System.out.print("Enter a number: ");
    arrayname[1] = in.nextInt(); //Get input from user as Int to position 1

    System.out.println(arrayname[1]);               //Print position 1 of Array
    System.out.println(arrayname.length);           //Print length of Array
    System.out.println(Arrays.toString(arrayname)); //Print all members of Array

  }
}
```

```java
int i = Integer.parseInt(in.next());   //This will take an Integer as input
```

```java
float i = Float.parseFloat(in.next()); //This will take a Float as input
```

```java
string i = in.next();                  //This will take a String as input
```

##

### :small_blue_diamond:**Types of Variables**

```java
int varname = 5;                // A integer variable
```

```java
float varname = 5.476;          // A float variable
```

```java
double varname = 5.476978;      // A double variable
```

```java
char varname = 'c';             // A char variable
```

```java
string varname = "Hello World"; // A string variable
```

```java
boolean varname = true;         // A boolean variable ( true / false )
```

- - -

<div align="left">

  Date Type | EX Values
  :--- | :---
  boolean | FALSE/TRUE
  char | (A single character)
  int | (0 ; 2 ; 100 ; 68)
  float | (1.79)
  double | (3.7986)
  ... | ...
  String | "Hello World"
  Array | [4,4.5,876,978]
  ... | ...

</div>

##

<div align="left">

  Operator Category | Operators
  :--- | :---
  Arithmetic operators | +,-,/,*,%
  Relational operators | <, >, <=, >=,==, !=
  Logical operators | && , ||
  Increment and Decrement operator | ++ , --
  ... | ...

</div>

 <p align="center">:zap: :construction: :zap:</p>
