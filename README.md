# Java-Streams-And-Files
Advanced Java

Problem 1.	Sum lines
Write a program that reads a text file and prints on the console the sum of the ASCII symbols of each of its lines. Use BufferedReader in combination with FileReader.
lines.txt	Output
Kvo staa?
Nishto, ti?
Chuk, maina.	824
989
1035

Problem 2.	ALL CAPITALS!
Write a program that reads a text file and changes the casing of all letters to upper. The file should be overwritten. Use BufferedReader, FileReader, FileWriter, and PrintWriter.
lines.txt	lines.txt
Kvo staa?
Nishto, ti?
Chuk, maina.	KVO STAA?
NISHTO, TI?
CHUK, MAINA.

Problem 3.	Count character types.
Write a program that reads a list of words from the file words.txt and finds the count of vowels (гласни букви), consonants (съгласни) and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
Write the results in file count-chars.txt. 
words.txt	count-chars.txt
Thanks to us, you owe it to the Chinese.	Vowels: 13
Consonants: 17
Punctuation: 2

Problem 4.	Copy .jpg File
Write a program that copies the contents of a .jpg file to another using FileInputStream, FileOutputStream, and byte[] buffer. Set the name of the new file as my-copied-picture.jpg.

Problem 5.	Save an ArrayList of doubles
Write a program that saves and loads the information from an ArrayList to a file using ObjectInputStream, ObjectOutputStream. Set the name of the new file as doubles.list
