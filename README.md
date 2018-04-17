# ExampleBot
Example bot for Telegram (Using Java)

## Getting Started
I’d like to say that I’m writing this tutorial in a way that I’ll assume you have very little knowledge in Bots, Git, and Java programming. However, this is not a tutorial to users without any programming skills at all, so be sure you have a basic knowledge with coding with OOP and running simple Java programs.

### Prerequisites

What things you'll need:

1. Telegram Account
2. Java SDK + IDE (ie: Eclipse)
3. Telegram Bot Java Library:
https://github.com/rubenlagus/TelegramBots
you'll need to include this in your project, one way is to download:
```
telegrambots-3.x-jar-with-dependencies.jar
```
from here: https://github.com/rubenlagus/TelegramBots/releases/
(download the latest release)
we will include this in our project later.

4. Register a new Telegram Bot:
you can create new telegram bot via BotFather, to do so, simply follow this steps:

a) start a new chat with @BotFather : https://t.me/BotFather

b) enter the command:
```/newbot```

c) give the bot a name, description and all the deatils needed, finally you will get a TOKEN, save it for later.

if you have a problem creating new bot, just google 'create new telegram bot' and see some detailed tutorial about it.

### Installing

now we have everything we need, we can clone this project and import the JAR we downloaded before.

1. git clone this project, do it however you choose.
if you don't familiar with git, you can download as zip and copy the relevant file to your new eclipse project.
however, the best way to clone this repository into Eclipse is to follow this quick tutorial:

https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse
after you click on "Clone a git Repository" you will need to enter git url, enter this url:
```
https://github.com/tomer953/ExampleBot
```
and clone it to your local machine.

2. Include the Telegram Bot Java Library in your build path, to do so, do the following:
Right Click on the project -> Build Path -> Configure Build Path... -> in the "Libraries" Tab, select: "Add External JARs..."
and choose the JAR file you have downloaded earlier in the Prerequisites section.


3. open the src folder and edit the "Bot.Java" file,
you'll see:
```
@Override
public String getBotUsername() { return "BOT_NAME_HERE"; }

@Override
public String getBotToken() { return "BOT_TOKEN_HERE"; }
```

set the value of ```BOT_NAME_HERE``` to your bot name,
and change ```BOT_TOKEN_HERE``` to your bot token,
so after the update it will look like this example:

```
@Override
public String getBotUsername() { return "ExampleBot"; }

@Override
public String getBotToken() { return "953953953:OmGThiSToK3ni5Am4z1nGL0l"; }
```

4. run the Main.java file, if everything works, you should see in the console "Bot is online!" output.

## Modify and update the bot

This is just a simple "Hello World!" bot,
for making it better you need to add some functionality,
remember that every new message is trigger the "OnUpdate" event that found in Bot.java class,
so feel free to extend it to whatever you want to.

remember to use the official telegram API documentation, since almost every function in the official API is supported via the Java API for telegram we included in our project.
for example, every type listed here:
https://core.telegram.org/bots/api/#available-types
is represented as a Class in our code, so we can create new instance of it, and use the method of this class easily.

## What's next?

I will try to extend this bot to use Config file, MySql db, and reply with some buttons and keyboards, not only simple text.
Stay tuned :)
