# Sort Manager Project
### Contents:
<ul>
        <li>Overview</li>
        <li>Input</li>
        <li>Output </li>
        <li>Design </li>
        <li>Speed Comparison Test </li>
        <li>Tools </li>
</ul>




### Overview
<p>The Sort Manager Project is a Java program that allows a user to sort a randomised 
array.</p>
<p>The user is presented with a choice of sort algorithms as well as their desired array length. </p>

### Input

<p id="Input">The program takes an input of <code>1</code>
to run, or <code>0</code> to exit.</p>
<p>When the program runs, the user is prompted to enter <code>1</code>,<code>2</code>,<code>3</code>,<code>4</code> or <code>5</code>  to choose between:
<ol>
    <li><code>BinaryTree sort</code></li>
    <li><code>Bubble sort</code></li>
    <li><code>Insertion Sort</code></li>
    <li><code>Quick sort</code></li>

</ol> 
<p>The user is then prompted <code>ENTER SIZE OF ARRAY</code> to generate a randomised integer array.</p>
<p>When the program finishes, the user is taken back to the main menu: <code>Enter 1 to run, 0 to exit</code>. </p>

### Output 
<p id="Output">The program outputs a random unsorted array,
a sorted array with the user's choice of algorithm, and the time taken for the algorithm to execute.</p>

### Design

<p id="Design">The SortManager Project employs a <i>Model-View-Controller</i> (MVC) design pattern, and within that a <i>factory</i> design pattern.</p>

### Speed Comparison Test
<p id="SpeedTest"></p>

### Tools
<ul id="Tools">
    <li>Apache Maven build automation</li>
    <li>JUnit unit testing framework</li>
    <li>GitBash CLI</li>
</ul>

