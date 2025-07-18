import unittest

import strings_play_main

class TestStringsPlay(unittest.TestCase):
    def test_function_returns_second_parameter_in_between_string(self):
        play = strings_play_main
        self.assertEqual("helceloo", play.strings_play("helloo", param2="ce"))

    def test_function_returns_second_parameter_appended_to_string(self):
        play = strings_play_main
        self.assertEqual("joyce", play.strings_play("joy", param2="ce"))