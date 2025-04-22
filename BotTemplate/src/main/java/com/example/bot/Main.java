package com.example.bot;

import de.aschallenberg.botclient.bot.BotRegistry;
import de.aschallenberg.botclient.config.ConfigLoader;
import de.aschallenberg.botclient.websocket.WebSocketInitiator;

/*
 * Hier startest du dein Bot-Programm
 */
public class Main {
	public static void main(String[] args) {

		// Damit lädst du alle benötigten Konfigurationen.
		ConfigLoader.load(args);

		// Hiermit teilst du der Schnittstelle zur Plattform mit, welche Klasse die Hauptklasse deines Bots ist.
		BotRegistry.setBotClass(MeinBot.class);

		// Hiermit initiierst du die Websocket-Verbindung zur Plattform.
		WebSocketInitiator.initConnection();
	}
}
