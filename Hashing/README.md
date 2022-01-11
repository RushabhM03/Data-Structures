# Hashing techniques
Hashing is a technique or process of mapping keys, values into the hash table by using a hash function. It is done for faster access to elements. The efficiency of mapping depends on the efficiency of the hash function used.

Let a hash function H(x) maps the value x at the index x%10 in an Array. For example if the list of values is [11,12,13,14,15] it will be stored at positions {1,2,3,4,5} in the array or Hash table respectively.

<img width="432" alt="image" src="https://user-images.githubusercontent.com/68846562/148937382-537ada90-d91f-4fd2-859b-0d1635561a40.png">


Various techniques to avoid drawbacks of space:
1. Open hashing
    1. Chaining
2. Closed hashing
    1. Linear probing
    2. quadrartic probing
    3. Double hashing
