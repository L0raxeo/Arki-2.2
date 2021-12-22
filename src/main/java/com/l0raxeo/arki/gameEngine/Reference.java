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

        System.out.println(NAME);
        System.out.println(GAMEID);
        System.out.println(VERSION);
    }

    // Game Information

    public static String NAME = "Sample Game";
    public static String GAMEID = "sampleGame";
    public static String VERSION = "1.0";
    public static final int targetFPS = 60;

    // Display Information

    public static final int displayWidth = 1080;
    public static final int displayHeight = 720;
    public static final boolean resizeable = false;

}
