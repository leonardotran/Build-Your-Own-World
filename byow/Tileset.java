package byow.TileEngine;

import java.awt.Color;
import java.io.File;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * You are free to (and encouraged to) create and add your own tiles to this file. This file will
 * be turned in with the rest of your code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {
    private static final File CWD = new File(System.getProperty("user.dir"));
    public static final TETile AVATAR = new TETile('@', Color.white, Color.black,
            "you1", fileUtils.join(CWD,"byow/assets/Pink_Monster.png").getPath());
    public static final TETile AVATAR_LEFT = new TETile('@', Color.white, Color.black,
            "you1", fileUtils.join(CWD,"byow/assets/Pink_Monster_Left.png").getPath());

    public static final TETile AVATAR2 = new TETile('@', Color.red, Color.black,
            "you2", fileUtils.join(CWD,"byow/assets/Owlet_Monster.png").getPath());
    public static final TETile AVATAR2_LEFT = new TETile('@', Color.red, Color.black,
            "you2", fileUtils.join(CWD,"byow/assets/Owlet_Monster_Left.png").getPath());

    public static final TETile WALL = new TETile('#', new Color(216, 128, 128), Color.darkGray,
            "wall", fileUtils.join(CWD,"byow/assets/wall.png").getPath());
    public static final TETile FLOOR = new TETile('·', new Color(128, 192, 128), Color.black,
            "floor", fileUtils.join(CWD,"byow/assets/floor.png").getPath());
    public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "nothing");
    public static final TETile GRASS = new TETile('"', Color.green, Color.black, "grass");
    public static final TETile WATER = new TETile('≈', Color.blue, Color.black, "water");
    public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink,
            "Mystery Chest", fileUtils.join(CWD,"byow/assets/chest2.png").getPath());
    public static final TETile FLOWER_TWO = new TETile('❀', Color.magenta, Color.pink,
            "Mystery Chest", fileUtils.join(CWD,"byow/assets/chest2.png").getPath());
    public static final TETile LOCKED_DOOR = new TETile('█', Color.orange, Color.black,
            "locked door");
    public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
            "unlocked door");
    public static final TETile SAND = new TETile('▒', Color.yellow, Color.black, "sand");
    public static final TETile SAND2 = new TETile('▒', Color.yellow, Color.red, "sand");

    public static final TETile MOUNTAIN = new TETile('▲', Color.gray, Color.black, "mountain");
    public static final TETile TREE = new TETile('♠', Color.green, Color.black,
            "Potion", fileUtils.join(CWD,"byow/assets/dragon.png").getPath());
    public static final TETile TREE_TWO = new TETile('♠', Color.red, Color.black, "Floor");
    public static final TETile FLOOR_TWO = new TETile('·', Color.magenta, Color.black,
            "Floor");

}


