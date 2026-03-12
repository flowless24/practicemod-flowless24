package flowless24.practicemod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import javax.swing.*;
import java.util.Random;

public class PrinterItem extends Item {
    public PrinterItem(Settings settings) {
        super(settings);
    }

    String[] Outputs = {"Hi!", "Bye!", "Hello there!", "See ya!", "Greetings!", "Farewell!", "Howdy!", "Later!", "What's up?", "Take care!"};

    Random random = new Random();

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            int randomInt = random.nextInt(0, 10);
            user.sendMessage(Text.literal(Outputs[randomInt]));
            user.getStackInHand(hand).damage(1, user, playerEntity -> playerEntity.sendToolBreakStatus(hand));
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    /*
    @Override
    public ActionResult use(){
        PlayerEntity player = context.getPlayer();
        if (!context.getWorld().isClient()){
            int randomInt = random.nextInt(0,10);
            player.sendMessage(Text.literal(Outputs[randomInt]));
        }
        return ActionResult.SUCCESS;

    }
    */

}
