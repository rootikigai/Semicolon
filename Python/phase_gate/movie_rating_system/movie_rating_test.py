import unittest
from unittest import TestCase

from movie_rating_system.movie_rating_functions import *


class MovieRatingTest(TestCase):

    def test_that_movie_folder_is_not_empty(self):
        add_movie("Koto Aye")
        self.assertTrue(len(movie_folder) > 0)

    def test_that_movie_can_be_added(self):
        self.assertEqual(add_movie("Koto Aye"), f"Movie - Koto Aye, was added on {current_date_and_time()}")

    def test_that_movie_can_be_rated(self):
        self.assertEqual(rate_movie(5), "Movie - Koto Aye, was rated: 5")

    def test_get_average_rating(self):
        self.assertEqual((get_average_rating("Koto Aye")), "Average rating for Koto Aye is 5")

if __name__ == '__main__':
    unittest.main()
