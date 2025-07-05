from datetime import datetime
movie_folder = []
movie_rating_system = []

def current_date_and_time():
    return datetime.now().strftime("%B %d, %Y, %I:%M %p")

def see_movie_folder():
    return movie_folder

def add_movie(movie_title):
    now = datetime.now()
    formatted_date = now.strftime("%B %d, %Y, %I:%M %p")
    movie_folder.append([movie_title, formatted_date])

    return [movie_title, formatted_date]

def rate_movie(movie_title, rating):
    rating = int(rating)
    if 0 <= rating <= 5:
        rated = [add_movie(movie_title), rating]
        movie_folder.extend(rated)
    return "Movie - {}, was rated: {}".format(movie_title, rating)

def find_movie(movie_title):
    for movie in movie_folder:
        if movie[0] == movie_title:
            return movie[1]
    return None


#print(add_movie("Koto Aye"))
#print(add_movie("Ipadabo Abija"))
#print(add_movie("Glamor Girls"))
#print()
print(rate_movie("Koto Aye", 5))
print(rate_movie("Koto Aye", 4))
print()
#print(see_movie_folder())
#print()
print(find_movie("Koto Aye"))
#print(current_date_and_time())