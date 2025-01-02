# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java programming error: the `ArrayIndexOutOfBoundsException`.  The `bug.java` file contains code that attempts to access an array element beyond its bounds, resulting in this exception.  The `bugSolution.java` file shows how to correctly handle array access to prevent this error.

**Bug Description:**

The program attempts to assign a value to the 6th element (index 5) of an array that only has 5 elements (indices 0-4). This causes an `ArrayIndexOutOfBoundsException`.

**Solution:**

The solution involves adding a check to make sure the index is within the valid bounds of the array before attempting to access it.