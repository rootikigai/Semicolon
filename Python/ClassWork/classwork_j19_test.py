import unittest

from classwork_j19 import *


class MyTestCase(unittest.TestCase):
    def test_that_ten_random_nums_function_exists(self):
        self.assertTrue(ten_random_nums())

    def test_that_length_of_a_list_function_exists(self):
        self.assertTrue(length_of_a_list(list_of_numbers=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
    def test_length_of_a_list_function_works(self):
        self.assertEqual(length_of_a_list([1, 2, 3, 4, 5]), 5)

    def test_that_sum_elems_at_even_positions_function_exists(self):
        self.assertTrue(sum_elems_at_even_positions(list_of_numbers=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
    def test_that_sum_elems_at_even_positions_function_works(self):
        self.assertEqual(sum_elems_at_even_positions([3, 6, 2, 3, 7, 8, 9, 4]), 21)

    def test_that_sum_elems_at_odd_positions_function_exists(self):
        self.assertTrue(sum_elems_at_odd_positions(list_of_numbers=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
    def test_that_sum_elems_at_odd_positions_function_works(self):
        self.assertEqual(sum_elems_at_odd_positions([3, 6, 2, 3, 7, 8, 9, 4]), 21)

    def test_that_multiply_elems_at_every_third_positions_function_exists(self):
        self.assertTrue(multiply_elems_at_every_third_positions(list_of_numbers=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
    def test_that_multiply_elems_at_every_third_positions_function_works(self):
        self.assertEqual(multiply_elems_at_every_third_positions([3, 6, 2, 3, 7, 8, 9, 4]), 16)

    def test_that_average_of_elems_function_exists(self):
        self.assertTrue(average_of_elems(list_of_numbers=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
    def test_that_average_of_elems(self):
        self.assertEqual(average_of_elems([1, 2, 3, 4, 5]), 1.8)

if __name__ == '__main__':
    unittest.main()
