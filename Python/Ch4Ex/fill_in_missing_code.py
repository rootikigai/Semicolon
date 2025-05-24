def seconds_since_midnight(hours, minutes, seconds):
	hour_in_seconds = hours * 60 * 60
	minute_in_seconds = minutes * 60
	return hour_in_seconds + minute_in_seconds + seconds

#print (seconds_since_midnight(13, 30, 45))
