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

## 💻 Pattern Solutions Catalog (n = 4)

| Pattern No. | File Name | Visual Preview (n = 4) | Loop Logic & Formula |
| :--- | :--- | :--- | :--- |
| **01** | `Pattern01.java` | <code>****<br>****<br>****<br>****</code> | **Outer:** `0` to `n-1`<br>**Inner:** `0` to `n-1` (prints `*`) |
| **02** | `Pattern02.java` | <code>*<br>**<br>***<br>****</code> | **Outer:** `i = 0` to `n-1`<br>**Inner:** prints `i + 1` stars |
| **03** | `Pattern03.java` | <code>1<br>1 2<br>1 2 3<br>1 2 3 4</code> | **Inner:** prints numbers `j` from `1` up to `i + 1` |
| **04** | `Pattern04.java` | <code>1<br>2 2<br>3 3 3<br>4 4 4 4</code> | **Inner:** prints current row number `(i + 1)` exactly `(i + 1)` times |
| **05** | `Pattern05.java` | <code>****<br>***<br>**<br>*</code> | **Outer:** `i = 0` to `n-1`<br>**Inner:** prints `n - i` stars |
| **06** | `Pattern06.java` | <code>1 2 3 4<br>1 2 3<br>1 2<br>1</code> | **Inner:** prints numbers `j` from `1` up to `n - i` |
| **07** | `Pattern07.java` | <code>&nbsp;&nbsp;&nbsp;*<br>&nbsp;&nbsp;***<br>&nbsp;*****<br>*******</code> | **Spaces:** `n - i - 1` times<br>**Stars:** `2 * i + 1` times |
| **08** | `Pattern08.java` | <code>*******<br>&nbsp;*****<br>&nbsp;&nbsp;***<br>&nbsp;&nbsp;&nbsp;*</code> | **Spaces:** `i` times<br>**Stars:** `2 * (n - i) - 1` times |
| **09** | `Pattern09.java` | <code>&nbsp;&nbsp;&nbsp;*<br>&nbsp;&nbsp;***<br>&nbsp;*****<br>*******<br>*******<br>&nbsp;*****<br>&nbsp;&nbsp;***<br>&nbsp;&nbsp;&nbsp;*</code> | Sequential combination of **Pattern 07** directly followed by **Pattern 08** |
| **10** | `Pattern10.java` | <code>*<br>**<br>***<br>****<br>***<br>**<br>*</code> | **Total rows:** `2 * n - 1`<br>**Stars:** `i + 1` if `i < n`, else `2 * n - 1 - i` |
| **11** | `Pattern11.java` | <code>1<br>0 1<br>1 0 1<br>0 1 0 1</code> | **Parity Check:** if `(i + j) % 2 == 0` print `1`, else print `0` |
| **12** | `Pattern12.java` | <code>1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1<br>1 2&nbsp;&nbsp;&nbsp;&nbsp;2 1<br>1 2 3&nbsp;&nbsp;3 2 1<br>1 2 3 4 4 3 2 1</code> | **Left:** `1` to `i+1`<br>**Spaces:** `2 * (n - 1 - i)`<br>**Right:** `i+1` down to `1` |
| **13** | `Pattern13.java` | <code>1<br>2 3<br>4 5 6<br>7 8 9 10</code> | Maintain single global variable `int count = 1;`, print and `count++` |
| **14** | `Pattern16.java` | <code>********<br>***&nbsp;&nbsp;***<br>**&nbsp;&nbsp;&nbsp;&nbsp;**<br>*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br>*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br>**&nbsp;&nbsp;&nbsp;&nbsp;**<br>***&nbsp;&nbsp;***<br>********</code> | **Top Half:** `(n - i)` stars, `2 * i` spaces, `(n - i)` stars.<br>**Bottom Half:** Reverse order. |
| **15** | `Pattern17.java` | <code>*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*<br>**&nbsp;&nbsp;&nbsp;&nbsp;**<br>***&nbsp;&nbsp;***<br>********<br>***&nbsp;&nbsp;***<br>**&nbsp;&nbsp;&nbsp;&nbsp;**<br>*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</code> | **Total rows:** `2 * n - 1`<br>**Stars per wing:** `i + 1` (top) or `2 * n - 1 - i` (bottom)<br>**Gap:** `2 * (n - stars)` |

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
