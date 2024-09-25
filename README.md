# Largest Product of Three Numbers in an Array

## Overview

This Java program calculates the largest product of any three numbers in a given array. It uses efficient sorting and logic to handle arrays that contain both positive and negative numbers. The program can handle edge cases where the largest product comes from either the three largest numbers or from two negative numbers combined with the largest positive number.

## Features

- **Handles negative numbers**: The program considers cases where multiplying two negative numbers results in a positive product, which can be larger than the product of the three largest positive numbers.
- **Scalability**: The program can handle arrays of various sizes.
- **Efficiency**: It leverages sorting to simplify the process of finding the largest product.

## How It Works

The program works by following these steps:
1. **Input Array**: The program takes an integer array as input.
2. **Sorting**: It sorts the array in ascending order. Sorting helps simplify the task of finding the largest product of three numbers.
3. **Calculate Product**: 
   - It calculates the product of the three largest numbers, which are located at the last three positions in the sorted array.
   - It also calculates the product of the two smallest (possibly negative) numbers and the largest number.
4. **Comparison**: The two potential products are compared, and the maximum product is returned as the result.
5. **Output**: The result is displayed in the console, showing the largest possible product of any three numbers in the array.

### Detailed Breakdown

1. **Sorting the Array**:  
   The array is sorted in ascending order using Java's built-in sorting method. After sorting, the largest three numbers will be located at the end of the array, and the two smallest (potentially negative) numbers will be at the beginning.

2. **Calculating Maximum Product**:  
   After sorting, there are two main possibilities for the maximum product:
   - **Three largest numbers**: The product of the three largest numbers is calculated.
   - **Two smallest numbers and the largest number**: The product of the two smallest numbers (which could be negative) and the largest number is calculated.

3. **Returning the Result**:  
   The larger of the two calculated products is returned as the final result.

4. **Example**:  
   Given an array like `{-10, -10, -5, -6}`, the program considers:
   - The product of the two smallest numbers and the largest number
   - The product of the three largest numbers

   The maximum of these two values is returned as the result.

### Time Complexity
- **Sorting**: The time complexity of sorting the array is `O(n log n)`, where `n` is the number of elements in the array.
- **Product Calculation**: After sorting, the program performs constant-time multiplications and comparisons, which takes `O(1)` time.
- **Overall Complexity**: The overall time complexity of the program is `O(n log n)` due to the sorting step.

## How to Run

1. Ensure you have [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.
2. Save the code in a `.java` file and compile it using a Java compiler.
3. Run the compiled program. The program will output the largest product of any three numbers from the given array.

## Example Output

When the program runs, it will display the largest product of any three numbers in the array you provide.

## Customization

You can customize the array by modifying the input values. You can test the program with different sets of numbers, including arrays with:
- All positive numbers
- All negative numbers
- A mix of both positive and negative numbers

The output will vary depending on the input.

## License

This project is open source and free to use under the MIT License.
