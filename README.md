# Striver A2Z DSA Sheet - Pattern Printing in Java

A structured repository containing clean, modular Java solutions for all 22 pattern printing problems from the **Striver A2Z DSA Sheet** (Take U Forward).

---

## What is Pattern Printing?

In computer science, **Pattern Printing** is the practice of arranging numbers, stars (`*`), letters, or blank spaces into geometric layouts on the terminal screen.

### Key Terms Explained

* **Nested Loop:** A loop inside another loop. 
  * The **Outer Loop** controls the vertical dimension (which row you are on).
  * The **Inner Loop** controls the horizontal dimension (which column you are printing in that row).
* **0-Indexed vs 1-Indexed:**
  * **0-Indexed:** Starting your count at `0` (e.g., rows go `0, 1, 2, 3` for $n=4$)[cite: 1].
  * **1-Indexed:** Starting your count at `1` (e.g., rows go `1, 2, 3, 4`)[cite: 1].
* **`System.out.print()` vs `System.out.println()`:**
  * `System.out.print()` outputs text and keeps the cursor on the **same line** (used inside inner loops for characters and spaces)[cite: 1].
  * `System.out.println()` outputs a newline character (`\n`), moving the cursor down to the **next row**[cite: 1].

---

## The 4-Step Mental Model

To solve any pattern problem systematically:

1. **Count the Rows:** Run the outer loop `for (int i = 0; i < n; i++)` to define the total vertical levels[cite: 1].
2. **Break Down the Columns:** Inspect what each line needs:
   * How many leading spaces?[cite: 1]
   * How many stars, numbers, or letters?[cite: 1]
   * How many trailing spaces (if needed)?[cite: 1]
3. **Write the Mathematical Formula:** Relate the count of spaces or characters to the current row index `i` and total height `n`[cite: 1].
4. **End the Row:** After all column loops for that row finish, call `System.out.println();` before moving to the next row[cite: 1].

---

## Pattern Catalog ($n = 4$)

