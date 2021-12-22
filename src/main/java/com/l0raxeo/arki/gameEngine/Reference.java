package com.l0raxeo.arki.gameEngine;

import com.l0raxeo.arki.gameEngine.init.Init;
import com.l0raxeo.arki.gameEngine.init.Initializer;
import com.l0raxeo.arki.gameEngine.utils.FileLoader;

import java.util.Objects;

/**
 * -- Backend game settings --
 *
 * Game creator should change info here
 * according to the game.
 *
 * @author Lorcan A. Cheng
 */

@Init
public class Reference implements Initializer
{
    @Override
    public void preInit() throws Exception
    {
        FileLoader.createDir("libs/resources");
        FileLoader.createDir("bin/assets");

        FileLoader.loadFile("libs/resources/game_info.txt");

        NAME = Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 1)).split("=")[1];
        GAMEID = Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 2)).split("=")[1];
        VERSION = Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 3)).split("=")[1];

        // display information
        displayWidth = Integer.parseInt(Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 4)).split("=")[1]);
        displayHeight = Integer.parseInt(Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 5)).split("=")[1]);
        targetFPS = Integer.parseInt(Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 6)).split("=")[1]);
        resizeable = Boolean.parseBoolean(Objects.requireNonNull(FileLoader.readLine("libs/resources/game_info.txt", 7)).split("=")[1]);
    }

    // Game Information

    public static String NAME;
    public static String GAMEID;
    public static String VERSION;

    // Display Information

    public static int displayWidth = 1080;
    public static int displayHeight = 720;
    public static int targetFPS = 60;
    public static boolean resizeable = false;

}
