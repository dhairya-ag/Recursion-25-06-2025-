# Recursion-25-06-2025-
Basic Problems based on recursion using java
1. The Drumbeats of the Festival (Print 1 to n)
Story:
In a village festival, a drummer plays beats in increasing order.
He starts with beat 1 and goes up to beat n.
👉 Can you print the beats in order using recursion?
Input:
● Integer n (number of beats).
Output:
● Numbers from 1 to n separated by space.
Constraints:
● 1 <= n <= 1000
Example:
Input: 5
Output: 1 2 3 4 5
2. The Echo in the Cave (Print n to 1)
Story:
Inside a magical cave, a traveler shouts a number n.
The echo answers back in descending order down to 1.
👉 Print numbers from n to 1 using recursion.
Input:
● Integer n.
Output:
● Numbers from n to 1 separated by space.
Constraints:
● 1 <= n <= 1000
Example:
Input: 5
Output: 5 4 3 2 1
3. The King’s Treasury (Sum of First n Numbers)
Story:
The King of Numberia has n treasure chests.
Each chest contains exactly the same number of coins as its position.
(Chest 1 has 1 coin, Chest 2 has 2 coins, … Chest n has n coins).
👉 Find the total coins using recursion.
Input:
● Integer n.
Output:
● The sum of numbers from 1 to n.
Constraints:
● 1 <= n <= 10^4
Example:
Input: 5
Output: 15
Explanation: 1+2+3+4+5 = 15
4. The Wizard’s Mirror (Reverse String)
Story:
The wizard’s mirror reverses any word spoken into it.
👉 Reverse a string using recursion.
Input:
● String s.
Output:
● Reversed string.
Constraints:
● 1 <= s.length <= 100
Example:
Input: hello
Output: olleh
5. The Treasure Boxes (Sum of Array)
Story:
A hero finds n treasure boxes, each with some coins.
He opens them one by one and counts the coins.
👉 Find the total coins using recursion.
Input:
● First line: integer n
● Second line: n integers (coins in each box).
Output:
● Sum of coins.
Constraints:
● 1 <= n <= 100
● 1 <= coins[i] <= 1000
Example:
Input:
5
2 5 3 8 6
Output:
24
6. The Traveler’s Steps (Climbing Stairs)
Story:
A traveler must climb a staircase with n magical steps.
He can climb 1 step or 2 steps at a time.
👉 Find the number of distinct ways to reach the top using recursion.
Input:
● Integer n.
Output:
● Number of ways to climb.
Constraints:
● 1 <= n <= 30
Example:
Input: 3
Output: 3
Explanation: {1+1+1, 1+2, 2+1}
7. The Princess’s Lock (Factorial)
Story:
The princess is locked behind n magical locks.
She can only unlock them in every possible order.
👉 How many ways can she open them? (factorial)
Input:
● Integer n.
Output:
● Factorial of n.
Constraints:
● 1 <= n <= 12
Example:
Input: 4
Output: 24
Explanation: 4! = 4×3×2×1
8 . The Rabbit’s Family (Fibonacci)
Story:
In a magical forest, rabbits grow as:
● Month 1 → 1 rabbit
● Month 2 → 1 rabbit
● From Month 3 → rabbits = sum of previous two months.
👉 Find number of rabbits after n months.
Input:
● Integer n.
Output:
● Fibonacci number at month n.
Constraints:
● 1 <= n <= 40
Example:
Input: 6
Output: 8
Explanation: 1,1,2,3,5,8
