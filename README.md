# Multi-threaded-Dictionary-Server

Created a multithreaded dictionary server using a client-server architecture along with multi-threading and socket programming.
It consists of the server which provides the functions of the dictionary to the clients. Multiple clients are used here. Using the concept of multi-threading, multiple clients can concurrently use the dictionary . The dictionary provides 4 functions:- 
Search (Used to search a specific word in a dictionary and display it’s meaning) 
Add (Used to add a new word with meaning in the dictionary)
Remove (Used to remove a specific word in a dictionary).
Empty (It will remove all the words from the dictionary) 



# Commands to run DictionaryClient.java

javac DictionaryClient.java
java DictionaryClient localhost 8080

# Commands to run DictionaryServer.java

javac DictionaryServer.java -Xlint:unchecked
java DictionaryServer 8080 DictionaryFile


Words in our dictionary
parsimonious
kindred
