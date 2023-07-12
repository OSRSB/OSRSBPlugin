package net.runelite.client.plugins.bot.base;

import net.runelite.client.plugins.bot.BotConfig;
import net.runelite.rsb.botLauncher.BotLite;

import javax.swing.*;

public class DebugPanel extends JPanel {
    BotLite bot;
    JCheckBox drawMouse = new JCheckBox("Draw Mouse");
    JCheckBox drawMouseTrail = new JCheckBox("Draw Mouse Trail");
    JCheckBox enableMouse = new JCheckBox("Enable Mouse");
    JCheckBox drawBoundaries = new JCheckBox("Draw Boundaries");
    JCheckBox drawGround = new JCheckBox("Draw Ground");
    JCheckBox drawInventory = new JCheckBox("Draw Inventory");
    JCheckBox drawNPCs = new JCheckBox("Draw NPCs");
    JCheckBox drawObjects = new JCheckBox("Draw Objects");
    JCheckBox drawPlayers = new JCheckBox("Draw Players");
    JCheckBox drawSettings = new JCheckBox("Draw Settings");
    JCheckBox drawWeb = new JCheckBox("Draw Web");

    public DebugPanel(BotLite bot) {
        super();
        this.bot = bot;
        init();
    }

    private void init() {
        drawMouse.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawMouse(drawMouse.isSelected()));
        drawMouseTrail.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawMouseTrail(drawMouseTrail.isSelected()));
        enableMouse.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setEnableMouse(enableMouse.isSelected()));
        drawBoundaries.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawBoundaries(drawBoundaries.isSelected()));
        drawGround.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawGround(drawGround.isSelected()));
        drawInventory.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawInventory(drawInventory.isSelected()));
        drawNPCs.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawNPCs(drawNPCs.isSelected()));
        drawObjects.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawObjects(drawObjects.isSelected()));
        drawPlayers.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawPlayers(drawPlayers.isSelected()));
        drawSettings.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawSettings(drawSettings.isSelected()));
        drawWeb.addActionListener(e -> bot.getScriptHandler().getDebugSettingsListener().setDrawWeb(drawWeb.isSelected()));

        BotConfig config = bot.configManager.getConfig(BotConfig.class);
        if (config != null) {
            drawMouse.setSelected(!config.debugDrawMouse());
            drawMouse.doClick();
            drawMouseTrail.setSelected(!config.debugDrawMouseTrail());
            drawMouseTrail.doClick();
            enableMouse.setSelected(!config.debugEnableMouse());
            enableMouse.doClick();
            drawBoundaries.setSelected(!config.debugDrawBoundaries());
            drawBoundaries.doClick();
            drawGround.setSelected(!config.debugDrawGround());
            drawGround.doClick();
            drawInventory.setSelected(!config.debugDrawInventory());
            drawInventory.doClick();
            drawNPCs.setSelected(!config.debugDrawNPCs());
            drawNPCs.doClick();
            drawObjects.setSelected(!config.debugDrawObjects());
            drawObjects.doClick();
            drawPlayers.setSelected(!config.debugDrawPlayers());
            drawPlayers.doClick();
            drawSettings.setSelected(!config.debugDrawSettings());
            drawSettings.doClick();
            drawWeb.setSelected(!config.debugDrawWeb());
            drawWeb.doClick();
        }

        drawBoundaries.setEnabled(false);
        drawGround.setEnabled(false);
        drawInventory.setEnabled(false);
        drawNPCs.setEnabled(false);
        drawObjects.setEnabled(false);
        drawPlayers.setEnabled(false);

        drawWeb.setEnabled(false);

        this.add(drawMouse);
        this.add(drawMouseTrail);
        this.add(enableMouse);
        this.add(drawBoundaries);
        this.add(drawGround);
        this.add(drawInventory);
        this.add(drawNPCs);
        this.add(drawObjects);
        this.add(drawPlayers);
        this.add(drawSettings);
        this.add(drawWeb);
    }

    public void setDrawMouse(boolean drawMouse) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawMouse(drawMouse);
    }

    public void setDrawMouseTrail(boolean drawMouseTrail) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawMouseTrail(drawMouseTrail);
    }

    public void setEnableMouse(boolean enableMouse) {
        bot.getScriptHandler().getDebugSettingsListener().setEnableMouse(enableMouse);
    }

    public void setDrawBoundaries(boolean drawBoundaries) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawBoundaries(drawBoundaries);
    }

    public void setDrawGround(boolean drawGround) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawGround(drawGround);
    }

    public void setDrawInventory(boolean drawInventory) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawInventory(drawInventory);
    }

    public void setDrawNPCs(boolean drawNPCs) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawNPCs(drawNPCs);
    }

    public void setDrawObjects(boolean drawObjects) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawObjects(drawObjects);
    }

    public void setDrawPlayers(boolean drawPlayers) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawPlayers(drawPlayers);
    }

    public void setDrawSettings(boolean drawSettings) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawSettings(drawSettings);
    }

    public void setDrawWeb(boolean drawWeb) {
        bot.getScriptHandler().getDebugSettingsListener().setDrawWeb(drawWeb);
    }
}
