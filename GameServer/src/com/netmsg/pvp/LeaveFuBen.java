package com.netmsg.pvp;

import com.action.room.ExitRoomAction;
import com.netmsg.NetCmd;
import com.netmsg.PBMessage;
import com.player.GamePlayer;
import com.room.Room;
import com.room.RoomMgr;

public class LeaveFuBen implements NetCmd
{
	public void execute(GamePlayer player, PBMessage packet) throws Exception
	{
		Room room = player.getRoom();
		if (room != null)
		{
			RoomMgr.getInstance().addAction(new ExitRoomAction(room, player));
		}
	}
}
