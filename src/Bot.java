import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {	

	@Override
	public String getBotUsername() { return "BOT_NAME_HERE"; }
	
	@Override
	public String getBotToken() { return "BOT_TOKEN_HERE"; }
	
	@Override
	//this function is triggered everytime the bot get a new message
	//we get object from type "Update" [ read more here: https://core.telegram.org/bots/api#update ]
	public void onUpdateReceived(Update update) {

		//handle messages -> we look for the message we recieved
		if (update.hasMessage()) {
			
			//we save the message in new Message object
			Message message = update.getMessage();
			
			//we check that the text is not empty
			if (message != null && message.hasText()) {
				
				//we take the text, and convert it to lower case, so even if the user typed "/HELLO" it should work
				String msg = message.getText().toLowerCase();
				
				//now we tell the bot to respond to specific cases:
				if (msg.startsWith("/hello")) {
					SendMsg(message, "Hello World!");
				}
				else if (msg.equals("/start")) {
					SendMsg(message, "Ok! let's get the party started 😀");
				}
			}	
		}
	
	}

	//this function takes a message object (that contains the sender id and all the details we need to respond)
	//and a simple string, and send a new message to the user
	public void SendMsg(Message message, String s) {
		SendMessage sendMessage = new SendMessage();
		
		//set the destination, and the text we want to send
		sendMessage.setChatId(message.getChatId().toString());
		sendMessage.setText(s);
		
		//try to send it:
		try {
			execute(sendMessage);
		}
		catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
		
}