Java Version 1.8
-----------------


Run following java class to convert speech:
----------------------------------------

java -cp dolphin.jar SpeechConverter input.txt

-SpeechConverter - the main class for speech converter
-input.txt - the text file containing speech



Run following java class to add new speech:
-------------------------------------------
java -cp dolphin.jar AddSoundMapping <sound> <meaning>

Eg: java -cp dolphin.jar AddSoundMapping ekkhhk hello

-AddSoundMapping - java class to add new speech in the data store
-ekkhhk - first argument containing the sound
-hello - second argument containing the meaning for the sound



