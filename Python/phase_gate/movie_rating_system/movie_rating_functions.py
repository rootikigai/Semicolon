from datetime import datetime
movie_folder = []
date = datetime.now().strftime("%B %d, %Y, %I:%M %p")

def current_date_and_time():
    return date

def see_movie_folder():
    return movie_folder

def add_movie(movie_name):
    movie = {"Title": movie_name, "Date": date, "Movie Ratings": []}
    movie_folder.append(movie)
    return f"Movie - {movie_name}, was added on {movie['Date']}"

def rate_movie(movie_name, rating):
    rating = int(rating)
    if 0 <= rating <= 5:
        for movie in movie_folder:
            if movie['Title'] == movie_name:
                movie['Movie Ratings'].append(rating)
                return f"Movie - {movie_name}, was rated: {rating}"
    return None

def get_average_rating(movie_name):
    average_rating = 0.0
    for movie in movie_folder:
        if movie['Title'] == movie_name:
            ratings = movie['Movie Ratings']
            if ratings:
                average_rating = sum(ratings) / len(ratings)
            return f"Average Rating - {movie_name}: {average_rating}"
    return None


print(add_movie("Koto Aye"))
#print(add_movie("Ipadabo Abija"))
#print(add_movie("Glamor Girls"))
print()
print(rate_movie("Koto Aye", 5))
print(rate_movie("Koto Aye", 4))
print()
print(get_average_rating("Koto Aye"))
print()
print(see_movie_folder())
print()
#print(find_movie("Koto Aye"))
#print(current_date_and_time())