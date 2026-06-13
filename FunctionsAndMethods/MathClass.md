# math class 
The Math class in Java is a built-in class and is part of the java.lang package. It provides various mathematical functionalities through methods and constants. It's a non-instantiable class, meaning we cannot create an object using the new keyword — we call its methods directly through the class name (they are all static). Study Rocket

Method-by-Method Breakdown
a. Math.min()
Math.min(double a, double b) returns the smaller of two values. It works with int, long, float, and double. 


b. Math.max()
Math.max(double a, double b) returns the greater of two double values. If the two arguments are of the same type, the method will return that type; if they are of different types, it returns a value of the wider type. 

c. Math.sqrt()
Math.sqrt(double a) returns the correctly rounded positive square root of a double value. 

d. Math.pow()
Math.pow(x, y) returns the value of x raised to the power of y. Note: Math.pow() always returns a double, even if the result is a whole number. 

e. Math.avg() — ⚠️ Does NOT Exist!
Math.avg() is not a method in Java's Math class. The standard Math class includes abs, ceil, floor, max, min, pow, random, round, sqrt, and trigonometric functions — but no avg(). To compute an average, you simply use arithmetic: (a + b) / 2.0. I'll demonstrate this in the code below. 

f. Math.abs()
Math.abs() returns the absolute value of the given argument. If the argument is not negative, the argument is returned as-is.

Claude finished the responseYou said: Search about(Google) & use the following methods of the Math class in Java:Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( )4:35 PMClaude responded: Here's a comprehensive explanation and working Java program covering all the requested Math class methods.Searched the webSearched the webHere's a comprehensive explanation and working Java program covering all the requested Math class methods. Note that Math.avg() does not exist in Java — I'll address that separately.

📚 Java Math Class — Research Summary
The Math class in Java is a built-in class and is part of the java.lang package. It provides various mathematical functionalities through methods and constants. It's a non-instantiable class, meaning we cannot create an object using the new keyword — we call its methods directly through the class name (they are all static). Study Rocket

Method-by-Method Breakdown
a. Math.min()

Math.min(double a, double b) returns the smaller of two values. It works with int, long, float, and double. DataCamp
b. Math.max()

Math.max(double a, double b) returns the greater of two double values. If the two arguments are of the same type, the method will return that type; if they are of different types, it returns a value of the wider type. DataCampNtci
c. Math.sqrt()

Math.sqrt(double a) returns the correctly rounded positive square root of a double value. DataCamp
d. Math.pow()

Math.pow(x, y) returns the value of x raised to the power of y. Note: Math.pow() always returns a double, even if the result is a whole number. W3Schools
e. Math.avg() — ⚠️ Does NOT Exist!

Math.avg() is not a method in Java's Math class. The standard Math class includes abs, ceil, floor, max, min, pow, random, round, sqrt, and trigonometric functions — but no avg(). To compute an average, you simply use arithmetic: (a + b) / 2.0. I'll demonstrate this in the code below. 

f. Math.abs()  // removes negative sign , always (number > 0)
Math.abs() returns the absolute value of the given argument. If the argument is not negative, the argument is returned as-is. Study Rocket




//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Now here's a complete, well-commented Java program demonstrating all of them
🖥️ Expected Output
========================================
       Java Math Class Methods Demo     
========================================

a. Math.min()
   Math.min(-15, 42) = -15
   → Returns the smaller value.

b. Math.max()
   Math.max(-15, 42) = 42
   → Returns the larger value.

c. Math.sqrt()
   Math.sqrt(64.0) = 8.0
   → √64 = 8.0

d. Math.pow()
   Math.pow(3.0, 4.0) = 81.0
   → 3^4 = 81.0

e. Math.avg()  ← ⚠️  This method does NOT exist in Java!
   Java's Math class does not provide an avg() method.
   To compute the average of two numbers, use:
       double avg = (a + b) / 2.0;
   Average of -15 and 42 = 13.5

f. Math.abs()
   Math.abs(-15) = 15
   → Removes the negative sign; result is always >= 0.

========================================
     Practical Combined Example         
========================================
Given: num1 = -9.0, num2 = 4.0
  Smaller value     : -9.0
  Larger value      : 4.0
  √|num1|           : 3.0
  num2 ^ 3          : 64.0
  |num1|            : 9.0
  Average (manual)  : -2.5



# ☕ Java `Math` Class — Quick Reference

> 📌 All methods are **static** — call via `Math.methodName()` | Part of `java.lang` *(no import needed)*

---

## 🔵 a. `Math.min(a, b)`

Returns the **smaller** of two values.

| Syntax | Works With | Example |
|--------|-----------|---------|
| `Math.min(a, b)` | `int`, `long`, `float`, `double` | `Math.min(10, 3)` → `3` |

```java
Math.min(10, 3)    // → 3
Math.min(-5, -2)   // → -5
Math.min(7.5, 7.9) // → 7.5
```

---

## 🟢 b. `Math.max(a, b)`


Returns the **larger** of two values.

| Syntax | Works With | Example |
|--------|-----------|---------|
| `Math.max(a, b)` | `int`, `long`, `float`, `double` | `Math.max(10, 3)` → `10` |

```java
Math.max(10, 3)    // → 10
Math.max(-5, -2)   // → -2
Math.max(7.5, 7.9) // → 7.9
```

---

## 🟣 c. `Math.sqrt(x)`
Returns the **square root** of x. Argument must be `>= 0`, else returns `NaN`.

| Syntax | Note | Example |
|--------|------|---------|
| `Math.sqrt(x)` | `x` must be ≥ 0 | `Math.sqrt(64.0)` → `8.0` |

```java
Math.sqrt(64.0)  // → 8.0
Math.sqrt(2.0)   // → 1.4142135...
Math.sqrt(0)     // → 0.0
```

---

## 🔷 d. `Math.pow(base, exp)`

Returns `base` raised to the **power** of `exp`. Always returns `double`.

| Syntax | Note | Example |
|--------|------|---------|
| `Math.pow(base, exp)` | Always returns `double` | `Math.pow(3, 4)` → `81.0` |

```java
Math.pow(3, 4)   // → 81.0
Math.pow(2, 8)   // → 256.0
Math.pow(5, 0)   // → 1.0
```

---

## ⚠️ e. `Math.avg()` — Does NOT Exist!


> ❌ `Math.avg()` is **not** a method in Java's `Math` class.
> ✅ Compute average **manually** using arithmetic.

```java
double avg = (a + b) / 2.0;

// Example:
double avg = (10 + 3) / 2.0;  // → 6.5
```

---

## 🟠 f. `Math.abs(x)`


Returns the **absolute (positive) value** of x. Always `>= 0`.

| Syntax | Works With | Example |
|--------|-----------|---------|
| `Math.abs(x)` | `int`, `long`, `float`, `double` | `Math.abs(-15)` → `15` |

```java
Math.abs(-15)    // → 15
Math.abs(7)      // → 7
Math.abs(-3.14)  // → 3.14
```

---

> 💡 **Tip:** `Math.pow()` aur `Math.sqrt()` hamesha `double` return karte hain, chahe result whole number ho.