| File Name | Pattern Name | Visual Preview ($n = 4$) | Loop Formulation & Logic |
| :--- | :--- | :--- | :--- |
| `Pattern01.java` | **Solid Square** | `****`<br>`****`<br>`****`<br>`****` | Outer loop: `0` to `n-1`<br>Inner loop: `0` to `n-1` (prints `*`)[cite: 1] |
| `Pattern02.java` | **Right-Angled Triangle** | `*`<br>`**`<br>`***`<br>`****` | Outer loop: `i = 0` to `n-1`<br>Inner loop: prints `i + 1` stars[cite: 1] |
| `Pattern03.java` | **Right-Angled Number Triangle** | `1`<br>`1 2`<br>`1 2 3`<br>`1 2 3 4` | Inner loop: prints `j` from `1` up to `i + 1`[cite: 1] |
| `Pattern04.java` | **Repeated Number Triangle** | `1`<br>`2 2`<br>`3 3 3`<br>`4 4 4 4` | Inner loop: prints current row number `(i + 1)` exactly `(i + 1)` times[cite: 1] |
| `Pattern05.java` | **Inverted Star Triangle** | `****`<br>`***`<br>`**`<br>`*` | Outer loop: `i = 0` to `n-1`<br>Inner loop: prints `n - i` stars[cite: 1] |
| `Pattern06.java` | **Inverted Number Triangle** | `1 2 3 4`<br>`1 2 3`<br>`1 2`<br>`1` | Inner loop: prints `j` from `1` up to `n - i`[cite: 1] |
| `Pattern07.java` | **Star Pyramid** | `&nbsp;&nbsp;&nbsp;*`<br>`&nbsp;&nbsp;***`<br>`&nbsp;*****`<br>`*******` | Spaces loop: `n - i - 1` times<br>Stars loop: `2 * i + 1` times[cite: 1] |
| `Pattern08.java` | **Inverted Star Pyramid** | `*******`<br>`&nbsp;*****`<br>`&nbsp;&nbsp;***`<br>`&nbsp;&nbsp;&nbsp;*` | Spaces loop: `i` times<br>Stars loop: `2 * (n - i) - 1` times[cite: 1] |
| `Pattern09.java` | **Diamond Star** | `&nbsp;&nbsp;&nbsp;*`<br>`&nbsp;&nbsp;***`<br>`&nbsp;*****`<br>`*******`<br>`*******`<br>`&nbsp;*****`<br>`&nbsp;&nbsp;***`<br>`&nbsp;&nbsp;&nbsp;*` | Sequential combination of **Pattern 07** followed directly by **Pattern 08**[cite: 1] |
| `Pattern10.java` | **Half Diamond** | `*`<br>`**`<br>`***`<br>`****`<br>`***`<br>`**`<br>`*` | Total rows: `2 * n - 1`<br>Stars: `i + 1` if `i < n`, else `2 * n - 1 - i`[cite: 1] |
| `Pattern11.java` | **Binary Alternating Triangle** | `1`<br>`0 1`<br>`1 0 1`<br>`0 1 0 1` | Check index parity: if `(i + j) % 2 == 0` print `1`, else print `0`[cite: 1] |
| `Pattern12.java` | **Number Crown** | `1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1`<br>`12&nbsp;&nbsp;&nbsp;&nbsp;21`<br>`123&nbsp;&nbsp;321`<br>`12344321` | Left numbers (`1` to `i+1`), central spaces (`2 * (n - 1 - i)`), right numbers (`i+1` down to `1`)[cite: 1] |
| `Pattern13.java` | **Increasing Continuous Number Triangle** | `1`<br>`2 3`<br>`4 5 6`<br>`7 8 9 10` | Maintain single incrementing integer variable `count = 1`, print and increment `count++`[cite: 1] |
| `Pattern14.java` | **Letter Triangle** | `A`<br>`A B`<br>`A B C`<br>`A B C D` | Inner loop prints character cast: `(char)('A' + j)` from `0` to `i`[cite: 1] |
| `Pattern15.java` | **Inverted Letter Triangle** | `A B C D`<br>`A B C`<br>`A B`<br>`A` | Inner loop prints `(char)('A' + j)` from `0` to `n - i - 1`[cite: 1] |
| `Pattern16.java` | **Alpha Ramp** | `A`<br>`B B`<br>`C C C`<br>`D D D D` | Inner loop prints current row character `(char)('A' + i)` repeatedly `(i + 1)` times[cite: 1] |
| `Pattern17.java` | **Alpha Hill** | `&nbsp;&nbsp;&nbsp;A`<br>`&nbsp;&nbsp;ABA`<br>`&nbsp;ABCBA`<br>`ABCDCBA` | Spaces: `n - i - 1`<br>Increment character up to middle column, then decrement back down[cite: 1] |
| `Pattern18.java` | **Alpha Triangle (Reversed)** | `D`<br>`C D`<br>`B C D`<br>`A B C D` | Outer loop: `i = 0` to `n-1`<br>Inner starts at `(char)('A' + n - 1 - i)` and goes up to `'A' + n - 1`[cite: 1] |
| `Pattern19.java` | **Symmetric Void** | `********`<br>`***&nbsp;&nbsp;***`<br>`**&nbsp;&nbsp;&nbsp;&nbsp;**`<br>`*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*`<br>`*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*`<br>`**&nbsp;&nbsp;&nbsp;&nbsp;**`<br>`***&nbsp;&nbsp;***`<br>`********` | Top half: `(n-i)` stars, `2*i` spaces, `(n-i)` stars<br>Bottom half: `(i+1)` stars, `2*(n-1-i)` spaces, `(i+1)` stars[cite: 1] |
| `Pattern20.java` | **Butterfly Pattern** | `*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*`<br>`**&nbsp;&nbsp;&nbsp;&nbsp;**`<br>`***&nbsp;&nbsp;***`<br>`********`<br>`***&nbsp;&nbsp;***`<br>`**&nbsp;&nbsp;&nbsp;&nbsp;**`<br>`*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*` | Wings of increasing stars, decreasing middle gap; reverses after middle row[cite: 1] |
| `Pattern21.java` | **Hollow Square** | `****`<br>`*&nbsp;&nbsp;*`<br>`*&nbsp;&nbsp;*`<br>`****` | Print `*` only if boundary condition met: `i == 0 \|\| i == n-1 \|\| j == 0 \|\| j == n-1`, else print space[cite: 1] |
| `Pattern22.java` | **Concentric Number Matrix** | `4 4 4 4 4 4 4`<br>`4 3 3 3 3 3 4`<br>`4 3 2 2 2 3 4`<br>`4 3 2 1 2 3 4`<br>`4 3 2 2 2 3 4`<br>`4 3 3 3 3 3 4`<br>`4 4 4 4 4 4 4` | Matrix size: `2*n - 1`<br>Value at `(i, j)`: `n - Math.min(Math.min(i, j), Math.min(2*n - 2 - i, 2*n - 2 - j))`[cite: 1] |

---

## Directory Organization

Each problem is stored in its own standalone Java file conforming to standard Java class naming conventions[cite: 1]:

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
├── Pattern15.java
├── Pattern16.java
├── Pattern17.java
├── Pattern18.java
├── Pattern19.java
├── Pattern20.java
├── Pattern21.java
└── Pattern22.java
