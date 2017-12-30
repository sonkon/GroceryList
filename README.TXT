These files are adaptations of the code from http://www.homeandlearn.co.uk/java/write_to_textfile.html

The tutorials on that website show basic file reading and file writing. There are three major changes, however. For the purposes of our project (creating a chatbot) we need to create input/response pairs whereby a computer might "interpret" what you are saying via matching strings (i.e. the input) and then reply (i.e. the response).  These are stored in a single text file, samplefile.txt.  

A computer learns through experience. As such, a rudementary mechanism was created where by you can add "experience" by entering input/response pairs.  These pairs are saved to the text file as a single line, comma-delimited.

The delimiter is actually "," and not simply a single comma. The reason for the quotes is to minimize the potential problems when a comma is entered into the system as part of a more human-like response. The term for reading and separating the two parts of the data on one line (input,response) is called parsing.  This program only shows you the most basic form of parsing. Parsing can be used in many different ways such as to validate data before processing it.  For example, you may wish to evaluate a string to see if it is a properly formated email address.

Another thing that was added to the program was the use of a IRPair class to define each input-response pair. This will allow you to read the entire text file into memory and manipulate the input (from the end-user) and query the array list for a match before replying with a suitable response.

Finally, the last major change to the program was the conversion from the use of Arrays to ArrayLists. Though this is not a strict requirement I felt it may be beneficial, especially if we start to discuss inserting or removing elements to the list of pairs.



