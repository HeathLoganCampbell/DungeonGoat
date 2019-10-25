package com.heathlogancampbell.labgoat.tiles;

import com.heathlogancampbell.engine.graphics.Sprite;

public class FloorTile extends TileBase
{
    public FloorTile(Sprite sprite) {
        super(sprite);

        this.setSolid(false);
    }
}
