A non-empty zero-indexed string S consisting of Q characters is given. The period of this string is the smallest positive integer P such that:
```
P ≤ Q / 2 and S[K] = S[K+P] for 0 ≤ K < Q − P.
```
For example, 7 is the period of “pepsicopepsicopep”. A positive integer M is the binary period of a positive integer N if M is the period of the binary representation of N.

For example, 1651 has the binary representation of "110011100111". Hence, its binary period is 5. On the other hand, 102 does not have a binary period, because its binary representation is “1100110” and it does not have a period.

Consider above scenarios & write a function in Java which will accept an integer N as the parameter. Given a positive integer N, the function returns the binary period of N. The function should return −1 if N does not have a binary period.
