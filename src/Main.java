import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

//this is the Main class, which will create new instance of the bot
public class Main {

	public static void main(String[] args) throws Exception {

		//create new bot
		ApiContextInitializer.init();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		
		//init bot (we try to create new bot, and throw exception if creation failed)
		try {
			telegramBotsApi.registerBot(new Bot());
			System.out.println("Bot is online!");
		} 
		catch (TelegramApiException e) {
			e.printStackTrace();
		}
		
	}
	
}
