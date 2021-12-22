package com.l0raxeo.arki.gameEngine.init;

import com.l0raxeo.arki.gameEngine.Engine;
import com.l0raxeo.arki.gameEngine.entities.EntityManager;
import com.l0raxeo.arki.gameEngine.scenes.SceneManager;
import com.l0raxeo.arki.gameEngine.utils.VersionInfo;

/**
 * Initializer for game processes.
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
public class Game implements Initializer
{

    @Override
    public void preInit()
    {
        Engine.sceneManager = new SceneManager();
        Engine.entityManager = new EntityManager();
    }

}
