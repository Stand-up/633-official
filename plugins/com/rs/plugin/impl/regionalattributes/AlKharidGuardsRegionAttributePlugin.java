package com.rs.plugin.impl.regionalattributes;

import com.rs.game.map.WorldTile;
import com.rs.plugin.listener.RegionAttributeListener;
import com.rs.plugin.wrapper.RegionAttributeSignature;

@RegionAttributeSignature(forceMultiRegions = {}, alias="Al-Kharid_Guards")
public class AlKharidGuardsRegionAttributePlugin implements RegionAttributeListener {

	@Override
	public boolean withinMultiZonedBoundaries(WorldTile tile) {
		int destX = tile.getX();
		int destY = tile.getY();
		return destX >= 3281 && destX <= 3305 && destY >= 3148 && destY <= 3177;
	}
}