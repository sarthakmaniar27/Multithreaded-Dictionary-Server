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

Screenshots:

![image16](https://user-images.githubusercontent.com/47854537/107873679-281f5500-6eda-11eb-98a0-fbdbacff80cd.png)
![image6](https://user-images.githubusercontent.com/47854537/107873680-2b1a4580-6eda-11eb-8db9-90e9c53d7429.png)
![image8](https://user-images.githubusercontent.com/47854537/107873681-2ce40900-6eda-11eb-867f-167443d0b71a.png)
![image12](https://user-images.githubusercontent.com/47854537/107873684-2e153600-6eda-11eb-8f8e-1724fe0d41bf.png)
![image5](https://user-images.githubusercontent.com/47854537/107873686-2fdef980-6eda-11eb-9020-9c8e2c1a9553.png)
![image9](https://user-images.githubusercontent.com/47854537/107873689-32415380-6eda-11eb-9057-e29b68ec7768.png)
![image13](https://user-images.githubusercontent.com/47854537/107873691-33728080-6eda-11eb-812c-8f8760face31.png)
![image14](https://user-images.githubusercontent.com/47854537/107873693-353c4400-6eda-11eb-804c-e71e3eb97842.png)
![image11](https://user-images.githubusercontent.com/47854537/107873694-37060780-6eda-11eb-8ffb-411cb307fb0c.png)

