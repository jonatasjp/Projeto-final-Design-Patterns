package implementacao;

public class AchievementObserverInventor implements AchievementObserver{

	@Override
	public void achievementUpdate(String user, Achievement a) {
		
		if(a.getName().equals("CREATION") && (a instanceof Points)){
			Points points = (Points) a;
			if(points.getPontos() >= 100) {
				AchievementStorage storage =  AchievementStorageFactory.getAchievementStorage();
				storage.addAchievement(user, new Badge("INVENTOR"));
			}
		}
	
	}
}
