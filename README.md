# json-tree-test
A simple programming test for working with JSON and tree structures.

--------------------------------------------------------------------

First, set up a Github account (if you do not already have one) and fork this repository. Instructions for doing this can be found [here](https://help.github.com/articles/fork-a-repo/).

Linux execution instructions:

    . run.sh

General execution instructions:

    javac -cp dependencies.jar Node.java
    java -ea -cp dependencies.jar:. Node

This should produce the following output:

    Gala
    Ambrosia
    Fuji
    Granny Smith
    Exception in thread "main" java.lang.AssertionError
        at Node.main(Node.java:68)

Your job is to complete the missing methods so that all of the assert statements evaluate to true. You should not need to modify the main() method at all. When you are finished, commit your changes, push them to your copy of this repository on Github, and send us a link to it.

Possibly helpful links:
* [Introduction to Git](http://rogerdudler.github.io/git-guide/)
* [Binary trees](https://en.wikipedia.org/wiki/Binary_tree)
* [Arrays](https://en.wikipedia.org/wiki/Array_data_structure)
* [Maps](https://en.wikipedia.org/wiki/Associative_array)
* [JSON](http://json.org/)
