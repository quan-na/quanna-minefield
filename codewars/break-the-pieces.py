USE_BREAK_DISPLAY = True

class Shape2D:
    """A 2D redefinition of shape"""
    def __init__(self, shape_string):
        self.data = shape_string.split("\n")
    def charAt(self, col, row):
        if row >= len(self.data) or row < 0: return " "
        if col >= len(self.data[row]) or col <0: return " "
        return self.data[row][col]
    def size(self):
        return (max(map(lambda x: len(x), self.data)),len(self.data))

def break_evil_pieces(shape):
    s2 = Shape2D(shape)
    print(s2.size())
    print(s2.charAt(0,0))
    print(s2.charAt(1,0))
    print(s2.charAt(12,0))
    pass

# right turn     random       p-i-e-ce-s
# m-a-n-i-ac     access       from lines
#                gr-i-d
#
# pieces            cut out with
# inside            left    turn
# others
#
# one pass    con--nec-t    con--nec-t
# par-se-r    left or up    conditions
#
# unconfirmed
# p-i-e-c-e-s
#
#

# what test data look like
name = "Simple shape"
shape = """
+----------+
|          |
|          |
|          |
+----------+
|          |
|          |
+----------+
""".strip('\n')

expected = ["""
+----------+
|          |
|          |
|          |
+----------+
""".strip('\n'), """
+----------+
|          |
|          |
+----------+
""".strip('\n'),]

break_evil_pieces(shape)
