public static AVLNode delete(int key, AVLNode node) {

84 

if (node == null)

85 

return null;

86 

87 

if (key < node.key)

88 

node.left = delete(key, node.left);

89 

else if (key > node.key)

90 

node.right = delete(key, node.right);

91 

else // Node to be deleted found

92 

if (node.left != null && node.right != null) { // Two children

93 

AVLNode minNode = findMin(node.right);

94 

node.key = minNode.key;

95 

node.right = delete(minNode.key, node.right);

96 

} else

// One or no child

97 

node = (node.left != null) ? node.left : node.right;

98 

99 

if (node != null) {

100 

node.height = Math.max(height(node.left), height(node.right)) + 1;

101 

102 

// Balance the tree

103 

if (height(node.left) - height(node.right) == 2)

104 

if (height(node.left.left) >= height(node.left.right))

105 

node = rotateWithLeftChild(node);

106 

else

107 

node = doubleWithLeftChild(node);

108 

else if (height(node.right) - height(node.left) == 2)

109 

if (height(node.right.right) >= height(node.right.left))

110 

node = rotateWithRightChild(node);

111 

else

112 

node = doubleWithRightChild(node);

113 

}

114 

return node;
