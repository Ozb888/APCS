Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS pd07
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05
time spent: 69420 hrs


DISCO
------------------------------------------------
* 
================================================


QCC
------------------------------------------------
* 
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
Down.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
an abstract representing all paths to all children of a parent.
undirected graph where any 2 vertices are connected by exactly 1 path


Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
it increases efficiecny, limiting how far a tree can go without getting ot a leaf, decreasing search time as the traversal down an exxtra layer
is no longer needed as much as it would be in an unbalanced tree

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
each leaf either differs by depth of one with its neighbor leaf or not at all.

Is a perfect tree complete? 
Yes, because all levels are completely filled so therefore the last level is left justified.

Is a complete tree balanced? 
Yes, because there is not more than a difference of 1 in height.

Is the Man Who Is Tall Happy?
https://en.wikipedia.org/wiki/Is_the_Man_Who_Is_Tall_Happy%3F

What must be true of perfect trees but not others?
There has to be the maximum nodes at the bottom level and none of them can have children.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
Yes, because you can figure out where nodes end using the post order traversal and you can figure out what the order of the nodes are using the pre order traversal.
================================================
