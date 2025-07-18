import unittest

import strings_play_main

class TestStringsPlay(unittest.TestCase):
    def test_function_returns_second_parameter_in_between_string(self):
        play = strings_play_main
        self.assertEqual("helceloo", play.strings_play("helloo", param2="ce"))