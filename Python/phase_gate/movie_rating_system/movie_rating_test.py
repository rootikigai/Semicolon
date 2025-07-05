import unittest
from unittest import TestCase
from datetime import datetime

from movie_rating_system.movie_rating_functions import movie_folder, add_movie, see_movie_folder, current_date_and_time, \
    rate_movie


class MovieRatingTest(TestCase):

    def test_that_movie_folder_is_empty(self):
        self.assertTrue(len(movie_folder) == 0)

    def test_that_movie_can_be_added(self):
        add_movie("Koto Aye")
        self.assertEqual(see_movie_folder(), [["Koto Aye", current_date_and_time()]])

    def test_that_movie_can_be_rated(self):
        rate_movie("Koto Aye", 5)
        self.assertEqual(rate_movie(movie_title, rating), "Movie - {}, was rated: {}".format(movie_title, rating))

if __name__ == '__main__':
    unittest.main()
