import unittest
from unittest import TestCase

from movie_rating_system.movie_rating_functions import *


class MovieRatingTest(TestCase):

    def setUp(self):
        movie_folder.clear()

    def test_that_movie_folder_is_not_empty(self):
        add_movie("Koto Aye")
        self.assertTrue(len(movie_folder) > 0)

    def test_that_movie_can_be_added(self):
        outcome = add_movie("Koto Aye")
        self.assertIn("Movie - Koto Aye, was added on", outcome)

    def test_that_movie_can_be_rated(self):
        add_movie("Koto Aye")
        self.assertEqual(rate_movie("Koto Aye",5), "Movie - Koto Aye, was rated: 5")

    def test_get_average_rating(self):
        add_movie("Koto Aye")
        rate_movie("Koto Aye", 5)
        rate_movie("Koto Aye", 4)
        self.assertEqual((get_average_rating("Koto Aye")), "Average Rating - Koto Aye: 4.5")

if __name__ == '__main__':
    unittest.main()
