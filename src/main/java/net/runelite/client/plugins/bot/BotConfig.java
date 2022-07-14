package net.runelite.client.plugins.bot;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("bot")
public interface BotConfig extends Config {
    @ConfigItem(
            keyName = "bot",
            name = "OSRSBot",
            description = "Fuck Adam",
            position = 0
    )

    default boolean bot() {
        return true;
    }
}
