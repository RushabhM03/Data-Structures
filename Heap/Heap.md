# Heap
A Heap is a special Tree-based data structure in which the tree is a complete binary tree. Generally a heap is represented in an array for easy user understanding.

There are 2 types of heaps:
1. Max-Heap: In a Max-Heap the key present at the root node must be greatest among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.
2. Min-Heap: In a Min-Heap the key present at the root node must be minimum among the keys present at all of it’s children. The same property must be recursively true for all sub-trees in that Binary Tree.

<img width="353" alt="image" src="https://user-images.githubusercontent.com/68846562/148723919-d4db5be1-3f0c-42cf-94cb-df74c6a80da5.png">

Heap sort is done by creating a heap and then deleteing the elements one by one from the heap.

Time complexity for insert operation: O(log n)
Time complexity for delete operation: O(log n)
