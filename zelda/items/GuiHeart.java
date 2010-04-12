package zelda.items;

import java.awt.Rectangle;
import zelda.engine.GObject;
import zelda.engine.Game;

/**
 *
 * @author Bas Harteveld
 */
public class GuiHeart extends GObject
{
    private final static String[] fullAnimation	 = {"full"};
    private final static String[] emptyAnimation = {"empty"};

    public GuiHeart(Game game, int x, int y, boolean full)
    {
        super(game, x, y, 18, 15, "images/guihearts.png");
        spriteLoc.put("full", new Rectangle(0, 0, 18, 15));
        spriteLoc.put("empty", new Rectangle(20, 0, 18, 15));

        if(full)
        {
             sprite.setSprite(spriteLoc.get("full"));
             setAnimation(fullAnimation);
        }
        else
        {
            sprite.setSprite(spriteLoc.get("empty"));
            setAnimation(emptyAnimation);
        }

		screenAdjust = false;
        checkcollision = false;
        liquid = true;
    }
}