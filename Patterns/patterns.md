# 🧩 Patterns — Thinking in Grids

Patterns are **not about stars or numbers**.  
They are about **visualizing logic as a grid (rows × columns)** and converting that logic into loops.

If you understand grids, patterns become easy.

---

## 🔑 Core Idea: Grid Thinking

Every pattern can be imagined as a matrix:

Row × Column representation

□ □ □ □ □  
□ □ □ □ □  
□ □ □ □ □  
□ □ □ □ □  
□ □ □ □ □

- Outer loop → Rows
- Inner loop → Columns
- Condition → What to print

This is the foundation for all pattern problems.

---

## 🧠 Step-by-Step Approach (Always Follow This)

### 1️⃣ Fix the Grid Size
Ask:
- How many rows?
- How many columns?

Example:
```
*****
*****
*****
*****
*****
```

Grid size = 5 × 5

---

### 2️⃣ Find the Row–Column Relationship
Ask:
- Are columns fixed?
- Do columns depend on the row number?

Example:
```
*
**
***
****
*****
```

Logic:
- Row 1 → 1 column
- Row 2 → 2 columns
- Row n → n columns

Inner loop depends on outer loop.

---

### 3️⃣ Decide What to Print
Ask:
- Print `*`?
- Print row number?
- Print column number?
- Print space?

Examples:

```
123
123
123
```
→ Print column number

```
1
22
333
```
→ Print row number

---

## 📐 Pattern Categories Using Grids

### ⭐ Fixed Grid Patterns
```
*****
*****
*****
```

Rule:
- Rows = n
- Columns = n

---

### ⭐ Growing Patterns
```
*
**
***
```

Rule:
- Columns = row number
- Inner loop → `j <= i`

---

### ⭐ Shrinking Patterns
```
***
**
*
```

Rule:
- Columns decrease every row
- Inner loop → `j <= (n - i + 1)`

---

### ⭐ Space + Pattern (Advanced)
```
    *
   **
  ***
 ****
*****
```

Grid split:
- Left side → spaces
- Right side → symbols

Use two inner loops:
1. Spaces
2. Stars / numbers

---

## 🧠 Dry Run Technique (Mandatory)

Before coding:
1. Draw the grid on paper
2. Label rows and columns
3. Decide what prints at each position

If you can dry-run it, you can code it.

---

## ❌ Common Mistakes
- Jumping straight into code
- Memorizing patterns
- Ignoring spaces
- Copy-pasting solutions

---

## ✅ Golden Rules

- Outer loop controls rows
- Inner loop controls columns
- Row defines structure
- Column defines content
- Spaces are characters too

---

## 🎯 Practice Rule

For every pattern:
- Visualize the grid
- Dry run
- Code it
- Push to GitHub

Consistency > complexity.

---

## 🚀 Goal of Patterns

Patterns build:
- Loop confidence
- Logical thinking
- Problem breakdown skills

This is the base for arrays, strings, recursion, and DSA.

If a pattern feels hard — you skipped the grid.
