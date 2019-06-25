Create a few class that extend each other and show in console initialization order od static, no-static blocks and constructors
A, B extends A, C extends B

<b>Result</b>

initialized static variable in class A  <br />
<b>static A block called </b> <br />
initialized static variable in class B <br />
<b>static B block called </b> <br />
initialized static variable in class C <br />
<b>static C block called </b> <br />
initialized no-static variable in class A <br />
<b>no-static A block called </b> <br />
Constructor A called </b> <br />
<b>initialized no-static variable in class B </b> <br />
no-static B block called <br />
<b>Constructor B called </b> <br />
initialized no-static variable in class C <br />
<b>no-static C block called </b> <br />
Constructor C called <br />
