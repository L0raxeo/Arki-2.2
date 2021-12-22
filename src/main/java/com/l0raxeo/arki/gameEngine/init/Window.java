package com.l0raxeo.arki.gameEngine.init;

import com.l0raxeo.arki.gameEngine.Engine;
import com.l0raxeo.arki.gameEngine.Reference;
import com.l0raxeo.arki.gameEngine.display.Display;
import com.l0raxeo.arki.gameEngine.input.keyboard.KeyManager;
import com.l0raxeo.arki.gameEngine.input.mouse.MouseManager;
import com.l0raxeo.arki.gameEngine.utils.VersionInfo;

/**
 * Manages all keys, and can be used to
 * retrieve information about the current
 * state of a specific key.
 *
 * @author Lorcan A. Cheng
 */
@VersionInfo(
        version = "1.0",
        releaseDate = "11/14/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
@Init
public class Window implements Initializer
{
    @Override
    public void preInit()
    {
        Engine.keyManager = new KeyManager();
        Engine.mouseManager = new MouseManager();
    }

    @Override
    public void init()
    {
        Engine.display = new Display(Reference.NAME, Reference.displayWidth, Reference.displayHeight);
    }

    @Override
    public void postInit()
    {
        Engine.display.getFrame().addKeyListener(Engine.keyManager);
        Engine.display.getCanvas().addMouseListener(Engine.mouseManager);
        Engine.display.getCanvas().addMouseMotionListener(Engine.mouseManager);
    }

}
