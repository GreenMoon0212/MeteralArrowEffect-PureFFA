package me.greenmoon.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;
import java.util.UUID;

public class OreDropMain implements EffectAddon {

    @Override
    public Integer getAPIVer() {
        return 1;
    }

    @Override
    public String getName() {
        return "OreDropTrail";
    }

    @Override
    public String getAuthor() {
        return "GreenMoon";
    }

    @Override
    public UUID authorUUID() {
        return UUID.fromString("53aaa7fb-569e-4391-9323-5762af38f255");
    }

    @Override
    public void onEnable() {
        new ArrowOreDropTrail().registerArrowShootEffect(this);
    }

    @Override
    public void onDisable() {
        new ArrowOreDropTrail().unregisterArrowShootEffect();
    }
}
