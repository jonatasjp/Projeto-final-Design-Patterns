package implementacao;

public class AchievementStorageFactory {

	private static AchievementStorage achievementStorage;
	
	public static AchievementStorage getAchievementStorage() {
		return achievementStorage;
	}
	
	public static void setAchievementStorage(AchievementStorage achievementStorage) {
		AchievementStorageFactory.achievementStorage = achievementStorage; 
	}
	
}
