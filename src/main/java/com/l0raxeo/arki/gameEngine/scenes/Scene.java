package com.l0raxeo.arki.gameEngine.scenes;

import com.l0raxeo.arki.gameEngine.utils.VersionInfo;

import java.awt.*;

/**
 * World containing entities within the game.
 * The scene is simply a container that all
 * entities of that world is stored in.
 *
 * @author Lorcan A. Cheng
 */
@VersionInfo(
        version = "2.1",
        releaseDate = "12/5/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
@SceneInfo(name = "Sample Scene", sceneID = "sampleScene", sideView = true, gravitationalConstant = 9.8)
public abstract class Scene
{

    /*
     * Properly set up scene:
     *
     * @SceneInfo(name = "Sample Scene", sceneID = "sampleScene")
     * public class SampleScene extends Scene
     * {

     *      @Override
     *      public void tick()
     *      {

     *      }

     *      @Override
     *      public void render(Graphics g)
     *      {

     *      }

     * }
     */

    public String name;
    public String id;
    public boolean sideView;
    public double gravitationalConstant;

    // Class
    public Scene()
    {
        name = this.getClass().getAnnotation(SceneInfo.class).name();
        id = this.getClass().getAnnotation(SceneInfo.class).sceneID();
        sideView = this.getClass().getAnnotation(SceneInfo.class).sideView();
        gravitationalConstant = this.getClass().getAnnotation(SceneInfo.class).gravitationalConstant();

        setupView();
    }

    // Initializers

    /**
     * If the current scene is a side view then falling gravity applies.
     */
    private void setupView()
    {
        if (sideView)
        {

        }
    }

    /**
     * Initializer that is invoked when the
     * scene is properly registered into the
     * {@link SceneManager} within the game
     * engine.
     */
    public void awake() {}

    /**
     * Initializer that is invoked when the
     * scene is set to active.
     */
    public void start()
    {

    }

    /**
     * This method is invoked when the scene
     * is deactivated.
     */
    public void sleep()
    {

    }

    // Update

    /**
     * Updates all objects and components in scene
     */
    public abstract void tick();

    /**
     * Renders all objects and components in scene
     */
    public abstract void render(Graphics g);

}
