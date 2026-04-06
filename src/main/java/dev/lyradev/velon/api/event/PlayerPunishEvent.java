package dev.lyradev.velon.api.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@RequiredArgsConstructor
public class PlayerPunishEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    @Getter private final Player player;
    @Getter private final String reason;
    @Getter private final String information;

    @Getter @Setter
    private String notification;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
