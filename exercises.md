**Exercise 1** 
Print Only Odd Numbers from the List

List<Integer> numbers = List.of(1,2,3,4,5,6);

**Exercise 2** 
Print Devices

List<String> devices = List.of("Television", "Laptop", "Phone", "Computer", "Tablet");

**Exercise 3** 
Print Courses Containing the word "Laptop"

**Exercise 4** 
Print Devices Whose Name has at least 6 letters

**Exercise 5** 
Print the cubes of odd numbers

**Exercise 6** 
Print the number of characters in each device name

**Exercise 7** 
Square every number in a list and find the sum of squares

**Exercise 8** 
Cube every number in a list and find the sum of cubes

**Exercise 9** 
Find Sum of Odd Numbers in a list

**Exercise 10** 
Create a List with Even Numbers Filtered from the Numbers List

**Exercise 11** 
Create a List with lengths of all Device titles.

Exercise 12 Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.

int sum = numbers.stream() .reduce(0, Integer::sum);

Exercise 13 Do Behavior Parameterization for the mapping logic.

List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());
