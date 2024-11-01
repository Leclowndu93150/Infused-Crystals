package com.leclowndu93150.infusedcrystals.common;

import com.leclowndu93150.infusedcrystals.registry.Tags;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nonnull;
import java.util.List;

public class AllInOneTool extends DiggerItem {

    private static final List<ItemAbility> ACTIONS = List.of(
            ItemAbilities.AXE_DIG,
            ItemAbilities.HOE_DIG,
            ItemAbilities.PICKAXE_DIG,
            ItemAbilities.SHOVEL_DIG,
            ItemAbilities.HOE_TILL,
            ItemAbilities.SHOVEL_FLATTEN,
            ItemAbilities.AXE_STRIP
    );

    public AllInOneTool(Tier tier) {
        super(tier,
                com.leclowndu93150.infusedcrystals.registry.Tags.Blocks.MINEABLE_WITH_AIO,
                new Properties()
                        .durability(tier.getUses() * 4)
                        .component(DataComponents.TOOL, tier.createToolProperties(Tags.Blocks.MINEABLE_WITH_AIO))
                        .attributes(createAttributes())
        );
    }

    private static ItemAttributeModifiers createAttributes() {
        ItemAttributeModifiers.Builder builder = ItemAttributeModifiers.builder();
        builder.add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID,4.0f, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
        builder.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.0f, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
        return builder.build();
    }

    @Override
    public boolean canPerformAction(@Nonnull ItemStack stack, @Nonnull ItemAbility toolAction) {
        if (ACTIONS.contains(toolAction))
            return true;
        return super.canPerformAction(stack, toolAction);
    }

    @Nonnull
    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getPlayer() == null) {
            return InteractionResult.FAIL;
        }

        if (context.getPlayer().isCrouching()) {
            return Items.IRON_SHOVEL.useOn(context);
        }
        InteractionResult tmp = Items.IRON_AXE.useOn(context);
        if (tmp == InteractionResult.SUCCESS)
            return tmp;
        return Items.IRON_HOE.useOn(context);
    }
}