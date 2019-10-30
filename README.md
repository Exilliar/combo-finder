# combo-finder
finds all the combinations of a given set of numbers

# Running the program
To input combos, enter them as args when running the program  
e.g. `java Combo "1,2,3,4"`

# Logic
For a given set of numbers, in this example 1, 2, 3, 4, 5 there are the below combinations for combos starting with 1  
To find the other combinations, the program will need to do a find and replace for each number to replace the next number with the previous number (e.g. the next number after finding the below combos will be 2 and the previous number will be 1) and replacing the first number with the next number  
Finding other combinations will require finding and replacing by referencing indexes rather than values (there could be multiple of the same value)


`| 1 | 2 | 3 | 4 | 5 |`
`| 1 | 2 | 3 | 5 | 4 |`
`| 1 | 2 | 4 | 3 | 5 |`
`| 1 | 2 | 4 | 5 | 3 |`
`| 1 | 2 | 5 | 3 | 4 |`
`| 1 | 2 | 5 | 4 | 3 |`


`| 1 | 3 | 2 | 4 | 5 |`
`| 1 | 3 | 2 | 5 | 4 |`
`| 1 | 3 | 4 | 2 | 5 |`
`| 1 | 3 | 4 | 5 | 2 |`
`| 1 | 3 | 5 | 2 | 4 |`
`| 1 | 3 | 5 | 4 | 2 |`


`| 1 | 4 | 2 | 3 | 5 |`
`| 1 | 4 | 2 | 5 | 3 |`
`| 1 | 4 | 3 | 2 | 5 |`
`| 1 | 4 | 3 | 5 | 2 |`
`| 1 | 4 | 5 | 2 | 3 |`
`| 1 | 4 | 5 | 3 | 2 |`


`| 1 | 5 | 2 | 3 | 4 |`
`| 1 | 5 | 2 | 4 | 3 |`
`| 1 | 5 | 3 | 2 | 4 |`
`| 1 | 5 | 3 | 4 | 2 |`
`| 1 | 5 | 4 | 2 | 3 |`
`| 1 | 5 | 4 | 3 | 2 |`
