Debugging Demonstration Steps in IntelliJ
Set a Breakpoint

Place a breakpoint at int sum = a + b; inside the addNumbers method.
Run the program in Debug mode.
Step Over (F8)

When execution stops at the breakpoint, press F8 to step over and see how sum gets calculated.
Step Into (F7)

Restart the debugger and this time, when execution reaches greetUser("Alice"), press F7 to step into the greetUser method.
Step Out (Shift + F8)

Once inside greetUser, press Shift + F8 to return to the caller method.
Step Into Recursion

Set a breakpoint at return n * factorial(n - 1); in the factorial method.
Debug and use F7 to step into recursive calls.
Observe how the call stack grows.
Inspect & Modify Variables

In the Debugger panel, inspect num1, num2, and sum.
Try changing num1 to 20 and observe the updated sum.

Debugging Challenge for the Class
Set a Breakpoint in calculateSum()

Place a breakpoint at sum += numbers[i]; and run the program in Debug mode.
Step through the loop using F8 (Step Over).
Observe what happens when i becomes equal to numbers.length.
Detect the First Bug

The loop should run while i < numbers.length, but it's using i <= numbers.length, causing an ArrayIndexOutOfBoundsException.
Fix: Change the condition to i < numbers.length.
Set a Breakpoint in calculateAverage()

Step into calculateSum(numbers) using F7 (Step Into).
Note how integer division causes the wrong average calculation.
Detect the Second Bug

Since calculateSum() returns an integer, dividing it by numbers.length (also an integer) leads to integer division.
Fix: Convert one operand to a double:

return (double) calculateSum(numbers) / numbers.length;

Debugging Steps in IntelliJ
Enable Exception Breakpoints

Open Run → View Breakpoints (Ctrl + Shift + F8 or Cmd + Shift + 8 on macOS).
Click "+" → Java Exception Breakpoints.
Select NullPointerException and ArrayIndexOutOfBoundsException.
Run the Program in Debug Mode

IntelliJ will pause execution automatically when an exception occurs.
Analyze the First Exception

The debugger will stop at:

System.out.println("Accessing an invalid index: " + numbers[5]);
Inspect the numbers array and see that index 5 doesn’t exist.
Fix: Change numbers[5] to numbers[2].
Analyze the Second Exception

After fixing the first error, re-run the debugger.
It will stop at:

System.out.println("Text length: " + text.length());
text is null, leading to NullPointerException.
Fix: Ensure text is initialized before calling length().

How to Use Method Breakpoints in IntelliJ
Set a Method Breakpoint

In IntelliJ, click on the left margin next to speak() in Animal, Dog, and Cat classes.
A red dot with a small icon (⚡) will appear, indicating a method breakpoint.
Run the Program in Debug Mode

IntelliJ will pause execution before the method executes.
This allows you to inspect which subclass method is called dynamically.
Step Through the Execution

Use F7 (Step Into) to see how polymorphism resolves the method call.
Set a Line Breakpoint (Optional)

If you only set a line breakpoint inside speak(), the program will only pause when reaching the print statement.
A method breakpoint pauses execution before the method starts, helping you track when and how often it's invoked.
