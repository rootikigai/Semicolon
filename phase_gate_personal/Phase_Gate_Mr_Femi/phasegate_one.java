phasegate_one.java

Question 1:

you are given a string num of digits(0-9). each character in the string represents how many times the digit corresponding to its index appears in the string.

return true if the string satisfies this rule for every index, otherwise return false.

example 1:

input: num = "1210"
output: true

explanation:

	. at index 0, the digit 0 appears 1 times.
	. at index 1, the digit 1 appears 2 times.
	. at index 2, the digit 2 appears 1 times.
	. at index 3, the digit 3 appears 0 times.


example 2:

input: num = "030"
output: false

explanation:

	. at index 0, the digit 0 appears 2 times, but it should appear 0 times.
	. at index 1, the digit 1 appears 0 times, but it should appear 3 times.



Question 2:

you are given a string word and a character ch.
find the first occurrence of ch in the string. reverse the part of word from the beginning(index 0) to the position of the first ch(inclusive).

if ch is not found in the string, return word as it is.

example 1:

input:
word = "abcdefd", ch = "d"
output:
"dcbaefd"

explanation:
the first d is at index 3. reverse the part of the string from index 0 to index 3:
"abcd" becomes "dcba". the rest of the string stays the same, so the result is "dcbaefd".



Question 3:

you are given an integer array nums. the unique elements of an array are the elements that appear exactly once in the array.

example 1:

input: nums = [1, 2, 3, 2]
output: 4

explanation: the unique elements are [1, 3], and the sum is 4.

example 2:

input: nums = [1, 1, 1, 1, 1]
output: 0

explanation: there are no unique elements, and the sum is 0.



Question 4:

write a method that eliminates duplicate values from an integer array. the method should take an array of integers as input and return a new array containing only the unique values from the original array, preserving their first occurrence order.

example 1:

input:
enter 10 integers: [1, 2, 2, 3, 4, 4, 5, 6, 6, 7]
output:
the unique integers are: [1, 2, 3, 4, 5, 6, 7]

example 2:

input:
enter 10 integers: [9, 8, 7, 7, 6, 5, 5, 5, 4, 3]
output:
the unique integers are: [9, 8, 7, 6, 5, 4, 3]



Question 5:

write a method named locateLargest that takes a two-dimensional array as input and returns the location of the largest element in the array. the method should return a one-dimensional array containing the row and column indices of the largest element.

example 1:

input: [[1.5, 2.3, 3.7, 4.6], [5,1, 6.2, 7.3, 8.4,], [9.5, 10.1, 11.8, 12.7]]
output: [2, 3]

example 2:

input: [[-1.2, -3.4], [-2.5, -0.5]]
output: [1, 1]
