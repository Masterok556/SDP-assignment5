# Strategy Pattern — Calculator

A small Java project demonstrating the **Strategy design pattern** with interchangeable calculator operations.

## Features

- Three strategies: addition, subtraction, and multiplication
- A common `OperationStrategy` interface
- A `Calculator` context that delegates the calculation to its current strategy
- Runtime strategy switching through `setStrategy()`
- No operation-specific `if`/`switch` inside the context

## Project Structure

```text
src/
├── Main.java
├── Calculator.java
├── OperationStrategy.java
├── AddStrategy.java
├── SubtractStrategy.java
└── MultiplyStrategy.java
```

## Requirements

- Java JDK 17 or newer (a recent JDK is recommended)
- IntelliJ IDEA or a terminal with `javac` and `java`

## How to Build and Run

**IntelliJ IDEA:** Open the project, configure a JDK, and run `Main.java`.

**macOS / Linux (from the project root):**

```bash
mkdir -p out
javac -d out src/*.java
java -cp out Main
```

**Windows PowerShell (from the project root):**

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem src -Filter *.java | ForEach-Object FullName)
java -cp out Main
```

> These commands assume all `.java` files are directly inside `src/` and use no Java `package` declarations. If you organize files into packages, update the commands and class name accordingly.

## How It Works

1. `Main` creates the `Calculator` with a concrete strategy.
2. The calculator calls `execute(a, b)` through the `OperationStrategy` interface.
3. `Main` calls `setStrategy()` to change the operation while the program runs.
4. The same `calculate(a, b)` method now uses a different algorithm.

For example, the client can switch from `AddStrategy` to `MultiplyStrategy` without changing the calculator itself.

## How to Add a New Strategy

1. Create a class such as `DivideStrategy`.
2. Implement `OperationStrategy` and its `execute(double a, double b)` method.
3. In `Main`, create the new strategy and pass it to `calculator.setStrategy()`.

No changes to `Calculator` or the existing strategies are necessary.

## Pattern Roles

| Role | Class |
| --- | --- |
| Strategy | `OperationStrategy` |
| Concrete Strategies | `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy` |
| Context | `Calculator` |
| Client | `Main` |
