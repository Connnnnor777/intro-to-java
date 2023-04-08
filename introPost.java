////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////                     This is a code that generates a custom intro post.                  //////////


////////////     there options for being a father, motorcyclist, and dog owner          ///////////

///////////       there are also variables for 3 different interests.                                   //////////


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

interests = ["gaming", "radios", "sigint"]
is_father = True
has_dog = True
has_motorcycle = True

message = "Hello there! Sorry for the late response. "

message += "I hope you're all doing well. My interests include "
for interest in interests:
    message += interest + ", "
message = message[:-2] + ". "

if is_father:
    message += "I am a father and "

if has_dog:
    message += "I have a dog. "

if has_motorcycle:
    message += "I also have a motorcycle. "

message += "As I always say, better late than never!"

print(message)