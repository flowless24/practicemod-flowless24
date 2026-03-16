package flowless24.practicemod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
   public static final FoodComponent OMELET = new FoodComponent.Builder().hunger(4)
           .saturationModifier(.1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 120*20), 1f).build();
}

