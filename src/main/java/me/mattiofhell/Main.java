package me.mattiofhell;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        System.out.println("[DifferenceCore] Plugin abilitato.");
    }

    @Override
    public void onDisable() {
        System.out.println("[DifferenceCore] Plugin disabilitato.");
    }


    @EventHandler
    public void onInvClick(InventoryClickEvent event) {
        Inventory inv = event.getInventory();

        if (inv.getType() == InventoryType.ENDER_CHEST) {
            if (event.getRawSlot() < inv.getSize()) {
                ItemStack holding = event.getCursor();
                if (holding.getType() == Material.DRAGON_EGG) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.WHITE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.ORANGE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.MAGENTA_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.LIGHT_BLUE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.YELLOW_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.LIME_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.PINK_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.GRAY_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.LIGHT_GRAY_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.CYAN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.PURPLE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.BLUE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.BROWN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.GREEN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.RED_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (holding.getType() == Material.BLACK_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    event.setCursor(holding);
                    inv.setItem(slot, inv.getItem(slot));
                }
            }else if (event.isShiftClick()) {
                ItemStack clicked = event.getCurrentItem();
                if (clicked.getType() == Material.DRAGON_EGG) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.WHITE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.ORANGE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.MAGENTA_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.LIGHT_BLUE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.YELLOW_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.LIME_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.PINK_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.GRAY_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.LIGHT_GRAY_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.CYAN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.PURPLE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.BLUE_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.BROWN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.GREEN_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.RED_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
                if (clicked.getType() == Material.BLACK_BANNER) {
                    Integer slot = event.getSlot();

                    event.setCancelled(true);
                    ((Player)event.getWhoClicked()).updateInventory();
                    inv.setItem(slot, inv.getItem(slot));
                }
            }
        }
    }
}
