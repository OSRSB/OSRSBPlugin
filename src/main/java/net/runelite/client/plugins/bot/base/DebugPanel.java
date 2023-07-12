package net.runelite.client.plugins.bot.base;

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
}
