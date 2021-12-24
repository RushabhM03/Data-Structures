# AVL Trees
AVL tree is a self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes. 

Example:

<img width="264" alt="image" src="https://user-images.githubusercontent.com/68846562/147338033-f3ab7720-2143-4c4f-ba9d-7955e8ab897e.png">

Note:
1. Each node of an AVL tree is balanced i.e. Each node has a balance factor of either 1 or 0 or -1. s={-1,0,1}.
2. If while inserting or deleting a node is imbalanced, we perform any one of the following rotations depending on the case:
    1. LL rotation
    2. RR rotation
    3. LR rotation
    4. RL rotation

## Class diagram
<img width="295" alt="image" src="https://user-images.githubusercontent.com/68846562/147344277-2ec354ae-b21b-476f-85be-c522f2c33f12.png">


## Files included:
1. AVL_Node.java
2. AVL_tree.java
3. AVL_interface.java
4. AVL_test.java
