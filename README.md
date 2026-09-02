# Striver A2Z DSA Sheet - Pattern Printing in Java

A structured repository containing modular Java solutions for all 22 pattern printing problems from the **Striver A2Z DSA Sheet** (Take U Forward).

---

## What is Pattern Printing?

In computer science, **Pattern Printing** is the practice of arranging numbers, stars (`*`), letters, or blank spaces into geometric layouts on the terminal screen.

### Key Technical Concepts

* **Nested Loops:** A loop inside another loop.
  * The **Outer Loop** controls the vertical row index (`i`).
  * The **Inner Loop** controls the horizontal column index (`j`).
* **`System.out.print()` vs `System.out.println()`:**
  * `System.out.print()` prints characters side-by-side on the active row.
  * `System.out.println()` outputs a newline character (`\n`) to terminate the row and drop to the next line.

---

## Universal 4-Step Strategy

1. **Outer Loop (Rows):** Run `for (int i = 0; i < n; i++)` to define vertical levels.
2. **Deconstruct the Columns:** Determine the number of leading spaces, printed characters, and trailing spaces for row `i`.
3. **Derive Closed-Form Formulas:** Express column counts strictly as algebraic functions of `i` and `n`.
4. **Row Reset:** Execute `System.out.println()` after inner column loops finish.

---

## Pattern Solutions ($n = 4$)

### Pattern 01: Solid Square
* **File:** `Pattern01.java`
* **Logic:** Run outer loop `0` to `n-1`; inner loop prints `*` from `0` to `n-1`.
```text
****
****
****
****
