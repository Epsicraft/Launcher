package fr.hdcarbone.epsicraft;

import java.io.File;

import fr.theshark34.openlauncherlib.launcher.GameInfos;
import fr.theshark34.openlauncherlib.launcher.GameTweak;
import fr.theshark34.openlauncherlib.launcher.GameType;
import fr.theshark34.openlauncherlib.launcher.GameVersion;

public class Launcher {
	public static final GameVersion EP_VERSION = new GameVersion("1.7.10", GameType.V1_7_10);
	public static final GameInfos EP_INFOS = new GameInfos("EPSI Craft 1", EP_VERSION, true, new GameTweak[] {GameTweak.FORGE});
	public static final File EP_DIR = EP_INFOS.getGameDir();
}
