# Pattern Printing in Java

A structured repository containing clean, modular Java solutions for the first 15 pattern printing problems.

This repository serves as a portfolio piece demonstrating foundational logic, nested loop control, spatial reasoning, and coordinate mapping in Java.

---

## 📌 What is Pattern Printing?

In computer science, **Pattern Printing** is the practice of arranging numbers, stars (`*`), letters, or blank spaces into geometric layouts on the terminal screen.

### Key Technical Concepts

* **Nested Loops:** A loop operating inside another loop.
  * The **Outer Loop** controls the vertical row index (`i`).
  * The **Inner Loop** controls the horizontal column index (`j`).
* **`System.out.print()` vs `System.out.println()`:**
  * `System.out.print()` prints characters side-by-side on the active row.
  * `System.out.println()` outputs a newline character (`\n`) to terminate the row and drop to the next line.

---

## 🧠 Universal 4-Step Strategy

1. **Outer Loop (Rows):** Run `for (int i = 0; i < n; i++)` to define vertical levels.
2. **Deconstruct the Columns:** Determine the number of leading spaces, printed characters, and trailing spaces for row `i`.
3. **Derive Formulas:** Express column counts strictly as algebraic formulas using `i` and `n`.
4. **Row Reset:** Execute `System.out.println()` after inner column loops finish.

---

# ☕ Java Pattern Programs (n = 4)

Visual gallery of all 15 pattern outputs. Click any title to navigate directly to its Java source file.

## Pattern 01: Square Pattern
****
****
****
****

## Pattern 02: Right-Angled Triangle
*
**
***
****

Pattern 03: Number Triangle
1
1 2
1 2 3
1 2 3 4

Pattern 04: Repeating Number Triangle
1
2 2
3 3 3
4 4 4 4

Pattern 05: Inverted Right-Angled Triangle
****
***
**
*

Pattern 06: Inverted Number Triangle
1 2 3 4
1 2 3
1 2
1

Pattern 07: Pyramid
   *
  ***
 *****
*******

Pattern 08: Inverted Pyramid
*******
 *****
  ***
   *

Pattern 09: Diamond
   *
  ***
 *****
*******
*******
 *****
  ***
   *

Pattern 10: Half Diamond
*
**
***
****
***
**
*

Pattern 11: Binary Triangle
1
0 1
1 0 1
0 1 0 1

Pattern 12: Number Crown
1      1
12    21
123  321
12344321

Pattern 13: Floyd's Triangle
1
2 3
4 5 6
7 8 9 10

Pattern 14: Hollow Diamond
   *
  * *
 *   *
*     *
 *   *
  * *
   *

Pattern 15: Butterfly Pattern
*      *
**    **
***  ***
********
***  ***
**    **
*      *
---

## 🗂️ Directory Organization

All files follow standard Java class naming conventions (PascalCase).

```text
.
├── README.md
├── Pattern01.java
├── Pattern02.java
├── Pattern03.java
├── Pattern04.java
├── Pattern05.java
├── Pattern06.java
├── Pattern07.java
├── Pattern08.java
├── Pattern09.java
├── Pattern10.java
├── Pattern11.java
├── Pattern12.java
├── Pattern13.java
├── Pattern14.java
└── Pattern15.java
