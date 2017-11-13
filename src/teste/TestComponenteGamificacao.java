package teste;

import java.util.Arrays;

import org.junit.Test;

import implementacao.AchievementObserverInventor;
import implementacao.AchievementObserverPartOfTheCommunity;
import implementacao.AchievementStorageFactory;
import implementacao.ForumService;
import implementacao.ForumServiceGamificationProxy;
import implementacao.ForumServiceMock;
import implementacao.MemoryAchievementStorage;

public class TestComponenteGamificacao {

	@Test
	public void testeAdicionandoTopico() {
		
		MemoryAchievementStorage storage = MemoryAchievementStorage.criarMemoryAchievementStorage();
		storage.setObservadores(Arrays.asList(new AchievementObserverInventor(), new AchievementObserverPartOfTheCommunity()));
		
		AchievementStorageFactory.setAchievementStorage(storage);
		
		ForumService forumService = new ForumServiceGamificationProxy(new ForumServiceMock());
		
		forumService.addTopic("jonatas", "Topico de teste1");
		
	}


	





}
