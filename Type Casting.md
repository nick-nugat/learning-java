> [[School]] - [[Learning]]
---
tags: #lecture
Links: [[AP Java]] - [[AP Java Lectures]]
___

# Type Casting

## Key Ideas
- put data type in parentheses before whatever you want to cast
- only "casts" the item immediately next to it
	- `double x - (double) 1 + 1 / 2; // 1.0`
	- `double y = 1 + (double) 1 / 2; // 1.5`
- you can use parentheses to escape
### Example
```java
class Main {
public static void main(Stringp[ args){
	double x = 4 / 3;
	double y = (double)(125/10);
	double z = (double) 28 / 5;
	System.out.println(x + " " + y + " " + z);
	}
}
```
### Debugging
> - #### You can use "print" statements to get the code to show you what's wrong
> - #### Analyze every single line of code
> - #### Talk to le rubber ducky 🦆 (or any inanimate object)

## Potential Questions
___
Created 09-09-2022, 10:44 AM.
