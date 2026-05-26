concepts from Two Sum.java 

Generating all Possible Pairs -
time complexity-O(n2)and space complexity- O(1) 
for solving this question, i have used naive approach(often called the brute-force approach)
In Java Terms...
A naive approach often involves nested loops (a loop inside another loop).
Brute force is all about checking every single possibility until you find the right answer. It doesn't try to be clever; it just checks everything.
The Visual Guide: Brute-Force in ActionImagine our array is [4, 2, 7, 3] and our target is 10.
A brute-force approach uses two pointers (let's call them i and j) to pair up every single number with every other number until they find a pair that adds up to 10.
Here is how the computer visualizes and steps through this process:
Step 1: Fix i at the first number (4) and move j through the rest.Is $4 + 2 = 10$? No.Is $4 + 7 = 10$? No.Is $4 + 3 = 10$? No.(We finished checking everything with 4. Let's move i to the next number).
Step 2: Move i to the second number (2) and move j through the remaining numbers.Is $2 + 7 = 10$? No.Is $2 + 3 = 10$? No.(Nothing matched. Move i again).
Step 3: Move i to the third number (7) and move j forward.Is $7 + 3 = 10$? Yes! We found our match! It took us 6 individual checks to get here because we blindly tried almost every combination.



===================================================================================================================

