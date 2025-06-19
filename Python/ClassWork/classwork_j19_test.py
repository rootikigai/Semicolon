import unittest

from classwork_j19 import ten_random_nums, length_of_a_list, sum_elems_at_even_positions


class MyTestCase(unittest.TestCase):
    def test_that_ten_random_nums_function_exists(self):
        self.assertTrue(ten_random_nums())

    def test_length_of_a_list_function_works(self):
        self.assertEqual(length_of_a_list([1, 2, 3, 4, 5]), 5)

    def test_that_sum_elems_at_even_positions_function_works(self):
        self.assertEqual(sum_elems_at_even_positions([3, 6, 2, 3, 7, 8, 9, 4]), 21)


if __name__ == '__main__':
    unittest.main()
