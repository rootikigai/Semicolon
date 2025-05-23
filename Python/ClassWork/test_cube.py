import cube
from unittest import TestCase

class TestCube(TestCase):
    def test_that_get_cube_function_exists(self):
            cube.get_cube(3)

    def test_that_get_cube_return_correct_answer(self):
            actual = cube.get_cube(5)
            expected = 125
            self.assertEqual(actual, expected)

            actual = cube.get_cube(100)
            expected = 1000000
            self.assertEqual(actual, expected)
