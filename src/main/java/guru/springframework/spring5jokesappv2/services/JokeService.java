package guru.springframework.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {

//	private final ChuckNorrisQuotes chuckNorrisQuotes;
//	
//	public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
//		super();
//		this.chuckNorrisQuotes = chuckNorrisQuotes;
//	}
//
//	public String getRandomQuote() {
//		return chuckNorrisQuotes.getRandomQuote();
//	}

	public JokeService() {
	}

	public String getRandomQuote() {
		ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
