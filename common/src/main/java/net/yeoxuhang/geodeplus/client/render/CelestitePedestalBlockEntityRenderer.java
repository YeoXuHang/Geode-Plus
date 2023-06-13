package net.yeoxuhang.geodeplus.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.yeoxuhang.geodeplus.GeodePlus;
import net.yeoxuhang.geodeplus.client.model.layer.GeodePlusModelLayersRegistry;
import net.yeoxuhang.geodeplus.common.block.CelestitePedestalBlock;
import net.yeoxuhang.geodeplus.common.block.entity.CelestitePedestalBlockEntity;


import java.util.Calendar;

public class CelestitePedestalBlockEntityRenderer<T extends CelestitePedestalBlockEntity> implements BlockEntityRenderer<T> {
    private final ItemRenderer itemRenderer;
    private static final ResourceLocation Pedestal = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/celestite_pedestal/pedestal.png");
    private static final ResourceLocation Crystals = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/celestite_pedestal/pink_topaz.png");
    private static final ResourceLocation Glass = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/celestite_pedestal/pink_topaz_glass.png");

    private static final ResourceLocation TEXTURE = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/celestite_pedestal/celestite_pedestal.png");

    private static final ResourceLocation XMAS = new ResourceLocation(GeodePlus.MOD_ID, "textures/entity/celestite_pedestal/christmas.png");

    private static ModelPart crystals_pedestal;
    private final ModelPart pedestal;
    private final ModelPart glass;
    private final ModelPart crystals;
    private final ModelPart crystal1;
    private final ModelPart crystal2;
    private final ModelPart crystal3;
    private final ModelPart crystal4;

    private boolean xmasTextures;

    public CelestitePedestalBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        ModelPart modelpart = context.bakeLayer(GeodePlusModelLayersRegistry.CELESTITE_PEDESTAL);
        crystals_pedestal = modelpart.getChild("crystals_pedestal");
        this.crystals = crystals_pedestal.getChild("crystals");
        this.pedestal = crystals_pedestal.getChild("pedestal");
        this.glass = crystals_pedestal.getChild("glass");
        this.crystal1 = this.crystals.getChild("crystal1");
        this.crystal2 = this.crystals.getChild("crystal2");
        this.crystal3 = this.crystals.getChild("crystal3");
        this.crystal4 = this.crystals.getChild("crystal4");
        this.itemRenderer = context.getItemRenderer();
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.xmasTextures = true;
        }
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition crystals_pedestal = partdefinition.addOrReplaceChild("crystals_pedestal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition pedestal = crystals_pedestal.addOrReplaceChild("pedestal", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -4.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition crystals = crystals_pedestal.addOrReplaceChild("crystals", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 0.0F));

        PartDefinition crystal1 = crystals.addOrReplaceChild("crystal1", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -6.0F));

        PartDefinition cube_r1 = crystal1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition crystal2 = crystals.addOrReplaceChild("crystal2", CubeListBuilder.create(), PartPose.offset(-6.0F, -2.0F, 0.0F));

        PartDefinition cube_r2 = crystal2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -1.5708F, -0.2618F));

        PartDefinition crystal3 = crystals.addOrReplaceChild("crystal3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 6.0F));

        PartDefinition cube_r3 = crystal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.0F, 0.0F, 5.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition crystal4 = crystals.addOrReplaceChild("crystal4", CubeListBuilder.create(), PartPose.offset(6.0F, -1.0F, 0.0F));

        PartDefinition cube_r4 = crystal4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 8).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));

        PartDefinition glass = crystals_pedestal.addOrReplaceChild("glass", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void render(T entity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int combinedLightIn, int combinedOverlayIn) {
        Level world = entity.getLevel();

        assert world != null;

        long gameTime = world.getGameTime();
        float offsetY = (float)Math.sin((double)((float)gameTime / 8.0F)) * 0.025F;
        float wrappistBlockEntity = (float)entity.tick();
        float crystalTick = wrappistBlockEntity / 35.0F;
        float tick = wrappistBlockEntity / 10.0F;
        poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
        /*if (xmasTextures) {
            crystals_pedestal.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(XMAS)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        } else crystals_pedestal.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        */
        pedestal.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(Pedestal)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        crystals.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(Crystals)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        glass.render(poseStack, multiBufferSource.getBuffer(RenderType.entityCutoutNoCull(Glass)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
        pedestal.setPos(8.0F, 0, -8.0F);
        crystals.setPos(8.0F, -11f, -8.0F);
        glass.setPos(8.0F, 0, -8.0F);
        this.crystals.setRotation(0.0F, -crystalTick % 360.0F, 0.0F);
        crystals_pedestal.setPos(8.0F, 0, -8.0F);

        if (entity.Test(true)){
            this.glass.visible = true;
        } else this.glass.visible = false;
        if (entity.hasLevel() && !entity.isEmpty()) {
            poseStack.pushPose();
            poseStack.translate(0.5, (double)offsetY - 0.7, -0.5);
            poseStack.scale(0.35F, 0.35F, 0.35F);
            poseStack.mulPose(Vector3f.YP.rotationDegrees(tick % 360.0F));
            poseStack.mulPose(Vector3f.XP.rotationDegrees(-180.0F));
            this.itemRenderer.renderStatic(entity.getItem(0), ItemTransforms.TransformType.NONE, combinedLightIn, OverlayTexture.NO_OVERLAY, poseStack, multiBufferSource, 0);
            poseStack.popPose();
        }
    }
    public static void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103015_, int p_103016_, float p_103017_, float p_103018_, float p_103019_, float p_103020_) {
        crystals_pedestal.render(poseStack, vertexConsumer, p_103015_, p_103016_);
    }
}