import to_do_list_functions
from unittest import TestCase

class to_do_list_functions_test(TestCase):
    def test_that_add_task_function_exists(self):
        task = to_do_list_functions.add_task("Buy FoodStuff")
        self.assertEqual(task["Task"], "Buy FoodStuff")
        self.assertEqual(task["message"], "Task Added")


